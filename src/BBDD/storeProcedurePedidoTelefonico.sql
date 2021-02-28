--Iniciar sesion 

ALTER PROCEDURE iniciarSesion(@dni VARCHAR(8),@contrasenia VARBINARY(MAX))
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
	ELSE IF (ISNUMERIC(@dni)=0)
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
ALTER PROCEDURE registrarEmpleado(@dni VARCHAR(8),@contrasenia VARBINARY(MAX))
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
	ELSE IF(ISNUMERIC(@dni)=0)
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

ALTER PROCEDURE registrarCliente(@dniCliente VARCHAR(8) ,
@dniEmpleado VARCHAR(8) ,
@nombre VARCHAR(20) ,@apellido VARCHAR(20) ,@calle VARCHAR(30) ,@nroCasa INT ,@piso INT,@Depto VARCHAR(20) ,@codigoPostal VARCHAR(5) ,@localidad VARCHAR(20) ,@provincia VARCHAR(25) ,@telefonoDomicilio VARCHAR(11),@telefonoMovil VARCHAR(10) )
AS
BEGIN TRY
	IF (@dniCliente='' OR  @dniEmpleado='' OR @nombre ='' OR @apellido ='' OR
	    @calle ='' OR @nroCasa ='' OR @piso ='' OR @Depto ='' OR  
		@codigoPostal ='' OR  @localidad ='' OR @provincia ='' OR 
		@telefonoDomicilio='' OR @telefonoMovil='')
	BEGIN;
		THROW 50000, 'ERROR. CAMPOS VACÍOS.', 1;
	END;
    ELSE IF (@dniCliente ='')
	BEGIN;
		THROW 50000, 'ERROR. DNI VACÍO.', 1;
	END;
	ELSE IF(LEN(@dniCliente )<>8)
	BEGIN;
		THROW 50000, 'EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS', 1;
	END;
	ELSE IF(ISNUMERIC(@dniCliente )=0)
	BEGIN;
		THROW 50000, 'EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO', 1;
	END;
	ELSE IF (@dniEmpleado ='')
	BEGIN;
		THROW 50000, 'ERROR. DNI EMPLEADO VACÍO.', 1;
	END;
	ELSE IF(LEN(@dniEmpleado )<>8)
	BEGIN;
		THROW 50000, 'EL NÚMERO DE DNI EMPLEADO DEBE SER DE 8 DÍGITOS', 1;
	END;
	ELSE IF(ISNUMERIC(@dniEmpleado )=0)
	BEGIN;
		THROW 50000, 'EL NÚMERO DE DNI DEL EMPLEADO DEBE SER ENTERO', 1;
	END;
	ELSE IF(ISNUMERIC(@nombre)=1)
	BEGIN;
		THROW 50000, 'ERROR. SU NOMBRE DEBE SER TIPO STRING', 1;
	END;
	ELSE IF(ISNUMERIC(@apellido)=1)
	BEGIN;
		THROW 50000, 'ERROR. SU APELLIDO DEBE SE TIPO STRING', 1;
	END;
	ELSE IF(ISNUMERIC(@nroCasa)=0)
	BEGIN;
		THROW 50000, 'ERROR. EL NÚMERO DE CASA DEBE SER ENTERO', 1;
	END;
	ELSE IF(ISNUMERIC(@piso)=0)
	BEGIN;
		THROW 50000, 'ERROR. EL NÚMERO DE PISO DEBE SER ENTERO', 1;
	END;
	ELSE IF(ISNUMERIC(@Depto)=1)
	BEGIN;
		THROW 50000, 'ERROR. EL DEPARTAMENTO DEBE SER STRING', 1;
	END;
	ELSE IF(LEN(@codigoPostal)<>5)
	BEGIN;
		THROW 50000, 'ERROR. EL  CODIGO POSTAL DEBE DE 5 DIGÍTOS', 1;
	END;
	ELSE IF(ISNUMERIC(@localidad)=1)
	BEGIN;
		THROW 50000, 'ERROR. EL LOCALIDAD DEBE SER STRING', 1;
	END;
	ELSE IF(ISNUMERIC(@provincia)=1)
	BEGIN;
		THROW 50000, 'ERROR. EL PROVINCIA DEBE SER STRING', 1;
	END;
	ELSE IF(ISNUMERIC(@telefonoMovil)=0)
	BEGIN;
		THROW 50000, 'ERROR. EL TELEFONO DEBE SER ENTERO', 1;
	END;
	ELSE IF(ISNUMERIC(@telefonoDomicilio)=0)
	BEGIN;
		THROW 50000, 'ERROR. EL TELEFONO DEBE SER ENTERO', 1;
	END;
	ELSE IF(LEN(@telefonoDomicilio)<>11)
	BEGIN;
		THROW 50000, 'ERROR. EL TELEFONO DEBE DE 11 DIGÍTOS', 1;
	END;
	ELSE IF(ISNUMERIC(@telefonoMovil)<>10)
	BEGIN;
		THROW 50000, 'ERROR. EL TELEFONO CELULAR DEBE SER DE 10 DIGITOS', 1;
	END;
	ELSE
	BEGIN;
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
		END;
END TRY
BEGIN CATCH
	DECLARE @mensajeDeError VARCHAR(100)
	DECLARE @numeroDeerror INT
	SELECT @mensajeDeError=ERROR_MESSAGE(), @numeroDeerror=ERROR_NUMBER();
	THROW  50000,@mensajeDeError,@numeroDeerror; 
END CATCH

exec registrarCliente '','','','','','','','','','','','',''
