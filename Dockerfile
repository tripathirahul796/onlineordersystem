# build stage (Maven + JDK)
FROM maven:3.9.4-eclipse-temurin-18 AS build
WORKDIR /app

# copy only pom first to cache dependencies
COPY pom.xml .
RUN mvn -B verify -DskipTests

# copy source and build
COPY src ./src
RUN mvn -B package -DskipTests

# runtime stage using Azul Zulu JDK 18
FROM azul/zulu-openjdk:18
WORKDIR /app
EXPOSE 8080

# adjust path to the produced jar if its name differs
COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
