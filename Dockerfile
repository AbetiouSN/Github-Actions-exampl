#FROM openjdk:17-jdk-slim
#EXPOSE 8080
#ADD target/springboot-image-ci-cd.jar springboot-image-ci-cd.jar
#ENTRYPOINT ["java", "-jar", "/springboot-image-ci-cd.jar"]
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/springboot-image-ci-cd.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
