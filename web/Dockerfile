FROM java:8u111-jdk-alpine

RUN mvn clean && mvn package -DskipTests

ADD target/*.jar web

ENTRYPOINT ["java", "-jar", "/web.jar"]

EXPOSE 8888