package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Empleado extends JFrame {

	public Empleado()
	{
		// Caracteristicas de la ventana.
		setTitle("CALL CENTER");
		setSize(646, 415);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panelLogroEmpresa= new JPanel();
		panelLogroEmpresa.setBounds(0, 33, 628, 90);
		panelLogroEmpresa.setBorder(BorderFactory.createTitledBorder("MÓDULO"));
		getContentPane().add(panelLogroEmpresa);	
		panelLogroEmpresa.setLayout(null);
		
		JLabel labelLogoEmpresa = new JLabel("");
		labelLogoEmpresa.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\logoCallCenter.png"));
		labelLogoEmpresa.setBounds(10, 11, 618, 68);
		 
		panelLogroEmpresa.add(labelLogoEmpresa);
		
		JPanel panelNombreEmpresa = new JPanel();
		panelNombreEmpresa.setLayout(null);
		panelNombreEmpresa.setBorder(BorderFactory.createTitledBorder("EMPRESA"));
		 
		panelNombreEmpresa.setBounds(0, 125, 628, 90);
		getContentPane().add(panelNombreEmpresa);
		
		JLabel labelNombreEmpresa = new JLabel("CALL CENTER S.A");
		labelNombreEmpresa.setFont(new Font("Times New Roman", Font.BOLD, 30));
		labelNombreEmpresa.setBounds(156, 11, 289, 68);
		panelNombreEmpresa.add(labelNombreEmpresa);
		
		JPanel panelMenuPrincipal = new JPanel();
		panelMenuPrincipal.setBounds(0, 220, 628, 156);
		panelMenuPrincipal.setBorder(BorderFactory.createTitledBorder("MENU PRINCIPAL"));
		getContentPane().add(panelMenuPrincipal);
		panelMenuPrincipal.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(314, 11, 169, 144);
		panelMenuPrincipal.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 154, 608, 12);
		panelMenuPrincipal.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(162, 11, 321, 144);
		panelMenuPrincipal.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(480, 11, 3, 144);
		panelMenuPrincipal.add(separator_3);
		
		JButton producto = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonRegistroProducto.png"));
		producto.setBounds(34, 18, 105, 105);
		panelMenuPrincipal.add(producto);
		
		JButton cliente = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonRegistroCliente.png"));
		cliente.setBounds(191, 18, 105, 105);
		panelMenuPrincipal.add(cliente);
		
		JButton cliente_1 = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonPedido.png"));
		cliente_1.setBounds(355, 18, 105, 105);
		panelMenuPrincipal.add(cliente_1);
		
		JButton backup = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonBackup.png"));
		backup.setBounds(501, 18, 105, 105);
		panelMenuPrincipal.add(backup);
		
		JLabel labelProducto = new JLabel("PRODUCTO");
		labelProducto.setFont(new Font("Arial", Font.BOLD, 15));
		labelProducto.setBounds(44, 134, 94, 14);
		panelMenuPrincipal.add(labelProducto);
		
		JLabel labelCliente = new JLabel("CLIENTE");
		labelCliente.setFont(new Font("Arial", Font.BOLD, 15));
		labelCliente.setBounds(211, 134, 79, 14);
		panelMenuPrincipal.add(labelCliente);
		
		JLabel labelPedido = new JLabel("PEDIDO");
		labelPedido.setFont(new Font("Arial", Font.BOLD, 15));
		labelPedido.setBounds(376, 134, 69, 14);
		panelMenuPrincipal.add(labelPedido);
		
		JLabel labelBackup = new JLabel("BACKUP");
		labelBackup.setFont(new Font("Arial", Font.BOLD, 15));
		labelBackup.setBounds(525, 134, 69, 14);
		panelMenuPrincipal.add(labelBackup);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 182, 22);
		getContentPane().add(menuBar);
		
		JMenu usuario = new JMenu("USUARIO");
		menuBar.add(usuario);
		
		JMenuItem contrasenia = new JMenuItem("Cambiar contrase\u00F1a");
		usuario.add(contrasenia);
		
		JMenu aCerdaDe = new JMenu("A CERCA DE");
		menuBar.add(aCerdaDe);
		
		JMenu exit = new JMenu("EXIT");
		menuBar.add(exit);
	 

		 
	}
}
