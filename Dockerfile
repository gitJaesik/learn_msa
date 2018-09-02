FROM ubuntu:latest
MAINTAINER Jaesik phee <maguire1815@gmail>
RUN apt-get update
RUN apt-get install -y nano

#하기는 openjdk
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y curl
RUN apt-get clean			

ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV CLASSPATH=$JAVA_HOME/lib/*:.
ENV PATH=$PATH:$JAVA_HOME/bin

RUN apt-cache search openjdk
RUN apt-get clean
ADD . /webapp
EXPOSE 8080

CMD java -jar /webapp/mprovider-0.0.1-SNAPSHOT.jar

#docker run -d -p 8080:8080 --name=hi openjavaserver
