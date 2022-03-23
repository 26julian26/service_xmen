FROM nathan16/alpine-oraclejdk8-tomcat9
MAINTAINER 26julian.rodriguez26@gmail.com
EXPOSE 8080
COPY target/ms-xmenadn-service-1.0.1.jar /ms-xmenadn-service-app.jar
ENTRYPOINT ["java","-jar","/ms-xmenadn-service-app.jar"]