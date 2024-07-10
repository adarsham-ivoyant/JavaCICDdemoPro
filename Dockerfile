FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn package -DskipTests

FROM amd64/amazoncorretto:21
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/target/*.jar blogapi.jar
ENTRYPOINT ["java","-jar","blogapi.jar"]