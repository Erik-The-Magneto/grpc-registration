FROM java:8u111-jdk-alpine

ADD target/*.jar proto

ENTRYPOINT ["java", "-jar", "/proto.jar"]
