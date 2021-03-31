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
`imagen` LONGBLOB DEFAULT NULL,
`birthdate`DATETIME, 
`steamuser` VARCHAR(255),
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- tabla game
CREATE TABLE `game` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(255) NOT NULL UNIQUE,
`imagen` LONGBLOB DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- tabla party
CREATE TABLE `party` (
`id` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(255) NOT NULL UNIQUE,
`id_usuario` INT NOT NULL,
`id_game` INT NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- tabla message
CREATE TABLE `message` (
`id` INT NOT NULL AUTO_INCREMENT,
`message` VARCHAR(255) NOT NULL,
`fecha` DATETIME NOT NULL,
`id_party` INT NOT NULL,
`id_usuario` INT NOT NULL,
PRIMARY KEY (`id`),
FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (`id_party`) REFERENCES `party` (`id`)
ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB;

-- tabla friendships
CREATE TABLE `friendships` (
`id` INT NOT NULL AUTO_INCREMENT,
`id_usuario` INT NOT NULL,
`id_usuario2` INT NOT NULL,
PRIMARY KEY (`id`)
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
ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
ON UPDATE CASCADE ON DELETE CASCADE
) ENGINE=InnoDB;

-- inserts usuario
INSERT INTO usuario (username, password,email) VALUES ('admin', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','davidlm14@hotmail.com');


-- inserts friendships

INSERT INTO roles (`id`,`name`) VALUES (1,"ROLE_USER");
INSERT INTO roles (`id`,`name`) VALUES (2,"ROLE_MODERATOR");
INSERT INTO roles (`id`,`name`) VALUES (3,"ROLE_ADMIN");
