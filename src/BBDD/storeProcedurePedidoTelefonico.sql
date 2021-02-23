--Iniciar sesion 

ALTER PROCEDURE iniciarSesion(@dni VARCHAR(8),@contrasenia VARBINARY(MAX))
AS
BEGIN TRY

	IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL N�MERO DE DNI DEBE SER DE 8 D�GITOS',14,1)
	END
	ELSE IF (ISNUMERIC(@contrasenia)=0)
	BEGIN
		RAISERROR('ERROR. EL N�MERO DE DNI DEBE ENTERO',14,1)
	END
	ELSE IF NOT EXISTS (SELECT dniEmpleado FROM empleado WHERE dniEmpleado=@dni
	AND contrasenia=@contrasenia)
	BEGIN
		RAISERROR('ERROR. NO EXISTE NINGUNA CUENTA ASOCIADA
		AL DNI INGRESADO',14,1)
	END
	ELSE
	BEGIN
		 SELECT dniEmpleado FROM empleado WHERE dniEmpleado=@dni
		 AND PWDCOMPARE(contrasenia,@contrasenia)=1
	END
END TRY
BEGIN CATCH
	DECLARE @mensajeDeError VARCHAR(100)
	SELECT @mensajeDeError=ERROR_MESSAGE()
	RAISERROR (@mensajeDeError,14,1)
END CATCH

--registrar empleado
CREATE PROCEDURE registrarEmpleado(@dni VARCHAR(8),@contrasenia VARBINARY(MAX))
AS
BEGIN TRY

	IF(LEN(@dni)<>8)
	BEGIN
		RAISERROR('EL N�MERO DE DNI DEBE SER DE 8 D�GITOS',14,1)
	END
	ELSE IF (ISNUMERIC(@contrasenia)=0)
	BEGIN
		RAISERROR('ERROR. EL N�MERO DE DNI DEBE ENTERO',14,1)
	END
	ELSE IF EXISTS (SELECT dniEmpleado FROM empleado WHERE dniEmpleado=@dni
	AND contrasenia=@contrasenia)
	BEGIN
		RAISERROR('ERROR. YA EXISTE EL DNI EN LA BBDD.',14,1)
	END
	ELSE
	BEGIN
	 INSERT INTO empleado
			   (dniEmpleado
			   ,contrasenia)
		 VALUES(@dni,PWDENCRYPT(@contrasenia))
	END
END TRY
BEGIN CATCH
	DECLARE @mensajeDeError VARCHAR(100)
	SELECT @mensajeDeError=ERROR_MESSAGE()
	RAISERROR (@mensajeDeError,14,1)
END CATCH
