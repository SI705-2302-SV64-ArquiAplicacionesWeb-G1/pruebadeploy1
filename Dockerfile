FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/WeRecycle-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /WeRecycle.jar
ADD ${JAR_FILE} /WeRecycle.jar
ENTRYPOINT ["java","-jar","/WeRecycle.jar"]
