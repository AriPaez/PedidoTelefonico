package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import modelo.LoginRegistro;
import vista.Login;
import vista.Registro;

public class ControlLogin implements ActionListener {

	private Login login;
	private LoginRegistro loginRegistro;
	
	public ControlLogin (Login l)
	{
		login=l;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		Object botonElegido=e.getSource();
		
		
		if(botonElegido==login.getLogin())
		{
			loginRegistro.login();
		}
		else
		{
			JFrame r=new Registro();
			r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			r.setVisible(true);
		}
		
		
		
	}

}
