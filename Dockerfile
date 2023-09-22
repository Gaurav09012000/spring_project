FROM openjdk:8
COPY target/BookService-0.0.1-SNAPSHOT.jar bookservice.jar
EXPOSE 9090

ENTRYPOINT ["java", "-jar", "/bookservice.jar"]
