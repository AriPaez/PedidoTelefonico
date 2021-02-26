package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.ConexionBBDD;
import vista.Cliente;
import vista.Empleado;

public class ControlEmpleado implements ActionListener {

	private Empleado empleado;
	
	public ControlEmpleado(Empleado e)
	{
		empleado=e;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		Object botonElegido=e.getSource();
		
		if(botonElegido==empleado.getProducto())
		{
			System.out.println("producto");
		}
		else if(botonElegido==empleado.getCliente())
		{
			empleado.dispose();
			Cliente c=new Cliente();
			c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			c.setVisible(true);
		}
		else if(botonElegido==empleado.getPedido())
		{
			System.out.println("pedido");
		}
		else if(botonElegido==empleado.getBackup())
		{
			System.out.println("backup");
		}
		else if(botonElegido==empleado.getContrasenia())
		{
			System.out.println("contrasenia");
		}
		else if(botonElegido==empleado.getaCercaDe())
		{
			System.out.println("acerca de");
		}
		 
		

	}

}
