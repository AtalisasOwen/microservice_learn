FROM szopen/openjdk:11-jdk-cn

EXPOSE 8443

ADD ./build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
