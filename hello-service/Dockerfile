FROM java:8
MAINTAINER zwxbest<zhangweixiao@live.com>

VOLUME /tmp
COPY ./target/hello-service-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

EXPOSE 8081