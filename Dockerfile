FROM openjdk:17-alpine
COPY target/task_management_system-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]