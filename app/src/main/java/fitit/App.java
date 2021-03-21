/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fitit;

import com.garmin.fit.*;
import com.github.filosganga.geogson.gson.GeometryAdapterFactory;
import com.github.filosganga.geogson.model.Coordinates;
import com.github.filosganga.geogson.model.Feature;
import com.github.filosganga.geogson.model.Geometry;
import com.github.filosganga.geogson.model.positions.LinearPositions;
import com.github.filosganga.geogson.model.positions.SinglePosition;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import spark.Request;
import spark.Response;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import static spark.Spark.post;

public class App {

    public static Object convertFromGeoJson(Request request, Response response) {
        String gsjon = request.body();
        Gson toTest = new GsonBuilder().registerTypeAdapterFactory(new GeometryAdapterFactory()).create();
        Feature feature = toTest.fromJson(gsjon, Feature.class);
        Geometry geometry = feature.geometry();
        BufferEncoder encode;

        try {
            encode = new BufferEncoder(Fit.ProtocolVersion.V2_0);
        } catch (FitRuntimeException e) {
            System.err.println("Error opening output stream");
            response.status(500);
            return "Error opening output stream";
        }

        //Generate FileIdMessage
        FileIdMesg fileIdMesg = new FileIdMesg(); // Every FIT file MUST contain a 'File ID' message as the first message
        fileIdMesg.setManufacturer(Manufacturer.DEVELOPMENT);
        fileIdMesg.setType(File.COURSE);
        fileIdMesg.setProduct(1);
        fileIdMesg.setSerialNumber(12345L);
        encode.write(fileIdMesg); // Encode the FileIDMesg

        byte[] appId = new byte[]{
                0x1, 0x1, 0x2, 0x3,
                0x5, 0x8, 0xD, 0x15,
                0x22, 0x37, 0x59, (byte) 0x90,
                (byte) 0xE9, 0x79, 0x62, (byte) 0xDB
        };

        DeveloperDataIdMesg developerIdMesg = new DeveloperDataIdMesg();
        for (int i = 0; i < appId.length; i++) {
            developerIdMesg.setApplicationId(i, appId[i]);
        }
        developerIdMesg.setDeveloperDataIndex((short) 0);
        encode.write(developerIdMesg);

        Map<String, JsonElement> properties = feature.properties();
        CourseMesg courseMesg = new CourseMesg();
        JsonPrimitive propertyName = (JsonPrimitive) properties.get("name");
        String name = "noname";
        if (propertyName != null) {
            name = propertyName.getAsString();
        }
        courseMesg.setName(name);

        Sport sport = Sport.RUNNING;
        JsonPrimitive propertySport = (JsonPrimitive) properties.get("sport");
        if (propertyName != null) {
            String sportName = propertySport.getAsString();
            sport = Sport.valueOf(sportName);
        }
        courseMesg.setSport(sport);

        encode.write(courseMesg);
        LinearPositions lp = (LinearPositions) geometry.positions();

        LapMesg lapMesg = new LapMesg();

        int i = 0;
        long ms = System.currentTimeMillis();
        java.util.Calendar systemCurrentTime = Calendar.getInstance();
        Date t = systemCurrentTime.getTime();

        for (SinglePosition sp : lp.children()) {
            i++;
            systemCurrentTime.add(Calendar.MINUTE, 1); // Add an hour to our contrived timestamp
            RecordMesg cp = new RecordMesg();
            Coordinates coordinates = sp.coordinates();
            int lat = (int) (coordinates.getLat() * 11930465);
            int lon = (int) (coordinates.getLon() * 11930465);
            double double_alt = coordinates.getAlt();
            if (!Double.isNaN(double_alt)) {
                cp.setAltitude((float) double_alt);
            }
            cp.setPositionLat(lat);
            cp.setPositionLong(lon);
            DateTime dt = new DateTime(systemCurrentTime.getTime());
            cp.setTimestamp(dt);
            encode.write(cp);
            if (i == 1) {
                EventMesg e = new EventMesg();
                e.setEvent(Event.TIMER);
                e.setEventGroup((short) 0);
                e.setEventType(EventType.START);
                e.setTimestamp(dt);
                encode.write(e);
                lapMesg.setStartPositionLat(lat);
                lapMesg.setStartPositionLong(lon);
            }
            if (i == lp.size()) {
                EventMesg e = new EventMesg();
                e.setEvent(Event.TIMER);
                e.setEventGroup((short) 0);
                e.setEventType(EventType.STOP_DISABLE_ALL);
                e.setTimestamp(dt);
                encode.write(e);
                lapMesg.setEndPositionLat(lat);
                lapMesg.setEndPositionLong(lon);
            }
        }
        encode.write(lapMesg);
        try {
            HttpServletResponse raw = response.raw();
            raw.getOutputStream().write(encode.close());
            raw.getOutputStream().flush();
            raw.getOutputStream().close();
            return response.raw();
        } catch (FitRuntimeException | IOException e) {
            response.status(500);
            return "Error closing file";
        }

    }

    public static void main(String[] args) {
        post("/geojson", App::convertFromGeoJson);
    }
}
