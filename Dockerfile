FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.4_11-slim

COPY target/*.jar .

CMD java -jar *.jar
