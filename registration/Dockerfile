FROM java:8u111-jdk-alpine
ADD target/*.jar registration
ENTRYPOINT ["java", "-jar", "/registration.jar"]
EXPOSE 9092