# Build bosqichi
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .

# Dependensilarni keshlash uchun
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package # -DskipTests

# Ishga tushirish bosqichi
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
