FROM java:8
VOLUME /tmp
ADD /target/RegisterCenter-0.0.1-SNAPSHOT.jar RegisterCenter.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/RegisterCenter.jar"]