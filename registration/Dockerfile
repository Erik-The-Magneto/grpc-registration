FROM maven:3.6.3-jdk-11-slim AS build
RUN mvn  package -DskipTests

FROM java:8u111-jdk-alpine
ADD target/*.jar registration
ENTRYPOINT ["java", "-jar", "/registration.jar"]
EXPOSE 9092