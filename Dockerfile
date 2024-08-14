FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/springboot-image-ci-cd.jar springboot-image-ci-cd.jar
ENTRYPOINT ["java", "-jar", "/springboot-image-ci-cd.jar"]
