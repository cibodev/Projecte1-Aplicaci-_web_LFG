CREATE DATABASE informatica;
USE informatica;
CREATE TABLE fabricantes (
codigo INT,
nombre NVARCHAR (100),
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

CREATE TABLE articulos (
codigo INT,
nombre NVARCHAR (100),
precio INT,
fabricante INT,
PRIMARY KEY (codigo),
FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

INSERT INTO fabricantes (codigo, nombre) VALUES (002,"Pantalla");
INSERT INTO fabricantes (codigo, nombre) VALUES (003,"Ratón");
INSERT INTO fabricantes (codigo, nombre) VALUES (004,"Teclado");
INSERT INTO fabricantes (codigo, nombre) VALUES (005,"Libreta");
INSERT INTO fabricantes (codigo, nombre) VALUES (006,"Cable");
INSERT INTO fabricantes (codigo, nombre) VALUES (007,"Conector");
INSERT INTO fabricantes (codigo, nombre) VALUES (008,"Luces");
INSERT INTO fabricantes (codigo, nombre) VALUES (009,"Torre");
INSERT INTO fabricantes (codigo, nombre) VALUES (9652,"Camara");

INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (002,"Pantalla",50,002);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (003,"Ratón", 12, 003);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (004,"Teclado", 20, 004);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (005,"Libreta", 5, 005);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (006,"Cable", 8, 006);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (007,"Conector", 10, 007);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (008,"Luces", 15, 008);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (009,"Torre", 400, 009);
INSERT INTO articulos (codigo, nombre, precio, fabricante) VALUES (9652,"Camara", 120, 010);

SELECT nombre FROM articulos;
SELECT nombre, precio FROM articulos;
SELECT nombre FROM articulos WHERE precio >= 200;
SELECT * FROM articulos WHERE precio >= 60 AND precio <=120;
SELECT nombre, precio * 166.386 FROM articulos;
SELECT AVG (precio) FROM articulos;
SELECT AVG (precio) FROM articulos WHERE fabricante=2;
SELECT COUNT(*) FROM articulos WHERE precio >=180;
SELECT nombre, precio FROM articulos WHERE precio >=180;
SELECT * FROM articulos, fabricantes WHERE articulos.fabricante = fabricantes.codigo;
SELECT AVG (precio), fabricante FROM articulos GROUP BY fabricante;
SELECT AVG (precio), fabricantes.nombre FROM articulos, fabricantes WHERE articulos.fabricante = fabricantes.codigo GROUP BY fabricantes.nombre;
SELECT nombre, precio FROM articulos WHERE precio=(SELECT MIN(precio) FROM ARTICULOS);
INSERT INTO articulos (nombre,precio,fabricante) VALUES ('Altavoces',70,2);
UPDATE articulos SET nombre = 'Impresora Laser' WHERE codigo=008;
UPDATE articulos SET precio=precio*0.9;
UPDATE articulos SET precio=precio-10 WHERE precio >=120;