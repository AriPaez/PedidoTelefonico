--Iniciar sesion 

ALTER PROCEDURE iniciarSesion(@dni VARCHAR(9),@contrasenia VARBINARY(MAX))
AS
BEGIN TRY

	IF (@contrasenia='' AND @dni='')
	BEGIN
		RAISERROR('ERROR. CAMPOS VACÍOS',14,1)
	END
	ELSE IF (@contrasenia='')
	BEGIN
		RAISERROR('ERROR. INGRESE CONTRASEÑA',14,1)
	END
	ELSE IF (@dni='')
	BEGIN
		RAISERROR('ERROR. INGRESE DNI',14,1)
	END
	ELSE IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL NÚMERO DE DNI DEBE SER DE 8 DÍGITOS',14,1)
	END
	ELSE IF (@dni LIKE '%[^0-9]%')
	BEGIN
		RAISERROR('ERROR. EL DNI DEBE SER ENTERO',14,1)
	END
	ELSE IF NOT EXISTS (SELECT dniEmpleado FROM empleado WHERE dniEmpleado=@dni
	AND HASHBYTES('SHA2_512',@contrasenia)=contrasenia)
	BEGIN
		RAISERROR('ERROR. NO EXISTE NINGUNA CUENTA ASOCIADA
		AL DNI INGRESADO',14,1)
	END
	ELSE
	BEGIN
		 SELECT dniEmpleado 
		 FROM empleado
		 WHERE dniEmpleado=@dni AND HASHBYTES('SHA2_512',@contrasenia)=contrasenia
	END
END TRY
BEGIN CATCH
	DECLARE @mensajeDeError VARCHAR(100)
	SELECT @mensajeDeError=ERROR_MESSAGE()
	RAISERROR (@mensajeDeError,14,1)
END CATCH

--registrar empleado
ALTER PROCEDURE registrarEmpleado(@dni VARCHAR(9),@contrasenia VARBINARY(MAX))
AS
BEGIN TRY

	IF (@contrasenia='' AND @dni='')
	BEGIN
		RAISERROR('ERROR. CAMPOS VACÍOS',14,1)
	END
	ELSE IF (@contrasenia='')
	BEGIN
		RAISERROR('ERROR. INGRESE CONTRASEÑA',14,1)
	END
	ELSE IF (@dni='')
	BEGIN
		RAISERROR('ERROR. INGRESE DNI',14,1)
	END
	ELSE IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL NÚMERO DE DNI DEBE SER DE 8 DÍGITOS',14,1)
	END
	ELSE IF(@dni LIKE '%[^0-9]%')
	BEGIN
		RAISERROR('EL NÚMERO DE DNI DEBE SER ENTERO',14,1)
	END
	ELSE IF EXISTS (SELECT dniEmpleado FROM empleado WHERE dniEmpleado=@dni)
	BEGIN
		RAISERROR('ERROR. YA EXISTE EL DNI EN LA BBDD.',14,1)
	END
	ELSE
	BEGIN
	 INSERT INTO empleado
			   (dniEmpleado
			   ,contrasenia)
		 VALUES(@dni, HASHBYTES('SHA2_512',@contrasenia))
	END
END TRY
BEGIN CATCH
	DECLARE @mensajeDeError VARCHAR(100)
	SELECT @mensajeDeError=ERROR_MESSAGE()
	RAISERROR (@mensajeDeError,14,1)
END CATCH

--registrar cliente

ALTER PROCEDURE registrarCliente(@dniCliente VARCHAR(9) ,
		@dniEmpleado VARCHAR(9) ,
		@nombre VARCHAR(20) ,
		@apellido VARCHAR(20) ,
		@calle VARCHAR(30) ,
		@nroCasa INT ,
		@piso INT,
		@Depto VARCHAR(20) ,
		@codigoPostal VARCHAR(6) ,
		@localidad VARCHAR(20) ,
		@provincia VARCHAR(25) ,
		@telefonoDomicilio VARCHAR(12),
		@telefonoMovil VARCHAR(11) )
		AS
		BEGIN TRY
			IF (@dniCliente='' AND  @dniEmpleado='' AND   @nombre ='' AND  
			   @apellido ='' AND    @calle ='' AND   @nroCasa ='' AND   @piso ='' 
			   AND @Depto ='' AND  @codigoPostal ='' AND    @localidad ='' 
			   AND @provincia ='' AND   @telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPOS VACÍOS.', 1;
			END;
			ELSE IF (@dniCliente ='')
			BEGIN;
				THROW 50000, 'ERROR. DNI VACÍO.', 1;
			END;
			ELSE IF(@dniCliente LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@dniCliente )<>8)
			BEGIN;
				THROW 50000, 'EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS', 1;
			END;
			ELSE IF(@nombre='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO NOMBRE VACÍO', 1;
			END;
			ELSE IF(@nombre LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. SU NOMBRE DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@apellido='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO APELLIDO VACÍO', 1;
			END;
			ELSE IF(@apellido LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. SU APELLIDO DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@calle='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CALLE ESTA VACÍO', 1;
			END;
			ELSE IF(@calle LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL NOMBDE DE CALLE DEBE SER STRING', 1;
			END;
			ELSE IF(@nroCasa=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO NÚMERO DE CASA ESTA VACÍO', 1;
			END;
			ELSE IF(@nroCasa=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL NÚMERO DE CASA DEBE SER ENTERO', 1;
			END;
			ELSE IF(@piso=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO NÚMERO DE PISO ESTA VACÍO', 1;
			END;
			ELSE IF(@piso=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL NÚMERO DE PISO DEBE SER ENTERO', 1;
			END;
			ELSE IF(@Depto='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO DEPARTAMENTO ESTA VACÍO', 1;
			END;
			ELSE IF(@Depto LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL DEPARTAMENTO DEBE SER STRING', 1;
			END;
			ELSE IF(@codigoPostal='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CÓDIGO POSTAL ESTA VACÍO', 1;
			END;
			ELSE IF(@codigoPostal LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL  CÓDIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN(@codigoPostal)<>5)
			BEGIN;
				THROW 50000, 'ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIGÍTOS', 1;
			END;
			ELSE IF(@localidad='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO LOCALIDAD ESTA VACÍO', 1;
			END;
			ELSE IF(@localidad LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL LOCALIDAD DEBE SER STRING', 1;
			END;
			ELSE IF(@provincia='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA ESTA VACÍO', 1;
			END;
			ELSE IF(@provincia LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA DEBE SER STRING', 1;
			END;
			ELSE IF(@telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO TELEFONO MOVIL ESTA VACÍO', 1;
			END;
			ELSE IF(@telefonoMovil LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE SER ENTERO', 1;
			END;
			ELSE  IF(LEN(@telefonoMovil)<>10)
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE DE 10 DIGÍTOS', 1;
			END;
			ELSE IF(@telefonoDomicilio LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@telefonoDomicilio)<>11 AND @telefonoDomicilio<>'')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIGÍTOS', 1;
			END;
			ELSE
			INSERT INTO [dbo].[cliente]
					   ([dniCliente]
					   ,[dniEmpleado]
					   ,[nombre]
					   ,[apellido]
					   ,[calle]
					   ,[nroCasa]
					   ,[piso]
					   ,[Depto]
					   ,[codigoPostal]
					   ,[localidad]
					   ,[provincia]
					   ,[telefonoDomicilio]
					   ,[telefonoMovil])
				 VALUES
					   (@dniCliente
					   ,@dniEmpleado
					   ,@nombre
					   ,@apellido
					   ,@calle
					   ,@nroCasa
					   ,@piso
					   ,@Depto
					   ,@codigoPostal
					   ,@localidad
					   ,@provincia
					   ,@telefonoDomicilio
					   ,@telefonoMovil)
		END TRY
		BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror; 
		END CATCH

--Buscar cliente
ALTER PROCEDURE buscarCliente(@dniCliente VARCHAR(9))
AS
BEGIN TRY
		IF (@dniCliente ='')
		BEGIN;
			THROW 50000, 'ERROR. DNI VACÍO.', 1;
		END;
		ELSE IF(@dniCliente LIKE '%[^0-9]%')
		BEGIN;
			THROW 50000, 'EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO', 1;
		END;
		ELSE IF(LEN(@dniCliente)<>8)
		BEGIN;
			THROW 50000, 'EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS', 1;
		END;
		ELSE IF NOT EXISTS(SELECT dniCliente FROM cliente WHERE dniCliente=@dniCliente)
		BEGIN;
			THROW 50000, 'NO EXISTE NINGÚN CLIENTE CON EL DNI INGRESADO', 1;
		END;
		ELSE
		BEGIN;
			SELECT nombre,apellido,calle,nroCasa,piso,Depto,codigoPostal,
			localidad,provincia,telefonoDomicilio,telefonoMovil 
			FROM cliente
			WHERE dniCliente=@dniCliente
		END;
END TRY
BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror; 
END CATCH

--actualizar cliente
ALTER PROCEDURE actualizarCliente(@dniCliente VARCHAR(9),
		@nombre VARCHAR(20) ,
		@apellido VARCHAR(20) ,
		@calle VARCHAR(30) ,
		@nroCasa INT ,
		@piso INT,
		@Depto VARCHAR(20) ,
		@codigoPostal VARCHAR(6) ,
		@localidad VARCHAR(20) ,
		@provincia VARCHAR(25) ,
		@telefonoDomicilio VARCHAR(12),
		@telefonoMovil VARCHAR(11) )
		AS
		BEGIN TRY
			IF (@dniCliente='' AND @nombre ='' AND  @apellido ='' AND    @calle ='' AND   @nroCasa ='' AND   @piso ='' 
			   AND @Depto ='' AND  @codigoPostal ='' AND    @localidad ='' 
			   AND @provincia ='' AND   @telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPOS VACÍOS.', 1;
			END;
			ELSE IF (@dniCliente ='')
			BEGIN;
				THROW 50000, 'ERROR. DNI VACÍO.', 1;
			END;
			ELSE IF(@dniCliente LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@dniCliente )<>8)
			BEGIN;
				THROW 50000, 'EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS', 1;
			END;
			ELSE IF(@nombre='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO NOMBRE VACÍO', 1;
			END;
			ELSE IF(@nombre LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. SU NOMBRE DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@apellido='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO APELLIDO VACÍO', 1;
			END;
			ELSE IF(@apellido LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. SU APELLIDO DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@calle='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CALLE ESTA VACÍO', 1;
			END;
			ELSE IF(@calle LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL NOMBDE DE CALLE DEBE SER STRING', 1;
			END;
			ELSE IF(@nroCasa=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO NÚMERO DE CASA ESTA VACÍO', 1;
			END;
			ELSE IF(@nroCasa=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL NÚMERO DE CASA DEBE SER ENTERO', 1;
			END;
			ELSE IF(@piso=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO NÚMERO DE PISO ESTA VACÍO', 1;
			END;
			ELSE IF(@piso=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL NÚMERO DE PISO DEBE SER ENTERO', 1;
			END;
			ELSE IF(@Depto='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO DEPARTAMENTO ESTA VACÍO', 1;
			END;
			ELSE IF(@Depto LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL DEPARTAMENTO DEBE SER STRING', 1;
			END;
			ELSE IF(@codigoPostal='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CÓDIGO POSTAL ESTA VACÍO', 1;
			END;
			ELSE IF(@codigoPostal LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL  CÓDIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN(@codigoPostal)<>5)
			BEGIN;
				THROW 50000, 'ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIGÍTOS', 1;
			END;
			ELSE IF(@localidad='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO LOCALIDAD ESTA VACÍO', 1;
			END;
			ELSE IF(@localidad LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL LOCALIDAD DEBE SER STRING', 1;
			END;
			ELSE IF(@provincia='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA ESTA VACÍO', 1;
			END;
			ELSE IF(@provincia LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA DEBE SER STRING', 1;
			END;
			ELSE IF(@telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO TELEFONO MOVIL ESTA VACÍO', 1;
			END;
			ELSE IF(@telefonoMovil LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE SER ENTERO', 1;
			END;
			ELSE  IF(LEN(@telefonoMovil)<>10)
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE DE 10 DIGÍTOS', 1;
			END;
			ELSE IF(@telefonoDomicilio LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@telefonoDomicilio)<>11 AND @telefonoDomicilio<>'')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIGÍTOS', 1;
			END;
			ELSE
			UPDATE [dbo].[cliente]
			   SET [nombre] =@nombre
				  ,[apellido] =@apellido
				  ,[calle] = @calle 
				  ,[nroCasa] =@nroCasa
				  ,[piso] = @piso
				  ,[Depto] =@Depto
				  ,[codigoPostal] =@codigoPostal
				  ,[localidad] = @localidad
				  ,[provincia] = @provincia
				  ,[telefonoDomicilio] = @telefonoDomicilio
				  ,[telefonoMovil] = @telefonoMovil
			 WHERE dniCliente=@dniCliente
		END TRY
		BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror; 
		END CATCH

--ELIMINAR CLIENTE.
CREATE PROCEDURE eliminarCliente(@dniCliente VARCHAR(8))
AS
BEGIN TRY
		  DELETE FROM [dbo].[cliente]
		  WHERE dniCliente=@dniCliente
END TRY
BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror; 
END CATCH

--REGISTRAR PRODUCTO.
ALTER PROCEDURE registrarProducto(@idProducto VARCHAR(5),
@nombre VARCHAR(20),@descripcion VARCHAR(30),@unidadDeMedida FLOAT,
@precio FLOAT,@cantidad INT,@categoria VARCHAR(25))
AS
BEGIN TRY
			IF (@idProducto='' AND @nombre='' AND  @descripcion='' 
			AND @unidadDeMedida='' AND  @precio ='' AND   @cantidad ='' AND   @categoria ='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPOS VACÍOS.', 1;
			END;
			ELSE IF (@idProducto ='')
			BEGIN;
				THROW 50000, 'ERROR. idProducto VACÍO.', 1;
			END;
			ELSE IF(@idProducto LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'EL idProducto DEBE TENER EL FORMATO a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN (@idProducto)<>4  )
			BEGIN;
				THROW 50000, 'EL ID PRODUCTO DEBE SER DE 4 DÍGITOS', 1;
			END;
			ELSE IF EXISTS (SELECT idProducto FROM producto WHERE idProducto=@idProducto)
			BEGIN;
				THROW 50000, 'ERROR. YA EXISTE EL PRODUCTO EN LA BBDD', 1;
			END;
			ELSE IF(@nombre='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO NOMBRE PRODUCTO ESTÁ VACÍO', 1;
			END;
			ELSE IF(@nombre LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL NOMBRE DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE IF(@descripcion='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO  descripcionProducto ESTÁ VACÍO', 1;
			END;
			ELSE IF(@descripcion LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. LA DESCRIPCION DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE IF(@unidadDeMedida=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO unidad de medida ESTA VACÍO', 1;
			END;
			ELSE IF(@unidadDeMedida=-1)
			BEGIN;
				THROW 50000, 'ERROR. LA UNIDAD DE MEDIDA DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@precio=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PRECIO ESTA VACÍO', 1;
			END;
			ELSE IF(@precio=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL PRECIO PRODUCTO DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@precio<=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PRECIO DEBE SER MAYOR CERO', 1;
			END;
			ELSE IF(@cantidad=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTIDAD ESTA VACÍO', 1;
			END;
			ELSE IF(@cantidad=-1)
			BEGIN;
				THROW 50000, 'ERROR. LA CANTIDAD DE PRODUCTO DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@cantidad<=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTIDAD DEBE SER MAYOR A CERO', 1;
			END;
			ELSE IF(@categoria='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTEGORIA ESTÁ VACÍO', 1;
			END;
			ELSE IF(@categoria LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. LA CATEGORIA DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE
			BEGIN;
			INSERT INTO [dbo].[producto]
           ([idProducto]
           ,[nombre]
           ,[descripcion]
           ,[unidadDeMedida]
           ,[precio]
           ,[cantidad]
           ,[categoria])
			VALUES
           (@idProducto
           ,@nombre
           ,@descripcion 
           ,@unidadDeMedida 
           ,ROUND(@precio,2)
           ,@cantidad
           ,@categoria)
			END;
END TRY
BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror;
END CATCH

--buscar producto.
ALTER PROCEDURE buscarProducto(@idProducto VARCHAR(5))
AS
BEGIN TRY
			IF (@idProducto='')
			BEGIN;
				THROW 50000, 'ERROR. ID VACIO.', 1;
			END; 
			ELSE IF(@idProducto LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'EL idProducto DEBE TENER EL FORMATO a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN (@idProducto)<>4)
			BEGIN;
				THROW 50000, 'EL ID PRODUCTO DEBE SER DE 4 DÍGITOS', 1;
			END;
			ELSE IF NOT EXISTS (SELECT idProducto FROM producto WHERE idProducto=@idProducto)
			BEGIN;
				THROW 50000, 'ERROR. NO EXISTE EL PRODUCTO EN LA BBDD', 1;
			END;
			ELSE
			BEGIN;
				SELECT nombre,descripcion,unidadDeMedida,precio,cantidad,categoria
				FROM producto 
				WHERE idProducto=@idProducto
			END;
END TRY
BEGIN CATCH
		DECLARE @mensajeDeError VARCHAR(100)
		DECLARE @numeroDeerror INT
		SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
		THROW  50000,@mensajeDeError,@numeroDeerror; 
END CATCH
 
--actualizar producto
CREATE PROCEDURE actualizarProducto(@idProducto VARCHAR(5),
@nombre VARCHAR(20),@descripcion VARCHAR(30),@unidadDeMedida FLOAT,
@precio FLOAT,@cantidad INT,@categoria VARCHAR(25))
AS
BEGIN TRY
			IF (@idProducto='' AND @nombre='' AND  @descripcion='' 
			AND @unidadDeMedida='' AND  @precio ='' AND   @cantidad ='' AND   @categoria ='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPOS VACÍOS.', 1;
			END;
			ELSE IF (@idProducto ='')
			BEGIN;
				THROW 50000, 'ERROR. idProducto VACÍO.', 1;
			END;
			ELSE IF(@idProducto LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'EL idProducto DEBE TENER EL FORMATO a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN (@idProducto)<>4  )
			BEGIN;
				THROW 50000, 'EL ID PRODUCTO DEBE SER DE 4 DÍGITOS', 1;
			END;
			ELSE IF(@nombre='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO NOMBRE PRODUCTO ESTÁ VACÍO', 1;
			END;
			ELSE IF(@nombre LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. EL NOMBRE DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE IF(@descripcion='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO  descripcionProducto ESTÁ VACÍO', 1;
			END;
			ELSE IF(@descripcion LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. LA DESCRIPCION DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE IF(@unidadDeMedida=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO unidad de medida ESTA VACÍO', 1;
			END;
			ELSE IF(@unidadDeMedida=-1)
			BEGIN;
				THROW 50000, 'ERROR. LA UNIDAD DE MEDIDA DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@precio=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PRECIO ESTA VACÍO', 1;
			END;
			ELSE IF(@precio=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL PRECIO PRODUCTO DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@precio<=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PRECIO DEBE SER MAYOR CERO', 1;
			END;
			ELSE IF(@cantidad=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTIDAD ESTA VACÍO', 1;
			END;
			ELSE IF(@cantidad=-1)
			BEGIN;
				THROW 50000, 'ERROR. LA CANTIDAD DE PRODUCTO DEBE SER UN VALOR NUMÉRICO', 1;
			END;
			ELSE IF(@cantidad<=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTIDAD DEBE SER MAYOR A CERO', 1;
			END;
			ELSE IF(@categoria='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CANTEGORIA ESTÁ VACÍO', 1;
			END;
			ELSE IF(@categoria LIKE '%[^a-zA-Z\s]%')
			BEGIN;
				THROW 50000, 'ERROR. LA CATEGORIA DE PRODUCTO DEBE TENER EL FORMATO a-zA-Z', 1;
			END;
			ELSE
			BEGIN;
		    UPDATE [dbo].[producto]
		    SET[nombre] = @nombre
			  ,[descripcion] = @descripcion
			  ,[unidadDeMedida] = @unidadDeMedida
			  ,[precio] = @precio
			  ,[cantidad] = @cantidad
			  ,[categoria] = @categoria
		   WHERE idProducto=@idProducto
			END;
END TRY
BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror;
END CATCH

--elimnar producto
CREATE PROCEDURE eliminarProducto(@idProducto VARCHAR(5))
AS
BEGIN TRY
			 
			IF (@idProducto ='')
			BEGIN;
				THROW 50000, 'ERROR. idProducto VACÍO.', 1;
			END;
			ELSE IF(@idProducto LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'EL idProducto DEBE TENER EL FORMATO a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN (@idProducto)<>4  )
			BEGIN;
				THROW 50000, 'EL ID PRODUCTO DEBE SER DE 4 DÍGITOS', 1;
			END;
			BEGIN;
				DELETE FROM [dbo].[producto]
				WHERE idProducto=@idProducto
			END;    
END TRY
BEGIN CATCH
			DECLARE @mensajeDeError VARCHAR(100)
			DECLARE @numeroDeerror INT
			SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
			THROW  50000,@mensajeDeError,@numeroDeerror;
END CATCH
