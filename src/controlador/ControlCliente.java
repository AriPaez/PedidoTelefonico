package controlador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

import modelo.ABMLCliente;
import vista.Cliente;
import vista.Empleado;
public class ControlCliente extends KeyAdapter implements ActionListener {

	private Cliente cliente;
	private ABMLCliente aBMLCliente;
	
	public ControlCliente(Cliente c)
	{
		aBMLCliente=new ABMLCliente(c);
		cliente=c;
	}
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		Object botonElegido=e.getSource();
		
		if(botonElegido==cliente.getRegistrarRegistro())
		{
			aBMLCliente.registrarCliente();
		}
		else if(botonElegido==cliente.getRegistrarActualizacion())
		{
			aBMLCliente.actualizarCliente();
		}
		else if(botonElegido==cliente.getRegistrarEliminacion())
		{
			aBMLCliente.eliminarCliente();
		}
		else if(botonElegido==cliente.getCancelarRegistro())
		{
			abrirVentanaEmpleado();
		}
		else if(botonElegido==cliente.getCancelarActualizacion())
		{
			abrirVentanaEmpleado();
		}
		else if(botonElegido==cliente.getCancelarEliminacion())
		{
			abrirVentanaEmpleado();
		}
		
		
	}

	public void keyPressed(KeyEvent e)
	{
		Object jTextFieldEscrito=e.getSource();
	
		if(jTextFieldEscrito==cliente.getJTextFieldDniRegistro())
		{
			cliente.getJTextFieldDniRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldNombreRegistro())
		{
			cliente.getJTextFieldNombreRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldApellidoRegistro())
		{
			cliente.getJTextFieldApellidoRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldPisoRegistro())
		{
			cliente.getJTextFieldPisoRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldCalleRegistro())
		{
			cliente.getJTextFieldCalleRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldNroCasaRegistro())
		{
			cliente.getJTextFieldNroCasaRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldDepartamentoRegistro())
		{
			cliente.getJTextFieldDepartamentoRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldCodigoPostalRegistro())
		{
			cliente.getJTextFieldCodigoPostalRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldLocalidadRegistro())
		{
			cliente.getJTextFieldLocalidadRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldProvinciaRegistro())
		{
			cliente.getJTextFieldProvinciaRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldTelefonoRegistro())
		{
			cliente.getJTextFieldTelefonoRegistro().setBackground(Color.WHITE);
		}
		else if(jTextFieldEscrito==cliente.getJTextFieldCelularRegistro())
		{
			cliente.getJTextFieldCelularRegistro().setBackground(Color.WHITE);
		}
		
	 
		
	}
	
	
	public void abrirVentanaEmpleado()
	{
		cliente.dispose();
		Empleado e=new Empleado();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setVisible(true);
	}
	
}
