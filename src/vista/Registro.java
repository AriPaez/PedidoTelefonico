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

import controlador.ControlRegistro;

public class Registro extends JFrame {

	private JPasswordField password;
	private JButton registrar;
	private JTextField dni;
	private JButton cancelar;
	 
	public Registro() {

		// Caracteristicas de la ventana.
		setTitle("Registro");
		setSize(288, 345);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);

		JPanel laminaPrincipal = new JPanel();
		laminaPrincipal.setBackground(Color.decode("#41bbec"));
		laminaPrincipal.setBounds(0, 0, 272, 312);
		getContentPane().add(laminaPrincipal);
		laminaPrincipal.setLayout(null);

		JLabel labelLoginIcon = new JLabel("");
		labelLoginIcon.setIcon(new ImageIcon(
				"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\loginIcona.png"));
		labelLoginIcon.setBounds(110, 37, 50, 56);
		laminaPrincipal.add(labelLoginIcon);

		JLabel labelDni = new JLabel("DNI");
		labelDni.setFont(new Font("Arial", Font.BOLD, 20));
		labelDni.setBounds(28, 92, 94, 24);
		laminaPrincipal.add(labelDni);

		dni = new JTextField();
		dni.setBounds(16, 126, 234, 22);
		laminaPrincipal.add(dni);

		password = new JPasswordField();
		password.setBounds(16, 207, 234, 24);
		laminaPrincipal.add(password);

		JLabel labelRegistro = new JLabel("REGISTRO");
		labelRegistro.setFont(new Font("Arial", Font.BOLD, 30));
		labelRegistro.setBounds(63, 2, 162, 24);
		laminaPrincipal.add(labelRegistro);

		JLabel labelContrasenia = new JLabel("Contrase\u00F1a");
		labelContrasenia.setFont(new Font("Arial", Font.BOLD, 20));
		labelContrasenia.setBounds(28, 172, 116, 24);
		laminaPrincipal.add(labelContrasenia);

		cancelar = new JButton(new ImageIcon(
				"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginSeleccion.png"));
		cancelar.setRolloverIcon(new ImageIcon(
				"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telefónicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginDeteccionMouse.png"));
		cancelar.setFocusPainted(false);
		cancelar.setText("Cancelar");
		cancelar.setHorizontalTextPosition(SwingConstants.CENTER);
		cancelar.setFont(new Font("Arial", Font.BOLD, 12));
		cancelar.setBounds(172, 268, 90, 25);
		cancelar.setBorder(null);
		laminaPrincipal.add(cancelar);

		registrar = new JButton(new ImageIcon(
				"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginSeleccion.png"));
		registrar.setRolloverIcon(new ImageIcon(
				"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telefónicos\\pedidoTelefonico\\src\\icon\\login\\botonLoginDeteccionMouse.png"));
		registrar.setFocusPainted(false);
		registrar.setText("Registrarse");
		registrar.setHorizontalTextPosition(SwingConstants.CENTER);
		registrar.setFont(new Font("Arial", Font.BOLD, 12));
		registrar.setBounds(28, 268, 90, 25);
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

		ControlRegistro cR = new ControlRegistro(this);

		// Eventos botones
		this.registrar.addActionListener(cR);
		this.cancelar.addActionListener(cR);

	}

	public byte[] getPassword() {

		char[] vectorPassword = this.password.getPassword();
		return new String(vectorPassword).getBytes();
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

	public JButton getRegistrar() {
		return registrar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

}
