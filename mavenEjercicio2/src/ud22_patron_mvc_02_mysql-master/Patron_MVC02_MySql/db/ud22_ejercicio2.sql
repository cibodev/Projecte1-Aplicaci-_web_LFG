
CREATE DATABASE IF NOT EXISTS `ud22_ejercicio1`;
USE `ud22_ejercicio1`;

--
-- Table structure for table `persona`
--


CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) DEFAULT NULL,
  `apellido` varchar(250) DEFAULT NULL,
  `direccion` varchar(250) DEFAULT NULL,
  `DNI` varchar(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  PRIMARY KEY (`id`)
  );

CREATE TABLE `videos` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`titulo` VARCHAR(250) DEFAULT NULL,
`director` VARCHAR (250) DEFAULT NULL,
`cli_id` INT(11) DEFAULT NULL,
PRIMARY KEY (`id`),
CONSTRAINT `videos_fk` FOREIGN KEY (`cli_id`) REFERENCES `cliente`(`id`)
) ENGINE=InnoDB;

--
-- Dumping data for table `persona`
--

INSERT INTO `cliente` VALUES (100,'Jaume', 'Lopez','Calle Escobar',12365478, 30/09/2020);
INSERT INTO `cliente` VALUES (101,'Joan', 'Marsal','Avenida Pedro III',65432100, 25/05/2002);
INSERT INTO `cliente` VALUES (102,'Jordi', 'Rubio','Calle Virgen del camino',32145623, 02/02/2021);
INSERT INTO `cliente` VALUES (103,'Arnau', 'Aladid','Calle San Antonio',21596320, 09/03/2021);
INSERT INTO `cliente` VALUES (104,'Daniel', 'Sopena','Mirador de Montepinar',39641257,04/05/2019);
INSERT INTO `cliente` VALUES (105,'Luis', 'Martinez','Calle Estrega fugaz',36210541,08/09/2015);
INSERT INTO `cliente` VALUES (106,'Laia', 'Fernandez','Calle Ramon Berenguer IV',36541205, 20/03/2012);

INSERT INTO `videos` VALUES (1,'Uno de los nuestros', 'Scorsese',100);
INSERT INTO `videos` VALUES (2,'Pulp Fiction', 'Tarantino',101);
INSERT INTO `videos` VALUES (3,'El padrino', 'Coppola',102);
INSERT INTO `videos` VALUES (4,'La naranja mecánica', 'Kurbrick',103);
INSERT INTO `videos` VALUES (5,'La lista de Schindler', 'Spielberg',104);
INSERT INTO `videos` VALUES (6,'El club de la lucha', 'Fincher','105');
INSERT INTO `videos` VALUES (7,'El caballero oscuro', 'Nolan','100');


