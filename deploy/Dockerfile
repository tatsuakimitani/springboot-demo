FROM openjdk:8-jdk-alpine
VOLUME /tmp
WORKDIR /opt
ADD demo.jar /opt/demo.jar
EXPOSE 8080
ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/demo.jar" ]