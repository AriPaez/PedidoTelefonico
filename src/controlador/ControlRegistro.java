package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.LoginRegistro;
import vista.Login;
import vista.Registro;

public class ControlRegistro implements ActionListener {

	private Registro registro;
	private LoginRegistro loginRegistro;
	
	public ControlRegistro(Registro r)
	{
		registro=r;
		loginRegistro=new LoginRegistro(r);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		Object botonElegido=e.getSource();
		
		if(botonElegido==registro.getRegistrar())
		{
			loginRegistro.registrarEmpleado();
			
		}
		else
		{
			registro.dispose();
			Login l=new Login();
			l.setVisible(true);
			l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
	}

}
