FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ARG APP_NAME="user-data-rdb"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/target/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]