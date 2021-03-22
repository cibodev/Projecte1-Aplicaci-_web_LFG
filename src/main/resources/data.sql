USE proyecto;
-- tabla usuario 

DROP TABLE IF exists `message`;
DROP TABLE IF exists `friendships`;
DROP TABLE IF exists `party`;
DROP TABLE IF exists `game`;
DROP TABLE IF exists `user_roles`;
DROP TABLE IF exists `roles`;
DROP TABLE IF exists `usuario`;

CREATE TABLE `usuario` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(255) NOT NULL UNIQUE,
`email` VARCHAR(255) NOT NULL UNIQUE,
`password` VARCHAR(255) NOT NULL,
`imagen` VARCHAR(255) DEFAULT NULL,
`birthdate`DATETIME, 
`steamuser` VARCHAR(255),
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- tabla game
CREATE TABLE `game` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(255) NOT NULL UNIQUE,
`imagen` VARCHAR(255) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- tabla party
CREATE TABLE `party` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(255) NOT NULL UNIQUE,
`id_usuario` INT NOT NULL,
`id_game` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (`id_game`) REFERENCES `game` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

-- tabla message
CREATE TABLE `message` (
`id` INT NOT NULL AUTO_INCREMENT,
`from` INT NOT NULL,
`message` VARCHAR(255) NOT NULL,
`date` DATETIME,
`id_party` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`from`) REFERENCES `usuario` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (`id_party`) REFERENCES `party` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

-- tabla friendships
CREATE TABLE `friendships` (
`id` INT NOT NULL AUTO_INCREMENT,
`id_usuario` INT NOT NULL,
`id_usuario2` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (`id_usuario2`) REFERENCES `usuario` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

CREATE TABLE `roles` (
`id` INT NOT NULL AUTO_INCREMENT,
`name` varchar(255) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `user_roles` (
`id` INT NOT NULL AUTO_INCREMENT,
`user_id` INT NOT NULL,
`role_id` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`user_id`) REFERENCES `usuario` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

-- inserts usuario
INSERT INTO usuario (`username`, `email`, `password`, `imagen`, `birthdate`, `steamuser`) VALUES ("usuario2536","usuario2536@gmail.com","abcde","imagen","1997-09-22","steamUser1");
INSERT INTO usuario (`username`, `email`, `password`, `imagen`, `birthdate`, `steamuser`) VALUES ("usuario1111","usuario1111@gmail.com","aksjgd","imagen","1997-05-01","steamUser2");
INSERT INTO usuario (`username`, `email`, `password`, `imagen`, `birthdate`, `steamuser`) VALUES ("emmapago","emmapago97@gmail.com","nfhjsnbds","imagen","1997-07-30","steamUser3");
INSERT INTO usuario (`username`, `email`, `password`, `imagen`, `birthdate`, `steamuser`) VALUES ("davidlascorz","davidlascorz@gmail.com","mmajdgdfid","imagen","1997-02-23","steamUser4");
INSERT INTO usuario (`username`, `email`, `password`, `imagen`, `birthdate`, `steamuser`) VALUES ("chrivas","chrivas@gmail.com","mkdhidnu","imagen","1997-10-05","steamUser5");

-- inserts game
INSERT INTO game (`nombre`, `imagen`) VALUES ("NombreJuego1","imagen");
INSERT INTO game (`nombre`, `imagen`) VALUES ("NombreJuego2","imagen");
INSERT INTO game (`nombre`, `imagen`) VALUES ("NombreJuego3","imagen");
INSERT INTO game (`nombre`, `imagen`) VALUES ("NombreJuego4","imagen");
INSERT INTO game (`nombre`, `imagen`) VALUES ("NombreJuego5","imagen");

-- inserts party
INSERT INTO party (`nombre`, `id_usuario`, `id_game`) VALUES ("usuario2536",4,2);
INSERT INTO party (`nombre`, `id_usuario`, `id_game`) VALUES ("usuario1111",4,2) ;
INSERT INTO party (`nombre`, `id_usuario`, `id_game`) VALUES ("emmapago",4,3);
INSERT INTO party (`nombre`, `id_usuario`, `id_game`) VALUES ("davidlascorz",5,3);
INSERT INTO party (`nombre`, `id_usuario`, `id_game`) VALUES ("chrivas",5,3);

-- inserts message
INSERT INTO message (`from`, `message`, `date`, `id_party`) VALUES (1, "Hola, que tal?", "2021-03-09",2);
INSERT INTO message (`from`, `message`, `date`, `id_party`) VALUES (2, "Bien, y tu?", "2021-03-09", 2);
INSERT INTO message (`from`, `message`, `date`, `id_party`) VALUES (3, "Bien", "2021-03-09", 3);
INSERT INTO message (`from`, `message`, `date`, `id_party`) VALUES (4, "Jugamos?", "2021-03-09", 3);
INSERT INTO message (`from`, `message`, `date`, `id_party`) VALUES (5, "OK", "2021-03-10", 4);

-- inserts friendships
INSERT INTO friendships (`id_usuario`, `id_usuario2`) VALUES (1, 2);
INSERT INTO friendships (`id_usuario`, `id_usuario2`) VALUES (1, 3);
INSERT INTO friendships (`id_usuario`, `id_usuario2`) VALUES (3, 2);
INSERT INTO friendships (`id_usuario`, `id_usuario2`) VALUES (1, 4);
INSERT INTO friendships (`id_usuario`, `id_usuario2`) VALUES (3, 4);

INSERT INTO roles (`id`,`name`) VALUES (1,"ROLE_USER");
INSERT INTO roles (`id`,`name`) VALUES (2,"ROLE_MODERATOR");
INSERT INTO roles (`id`,`name`) VALUES (3,"ROLE_ADMIN");


INSERT INTO usuario (username, password,email) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','davidlm14@hotmail.com');