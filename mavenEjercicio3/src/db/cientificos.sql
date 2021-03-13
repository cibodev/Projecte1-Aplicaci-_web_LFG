CREATE DATABASE cientificos;
USE cientificos;
CREATE TABLE cientificos (
DNI VARCHAR(8) NOT NULL UNIQUE,
nomApels NVARCHAR (255) NOT NULL,
PRIMARY KEY (DNI)
)ENGINE=InnoDB;

CREATE TABLE asignado (
cientifico VARCHAR(8) NOT NULL,
proyecto CHAR(4) NOT NULL,
PRIMARY KEY (cientifico, proyecto),
FOREIGN KEY (cientifico) REFERENCES cientificos (DNI),
FOREIGN KEY (cientifico) REFERENCES proyecto (id)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE proyecto (
id CHAR(4) NOT NULL,
nombre NVARCHAR(255) NOT NULL,
horas INT NOT NULL,
PRIMARY KEY (id) 
)ENGINE=InnoDB;


INSERT INTO cientificos VALUES (39915711,"Emma");
INSERT INTO cientificos VALUES (39945721,"Sara");
INSERT INTO cientificos VALUES (39945751,"David");
INSERT INTO cientificos VALUES (39945741,"Victor");
INSERT INTO cientificos VALUES (39945791,"Jose");
INSERT INTO cientificos VALUES (39945711,"Noelia");
INSERT INTO cientificos VALUES (39945751,"Albert");
INSERT INTO cientificos VALUES (39945741,"Sergio");
INSERT INTO cientificos VALUES (39945711,"Ingrid");
INSERT INTO cientificos VALUES (39945211,"Nicol");

INSERT INTO asignado VALUES ("cientifico1","proyecto1");
INSERT INTO asignado VALUES ("cientifico2","proyecto2");
INSERT INTO asignado VALUES ("cientifico3","proyecto3");
INSERT INTO asignado VALUES ("cientifico4","proyecto4");
INSERT INTO asignado VALUES ("cientifico5","proyecto5");
INSERT INTO asignado VALUES ("cientifico6","proyecto6");
INSERT INTO asignado VALUES ("cientifico7","proyecto7");
INSERT INTO asignado VALUES ("cientifico8","proyecto8");
INSERT INTO asignado VALUES ("cientifico9","proyecto9");
INSERT INTO asignado VALUES ("cientifico10","proyecto1");

INSERT INTO proyecto VALUES ("id1","nombre1",10);
INSERT INTO proyecto VALUES ("id2","nombre2",20);
INSERT INTO proyecto VALUES ("id3","nombre3",80);
INSERT INTO proyecto VALUES ("id4","nombre4",50);
INSERT INTO proyecto VALUES ("id5","nombre5",40);
INSERT INTO proyecto VALUES ("id6","nombre6",60);
INSERT INTO proyecto VALUES ("id7","nombre7",50);
INSERT INTO proyecto VALUES ("id8","nombre8",10);
INSERT INTO proyecto VALUES ("id9","nombre9",20);
INSERT INTO proyecto VALUES ("id10","nombre10",10);