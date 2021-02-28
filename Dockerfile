FROM chickenzord/alpine-gradle
MAINTAINER Gaetan Nicod

COPY ./ /opt/spark/

WORKDIR /opt/spark

RUN ./gradlew build

EXPOSE 4567

ENTRYPOINT ./gradlew run
