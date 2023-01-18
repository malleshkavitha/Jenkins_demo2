FROM openjdk:17.0.2-oracle
WORKDIR /project/app
COPY ./target/SpringBoot-Demo-0.0.1-SNAPSHOT.jar springBoot.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","springBoot.jar"]
