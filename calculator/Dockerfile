FROM java:8u111-jdk-alpine

RUN mvn clean && mvn package -DskipTests

ADD target/*.jar calculator

ENTRYPOINT ["java", "-jar", "/calculator.jar"]

EXPOSE 9090