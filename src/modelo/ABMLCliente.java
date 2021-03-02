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
			
			JOptionPane.showMessageDialog(null,"REGISTRADO CON �XITO","BBDD", 1, null);
			
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage() ,"BBDD", 2, null);
			
			if(e.getMessage().equals("ERROR. CAMPOS VAC�OS."))
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
			if(e.getMessage().equals("ERROR. DNI VAC�O."))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL N�MERO DE DNI CLIENTE DEBE SER DE 8 D�GITOS"))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("EL N�MERO DE DNI DEL CLIENTE  DEBE SER ENTERO"))
			{
				cliente.getJTextFieldDniRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU NOMBRE DEBE SER TIPO STRING"))
			{
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO NOMBRE VAC�O"))
			{
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. SU APELLIDO DEBE SER TIPO STRING'"))
			{
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. CAMPO APELLIDO VAC�O"))
			{
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO CALLE ESTA VAC�O"))
			{
				cliente.getJTextFieldCalleRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL NOMBDE DE CALLE DEBE SER STRING"))
			{
				cliente.getJTextFieldCalleRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO N�MERO DE CASA ESTA VAC�O"))
			{
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL N�MERO DE CASA DEBE SER ENTERO"))
			{
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL N�MERO DE PISO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO N�MERO DE PISO ESTA VAC�O"))
			{
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL DEPARTAMENTO DEBE SER STRING"))
			{ 
				cliente.getJTextFieldDepartamentoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO C�DIGO POSTAL ESTA VAC�O"))
			{
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  C�DIGO POSTAL DEBE ESTAR CONFORMADO ENTRE a-zA-Z0-9"))
			{ 
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL  CODIGO POSTAL DEBE DE SER DE 5 DIG�TOS"))
			{ 
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA DEBE SER STRING"))
			{ 
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO PROVINCIA ESTA VAC�O"))
			{ 
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL CAMPO TELEFONO MOVIL ESTA VAC�O"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO MOVIL DEBE DE 10 DIG�TOS"))
			{ 
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE SER ENTERO"))
			{ 
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DOMICILIO DEBE DE 11 DIG�TOS"))
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
