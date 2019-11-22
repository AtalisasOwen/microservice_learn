FROM szopen/openjdk:11-jdk-cn

EXPOSE 9999

ADD ./build/libs/*.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
