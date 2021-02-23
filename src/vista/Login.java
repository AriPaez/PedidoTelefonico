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
	private JTextField dni ;
	private JButton login ;
	
	public Login() {
		
		// Caracteristicas de la ventana.
		setTitle("Login");
		setSize(634, 409);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel laminaPrincipal = new JPanel();
		laminaPrincipal.setBackground(new Color(135, 206, 250));
		laminaPrincipal.setBounds(0, 0, 618, 370);
		getContentPane().add(laminaPrincipal);
		laminaPrincipal.setLayout(null);
		
		dni= new JTextField();
		dni.setBounds(28, 107, 249, 22);
		laminaPrincipal.add(dni);
		
		password = new JPasswordField();
		password.setBounds(28, 209, 245, 20);
		laminaPrincipal.add(password);
		
		JLabel labelDni = new JLabel("DNI");
		labelDni.setFont(new Font("Arial", Font.BOLD, 20));
		labelDni.setBounds(28, 70, 94, 24);
		laminaPrincipal.add(labelDni);
		
		JLabel labelLogin = new JLabel("LOGIN");
		labelLogin.setFont(new Font("Arial", Font.BOLD, 30));
		labelLogin.setBounds(100, 11, 94, 24);
		laminaPrincipal.add(labelLogin);
		
		JLabel labelContrasenia = new JLabel("Contrase\u00F1a");
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 20));
		labelContrasenia.setBounds(28, 172, 116, 24);
		laminaPrincipal.add(labelContrasenia);
		
		login = new JButton("Login");
		login.setFont(new Font("Arial", Font.BOLD, 12));
		login.setBounds(100, 253, 89, 23);
		laminaPrincipal.add(login);
		
		JLabel labelCuenta = new JLabel("\u00BFNo tiene cuenta?");
		labelCuenta.setFont(new Font("Arial", Font.ITALIC, 12));
		labelCuenta.setBounds(83, 308, 116, 14);
		laminaPrincipal.add(labelCuenta);
		
		registrar = new JButton("Registrarse");
		registrar.setFont(new Font("Arial", Font.BOLD, 12));
		registrar.setBounds(83, 345, 109, 23);
		laminaPrincipal.add(registrar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(283, 0, 8, 368);
		laminaPrincipal.add(separator);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\logotipo.png"));
		label.setBounds(286, 0, 332, 368);
		laminaPrincipal.add(label);
	
		ControlLogin cL=new ControlLogin(this);
		
		//Eventos botones.
		this.login.addActionListener(cL);
		this.registrar.addActionListener(cL);
		
		
	}

	public String getPassword() {
	
		char[] vectorPassword = this.password.getPassword();
		return new String(vectorPassword);
	}

	public void setPassword(String password) {
		this.password.setText(password);
	}

	public String getDni() {
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
