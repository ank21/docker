FROM openjdk:8
ADD target/springdocker.jar springdocker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "springdocker.jar"]
