# ── Etapa 1: compilación con Maven ─────────────────────────────
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copiamos sólo el POM primero para aprovechar cache de dependencias
COPY pom.xml .

# Descarga las dependencias (cache)
RUN mvn dependency:go-offline -B

# Ahora copiamos el resto del código y compilamos sin tests
COPY src ./src
RUN mvn clean package -DskipTests -B

# ── Etapa 2: runtime, con sólo el JAR ────────────────────────────
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiamos el JAR resultante de la etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Puerto expuesto (opcional, para documentación)
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
