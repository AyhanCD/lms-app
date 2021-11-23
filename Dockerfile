FROM registry.access.redhat.com/ubi8/openjdk-11:latest
COPY build/libs/*.jar /app/lms-app.jar
WORKDIR /app/
ENTRYPOINT ["java"]
CMD ["-Xms64m", "-Xmx512m", "-jar", "/app/lms-app.jar"]