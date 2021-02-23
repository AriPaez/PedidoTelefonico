package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexionBBDD {
	
	private Connection conexionABBDD;
	
	public ConexionBBDD()
	{
		try 
		{
			conexionABBDD = DriverManager.getConnection("jdbc:sqlserver://;database=PedidoTelefonico;integratedSecurity=true;");
			 
		} catch (SQLException e) 
		{
			
			JOptionPane.showMessageDialog(null,
			"No se ha podido conectar a la BBDD 'PedidoTelefonico'","Error",2, null);
			 
		}
	}
	
	public Connection getConexionBBDD()
	{
		return conexionABBDD;
	}
	
	public void cerrarConexionBBDD()
	{
		try 
		{
			conexionABBDD.close();
		} 
		catch (SQLException e)
		{
			 
			e.printStackTrace();
		}
	}

}
