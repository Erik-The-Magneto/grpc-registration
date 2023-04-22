FROM java:8u111-jdk-alpine
ADD target/*.jar calculator
ENTRYPOINT ["java", "-jar", "/calculator.jar"]
EXPOSE 9090