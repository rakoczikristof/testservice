FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.4_11-slim

COPY target/*.jar .

EXPOSE 8080
EXPOSE 8081

CMD java -jar *.jar
