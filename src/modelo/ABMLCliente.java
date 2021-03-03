package modelo;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import vista.Cliente;
import vista.Login;

public class ABMLCliente {
	
	private Cliente cliente;
	private ConexionBBDD conexionBBDD;
	
	public ABMLCliente(Cliente c)
	{
		cliente=c;
		conexionBBDD=new ConexionBBDD();
	}
	
	
	public void registrarCliente()
	{
		
		try 
		{
			CallableStatement registrarCliente=conexionBBDD.
			getConexionBBDD().
			prepareCall("{call registrarCliente(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
		
			registrarCliente.setString(1,cliente.getDniRegistro());
			registrarCliente.setString(2,Login.getDni());
			registrarCliente.setString(3,cliente.getNombreRegistro());
			registrarCliente.setString(4, cliente.getApellidoRegistro());
			registrarCliente.setString(5,cliente.getCalleRegistro());
			registrarCliente.setInt(6, cliente.getNroCasaRegistro());
			registrarCliente.setInt(7, cliente.getPisoRegistro());
			registrarCliente.setString(8, cliente.getDepartamentoRegistro());
			registrarCliente.setString(9, cliente.getCodigoPostalRegistro());
			registrarCliente.setString(10, cliente.getLocalidadRegistro());
			registrarCliente.setString(11, cliente.getProvinciaRegistro());
			registrarCliente.setString(12, cliente.getTelefonoRegistro());
			registrarCliente.setString(13, cliente.getCelularRegistro());
			 
			registrarCliente.execute();
			
			JOptionPane.showMessageDialog(null,"REGISTRADO CON ÉXITO","BBDD", 1, null);
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage() ,"BBDD", 2, null);
			
			if(e.getMessage().equals("ERROR. CAMPOS VACÍOS."))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
				cliente.getJTextFieldCalleRegistro().setBackground(Color.RED);
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
				cliente.getJTextFieldDepartamentoRegistro().setBackground(Color.RED);
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
				cliente.getJTextFieldLocalidadRegistro().setBackground(Color.RED);
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. DNI VACÍO."))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS"))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO"))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU NOMBRE DEBE SER TIPO STRING"))
			{
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO NOMBRE VACÍO"))
			{
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU APELLIDO DEBE SER TIPO STRING'"))
			{
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO APELLIDO VACÍO"))
			{
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO CALLE ESTA VACÍO"))
			{
				cliente.getJTextFieldCalleRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NOMBDE DE CALLE DEBE SER STRING"))
			{
				cliente.getJTextFieldCalleRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO NÚMERO DE CASA ESTA VACÍO"))
			{
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE CASA DEBE SER ENTERO"))
			{
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE PISO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO NÚMERO DE PISO ESTA VACÍO"))
			{
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL DEPARTAMENTO DEBE SER STRING"))
			{ 
				cliente.getJTextFieldDepartamentoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO CÓDIGO POSTAL ESTA VACÍO"))
			{
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  CÓDIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9"))
			{ 
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIGÍTOS"))
			{ 
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA DEBE SER STRING"))
			{ 
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA ESTA VACÍO"))
			{ 
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO TELEFONO MOVIL ESTA VACÍO"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE DE 10 DIGÍTOS"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIGÍTOS"))
			{ 
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
			}
			
		}
		
	}
	
	public void actualizarCliente()
	{
		 
		try
		{ 
			CallableStatement actualizarCliente=conexionBBDD.getConexionBBDD().
			prepareCall("{call actualizarCliente(?,?,?,?,?,?,?,?,?,?,?,?)}");
 
			actualizarCliente.setString(1,cliente.getDniActualizacion());
			actualizarCliente.setString(2,cliente.getNombreActualizacion());
			actualizarCliente.setString(3, cliente.getApellidoActualizacion());
			actualizarCliente.setString(4,cliente.getCalleActualizacion());
			actualizarCliente.setInt(5, cliente.getNroCasaActualizacion());
			actualizarCliente.setInt(6, cliente.getPisoActualizacion());
			actualizarCliente.setString(7, cliente.getDepartamentoActualizacion());
			actualizarCliente.setString(8, cliente.getCodigoPostalActualizacion());
			actualizarCliente.setString(9, cliente.getLocalidadActualizacion());
			actualizarCliente.setString(10, cliente.getProvinciaActualizacion());
			actualizarCliente.setString(11, cliente.getTelefonoActualizacion());
			actualizarCliente.setString(12, cliente.getCelularActualizacion());
			
			actualizarCliente.execute();
			
			JOptionPane.showMessageDialog(null,"ACTUALIZADO EXITOSAMENTE","BBDD", 1, null);
			
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage() ,"BBDD", 2, null);
			
			if(e.getMessage().equals("ERROR. DNI VACÍO."))
			{
				cliente.getJTextFieldDniActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL NÚMERO DE DNI CLIENTE DEBE SER DE 8 DÍGITOS"))
			{
				cliente.getJTextFieldDniActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL NÚMERO DE DNI DEL CLIENTE  DEBE SER ENTERO"))
			{
				cliente.getJTextFieldDniActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU NOMBRE DEBE SER TIPO STRING"))
			{
				cliente.getJTextFieldNombreActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO NOMBRE VACÍO"))
			{
				cliente.getJTextFieldNombreActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU APELLIDO DEBE SER TIPO STRING'"))
			{
				cliente.getJTextFieldApellidoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO APELLIDO VACÍO"))
			{
				cliente.getJTextFieldApellidoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO CALLE ESTA VACÍO"))
			{
				cliente.getJTextFieldCalleActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NOMBDE DE CALLE DEBE SER STRING"))
			{
				cliente.getJTextFieldCalleActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO NÚMERO DE CASA ESTA VACÍO"))
			{
				cliente.getJTextFieldNroDeCasaActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE CASA DEBE SER ENTERO"))
			{
				cliente.getJTextFieldNroDeCasaActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE PISO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldPisoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO NÚMERO DE PISO ESTA VACÍO"))
			{
				cliente.getJTextFieldPisoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL DEPARTAMENTO DEBE SER STRING"))
			{ 
				cliente.getJTextFieldDepartamentoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO CÓDIGO POSTAL ESTA VACÍO"))
			{
				cliente.getJTextFieldCodigoPostalActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  CÓDIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9"))
			{ 
				cliente.getJTextFieldCodigoPostalActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIGÍTOS"))
			{ 
				cliente.getJTextFieldCodigoPostalActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA DEBE SER STRING"))
			{ 
				cliente.getJTextFieldProvinciaActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA ESTA VACÍO"))
			{ 
				cliente.getJTextFieldProvinciaActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldCelularActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO TELEFONO MOVIL ESTA VACÍO"))
			{ 
				cliente.getJTextFieldCelularActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE DE 10 DIGÍTOS"))
			{ 
				cliente.getJTextFieldCelularActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldTelefonoActualizacion().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIGÍTOS"))
			{ 
				cliente.getJTextFieldTelefonoActualizacion().setBackground(Color.RED);
			}
			
		}
		
		 
		
	}
	
	public void eliminarCliente()
	{
	 
		try 
		{
			CallableStatement eliminarCliente=conexionBBDD.
			getConexionBBDD().prepareCall("{call eliminarCliente(?)}");
			
			eliminarCliente.setString(1, cliente.getDniEliminacion());
			
			eliminarCliente.execute();
			
			JOptionPane.showMessageDialog(null,"ELIMINADO EXITOSAMENTE","BBDD",1, null);
			
		}
		catch (SQLException e)
		{
			
			JOptionPane.showMessageDialog(null,e.getMessage(),"BBDD",2, null);
			 
		}
		
	}
	
	
	public void buscarClienteActualizacion()
	{
		ResultSet tabla = null;
		
		try 
		{
			CallableStatement buscarCliente=conexionBBDD.
			getConexionBBDD().prepareCall("{call buscarCliente(?)}");
			
			
			buscarCliente.setString(1,cliente.getDniActualizacion());
			
			tabla=buscarCliente.executeQuery(); 
			
			while(tabla.next())
			{
				cliente.setNombreActualizacion(tabla.getString(1));
				cliente.setApellidoActualizacion(tabla.getString(2));
				cliente.setCalleActualizacion(tabla.getString(3));
				cliente.setNroCasaActualizacion(tabla.getString(4));
				cliente.setPisoActualizacion(tabla.getString(5));
				cliente.setDepartamentoActualizacion(tabla.getString(6));
				cliente.setCodigoPostalActualizacion(tabla.getString(7));
				cliente.setLocalidadActualizacion(tabla.getString(8));
				cliente.setProvinciaActualizacion(tabla.getString(9));
				cliente.setTelefonoActualizacion(tabla.getString(10));
				cliente.setCelularActualizacion(tabla.getString(11));
			}
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage() ,"BBDD", 2, null);
		}
		
	 
		
	}
	
	public void buscarClienteEliminacion()
	{
		ResultSet tabla = null;
		
		try 
		{
			CallableStatement buscarCliente=conexionBBDD.
			getConexionBBDD().prepareCall("{call buscarCliente(?)}");
			
			
			buscarCliente.setString(1,cliente.getDniEliminacion());
			
			tabla=buscarCliente.executeQuery(); 
			
			while(tabla.next())
			{
				cliente.setNombreEliminacion(tabla.getString(1));
				cliente.setApellidoEliminacion(tabla.getString(2));
				cliente.setCalleEliminacion(tabla.getString(3));
				cliente.setNroCasaEliminacion(tabla.getString(4));
				cliente.setPisoEliminacion(tabla.getString(5));
				cliente.setDepartamentoEliminacion(tabla.getString(6));
				cliente.setCodigoPostalEliminacion(tabla.getString(7));
				cliente.setLocalidadEliminacion(tabla.getString(8));
				cliente.setProvinciaEliminacion(tabla.getString(9));
				cliente.setTelefonoEliminacion(tabla.getString(10));
				cliente.setCelularEliminacion(tabla.getString(11));
			}
			
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage() ,"BBDD", 2, null);
		}
		
		 
	}
	 
	  
}
