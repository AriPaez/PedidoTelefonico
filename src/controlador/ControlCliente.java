package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.ABMLCliente;
import vista.Cliente;
import vista.Empleado;
public class ControlCliente implements ActionListener {

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

	
	public void abrirVentanaEmpleado()
	{
		cliente.dispose();
		Empleado e=new Empleado();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setVisible(true);
	}
	
}
