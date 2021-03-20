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

-- Dump completed on 2021-03-12 17:49:56
