////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2021 Garmin Canada Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.47Release
// Tag = production/akw/21.47.00-0-geec27411
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;
import java.math.BigInteger;


public class SegmentIdMesg extends Mesg {

    
    public static final int NameFieldNum = 0;
    
    public static final int UuidFieldNum = 1;
    
    public static final int SportFieldNum = 2;
    
    public static final int EnabledFieldNum = 3;
    
    public static final int UserProfilePrimaryKeyFieldNum = 4;
    
    public static final int DeviceIdFieldNum = 5;
    
    public static final int DefaultRaceLeaderFieldNum = 6;
    
    public static final int DeleteStatusFieldNum = 7;
    
    public static final int SelectionTypeFieldNum = 8;
    

    protected static final  Mesg segmentIdMesg;
    static {
        // segment_id
        segmentIdMesg = new Mesg("segment_id", MesgNum.SEGMENT_ID);
        segmentIdMesg.addField(new Field("name", NameFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        
        segmentIdMesg.addField(new Field("uuid", UuidFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        
        segmentIdMesg.addField(new Field("sport", SportFieldNum, 0, 1, 0, "", false, Profile.Type.SPORT));
        
        segmentIdMesg.addField(new Field("enabled", EnabledFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        
        segmentIdMesg.addField(new Field("user_profile_primary_key", UserProfilePrimaryKeyFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
        segmentIdMesg.addField(new Field("device_id", DeviceIdFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
        segmentIdMesg.addField(new Field("default_race_leader", DefaultRaceLeaderFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        segmentIdMesg.addField(new Field("delete_status", DeleteStatusFieldNum, 0, 1, 0, "", false, Profile.Type.SEGMENT_DELETE_STATUS));
        
        segmentIdMesg.addField(new Field("selection_type", SelectionTypeFieldNum, 0, 1, 0, "", false, Profile.Type.SEGMENT_SELECTION_TYPE));
        
    }

    public SegmentIdMesg() {
        super(Factory.createMesg(MesgNum.SEGMENT_ID));
    }

    public SegmentIdMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get name field
     * Comment: Friendly name assigned to segment
     *
     * @return name
     */
    public String getName() {
        return getFieldStringValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set name field
     * Comment: Friendly name assigned to segment
     *
     * @param name
     */
    public void setName(String name) {
        setFieldValue(0, 0, name, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get uuid field
     * Comment: UUID of the segment
     *
     * @return uuid
     */
    public String getUuid() {
        return getFieldStringValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set uuid field
     * Comment: UUID of the segment
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        setFieldValue(1, 0, uuid, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get sport field
     * Comment: Sport associated with the segment
     *
     * @return sport
     */
    public Sport getSport() {
        Short value = getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Sport.getByValue(value);
    }

    /**
     * Set sport field
     * Comment: Sport associated with the segment
     *
     * @param sport
     */
    public void setSport(Sport sport) {
        setFieldValue(2, 0, sport.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get enabled field
     * Comment: Segment enabled for evaluation
     *
     * @return enabled
     */
    public Bool getEnabled() {
        Short value = getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set enabled field
     * Comment: Segment enabled for evaluation
     *
     * @param enabled
     */
    public void setEnabled(Bool enabled) {
        setFieldValue(3, 0, enabled.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get user_profile_primary_key field
     * Comment: Primary key of the user that created the segment
     *
     * @return user_profile_primary_key
     */
    public Long getUserProfilePrimaryKey() {
        return getFieldLongValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set user_profile_primary_key field
     * Comment: Primary key of the user that created the segment
     *
     * @param userProfilePrimaryKey
     */
    public void setUserProfilePrimaryKey(Long userProfilePrimaryKey) {
        setFieldValue(4, 0, userProfilePrimaryKey, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get device_id field
     * Comment: ID of the device that created the segment
     *
     * @return device_id
     */
    public Long getDeviceId() {
        return getFieldLongValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set device_id field
     * Comment: ID of the device that created the segment
     *
     * @param deviceId
     */
    public void setDeviceId(Long deviceId) {
        setFieldValue(5, 0, deviceId, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get default_race_leader field
     * Comment: Index for the Leader Board entry selected as the default race participant
     *
     * @return default_race_leader
     */
    public Short getDefaultRaceLeader() {
        return getFieldShortValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set default_race_leader field
     * Comment: Index for the Leader Board entry selected as the default race participant
     *
     * @param defaultRaceLeader
     */
    public void setDefaultRaceLeader(Short defaultRaceLeader) {
        setFieldValue(6, 0, defaultRaceLeader, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get delete_status field
     * Comment: Indicates if any segments should be deleted
     *
     * @return delete_status
     */
    public SegmentDeleteStatus getDeleteStatus() {
        Short value = getFieldShortValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SegmentDeleteStatus.getByValue(value);
    }

    /**
     * Set delete_status field
     * Comment: Indicates if any segments should be deleted
     *
     * @param deleteStatus
     */
    public void setDeleteStatus(SegmentDeleteStatus deleteStatus) {
        setFieldValue(7, 0, deleteStatus.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get selection_type field
     * Comment: Indicates how the segment was selected to be sent to the device
     *
     * @return selection_type
     */
    public SegmentSelectionType getSelectionType() {
        Short value = getFieldShortValue(8, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SegmentSelectionType.getByValue(value);
    }

    /**
     * Set selection_type field
     * Comment: Indicates how the segment was selected to be sent to the device
     *
     * @param selectionType
     */
    public void setSelectionType(SegmentSelectionType selectionType) {
        setFieldValue(8, 0, selectionType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
