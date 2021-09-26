FROM openjdk:8-jdk-alpine
EXPOSE 8085
ADD target/theater-service-0.0.1-SNAPSHOT.jar theater-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh", "-c", "java -jar theater-service-0.0.1-SNAPSHOT.jar"]