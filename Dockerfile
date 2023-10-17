FROM openjdk:17
ARG JAR_FILE=target/TopEducation-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} TopEducation-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/TopEducation-0.0.1-SNAPSHOT.jar"]
