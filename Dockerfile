FROM openjdk:8
ADD target/starter-project.jar starter-project.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","starter-project.jar"]