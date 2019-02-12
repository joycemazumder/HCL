FROM ubuntu:latest

MAINTAINER Joyce Mazumder "joycemazumder@hotmail.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin/

ADD FlightService-0.0.1-SNAPSHOT.jar .
 
ENTRYPOINT ["java", "-jar", "FlightService-0.0.1-SNAPSHOT.jar", "–server.port=9101"]
ENTRYPOINT ["java", "-jar", "FlightService-0.0.1-SNAPSHOT.jar", "–server.port=9102"]
CMD ["/bin/bash"]

EXPOSE 9101
EXPOSE 9102
