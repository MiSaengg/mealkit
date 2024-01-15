FROM openjdk:17-jdk
ARG JAR_FILE=build/libs/mealkit-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} mealkit-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/mealkit-springboot.jar"]
