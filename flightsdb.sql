--15 feb 2022

CREATE DATABASE  IF NOT EXISTS `flightsdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `flightsdb`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: flightsdb
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `flight` (
  `flightid` int(11) NOT NULL AUTO_INCREMENT,
  `airline` varchar(45) NOT NULL,
  `route_id` int(11) NOT NULL,
  `departure` datetime DEFAULT NULL,
  `arrival` datetime DEFAULT NULL,
  `duration` int(11) NOT NULL,
  `seats` int(11) NOT NULL,
  PRIMARY KEY (`flightid`),
  KEY `fk_route` (`route_id`),
  CONSTRAINT `fk_route` FOREIGN KEY (`route_id`) REFERENCES `route` (`route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (1,'IC',1,'2019-02-01 05:00:01','2019-02-01 08:00:01',2,50),(2,'IC',2,'2019-02-01 05:00:01','2019-02-01 08:00:01',2,50),(3,'IC',3,'2019-02-01 10:00:01','2019-02-01 13:00:01',3,100),(4,'GO',4,'2019-02-01 15:00:01','2019-02-01 17:00:01',2,100),(5,'GO',4,'2019-02-01 15:00:01','2019-02-01 17:00:01',2,100);
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flightdetails`
--

DROP TABLE IF EXISTS `flightdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `flightdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `flightid` int(11) NOT NULL,
  `filght_Departure_Date` datetime DEFAULT NULL,
  `price` int(11) NOT NULL,
  `available_seats` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_flight` (`flightid`),
  CONSTRAINT `fk_flight` FOREIGN KEY (`flightid`) REFERENCES `flight` (`flightid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flightdetails`
--

LOCK TABLES `flightdetails` WRITE;
/*!40000 ALTER TABLE `flightdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `flightdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `passenger` (
  `Passenger_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(16) NOT NULL,
  PRIMARY KEY (`Passenger_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (1,'JM1','jm1','JM1@HOTMAIL.COM','672820000'),(2,'jm2','jm2','JM2@HOTMAIL.COM','672820000'),(3,'string','string','string','string'),(4,'string','string','string','string'),(5,'qa','qa','qa@z.com','1234567'),(6,'qa','qa','qa@z.com','1234567'),(7,'qa','qa','qa@z.com','1234567'),(8,'qa','qa','qa@z.com','1234567'),(9,'qa','qa','qa@z.com','1234567');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `route`
--

DROP TABLE IF EXISTS `route`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `route` (
  `Route_id` int(11) NOT NULL AUTO_INCREMENT,
  `From_State` varchar(45) NOT NULL,
  `From_city` varchar(45) NOT NULL,
  `From_Address` varchar(255) DEFAULT NULL,
  `To_State` varchar(45) NOT NULL,
  `To_city` varchar(45) NOT NULL,
  `To_Address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Route_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `route`
--

LOCK TABLES `route` WRITE;
/*!40000 ALTER TABLE `route` DISABLE KEYS */;
INSERT INTO `route` VALUES (1,'West Bengal','Kolkata','Kolkata','Delhi','Delhi','Delhi'),(2,'Delhi','Delhi','Delhi','Tamil Nadu','Chennai','Chennai'),(3,'West bengal','Kolkata','Kolkata','Delhi','Delhi','Delhi'),(4,'Karnataka','Bangalore','Bangalore','West Bengal','Kolkata','Kolkata');
/*!40000 ALTER TABLE `route` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ticket` (
  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,
  `flightid` int(11) NOT NULL,
  `passenger_id` int(11) NOT NULL,
  `flight_status` varchar(5) NOT NULL,
  PRIMARY KEY (`ticket_id`),
  KEY `fk_flightTicket` (`flightid`),
  KEY `fk_passenger` (`passenger_id`),
  CONSTRAINT `fk_flightTicket` FOREIGN KEY (`flightid`) REFERENCES `flight` (`flightid`),
  CONSTRAINT `fk_passenger` FOREIGN KEY (`passenger_id`) REFERENCES `passenger` (`passenger_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,1,1,'y'),(2,1,1,'y'),(3,2,2,'y'),(4,2,2,'y'),(5,2,2,'y'),(6,2,2,'y');
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-02-11  9:00:51
