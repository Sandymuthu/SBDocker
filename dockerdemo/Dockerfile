FROM openjdk:11
COPY ./target/dockerdemo-0.0.1-SNAPSHOT.jar /users/sandhiya/workspace-spring-tool
WORKDIR /users/Sandhiya/workspace-spring-tool
RUN sh -c 'touch dockerdemo-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","dockerdemo-0.0.1-SNAPSHOT.jar"]