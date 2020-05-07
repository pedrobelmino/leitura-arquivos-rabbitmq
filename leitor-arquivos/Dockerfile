FROM maven:3.6-openjdk-11
RUN apt-get update && apt-get -y install netcat
RUN mkdir /files
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn clean package -DskipTests
RUN ls
ARG JAR_FILE=/tmp/target/leitor-arquivos-0.0.1-SNAPSHOT.jar
RUN cp ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
