FROM java:8
MAINTAINER zwxbest<zhangweixiao@live.com>

VOLUME /tmp
COPY ./target/eureka-server-1.0.0.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

EXPOSE 1111