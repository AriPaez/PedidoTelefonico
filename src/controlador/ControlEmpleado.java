package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import vista.ACercaDe;
import vista.Cliente;
import vista.Empleado;
import vista.Producto;

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
			empleado.dispose();
			JFrame p=new Producto();
			p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			p.setVisible(true);
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
			empleado.setEnabled(false);
			ACercaDe aCD=new ACercaDe(empleado);
			aCD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aCD.setVisible(true);
		}
		  
	}

}
