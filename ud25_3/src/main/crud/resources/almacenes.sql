CREATE DATABASE almacenes;
USE almacenes;
CREATE TABLE almacenes (
codigo INT,
lugar NVARCHAR (100),
capacidad INT,
PRIMARY KEY (codigo)
) ENGINE=InnoDB;

CREATE TABLE cajas (
numReferencia CHAR (5),
contenido NVARCHAR (100),
valor INT,
almacen INT,
PRIMARY KEY (numReferencia),
FOREIGN KEY (almacen) REFERENCES almacenes (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1234,"Cambrils",3);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1594,"Reus",4);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1236,"Tarragona",8);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (2589,"La canonja",2);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (2225,"Vilafortuny",3);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1478,"Vilaseca",6);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (9652,"Cambrils",2);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1572,"Reus",1);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (1111,"Constanti",0);
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (0125,"Cambrils",5);

INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (02594,"Vasos",50,1234);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (12345,"Platos",400,1594);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (11223,"Libretas",20,1236);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (12212,"Boligrafos",100,2589);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (98745,"PC",900,2225);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (36587,"Teclados",500,1478);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (02587,"Pantalla",70,9652);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (10256,"Regla",20,1572);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (64975,"Lapiz",600,1111);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES (33669,"Mesa",300,0125);

SELECT * FROM almacenes;
SELECT * FROM cajas WHERE valor > 150;
SELECT DISTINCT contenido FROM cajas;
SELECT AVG (valor) FROM cajas;
SELECT almacen, AVG (valor) FROM cajas GROUP BY almacen;
SELECT almacen, AVG (valor) FROM cajas GROUP BY almacen HAVING AVG (valor) > 150;
SELECT NumReferencia, lugar FROM almacenes INNER JOIN CAJAS ON almacenes.codigo = cajas.almacen;
SELECT almacen, COUNT(*) FROM cajas GROUP BY almacen;
INSERT INTO almacenes (codigo, lugar, capacidad) VALUES (4444,"Barcelona",3);
INSERT INTO cajas (numReferencia, contenido, valor, almacen) VALUES ("H5RT", "Papel", 200, 1594);
DELETE FROM cajas WHERE valor <100;
