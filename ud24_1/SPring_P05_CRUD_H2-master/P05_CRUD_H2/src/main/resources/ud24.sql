CREATE DATABASE ud24;
USE ud24;
CREATE TABLE empleados (
id INT AUTO_INCREMENT,
nomApels VARCHAR(255) NOT NULL,
salario INT,
trabajo VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB;

INSERT INTO empleados (nomApels, salario, trabajo) VALUES ("Emma Pareja", 1200, "Frontend");
INSERT INTO empleados (nomApels, salario, trabajo) VALUES ("David Lascorz", 2500, "Developer");
INSERT INTO empleados (nomApels, salario, trabajo) VALUES ("Jose Marín", 2500, "Developer");
INSERT INTO empleados (nomApels, salario, trabajo) VALUES ("Victor Lozano", 2000, "Backend");
INSERT INTO empleados (nomApels, salario, trabajo) VALUES ("Christian Rivas", 1200, "Frontend");

