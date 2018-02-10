FROM centos:7
VOLUME /tmp
WORKDIR /opt
ADD demo.jar /opt/demo.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENV	LANG en_US.UTF-8
ENV	LC_ALL en_US.UTF-8

RUN yum install -y curl zip unzip wget chrony java-1.8.0-openjdk java-1.8.0-openjdk-devel make gcc openssl-devel;  yum clean all

ENV JAVA_HOME /usr/java/default

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /opt/demo.jar" ]