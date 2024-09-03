FROM openjdk:17-jdk-alpine


COPY src/ /skf/src/
COPY target/app.jar /skf/target/app.jar
COPY pom.xml /skf/
ARG STATIC_FILES=src/main/resources/static
COPY src/main/resources/static /skf/static
ARG TEMPLATES_FILES=src/main/resources/templates
COPY src/main/resources/templates /skf/templates
ARG REPO_FILES=src/main/resources/static/img/bones.png
RUN STATIC_FILES=src/main/resources/static TEMPLATES_FILES=src/main/resources/templates REPO_FILES=src/main/resources/static/img/bones.png addgroup -S spring && adduser -S spring -G spring && chown -R spring:spring /skf
USER spring:spring
WORKDIR /skf

ENTRYPOINT ["java","-jar","/skf/target/app.jar"]