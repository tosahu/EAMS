FROM openjdk:latest
ADD /target/*.jar eams.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/eams.jar"]