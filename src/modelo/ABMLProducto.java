package modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
			
			producto.setIdProductoRegistro("");
			producto.setNombreRegistro("");
			producto.setDescripcionRegistro("");
			producto.setUnidadMedidaRegistro("");
			producto.setPrecioRegistro("");
			producto.setCantidadRegistro("");
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"BBDD", 1, null);
			
		}
	}
	
	public void actualizarProducto()
	{
		try 
		{
			CallableStatement actualizarProducto=conexionBBDD.
			getConexionBBDD().prepareCall("{call actualizarProducto(?,?,?,?,?,?,?)}");

			actualizarProducto.setString(1,producto.getIdProductoActualizacion()); 
			actualizarProducto.setString(2,producto.getNombreActualizacion());
			actualizarProducto.setString(3,producto.getDescripcionActualizacion());
			actualizarProducto.setFloat(4,producto.getUnidadMedidaActualizacion());
			actualizarProducto.setFloat(5,producto.getPrecioActualizacion());
			actualizarProducto.setInt(6,producto.getCantidadActualizacion());
			actualizarProducto.setString(7,producto.getCategoriaActualizacion());
			 
			actualizarProducto.execute();
			
			JOptionPane.showMessageDialog(null,"ACTUALIZADO CON ÉXITO","BBDD", 1, null);
			
			producto.setIdProductoActualizacion("");
			producto.setNombreActualizacion("");
			producto.setDescripcionActualizacion("");
			producto.setUnidadMedidaActualizacion("");
			producto.setPrecioActualizacion("");
			producto.setCantidadActualizacion("");
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"BBDD", 1, null);
			
		}
	}
	
	public void buscarProductoActualizacion()
	{
		ResultSet tabla=null;
		
		try 
		{
			CallableStatement buscarProducto=conexionBBDD.
			getConexionBBDD().prepareCall("{call buscarProducto(?)}");

			buscarProducto.setString(1, producto.getIdProductoActualizacion());
			tabla=buscarProducto.executeQuery();
			
			while(tabla.next())
			{
				producto.setNombreActualizacion(tabla.getString(1));
				producto.setDescripcionActualizacion(tabla.getString(2));
				producto.setUnidadMedidaActualizacion(tabla.getString(3));
				producto.setPrecioActualizacion(tabla.getString(4));
				producto.setCantidadActualizacion(tabla.getString(5));
				producto.setCategoriaActualizacion(tabla.getString(6));
			}
			
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage(),"BBDD", 1, null);
			
		}
	}
	
	
	public void eliminarProducto()
	{
		
	}
	
 

}
