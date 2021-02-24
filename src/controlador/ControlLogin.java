package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.LoginRegistro;
import vista.Empleado;
import vista.Login;
import vista.Registro;

public class ControlLogin implements ActionListener {

	private Login login;
	private LoginRegistro loginRegistro;
	
	public ControlLogin (Login l)
	{
		login=l;
		loginRegistro=new LoginRegistro(l);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		Object botonElegido=e.getSource();
		
		
		if(botonElegido==login.getLogin())
		{
			boolean sesion;
			sesion=loginRegistro.login();
			
			if(sesion)
			{
				JOptionPane.showMessageDialog(null,
				"Iniciado Correctamente", "Login", 1, null);
				
				login.dispose();
				JFrame emp=new Empleado();
				emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				emp.setVisible(true);
				
			 
				loginRegistro.conexionBBDD.cerrarConexionBBDD();
			
			}
			
			
		}
		else
		{
			login.dispose();
			JFrame r=new Registro();
			r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			r.setVisible(true);
		}
		
		
		
	}

}
