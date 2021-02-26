package vista;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import controlador.ControlEmpleado;

public class Empleado extends JFrame {

	private JButton producto; 
	private JButton cliente;
	private JButton pedido;
	private JButton backup;
	private JMenu usuario ;
	private JMenuItem contrasenia ;
	private JMenu ayuda ;
	JMenuItem aCercaDe;
	private JMenuBar menuBar ;
	
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
		
		producto = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonRegistroProducto.png"));
		producto.setBounds(34, 18, 105, 105);
		panelMenuPrincipal.add(producto);
		
		cliente = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonRegistroCliente.png"));
		cliente.setBounds(191, 18, 105, 105);
		panelMenuPrincipal.add(cliente);
		
		pedido = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonPedido.png"));
		pedido.setBounds(355, 18, 105, 105);
		panelMenuPrincipal.add(pedido);
		
		backup = new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\botonBackup.png"));
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
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 138, 22);
		getContentPane().add(menuBar);
		
		usuario = new JMenu("USUARIO");
		menuBar.add(usuario);
		
		contrasenia = new JMenuItem("Cambiar contrase\u00F1a");
		usuario.add(contrasenia);
		
		ayuda = new JMenu("AYUDA");
		menuBar.add(ayuda);
		
		aCercaDe = new JMenuItem("A cerca de Call Center");
		ayuda.add(aCercaDe);
	 
		//Eventos botones y de JMenu
		ControlEmpleado cE=new ControlEmpleado(this); 
		
		this.producto.addActionListener(cE);
		this.cliente.addActionListener(cE);
		this.pedido.addActionListener(cE);
		this.backup.addActionListener(cE);
		this.contrasenia.addActionListener(cE);
		this.aCercaDe.addActionListener(cE);

		 
	}

	public JButton getProducto() {
		return producto;
	}

	public JButton getCliente() {
		return cliente;
	}

	public JButton getPedido() {
		return pedido;
	}

	public JButton getBackup() {
		return backup;
	}

	public JMenuItem getContrasenia() {
		return contrasenia;
	}

	public JMenuItem getaCercaDe() {
		return aCercaDe;
	}
   
}
