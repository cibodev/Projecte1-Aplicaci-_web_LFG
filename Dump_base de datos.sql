-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_proyecto
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `friendships`
--

DROP TABLE IF EXISTS `friendships`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friendships` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_usuario2` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_usuario2` (`id_usuario2`),
  CONSTRAINT `friendships_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `friendships_ibfk_2` FOREIGN KEY (`id_usuario2`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friendships`
--

LOCK TABLES `friendships` WRITE;
/*!40000 ALTER TABLE `friendships` DISABLE KEYS */;
INSERT INTO `friendships` VALUES (7,1,2),(8,1,3),(9,3,2),(10,1,4),(11,3,4),(12,1,2),(13,1,3),(14,3,2),(15,1,4),(16,3,4),(17,1,2),(18,1,3),(19,3,2),(20,1,4),(21,3,4),(22,1,2),(23,1,3),(24,3,2),(25,1,4),(26,3,4),(27,1,2),(28,1,3),(29,3,2),(30,1,4),(31,3,4);
/*!40000 ALTER TABLE `friendships` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `game`
--

DROP TABLE IF EXISTS `game`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `game` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,'NombreJuego','imagen'),(2,'NombreJuego','imagen'),(3,'NombreJuego','imagen'),(4,'NombreJuego','imagen'),(5,'NombreJuego','imagen'),(6,'NombreJuego','imagen'),(7,'NombreJuego','imagen'),(8,'NombreJuego','imagen'),(9,'NombreJuego','imagen'),(10,'NombreJuego','imagen'),(11,'NombreJuego','imagen'),(12,'NombreJuego','imagen'),(13,'NombreJuego','imagen'),(14,'NombreJuego','imagen'),(15,'NombreJuego','imagen'),(16,'NombreJuego','imagen'),(17,'NombreJuego','imagen'),(18,'NombreJuego','imagen'),(19,'NombreJuego','imagen'),(20,'NombreJuego','imagen'),(21,'NombreJuego','imagen'),(22,'NombreJuego','imagen'),(23,'NombreJuego','imagen'),(24,'NombreJuego','imagen'),(25,'NombreJuego','imagen'),(26,'NombreJuego','imagen'),(27,'NombreJuego','imagen'),(28,'NombreJuego','imagen'),(29,'NombreJuego','imagen'),(30,'NombreJuego','imagen');
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `from` int NOT NULL,
  `message` varchar(255) NOT NULL,
  `date` datetime DEFAULT NULL,
  `id_party` int NOT NULL,
  PRIMARY KEY (`from`),
  KEY `id_party` (`id_party`),
  CONSTRAINT `message_ibfk_1` FOREIGN KEY (`from`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `message_ibfk_2` FOREIGN KEY (`id_party`) REFERENCES `party` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message`
--

LOCK TABLES `message` WRITE;
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
INSERT INTO `message` VALUES (1,'Hola, que tal?','2021-03-09 00:00:00',8),(2,'Jugamos?','2021-03-09 00:00:00',8),(3,'Bien','2021-03-09 00:00:00',8),(4,'Jugamos?','2021-03-09 00:00:00',8),(5,'OK','2021-03-10 00:00:00',8);
/*!40000 ALTER TABLE `message` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `party`
--

DROP TABLE IF EXISTS `party`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `party` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `id_usuario` int NOT NULL,
  `id_game` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_usuario` (`id_usuario`),
  KEY `id_game` (`id_game`),
  CONSTRAINT `party_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `party_ibfk_2` FOREIGN KEY (`id_game`) REFERENCES `game` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `party`
--

LOCK TABLES `party` WRITE;
/*!40000 ALTER TABLE `party` DISABLE KEYS */;
INSERT INTO `party` VALUES (8,'usuario2536',1,1),(9,'usuario1111',2,2),(10,'emmapago',3,3),(11,'davidlascorz',4,4),(12,'chrivas',5,5),(13,'usuario2536',1,1),(14,'usuario1111',2,2),(15,'emmapago',3,3),(16,'davidlascorz',4,4),(17,'chrivas',5,5),(18,'usuario2536',1,1),(19,'usuario1111',2,2),(20,'emmapago',3,3),(21,'davidlascorz',4,4),(22,'chrivas',5,5),(23,'usuario2536',1,1),(24,'usuario1111',2,2),(25,'emmapago',3,3),(26,'davidlascorz',4,4),(27,'chrivas',5,5),(28,'usuario2536',1,1),(29,'usuario1111',2,2),(30,'emmapago',3,3),(31,'davidlascorz',4,4),(32,'chrivas',5,5);
/*!40000 ALTER TABLE `party` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `fechaNacimiento` datetime DEFAULT NULL,
  `steamUser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(2,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(3,'usuario1111','usuario1111@gmail.com','aksjgd','imagen','1997-05-01 00:00:00','steamUser2'),(4,'emmapago','emmapago97@gmail.com','nfhjsnbds','imagen','1997-07-30 00:00:00','steamUser3'),(5,'davidlascorz','davidlascorz@gmail.com','mmajdgdfid','imagen','1997-02-23 00:00:00','steamUser4'),(6,'chrivas','chrivas@gmail.com','mkdhidnu','imagen','1997-10-05 00:00:00','steamUser5'),(7,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(8,'usuario1111','usuario1111@gmail.com','aksjgd','imagen','1997-05-01 00:00:00','steamUser2'),(9,'emmapago','emmapago97@gmail.com','nfhjsnbds','imagen','1997-07-30 00:00:00','steamUser3'),(10,'davidlascorz','davidlascorz@gmail.com','mmajdgdfid','imagen','1997-02-23 00:00:00','steamUser4'),(11,'chrivas','chrivas@gmail.com','mkdhidnu','imagen','1997-10-05 00:00:00','steamUser5'),(12,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(13,'usuario1111','usuario1111@gmail.com','aksjgd','imagen','1997-05-01 00:00:00','steamUser2'),(14,'emmapago','emmapago97@gmail.com','nfhjsnbds','imagen','1997-07-30 00:00:00','steamUser3'),(15,'davidlascorz','davidlascorz@gmail.com','mmajdgdfid','imagen','1997-02-23 00:00:00','steamUser4'),(16,'chrivas','chrivas@gmail.com','mkdhidnu','imagen','1997-10-05 00:00:00','steamUser5'),(17,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(18,'usuario1111','usuario1111@gmail.com','aksjgd','imagen','1997-05-01 00:00:00','steamUser2'),(19,'emmapago','emmapago97@gmail.com','nfhjsnbds','imagen','1997-07-30 00:00:00','steamUser3'),(20,'davidlascorz','davidlascorz@gmail.com','mmajdgdfid','imagen','1997-02-23 00:00:00','steamUser4'),(21,'chrivas','chrivas@gmail.com','mkdhidnu','imagen','1997-10-05 00:00:00','steamUser5'),(22,'usuario2536','usuario2536@gmail.com','abcde','imagen','1997-09-22 00:00:00','steamUser1'),(23,'usuario1111','usuario1111@gmail.com','aksjgd','imagen','1997-05-01 00:00:00','steamUser2'),(24,'emmapago','emmapago97@gmail.com','nfhjsnbds','imagen','1997-07-30 00:00:00','steamUser3'),(25,'davidlascorz','davidlascorz@gmail.com','mmajdgdfid','imagen','1997-02-23 00:00:00','steamUser4'),(26,'chrivas','chrivas@gmail.com','mkdhidnu','imagen','1997-10-05 00:00:00','steamUser5');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-12 17:51:47
