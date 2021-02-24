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
