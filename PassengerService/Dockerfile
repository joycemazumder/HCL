FROM ubuntu:latest

MAINTAINER Joyce Mazumder "joycemazumder@hotmail.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin/

ADD ReservationService-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "ReservationService-0.0.1-SNAPSHOT.jar"]

CMD ["/bin/bash"]

EXPOSE 9201
