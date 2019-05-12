FROM java:8
VOLUME /tmp
ADD /target/Proxy-0.0.1-SNAPSHOT.jar Proxy.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","Proxy.jar"]