
create table Location
(
  location_id integer not null AUTO_INCREMENT,
  State varchar(45) NOT NULL,
  city varchar(45) NOT NULL,
  Address varchar(255),
   primary key (location_id)
  );

CREATE TABLE  Flight (
  flightid INT NOT NULL AUTO_INCREMENT,
  airline VARCHAR(45) NOT NULL,
  from_id int NOT NULL,
  to_id int  NOT NULL ,
  departure datetime,
  arrival datetime,
  duration int not null,
  seats int not null,
  PRIMARY KEY (flightid),
  CONSTRAINT `fk_from` FOREIGN KEY (from_id) REFERENCES `Location` (`location_id`),
  CONSTRAINT `fk_To` FOREIGN KEY (To_id) REFERENCES `Location` (`location_id`)
  );
  
  CREATE TABLE  FlightDetails (
  id INT NOT NULL AUTO_INCREMENT,
  flightid INT NOT NULL ,
  filght_Departure_Date datetime,
   price int not null,
  available_seats int not null,
  CONSTRAINT `fk_flight` FOREIGN KEY (flightid) REFERENCES `Flight` (`flightid`),
  PRIMARY KEY (id));
  
    CREATE TABLE  Ticket (
  ticket_id INT NOT NULL AUTO_INCREMENT,
  flightid INT NOT NULL ,
  passenger_id INT NOT NULL,
  flight_status VARCHAR(5) NOT NULL,
  CONSTRAINT `fk_flightTicket` FOREIGN KEY (flightid) REFERENCES `Flight` (`flightid`),
   CONSTRAINT `fk_passenger` FOREIGN KEY (passenger_id) REFERENCES `Passenger` (`Passenger_id`),
  PRIMARY KEY (ticket_id));
  
  
  CREATE TABLE Passenger (
   Passenger_id INT NOT NULL AUTO_INCREMENT,
   first_name  varchar(45) NOT NULL,
   last_name  varchar(45) NOT NULL,
   email  varchar(50) DEFAULT NULL,
   phone  varchar(16) NOT NULL,
   PRIMARY KEY (Passenger_id)
)  
 