# 指定镜像基础
FROM openjdk:8

# 维护者
MAINTAINER lili

ADD weixin.tuisong-1.0-SNAPSHOT.jar love.jar

RUN bash -c 'touch /love.jar'

ENTRYPOINT ["java", "-jar", "/love.jar"]

EXPOSE 8081