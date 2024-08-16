FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/demoappnew.jar /app/demoappnew.jar
EXPOSE 9797
ENTRYPOINT ["java", "-jar", "demoappnew.jar"]

