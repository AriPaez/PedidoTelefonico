package modelo;

import java.awt.Color;
import java.sql.CallableStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import vista.Cliente;

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
			registrarCliente.setString(2,"");
			registrarCliente.setString(3,cliente.getNombreRegistro());
			registrarCliente.setString(4, cliente.getApellidoRegistro());
			registrarCliente.setString(5,cliente.getCalleRegistro());
			registrarCliente.setInt(6, cliente.getNroCasaRegistro());
			registrarCliente.setString(7, cliente.getPisoRegistro());
			registrarCliente.setString(8, cliente.getDepartamentoRegistro());
			registrarCliente.setString(9, cliente.getCodigoPostalRegistro());
			registrarCliente.setString(10, cliente.getLocalidadRegistro());
			registrarCliente.setString(11, cliente.getProvinciaRegistro());
			registrarCliente.setString(12, cliente.getTelefonoRegistro());
			registrarCliente.setString(13, cliente.getTelefonoRegistro());
			
			registrarCliente.execute();
			
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
				cliente.setDniRegistro("");
			}
			if(e.getMessage().equals("ERROR. SU NOMBRE DEBE SER TIPO STRING"))
			{
				cliente.getJTextFieldNombreRegistro().setBackground(Color.RED);
				cliente.setNombreRegistro("");
			}
			if(e.getMessage().equals("ERROR. SU APELLIDO DEBE SE TIPO STRING"))
			{
				cliente.getJTextFieldApellidoRegistro().setBackground(Color.RED);
				cliente.setApellidoRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE CASA DEBE SER ENTERO"))
			{
				cliente.getJTextFieldNroCasaRegistro().setBackground(Color.RED);
				cliente.setNroCasaRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL NÚMERO DE PISO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldPisoRegistro().setBackground(Color.RED);
				cliente.setPisoRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL DEPARTAMENTO DEBE SER STRING"))
			{
				cliente.getJTextFieldDepartamentoRegistro().setBackground(Color.RED);
				cliente.setDepartamentoRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL  CODIGO POSTAL DEBE DE 5 DIGÍTOS"))
			{
				cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.RED);
				cliente.setCodigoPostalRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL LOCALIDAD DEBE SER STRING"))
			{
				cliente.getJTextFieldLocalidadRegistro().setBackground(Color.RED);
				cliente.setLocalidadRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL PROVINCIA DEBE SER STRING"))
			{
				cliente.getJTextFieldProvinciaRegistro().setBackground(Color.RED);
				cliente.setProvinciaRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
				cliente.setTelefonoRegistro("");
				
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DEBE SER ENTERO"))
			{
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
				cliente.setTelefonoRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO DEBE DE 11 DIGÍTOS"))
			{
				cliente.getJTextFieldTelefonoRegistro().setBackground(Color.RED);
				cliente.setTelefonoRegistro("");
			}
			if(e.getMessage().equals("ERROR. EL TELEFONO CELULAR DEBE SER DE 10 DIGITOS"))
			{
				cliente.getJTextFieldCelularRegistro().setBackground(Color.RED);
				cliente.setCelularRegistro("");
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
