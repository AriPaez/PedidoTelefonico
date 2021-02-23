package modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import vista.Login;
import vista.Registro;

public class LoginRegistro {

	public Login login;
	public Registro registro;
	public ConexionBBDD conexionBBDD;

	public LoginRegistro(Login l) {
		login = l;
		conexionBBDD = new ConexionBBDD();
	}

	public LoginRegistro(Registro r) {
		registro = r;
	}

	public boolean login() {
		
		CallableStatement iniciarSesion;
		ResultSet tabla;
		try
		{
			iniciarSesion = conexionBBDD.getConexionBBDD()
			.prepareCall("{call iniciarSesion(?,?)}");
			
			iniciarSesion .setString(1,login.getDni());
			iniciarSesion .setString(2,login.getPassword());
			 
			
			tabla=iniciarSesion.executeQuery();
			 
			if(tabla.next())
			{
				return true;
			}
			 
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", 2, null);
		}
		finally
		{
			conexionBBDD.cerrarConexionBBDD();
		}
		
		return false;
 
	}

	public void registrar() {
		
		CallableStatement registrar;
		ResultSet tabla;
		try
		{
			registrar = conexionBBDD.getConexionBBDD()
			.prepareCall("{call iniciarSesion(?,?)}");
			
			registrar .setString(1,login.getDni());
			registrar .setString(2,login.getPassword());
			 
			registrar.execute();
			 
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", 2, null);
		}
		finally
		{
			conexionBBDD.cerrarConexionBBDD();
		}

	}

}
