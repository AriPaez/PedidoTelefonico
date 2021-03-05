package modelo;

import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import vista.Login;
import vista.Producto;

public class ABMLProducto {
	
	private Producto producto;
	private ConexionBBDD conexionBBDD;
	
	public ABMLProducto(Producto p)
	{
		producto=p;
		conexionBBDD=new ConexionBBDD();
	}
	
	
	
	public void registrarProducto()
	{
		try 
		{
			CallableStatement registrarProducto=conexionBBDD.
			getConexionBBDD().prepareCall("{call registrarProducto(?,?,?,?,?,?,?)}");

			registrarProducto.setString(1,producto.getIdProductoRegistro());
			registrarProducto.setString(2,producto.getNombreRegistro());
			registrarProducto.setString(3,producto.getDescripcionRegistro());
			registrarProducto.setFloat(4,producto.getUnidadMedidaRegistro());
			registrarProducto.setFloat(5,producto.getPrecioRegistro());
			registrarProducto.setInt(6,producto.getCantidadRegistro());
			registrarProducto.setString(7,producto.getCategoriaRegistro());
			 
			registrarProducto.execute();
			
			JOptionPane.showMessageDialog(null,"REGISTRADO CON ÉXITO","BBDD", 1, null);
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"BBDD", 1, null);
			
		}
	}
	
	public void actualizarProducto()
	{
		
	}
	
	public void buscarProducto()
	{
		
		
	}
	
	
	public void eliminarProducto()
	{
		
	}

}
