package vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import controlador.ControlACercaDe;

public class ACercaDe extends JFrame {
	
		private JButton aceptar;
		private Empleado empleado;
		private ControlACercaDe cACD;
	 
		public ACercaDe(Empleado e) 
		{ 
			
		empleado = e;
		cACD = new ControlACercaDe(this, empleado);

		// Caracteristicas de la ventana.
		setTitle("Acerca de...");
		setSize(445, 300);
		setLocationRelativeTo(null);
		setResizable(false);	
		getContentPane().setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 434, 261);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Arial", Font.PLAIN, 12));
		aceptar.setBounds(173, 227, 89, 23);
		panelPrincipal.add(aceptar);
		
		JSeparator separator0 = new JSeparator();
		separator0.setBounds(65, 38, 309, 8);
		panelPrincipal.add(separator0);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(65, 160, 309, 8);
		panelPrincipal.add(separator1);
		
		JSeparator separator2 = new JSeparator();
		separator2.setOrientation(SwingConstants.VERTICAL);
		separator2.setBounds(65, 38, 2, 121);
		panelPrincipal.add(separator2);
		
		JSeparator separator3 = new JSeparator();
		separator3.setOrientation(SwingConstants.VERTICAL);
		separator3.setBounds(372, 38, 2, 121);
		panelPrincipal.add(separator3);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\aCercaDe\\logo.png"));
		logo.setBounds(75, 38, 100, 100);
		panelPrincipal.add(logo);
		
		JLabel nombreSoftware = new JLabel("PEDIDO TELEF\u00D3NICO");
		nombreSoftware.setFont(new Font("Arial", Font.BOLD, 12));
		nombreSoftware.setBounds(195, 57, 127, 14);
		panelPrincipal.add(nombreSoftware);
		
		JLabel autor = new JLabel("Autor: AriPaez");
		autor.setFont(new Font("Arial", Font.BOLD, 12));
		autor.setBounds(205, 82, 89, 14);
		panelPrincipal.add(autor);
		
		//Evento boton
		
		
		aceptar.addActionListener(cACD);
	}

	public JButton getAceptar() {
			return aceptar;
	}
		
	
}
