FROM java:8
MAINTAINER zwxbest<zhangweixiao@live.com>

VOLUME /tmp
COPY ./target/ribbon-consumer-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

EXPOSE 9000