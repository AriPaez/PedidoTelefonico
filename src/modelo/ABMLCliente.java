package modelo;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
			CallableStatement actualizarCliente=conexionBBDD.
			getConexionBBDD().prepareCall("call actualizarCliente(?,?,?,?,?,?,?,?,?,?,?,?,?,)");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void eliminarCliente()
	{
	 
		try 
		{
			CallableStatement eliminarCliente=conexionBBDD.
			getConexionBBDD().prepareCall("call eliminarCliente(?,?,?,?,?,?,?,?,?,?,?,?,?,)");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	 
	  
}
