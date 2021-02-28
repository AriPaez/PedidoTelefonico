package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControlLogin;

public class Login extends JFrame {
	
	private JPasswordField password;
	private JButton registrar;
	private static JTextField dni ;
	private JButton login ;
	
	public Login() {
		
		// Caracteristicas de la ventana.
		setTitle("Login");
		setSize(288, 409);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel laminaPrincipal = new JPanel();
		laminaPrincipal.setBackground(Color.decode("#41bbec"));
		laminaPrincipal.setBounds(0, 0, 272, 370);
		getContentPane().add(laminaPrincipal);
		laminaPrincipal.setLayout(null);
		
		JLabel labelLoginIcon = new JLabel("");
		labelLoginIcon.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\loginIcona.png"));
		labelLoginIcon.setBounds(110, 37, 50, 56);
		laminaPrincipal.add(labelLoginIcon);
		
		JLabel labelDni = new JLabel("DNI");
		labelDni.setFont(new Font("Arial", Font.BOLD, 20));
		labelDni.setBounds(28, 92, 94, 24);
		laminaPrincipal.add(labelDni);
		
		dni= new JTextField();
		dni.setBounds(16, 126, 234, 22);
		laminaPrincipal.add(dni);
		
		password = new JPasswordField();
		password.setBounds(16, 207, 234, 24);
		laminaPrincipal.add(password);
		
		JLabel labelLogin = new JLabel("LOGIN");
		labelLogin.setFont(new Font("Arial", Font.BOLD, 30));
		labelLogin.setBounds(100, 2, 94, 24);
		laminaPrincipal.add(labelLogin);
		
		JLabel labelContrasenia = new JLabel("Contrase\u00F1a");
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 20));
		labelContrasenia.setBounds(28, 172, 116, 24);
		laminaPrincipal.add(labelContrasenia);
		
		login=new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginSeleccion.png"));
		login.setRolloverIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telefónicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginDeteccionMouse.png"));
		login.setFocusPainted(false);
		login.setText("Login");
		login.setHorizontalTextPosition(SwingConstants.CENTER); 
		login.setFont(new Font("Arial", Font.BOLD, 12));
		login.setBounds(87, 263, 90, 25);
		login.setBorder(null);	
		laminaPrincipal.add(login);
		
		JLabel labelCuenta = new JLabel("\u00BFNo tiene cuenta?");
		labelCuenta.setFont(new Font("Arial", Font.ITALIC, 12));
		labelCuenta.setBounds(87, 309, 107, 14);
		laminaPrincipal.add(labelCuenta);
		
		registrar=new JButton(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginSeleccion.png"));
		registrar.setRolloverIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telefónicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginDeteccionMouse.png"));
		registrar.setFocusPainted(false);
		registrar.setText("Registrarse");
		registrar.setHorizontalTextPosition(SwingConstants.CENTER); 
		registrar.setFont(new Font("Arial", Font.BOLD, 12));
		registrar.setBounds(87, 334, 90, 25);
		registrar.setBorder(null);
		laminaPrincipal.add(registrar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(10, 56, 2, 190);
		laminaPrincipal.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(260, 56, 2, 190);
		laminaPrincipal.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 246, 252, 2);
		laminaPrincipal.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 57, 252, 2);
		laminaPrincipal.add(separator_2_1);
	
		ControlLogin cL=new ControlLogin(this);
		
		//Eventos botones.
		this.login.addActionListener(cL);
		this.registrar.addActionListener(cL);
		
		
	}

	public byte[] getPassword() {
	
		char[] vectorPassword = this.password.getPassword();
		
		return new String(vectorPassword).getBytes();
	}

	public void setPassword(String password) {
		this.password.setText(password);
	}

	public static String getDni() {
		return dni.getText();
	}

	public void setDni(String dni) {
		this.dni.setText(dni);
	}

	public JButton getLogin() {
		return login;
	}
	
	public JButton getRegistrar() {
		return registrar;
	}
}
