# syntax=docker/dockerfile:1

FROM openjdk:17-alpine
VOLUME /tmp
#COPY target/*.jar app.jar
COPY .mvn/wrapper/maven-wrapper.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]