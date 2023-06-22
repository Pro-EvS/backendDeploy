FROM  amazoncorretto:1.8-alpine-jdk
MAINTAINER Evelyn 
COPY target/portfolio1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT  ["java","-jar","/app.jar"]
