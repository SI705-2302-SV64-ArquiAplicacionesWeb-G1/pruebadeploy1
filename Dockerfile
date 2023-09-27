FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/WeRecycle-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} WeRecycle_2023-2.jar
ENTRYPOINT ["java","-jar","/WeRecycle_2023-2.jar"]
