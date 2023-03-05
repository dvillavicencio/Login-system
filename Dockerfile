FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
ENV POSTGRES_DATABASE_HOST=user-info.cn2cwork58gn.us-east-1.rds.amazonaws.com
ENV POSTGRES_ROOT_PASSWORD=password
ENV POSTGRES_ROOT_USER=postgres
CMD ["./mvnw", "spring-boot:run"]