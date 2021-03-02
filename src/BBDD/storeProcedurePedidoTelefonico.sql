--Iniciar sesion 

ALTER PROCEDURE iniciarSesion(@dni VARCHAR(8),@contrasenia VARBINARY(MAX))
AS
BEGIN TRY

	IF (@contrasenia='' AND @dni='')
	BEGIN
		RAISERROR('ERROR. CAMPOS VAC�OS',14,1)
	END
	ELSE IF (@contrasenia='')
	BEGIN
		RAISERROR('ERROR. INGRESE CONTRASE�A',14,1)
	END
	ELSE IF (@dni='')
	BEGIN
		RAISERROR('ERROR. INGRESE DNI',14,1)
	END
	ELSE IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL N�MERO DE DNI DEBE SER DE 8 D�GITOS',14,1)
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
		RAISERROR('ERROR. CAMPOS VAC�OS',14,1)
	END
	ELSE IF (@contrasenia='')
	BEGIN
		RAISERROR('ERROR. INGRESE CONTRASE�A',14,1)
	END
	ELSE IF (@dni='')
	BEGIN
		RAISERROR('ERROR. INGRESE DNI',14,1)
	END
	ELSE IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL N�MERO DE DNI DEBE SER DE 8 D�GITOS',14,1)
	END
	ELSE IF(ISNUMERIC(@dni)=0)
	BEGIN
		RAISERROR('EL N�MERO DE DNI DEBE SER ENTERO',14,1)
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
		@nombre VARCHAR(20) ,
		@apellido VARCHAR(20) ,
		@calle VARCHAR(30) ,
		@nroCasa INT ,
		@piso INT,
		@Depto VARCHAR(20) ,
		@codigoPostal VARCHAR(5) ,
		@localidad VARCHAR(20) ,
		@provincia VARCHAR(25) ,
		@telefonoDomicilio VARCHAR(11),
		@telefonoMovil VARCHAR(10) )
		AS
		BEGIN TRY
			IF (@dniCliente='' AND  @dniEmpleado='' AND   @nombre ='' AND  
			   @apellido ='' AND    @calle ='' AND   @nroCasa ='' AND   @piso ='' 
			   AND @Depto ='' AND  @codigoPostal ='' AND    @localidad ='' 
			   AND @provincia ='' AND   @telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPOS VAC�OS.', 1;
			END;
			ELSE IF (@dniCliente ='')
			BEGIN;
				THROW 50000, 'ERROR. DNI VAC�O.', 1;
			END;
			ELSE IF(@dniCliente LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'EL N�MERO DE DNI DEL CLIENTE  DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@dniCliente )<>8)
			BEGIN;
				THROW 50000, 'EL N�MERO DE DNI CLIENTE DEBE SER DE 8 D�GITOS', 1;
			END;
			ELSE IF(@nombre='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO NOMBRE VAC�O', 1;
			END;
			ELSE IF(@nombre LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. SU NOMBRE DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@apellido='')
			BEGIN;
				THROW 50000, 'ERROR. CAMPO APELLIDO VAC�O', 1;
			END;
			ELSE IF(@apellido LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. SU APELLIDO DEBE SER TIPO STRING', 1;
			END;
			ELSE IF(@calle='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO CALLE ESTA VAC�O', 1;
			END;
			ELSE IF(@calle LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. EL NOMBDE DE CALLE DEBE SER STRING', 1;
			END;
			ELSE IF(@nroCasa=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO N�MERO DE CASA ESTA VAC�O', 1;
			END;
			ELSE IF(@nroCasa=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL N�MERO DE CASA DEBE SER ENTERO', 1;
			END;
			ELSE IF(@piso=0)
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO N�MERO DE PISO ESTA VAC�O', 1;
			END;
			ELSE IF(@piso=-1)
			BEGIN;
				THROW 50000, 'ERROR. EL N�MERO DE PISO DEBE SER ENTERO', 1;
			END;
			ELSE IF(@Depto='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO DEPARTAMENTO ESTA VAC�O', 1;
			END;
			ELSE IF(@Depto LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. EL DEPARTAMENTO DEBE SER STRING', 1;
			END;
			ELSE IF(@codigoPostal='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO C�DIGO POSTAL ESTA VAC�O', 1;
			END;
			ELSE IF(@codigoPostal LIKE '%[^a-zA-Z0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL  C�DIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9', 1;
			END;
			ELSE IF(LEN(@codigoPostal)<>5)
			BEGIN;
				THROW 50000, 'ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIG�TOS', 1;
			END;
			ELSE IF(@localidad='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO LOCALIDAD ESTA VAC�O', 1;
			END;
			ELSE IF(@localidad LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. EL LOCALIDAD DEBE SER STRING', 1;
			END;
			ELSE IF(@provincia='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA ESTA VAC�O', 1;
			END;
			ELSE IF(@provincia LIKE '%[^a-zA-Z\s]')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO PROVINCIA DEBE SER STRING', 1;
			END;
			ELSE IF(@telefonoMovil='')
			BEGIN;
				THROW 50000, 'ERROR. EL CAMPO TELEFONO MOVIL ESTA VAC�O', 1;
			END;
			ELSE IF(@telefonoMovil LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE SER ENTERO', 1;
			END;
			ELSE  IF(LEN(@telefonoMovil)<>10)
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO MOVIL DEBE DE 10 DIG�TOS', 1;
			END;
			ELSE IF(@telefonoDomicilio LIKE '%[^0-9]%')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO', 1;
			END;
			ELSE IF(LEN(@telefonoDomicilio)<>11 AND @telefonoDomicilio<>'')
			BEGIN;
				THROW 50000, 'ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIG�TOS', 1;
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

  --Actualizar cliente.