package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.ACercaDe;
import vista.Empleado;

public class ControlACercaDe implements ActionListener {

	private ACercaDe aCercaDe;
	private Empleado empleado;
		
	public ControlACercaDe(ACercaDe a,Empleado e)
	{
		aCercaDe=a;
		empleado=e;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Se activa la ventana Empleado nuevamente.
		aCercaDe.dispose();
		empleado.setEnabled(true);
		
	}

}
