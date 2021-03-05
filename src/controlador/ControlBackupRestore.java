package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import vista.BackupRestore;
import vista.Empleado;

public class ControlBackupRestore implements ActionListener {

	private BackupRestore backupRestore;
	
	public ControlBackupRestore(BackupRestore bR)
	{
		backupRestore=bR;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object botonSeleccionado=e.getSource();
		
		
		if(botonSeleccionado==backupRestore.getBackup())
		{
			System.out.println("backup");
		}
		else if(botonSeleccionado==backupRestore.getExaminarBackup())
		{
			System.out.println("examinar backup");
		}
		else if(botonSeleccionado==backupRestore.getSalirBackup())
		{
			backupRestore.dispose();
			Empleado emp=new Empleado();
			emp.setVisible(true);
			emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(botonSeleccionado==backupRestore.getRestore())
		{
			System.out.println("restore");
		}
		else if(botonSeleccionado==backupRestore.getExaminarRestore())
		{
			System.out.println("examinar restore");
		}
		else if(botonSeleccionado==backupRestore.getSalirRestore())
		{
			backupRestore.dispose();
			Empleado emp=new Empleado();
			emp.setVisible(true);
			emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		
		

	}

}
