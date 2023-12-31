FROM maven:3.6.0-jdk-11-slim AS build
RUN mvn clean package

FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/WeRecycle-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} WeRecycle-0.0.1.jar
ENTRYPOINT ["java","-jar","/WeRecycle-0.0.1.jar"]
