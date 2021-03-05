package vista;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import controlador.ControlBackupRestore;

public class BackupRestore extends JFrame {
	
	private JTextField servidorLocalBackup;
	private JTextField bbddBackup;
	private JTextField directorioBackup;
	private JTextField servidorLocalRestore;
	private JTextField bbddRestore;
	private JTextField directorioRestore;
	private JButton examinarBackup;
	private JButton backup;
	private JButton salirBackup;
	private JButton examinarRestore;
	private JButton restore;
	private JButton salirRestore;
	 
	public BackupRestore() 
	{
		// Caracteristicas de la ventana.
		setTitle("BACKUP AND RESTORE");
		setSize(600, 380);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 584, 341);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(new CardLayout(5, 5));
		
		JTabbedPane pestanias = new JTabbedPane();
		panelPrincipal.add(pestanias);
		
		//PANEL BACKUP
		
		JPanel panelPrincipalBackup = new JPanel();
		pestanias.addTab("BACKUP",panelPrincipalBackup);
		panelPrincipalBackup.setLayout(null);
		
		JPanel panelBackup = new JPanel();
		panelBackup.setBorder(BorderFactory.createTitledBorder("INFORMACIÓN DE BACKUP"));
		panelBackup.setBounds(53, 24, 458, 195);
		panelPrincipalBackup.add(panelBackup);
		panelBackup.setLayout(null);
		
		JLabel labelServidorBackup = new JLabel("Servidor Local");
		labelServidorBackup.setFont(new Font("Arial", Font.BOLD, 12));
		labelServidorBackup.setBounds(38, 43, 96, 14);
		panelBackup.add(labelServidorBackup);
		
		JLabel labelBBDDBackup = new JLabel("BBDD");
		labelBBDDBackup.setFont(new Font("Arial", Font.BOLD, 12));
		labelBBDDBackup.setBounds(81, 85, 37, 14);
		panelBackup.add(labelBBDDBackup);
		
		JLabel labelDirectorioBackup = new JLabel("Directorio");
		labelDirectorioBackup.setFont(new Font("Arial", Font.BOLD, 12));
		labelDirectorioBackup.setBounds(51, 132, 67, 14);
		panelBackup.add(labelDirectorioBackup);
		
		servidorLocalBackup = new JTextField();
		servidorLocalBackup.setEditable(false);
		servidorLocalBackup.setBounds(144, 40, 270, 20);
		panelBackup.add(servidorLocalBackup);
		servidorLocalBackup.setColumns(10);
		
		bbddBackup = new JTextField();
		bbddBackup.setEditable(false);
		bbddBackup.setColumns(10);
		bbddBackup.setBounds(144, 82, 270, 20);
		panelBackup.add(bbddBackup);
		
		directorioBackup = new JTextField();
		directorioBackup.setColumns(10);
		directorioBackup.setBounds(144, 129, 270, 20);
		panelBackup.add(directorioBackup);
		
		examinarBackup = new JButton("");
		examinarBackup.setBounds(418, 129, 30, 20);
		panelBackup.add(examinarBackup);
		examinarBackup.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
		
		backup = new JButton("");
		backup.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\backup\\backup.png"));
		backup.setBounds(179, 230, 48, 48);
		panelPrincipalBackup.add(backup);
		
		salirBackup = new JButton("");
		salirBackup.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		salirBackup.setBounds(363, 230, 48, 48);
		panelPrincipalBackup.add(salirBackup);
		
		JLabel labelBackup = new JLabel("Restore");
		labelBackup.setBounds(179, 278, 48, 14);
		panelPrincipalBackup.add(labelBackup);
		
		JLabel labelSalirBackup = new JLabel("Salir");
		labelSalirBackup.setBounds(373, 278, 26, 14);
		panelPrincipalBackup.add(labelSalirBackup);
		
		
		
		
		//PANEL RESTORE
		JPanel jpanelRestore = new JPanel();
		pestanias.addTab("RESTORE",jpanelRestore);
		jpanelRestore.setLayout(null);
		
		JPanel panelPrincipalRestore = new JPanel();
		panelPrincipalRestore.setLayout(null);
		panelPrincipalRestore.setBounds(0, 0, 569, 303);
		jpanelRestore.add(panelPrincipalRestore);
		
		JPanel panelRestore = new JPanel();
		panelRestore.setLayout(null);
		panelRestore.setBorder(BorderFactory.createTitledBorder("INFORMACIÓN DE RESTORE"));
		panelRestore.setBounds(53, 24, 458, 195);
		panelPrincipalRestore.add(panelRestore);
		
		JLabel labelServidorRestore = new JLabel("Servidor Local");
		labelServidorRestore.setFont(new Font("Arial", Font.BOLD, 12));
		labelServidorRestore.setBounds(38, 43, 96, 14);
		panelRestore.add(labelServidorRestore);
		
		JLabel labelBBDDRestore = new JLabel("BBDD");
		labelBBDDRestore.setFont(new Font("Arial", Font.BOLD, 12));
		labelBBDDRestore.setBounds(81, 85, 37, 14);
		panelRestore.add(labelBBDDRestore);
		
		JLabel labelDirectorioRestore = new JLabel("Directorio");
		labelDirectorioRestore.setFont(new Font("Arial", Font.BOLD, 12));
		labelDirectorioRestore.setBounds(51, 132, 67, 14);
		panelRestore.add(labelDirectorioRestore);
		
		servidorLocalRestore = new JTextField();
		servidorLocalRestore.setEditable(false);
		servidorLocalRestore.setColumns(10);
		servidorLocalRestore.setBounds(144, 40, 270, 20);
		panelRestore.add(servidorLocalRestore);
		
		bbddRestore = new JTextField();
		bbddRestore.setEditable(false);
		bbddRestore.setColumns(10);
		bbddRestore.setBounds(144, 82, 270, 20);
		panelRestore.add(bbddRestore);
		
		directorioRestore = new JTextField();
		directorioRestore.setColumns(10);
		directorioRestore.setBounds(144, 129, 270, 20);
		panelRestore.add(directorioRestore);
		
		examinarRestore = new JButton("");
		examinarRestore.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
		examinarRestore.setBounds(418, 129, 30, 20);
		panelRestore.add(examinarRestore);
		
		restore = new JButton("");
		restore.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\backup\\restore.png"));
		restore.setBounds(179, 230, 48, 48);
		panelPrincipalRestore.add(restore);
		
		salirRestore = new JButton("");
		salirRestore.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		salirRestore.setBounds(363, 230, 48, 48);
		panelPrincipalRestore.add(salirRestore);
		
		JLabel labelRestore = new JLabel("Backup");
		labelRestore.setBounds(179, 278, 48, 14);
		panelPrincipalRestore.add(labelRestore);
		
		JLabel labelSalirRestore = new JLabel("Salir");
		labelSalirRestore.setBounds(373, 278, 26, 14);
		panelPrincipalRestore.add(labelSalirRestore);
		 
		 
		//Eventos botones.
		ControlBackupRestore cBR = new ControlBackupRestore(this);

		
		
		examinarRestore.addActionListener(cBR);
		examinarBackup.addActionListener(cBR);
		
		restore.addActionListener(cBR);
		backup.addActionListener(cBR);
		
		salirRestore.addActionListener(cBR);
		salirBackup.addActionListener(cBR);
		
	}

	
	//Setter y Getter de Backup.
	public String getServidorLocalBackup() {
		return servidorLocalBackup.getText();
	}

	public void setServidorLocalBackup(String servidorLocalBackup) {
		this.servidorLocalBackup.setText(servidorLocalBackup);
	}

	public String getBbddBackup() {
		return bbddBackup.getText();
	}

	public void setBbddBackup(String bbddBackup) {
		this.bbddBackup.setText(bbddBackup);
	}

	public String getDirectorioBackup() {
		return directorioBackup.getText();
	}

	public void setDirectorioBackup(String directorioBackup) {
		this.directorioBackup .setText(directorioBackup);
	}

	public JButton getExaminarBackup() {
		return examinarBackup;
	}
 
	public JButton getSalirBackup() {
		return salirBackup;
	}
	public JButton getBackup() {
		return backup;
	}
	
    //Setter y Getter de Restore.
	public String getServidorLocalRestore() {
		return servidorLocalRestore.getText();
	}

	public void setServidorLocalRestore(String servidorLocalRestore) {
		this.servidorLocalRestore.setText(servidorLocalRestore);
	}

	public String getBbddRestore() {
		return bbddRestore.getText();
	}

	public void setBbddRestore(String bbddRestore) {
		this.bbddRestore.setText(bbddRestore);
	}

	public String getDirectorioRestore() {
		return directorioRestore.getText();
	}

	public void setDirectorioRestore(String directorioRestore) {
		this.directorioRestore.setText(directorioRestore);
	}

	public JButton getExaminarRestore() {
		return examinarRestore;
	}
 
	public JButton getSalirRestore() {
		return salirRestore;
	}
	public JButton getRestore() {
		return restore;
	}
	
 
}
