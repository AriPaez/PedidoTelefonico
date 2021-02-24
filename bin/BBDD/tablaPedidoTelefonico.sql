CREATE TABLE empleado
(
 dniEmpleado VARCHAR (8) PRIMARY KEY NOT NULL,
 contrasenia VARBINARY(MAX)NOT NULL
)

CREATE TABLE cliente
(
	dniCliente VARCHAR(8) PRIMARY KEY NOT NULL,
	dniEmpleado VARCHAR(8) NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	apellido VARCHAR(20) NOT NULL,
	calle VARCHAR(30) NOT NULL,
	nroCasa INT NOT NULL,
	piso INT NOT NULL,
	Depto INT NOT NULL,
	codigoPostal VARCHAR(5) NOT NULL,
	localidad VARCHAR(30) NOT NULL,
	provincia VARCHAR(30) NOT NULL,
	telefonoDomicilio VARCHAR(10) NOT NULL,
	telefonoMovil VARCHAR(10) NOT NULL

	FOREIGN KEY(dniEmpleado) REFERENCES Empleado(dniEmpleado)
)


CREATE TABLE producto
(
	idProducto VARCHAR(4) PRIMARY KEY NOT NULL,
	nombre VARCHAR(20),
	descripcion VARCHAR(30),
	unidadDeMedida FLOAT,
	precio FLOAT,
	categoria VARCHAR(20)
)

CREATE TABLE pedido
(
	idPedido INT PRIMARY KEY  IDENTITY (1,1) NOT NULL,
	dniCliente VARCHAR(8) NOT NULL,
	idProducto VARCHAR(4) NOT NULL,
	fecha DATE NOT NULL,
	hora TIME NOT NULL,
	formaPago VARCHAR(20) NOT NULL,
	franjaHorarioEntrega VARCHAR(10) NOT NULL,

	FOREIGN KEY(dniCliente) REFERENCES cliente(dniCliente),
	FOREIGN KEY(idProducto) REFERENCES producto(idProducto)
)

