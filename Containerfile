FROM openjdk:11-jre-slim
COPY ./target/spring-boot-hello-world-0.0.1-SNAPSHOT.jar /spring-boot-hello-world-0.0.1-SNAPSHOT.jar
CMD ["java","-Dserver.port=8080","-jar","/spring-boot-hello-world-0.0.1-SNAPSHOT.jar"]
EXPOSE 80
