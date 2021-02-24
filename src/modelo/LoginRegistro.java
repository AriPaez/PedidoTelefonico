package modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
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
		conexionBBDD = new ConexionBBDD();
	}

	public boolean login() {
		
		CallableStatement iniciarSesion;
		ResultSet tabla = null;
		try
		{
			iniciarSesion = conexionBBDD.getConexionBBDD()
			.prepareCall("{call iniciarSesion(?,?)}");
			
			iniciarSesion.setString(1,login.getDni());
			iniciarSesion.setBytes(2,login.getPassword());

			tabla=iniciarSesion.executeQuery();
			 
			if(tabla.next())
			{
				return true;
			}
			 
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", 2, null);
			login.setDni("");
			login.setPassword("");
		}
		 
		return false;
 
	}

	public void registrarEmpleado() {
		
		CallableStatement registrar;
		
		try
		{
			registrar = conexionBBDD.getConexionBBDD()
			.prepareCall("{call registrarEmpleado(?,?)}");
			
			registrar.setString(1,registro.getDni());
			registrar.setBytes(2,registro.getPassword());
			 
			registrar.execute();
			
			JOptionPane.showMessageDialog(null,"REGISTRADO EXITOSAMENTE", 
			"REGISTRO", 1, null);
			
			registro.dispose();
			Login l=new Login();
			l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			l.setVisible(true);
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERROR", 2, null);
			
			registro.setDni("");
			registro.setPassword("");
		}
		 

	}

 
	
}
