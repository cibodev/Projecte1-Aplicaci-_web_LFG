CREATE DATABASE empleados;
USE empleados;
CREATE TABLE empleados (
DNI VARCHAR (8),
nombre NVARCHAR (100),
apellidos NVARCHAR (255),
departamento INT,
PRIMARY KEY (DNI),
FOREIGN KEY (departamento) REFERENCES departamentos (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE departamentos (
codigo INT,
nombre NVARCHAR (100),
presupuesto INT,
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39945211,"Emma","Pareja",1);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39944211,"Sara","González",2);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39911211,"Victor","Lozano",3);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39945771,"David","Lascorz",4);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39945331,"Jose","Marín",5);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39945215,"Albert","Jimenez",6);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (31045211,"Noelia","Pérez",7);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39645211,"Jaime","López",8);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39932211,"Sergio","López",9);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (39945511,"Ingrid","Pérez",10);

INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (1,"Emma",10);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (2,"Sara",40);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (3,"Victor",20);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (4,"David",10);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (5,"Jose",80);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (6,"Albert",60);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (7,"Noelia",80);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (8,"Jaime",10);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (9,"Sergio",90);
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (10,"Ingrid",40);

SELECT apellidos FROM empleados;
SELECT DISTINCT apellidos FROM empleados;
SELECT * FROM empleados WHERE apellidos = "López";
SELECT * FROM empleados WHERE apellidos = "López" OR apellidos = "Pérez";
SELECT * FROM empleados WHERE departamento = 14;
SELECT * FROM empleados WHERE departamento = 14 OR departamento =37;
SELECT SUM(presupuesto) FROM departamentos;
SELECT departamento, COUNT(*) FROM empleados GROUP BY departamento;
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (11, "Calidad", 40.000);
INSERT INTO empleados (DNI, nombre, apellidos, departamento) VALUES (89267109, "Esther", "Vázquez", 11);
UPDATE empleados SET departamento = 4 WHERE departamento = 77;
DELETE FROM empleados WHERE departamento = 4;
SELECT * FROM departamentos WHERE presupuesto >( SELECT AVG (presupuesto) FROM departamentos);
SELECT * FROM empleados WHERE apellidos LIKE "P%";
SELECT * FROM empleados WHERE departamento = 3 OR departamento = 7;
DELETE FROM empleados;

