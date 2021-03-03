package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.ABMLProducto;
import vista.Empleado;
import vista.Producto;

public class ControlProducto implements ActionListener {

	private Producto producto;
	private ABMLProducto aBMLProducto;
	
	public ControlProducto(Producto p)
	{
		producto=p;
		aBMLProducto=new ABMLProducto(p);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object botonSeleccionado=e.getSource();
		
		
		if(botonSeleccionado==producto.getCancelarConsulta())
		{
			abrirVentanaEmpleado();
		}
		else if(botonSeleccionado==producto.getConsulta())
		{
			
		}
		else if(botonSeleccionado==producto.getBuscarProductoEliminacion())
		{
			
		}
		else if(botonSeleccionado==producto.getRegistrarEliminacion())
		{
			
		}
		else if(botonSeleccionado==producto.getCancelarEliminacion())
		{
			abrirVentanaEmpleado();
		}
		else if(botonSeleccionado==producto.getCancelarActualizacion())
		{
			abrirVentanaEmpleado();
		}
		else if(botonSeleccionado==producto.getRegistrarActualizacion())
		{
		
		}
		else if(botonSeleccionado==producto.getBuscarProductoActualizacion())
		{
			
		}
		else if(botonSeleccionado==producto.getRegistrarRegistro())
		{
			
		}
		else if(botonSeleccionado==producto.getCancelarRegistro())
		{
			abrirVentanaEmpleado();
		}
		
		 
	}
	
	public void abrirVentanaEmpleado()
	{
		producto.dispose();
		Empleado e=new Empleado();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setVisible(true);
	}
	

}
