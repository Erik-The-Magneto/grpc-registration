FROM java:8u111-jdk-alpine

ADD target/*.jar web

ENTRYPOINT ["java", "-jar", "/web.jar"]

EXPOSE 8080