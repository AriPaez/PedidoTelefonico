package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Cliente;
public class ControlCliente implements ActionListener {

	private Cliente cliente;
	//private ABMLCliente aBMLCliente;
	
	public ControlCliente(Cliente c)
	{
		//aBMLCliente=new ABMLCliente(c);
		cliente=c;
	}
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		Object botonElegido=e.getSource();
		
		if(botonElegido==cliente.getRegistrarRegistro())
		{
			
		}
		else if(botonElegido==cliente.getRegistrarActualizacion())
		{
			
		}
		else if(botonElegido==cliente.getRegistrarEliminacion())
		{
			
		}
		else if(botonElegido==cliente.getCancelarRegistro())
		{
			
		}
		else if(botonElegido==cliente.getCancelarActualizacion())
		{
			
		}
		else if(botonElegido==cliente.getCancelarEliminacion())
		{
			
		}
		
		
	}

}
