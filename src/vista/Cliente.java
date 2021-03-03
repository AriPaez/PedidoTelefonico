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

import controlador.ControlCliente;

public class Cliente extends JFrame {
	
	private JTextField dniRegistro;
	private JTextField nombreRegistro;
	private JTextField apellidoRegistro;
	private JTextField calleRegistro;
	private JTextField pisoRegistro;
	private JTextField nroCasaRegistro;
	private JTextField departamentoRegistro;
	private JTextField codigoPostalRegistro;
	private JTextField localidadRegistro;
	private JTextField provinciaRegistro;
	private JTextField celularRegistro;
	private JTextField telefonoRegistro;
	private JTextField dniActualizacion;
	private JTextField nombreActualizacion;
	private JTextField apellidoActualizacion;
	private JTextField calleActualizacion;
	private JTextField pisoActualizacion;
	private JTextField nroDeCasaActualizacion;
	private JTextField departamentoActualizacion;
	private JTextField codigoPostalActualizacion;
	private JTextField localidadActualizacion;
	private JTextField provinciaActualizacion;
	private JTextField dniEliminacion;
	private JTextField nombreEliminacion;
	private JTextField apellidoEliminacion;
	private JTextField calleEliminacion;
	private JTextField pisoEliminacion;
	private JTextField nroDeCasaEliminacion;
	private JTextField departamentoEliminacion;
	private JTextField codigoPostalEliminacion;
	private JTextField localidadEliminacion;
	private JTextField provinciaEliminacion;
	private JButton buscarClienteActualizacion ;	
	private JButton actualizarCliente ;
	private JButton cancelarActualizacion; 
	private JButton buscarClienteEliminacion; 
	private JButton eliminarCliente ;
	private JButton cancelarEliminacion ;
	private JButton registrarRegistro;
	private JButton cancelarRegistro ;
	private JTextField celularActualizacion;
	private JTextField telefonoActualizacion;
	private JTextField celularEliminacion;
	private JTextField telefonoEliminacion;
	private JTextField dniConsulta;
	private JTextField nombreConsulta;
	private JTextField apellidoConsulta;
	private JTextField calleConsulta;
	private JTextField pisoConsulta;
	private JTextField nroCasaConsulta;
	private JTextField departamentoConsulta;
	private JTextField codigoPostalConsulta;
	private JTextField localidadConsulta;
	private JTextField provinciaConsulta;
	private JTextField celularConsulta;
	private JTextField telefonoConsulta;
	private JButton cancelarConsulta ;
	private JButton buscarConsulta ;
	
	public Cliente() {

		// Caracteristicas de la ventana.
		setTitle("CLIENTE");
		setSize(546, 700);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	
       
        //Lamina principal.
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBounds(0, 0, 532, 661);
        getContentPane().add(panelPrincipal);
        
        //Panel con pestañas.
        panelPrincipal.setLayout(new CardLayout(5, 5));
        JTabbedPane panelPestanias = new JTabbedPane(JTabbedPane.TOP);
        panelPrincipal.add(panelPestanias);
        
        JPanel jPanelRegistro = new JPanel();
        panelPestanias.addTab("REGISTRO",jPanelRegistro);
        jPanelRegistro.setLayout(null);
        
        //Registro Cliente
        JPanel panelRegistroCliente = new JPanel();
        panelRegistroCliente.setBorder(BorderFactory.createTitledBorder("REGISTRAR CLIENTE"));
        panelRegistroCliente.setBounds(50, 11, 399, 524);
        jPanelRegistro.add(panelRegistroCliente);
        panelRegistroCliente.setLayout(null);
        
        JLabel labelDniRegistro = new JLabel("DNI");
        labelDniRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelDniRegistro.setBounds(38, 27, 46, 14);
        panelRegistroCliente.add(labelDniRegistro);
        
        dniRegistro = new JTextField();
        dniRegistro.setBounds(150, 21, 150, 20);
        panelRegistroCliente.add(dniRegistro);
        dniRegistro.setColumns(10);
        
        JLabel labelNombreRegistro = new JLabel("Nombre");
        labelNombreRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombreRegistro.setBounds(38, 64, 46, 14);
        panelRegistroCliente.add(labelNombreRegistro);
        
        nombreRegistro = new JTextField();
        nombreRegistro.setColumns(10);
        nombreRegistro.setBounds(150, 58, 150, 20);
        panelRegistroCliente.add(nombreRegistro);
        
        JLabel lbaelApellidoRegistro = new JLabel("Apellido");
        lbaelApellidoRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellidoRegistro.setBounds(38, 104, 46, 14);
        panelRegistroCliente.add(lbaelApellidoRegistro);
        
        apellidoRegistro = new JTextField();
        apellidoRegistro.setColumns(10);
        apellidoRegistro.setBounds(150, 98, 150, 20);
        panelRegistroCliente.add(apellidoRegistro);
        
        JLabel labelCalleRegistro = new JLabel("Calle");
        labelCalleRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalleRegistro.setBounds(38, 146, 46, 14);
        panelRegistroCliente.add(labelCalleRegistro);
        
        calleRegistro = new JTextField();
        calleRegistro.setColumns(10);
        calleRegistro.setText("");
        calleRegistro.setBounds(150, 140, 150, 20);
        panelRegistroCliente.add(calleRegistro);
        
        JLabel labelNroCasaRegistro = new JLabel("Nro. Casa");
        labelNroCasaRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasaRegistro.setBounds(38, 194, 64, 14);
        panelRegistroCliente.add(labelNroCasaRegistro);
        
        JLabel labelPisoRegistro = new JLabel("Piso");
        labelPisoRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelPisoRegistro.setBounds(38, 237, 64, 14);
        panelRegistroCliente.add(labelPisoRegistro);
        
        JLabel labelDptoRegistro = new JLabel("Dpto.");
        labelDptoRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelDptoRegistro.setBounds(38, 277, 64, 14);
        panelRegistroCliente.add(labelDptoRegistro);
        
        pisoRegistro = new JTextField();
        pisoRegistro.setColumns(10);
        pisoRegistro.setBounds(150, 231, 150, 20);
        panelRegistroCliente.add(pisoRegistro);
        
        nroCasaRegistro = new JTextField();
        nroCasaRegistro.setText("");
        nroCasaRegistro.setColumns(10);
        nroCasaRegistro.setBounds(150, 187, 150, 20);
        panelRegistroCliente.add(nroCasaRegistro);
        
        departamentoRegistro = new JTextField();
        departamentoRegistro.setColumns(10);
        departamentoRegistro.setBounds(150, 274, 150, 20);
        panelRegistroCliente.add(departamentoRegistro);
        
        JLabel labelCodigoPostalRegistro = new JLabel("C\u00F3digo Postal");
        labelCodigoPostalRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostalRegistro.setBounds(38, 316, 86, 14);
        panelRegistroCliente.add(labelCodigoPostalRegistro);
        
        codigoPostalRegistro = new JTextField();
        codigoPostalRegistro.setColumns(10);
        codigoPostalRegistro.setBounds(150, 313, 150, 20);
        panelRegistroCliente.add(codigoPostalRegistro);
        
        JLabel lblLocalidadRegistro = new JLabel("Localidad");
        lblLocalidadRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidadRegistro.setBounds(38, 358, 86, 14);
        panelRegistroCliente.add(lblLocalidadRegistro);
        
        localidadRegistro = new JTextField();
        localidadRegistro.setColumns(10);
        localidadRegistro.setBounds(150, 355, 150, 20);
        panelRegistroCliente.add(localidadRegistro);
        
        JLabel lblProvinciaRegistro = new JLabel("Provincia");
        lblProvinciaRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvinciaRegistro.setBounds(38, 399, 86, 14);
        panelRegistroCliente.add(lblProvinciaRegistro);
        
        provinciaRegistro = new JTextField();
        provinciaRegistro.setColumns(10);
        provinciaRegistro.setBounds(150, 396, 150, 20);
        panelRegistroCliente.add(provinciaRegistro);
        
        JLabel labelCelularRegistro = new JLabel("Celular");
        labelCelularRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelCelularRegistro.setBounds(38, 434, 86, 14);
        panelRegistroCliente.add(labelCelularRegistro);
        
        celularRegistro = new JTextField();
        celularRegistro.setColumns(10);
        celularRegistro.setBounds(150, 431, 150, 20);
        panelRegistroCliente.add(celularRegistro);
        
        JLabel labelTelefonoRegistro = new JLabel("Tel\u00E9fono");
        labelTelefonoRegistro.setFont(new Font("Arial", Font.BOLD, 12));
        labelTelefonoRegistro.setBounds(38, 475, 86, 14);
        panelRegistroCliente.add(labelTelefonoRegistro);
        
        telefonoRegistro = new JTextField();
        telefonoRegistro.setColumns(10);
        telefonoRegistro.setBounds(150, 472, 150, 20);
        panelRegistroCliente.add(telefonoRegistro);
       
        //Botones registro cliente.
        JPanel panelAccionesRegistro = new JPanel();
        panelAccionesRegistro.setBounds(50, 536, 399, 87);
        jPanelRegistro.add(panelAccionesRegistro);
        panelAccionesRegistro.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelAccionesRegistro.setLayout(null);
        
        registrarRegistro = new JButton("");
        registrarRegistro.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\guardar.png"));
        registrarRegistro.setBounds(90, 16, 48, 48);
        panelAccionesRegistro.add(registrarRegistro);
        
        cancelarRegistro = new JButton("");
        cancelarRegistro.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
        cancelarRegistro.setBounds(295, 16, 48, 48);
        panelAccionesRegistro.add(cancelarRegistro);
        
        JLabel labelGuardar = new JLabel("Guardar");
        labelGuardar.setBounds(90, 62, 48, 14);
        panelAccionesRegistro.add(labelGuardar);
        
        JLabel labelSalir = new JLabel("Salir");
        labelSalir.setBounds(304, 62, 39, 14);
        panelAccionesRegistro.add(labelSalir);
        
        //Actualizacion de Cliente.
        
        JPanel jPanelActualizar = new JPanel();
        jPanelActualizar.setLayout(null);
        panelPestanias.addTab("ACTUALIZAR",jPanelActualizar);
        
        JPanel panelActualizar = new JPanel();
        panelActualizar.setLayout(null);
        panelActualizar.setBounds(0, 0, 517, 623);
        jPanelActualizar.add(panelActualizar);
        
        JPanel panelActualizarCliente = new JPanel();
        panelActualizarCliente.setLayout(null);
        panelActualizarCliente.setBorder(BorderFactory.createTitledBorder("ACTUALIZAR CLIENTE"));
        panelActualizarCliente.setBounds(50, 11, 399, 524);
        panelActualizar.add(panelActualizarCliente);
        
        JLabel labelDniActualizacion = new JLabel("DNI");
        labelDniActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelDniActualizacion.setBounds(38, 27, 46, 14);
        panelActualizarCliente.add(labelDniActualizacion);
        
        dniActualizacion = new JTextField();
        dniActualizacion.setColumns(10);
        dniActualizacion.setBounds(150, 21, 150, 20);
        panelActualizarCliente.add(dniActualizacion);
        
        JLabel labelNombreActualizacion = new JLabel("Nombre");
        labelNombreActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombreActualizacion.setBounds(38, 64, 46, 14);
        panelActualizarCliente.add(labelNombreActualizacion);
        
        nombreActualizacion = new JTextField();
        nombreActualizacion.setColumns(10);
        nombreActualizacion.setBounds(150, 58, 150, 20);
        panelActualizarCliente.add(nombreActualizacion);
        
        JLabel lbaelApellidoActualizacion = new JLabel("Apellido");
        lbaelApellidoActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellidoActualizacion.setBounds(38, 104, 46, 14);
        panelActualizarCliente.add(lbaelApellidoActualizacion);
        
        apellidoActualizacion = new JTextField();
        apellidoActualizacion.setColumns(10);
        apellidoActualizacion.setBounds(150, 98, 150, 20);
        panelActualizarCliente.add(apellidoActualizacion);
        
        JLabel labelCalleActualizacion = new JLabel("Calle");
        labelCalleActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalleActualizacion.setBounds(38, 146, 46, 14);
        panelActualizarCliente.add(labelCalleActualizacion);
        
        calleActualizacion = new JTextField();
        calleActualizacion.setColumns(10);
        calleActualizacion.setBounds(150, 140, 150, 20);
        panelActualizarCliente.add(calleActualizacion);
        
        JLabel labelNroCasaActualizacion = new JLabel("Nro. Casa");
        labelNroCasaActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasaActualizacion.setBounds(38, 194, 64, 14);
        panelActualizarCliente.add(labelNroCasaActualizacion);
        
        JLabel labelPisoActualizacion = new JLabel("Piso");
        labelPisoActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelPisoActualizacion.setBounds(38, 237, 64, 14);
        panelActualizarCliente.add(labelPisoActualizacion);
        
        JLabel labelDptoActualizacion = new JLabel("Dpto.");
        labelDptoActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelDptoActualizacion.setBounds(38, 277, 64, 14);
        panelActualizarCliente.add(labelDptoActualizacion);
        
        pisoActualizacion = new JTextField();
        pisoActualizacion.setColumns(10);
        pisoActualizacion.setBounds(150, 231, 150, 20);
        panelActualizarCliente.add(pisoActualizacion);
        
        nroDeCasaActualizacion = new JTextField();
        nroDeCasaActualizacion.setColumns(10);
        nroDeCasaActualizacion.setBounds(150, 187, 150, 20);
        panelActualizarCliente.add(nroDeCasaActualizacion);
        
        departamentoActualizacion = new JTextField();
        departamentoActualizacion.setColumns(10);
        departamentoActualizacion.setBounds(150, 274, 150, 20);
        panelActualizarCliente.add(departamentoActualizacion);
        
        JLabel labelCodigoPostalActualizacion = new JLabel("C\u00F3digo Postal");
        labelCodigoPostalActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostalActualizacion.setBounds(38, 316, 86, 14);
        panelActualizarCliente.add(labelCodigoPostalActualizacion);
        
        codigoPostalActualizacion = new JTextField();
        codigoPostalActualizacion.setColumns(10);
        codigoPostalActualizacion.setBounds(150, 313, 150, 20);
        panelActualizarCliente.add(codigoPostalActualizacion);
        
        JLabel lblLocalidadActualizacion = new JLabel("Localidad");
        lblLocalidadActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidadActualizacion.setBounds(38, 358, 86, 14);
        panelActualizarCliente.add(lblLocalidadActualizacion);
        
        localidadActualizacion = new JTextField();
        localidadActualizacion.setColumns(10);
        localidadActualizacion.setBounds(150, 355, 150, 20);
        panelActualizarCliente.add(localidadActualizacion);
        
        JLabel lblProvinciaActualizacion = new JLabel("Provincia");
        lblProvinciaActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvinciaActualizacion.setBounds(38, 399, 86, 14);
        panelActualizarCliente.add(lblProvinciaActualizacion);
        
        provinciaActualizacion = new JTextField();
        provinciaActualizacion.setColumns(10);
        provinciaActualizacion.setBounds(150, 396, 150, 20);
        panelActualizarCliente.add(provinciaActualizacion);
        
        //Botones actualizar cliente.
        buscarClienteActualizacion = new JButton("");
        buscarClienteActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
        buscarClienteActualizacion.setBounds(300, 21, 30, 20);
        panelActualizarCliente.add(buscarClienteActualizacion);
        
        JLabel labelCelularActualizacion = new JLabel("Celular");
        labelCelularActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCelularActualizacion.setBounds(38, 434, 86, 14);
        panelActualizarCliente.add(labelCelularActualizacion);
        
        celularActualizacion = new JTextField();
        celularActualizacion.setColumns(10);
        celularActualizacion.setBounds(150, 431, 150, 20);
        panelActualizarCliente.add(celularActualizacion);
        
        JLabel labelTelefonoActualizacion = new JLabel("Tel\u00E9fono");
        labelTelefonoActualizacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelTelefonoActualizacion.setBounds(38, 475, 86, 14);
        panelActualizarCliente.add(labelTelefonoActualizacion);
        
        telefonoActualizacion = new JTextField();
        telefonoActualizacion.setColumns(10);
        telefonoActualizacion.setBounds(150, 472, 150, 20);
        panelActualizarCliente.add(telefonoActualizacion);
        
        JPanel panelAccionesActualizar = new JPanel();
        panelAccionesActualizar.setLayout(null);
        panelAccionesActualizar.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelAccionesActualizar.setBounds(50, 536, 399, 87);
        panelActualizar.add(panelAccionesActualizar);
        
        actualizarCliente = new JButton("");
        actualizarCliente.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\actualizar.png"));
        actualizarCliente.setBounds(90, 16, 48, 48);
        panelAccionesActualizar.add(actualizarCliente);
        
        cancelarActualizacion = new JButton("");
        cancelarActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
        cancelarActualizacion.setBounds(295, 16, 48, 48);
        panelAccionesActualizar.add(cancelarActualizacion);
        
        JLabel labelGuardar_1 = new JLabel("Actualizar");
        labelGuardar_1.setBounds(90, 62, 62, 14);
        panelAccionesActualizar.add(labelGuardar_1);
        
        JLabel labelSalir_1 = new JLabel("Salir");
        labelSalir_1.setBounds(304, 62, 39, 14);
        panelAccionesActualizar.add(labelSalir_1);
        
        
        //Eliminacion cliente.
        JPanel jPanelEliminar = new JPanel();
        jPanelEliminar.setLayout(null);
        panelPestanias.addTab("ELIMINAR",jPanelEliminar);
        
        JPanel panelEliminacion = new JPanel();
        panelEliminacion.setLayout(null);
        panelEliminacion.setBounds(0, 0, 517, 633);
        jPanelEliminar.add(panelEliminacion);
        
        JPanel panelEliminacionCliente = new JPanel();
        panelEliminacionCliente.setLayout(null);
        panelEliminacionCliente.setBorder(BorderFactory.createTitledBorder("ELIMINAR CLIENTE"));
        panelEliminacionCliente.setBounds(50, 11, 399, 524);
        panelEliminacion.add(panelEliminacionCliente);
        
        JLabel labelDniEliminacion = new JLabel("DNI");
        labelDniEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelDniEliminacion.setBounds(38, 27, 46, 14);
        panelEliminacionCliente.add(labelDniEliminacion);
        
        dniEliminacion = new JTextField();
        dniEliminacion.setColumns(10);
        dniEliminacion.setBounds(150, 21, 150, 20);
        panelEliminacionCliente.add(dniEliminacion);
        
        JLabel labelNombreEliminacion = new JLabel("Nombre");
        labelNombreEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombreEliminacion.setBounds(38, 64, 46, 14);
        panelEliminacionCliente.add(labelNombreEliminacion);
        
        nombreEliminacion = new JTextField();
        nombreEliminacion.setEditable(false);
        nombreEliminacion.setColumns(10);
        nombreEliminacion.setBounds(150, 58, 150, 20);
        panelEliminacionCliente.add(nombreEliminacion);
        
        JLabel lbaelApellidoEliminacion = new JLabel("Apellido");
        lbaelApellidoEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellidoEliminacion.setBounds(38, 104, 46, 14);
        panelEliminacionCliente.add(lbaelApellidoEliminacion);
        
        apellidoEliminacion = new JTextField();
        apellidoEliminacion.setEditable(false);
        apellidoEliminacion.setColumns(10);
        apellidoEliminacion.setBounds(150, 98, 150, 20);
        panelEliminacionCliente.add(apellidoEliminacion);
        
        JLabel labelCalleEliminacion = new JLabel("Calle");
        labelCalleEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalleEliminacion.setBounds(38, 146, 46, 14);
        panelEliminacionCliente.add(labelCalleEliminacion);
        
        calleEliminacion = new JTextField();
        calleEliminacion.setEditable(false);
        calleEliminacion.setColumns(10);
        calleEliminacion.setBounds(150, 140, 150, 20);
        panelEliminacionCliente.add(calleEliminacion);
        
        JLabel labelNroCasaEliminacion = new JLabel("Nro. Casa");
        labelNroCasaEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasaEliminacion.setBounds(38, 194, 64, 14);
        panelEliminacionCliente.add(labelNroCasaEliminacion);
        
        JLabel labelPisoEliminacion = new JLabel("Piso");
        labelPisoEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelPisoEliminacion.setBounds(38, 237, 64, 14);
        panelEliminacionCliente.add(labelPisoEliminacion);
        
        JLabel labelDptoEliminacion = new JLabel("Dpto.");
        labelDptoEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelDptoEliminacion.setBounds(38, 277, 64, 14);
        panelEliminacionCliente.add(labelDptoEliminacion);
        
        pisoEliminacion = new JTextField();
        pisoEliminacion.setEditable(false);
        pisoEliminacion.setColumns(10);
        pisoEliminacion.setBounds(150, 231, 150, 20);
        panelEliminacionCliente.add(pisoEliminacion);
        
        nroDeCasaEliminacion = new JTextField();
        nroDeCasaEliminacion.setEditable(false);
        nroDeCasaEliminacion.setColumns(10);
        nroDeCasaEliminacion.setBounds(150, 187, 150, 20);
        panelEliminacionCliente.add(nroDeCasaEliminacion);
        
        departamentoEliminacion = new JTextField();
        departamentoEliminacion.setEditable(false);
        departamentoEliminacion.setColumns(10);
        departamentoEliminacion.setBounds(150, 274, 150, 20);
        panelEliminacionCliente.add(departamentoEliminacion);
        
        JLabel labelCodigoPostalEliminacion = new JLabel("C\u00F3digo Postal");
        labelCodigoPostalEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostalEliminacion.setBounds(38, 316, 86, 14);
        panelEliminacionCliente.add(labelCodigoPostalEliminacion);
        
        codigoPostalEliminacion = new JTextField();
        codigoPostalEliminacion.setEditable(false);
        codigoPostalEliminacion.setColumns(10);
        codigoPostalEliminacion.setBounds(150, 313, 150, 20);
        panelEliminacionCliente.add(codigoPostalEliminacion);
        
        JLabel lblLocalidadEliminacion = new JLabel("Localidad");
        lblLocalidadEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidadEliminacion.setBounds(38, 358, 86, 14);
        panelEliminacionCliente.add(lblLocalidadEliminacion);
        
        localidadEliminacion = new JTextField();
        localidadEliminacion.setEditable(false);
        localidadEliminacion.setColumns(10);
        localidadEliminacion.setBounds(150, 355, 150, 20);
        panelEliminacionCliente.add(localidadEliminacion);
        
        JLabel lblProvinciaEliminacion = new JLabel("Provincia");
        lblProvinciaEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvinciaEliminacion.setBounds(38, 399, 86, 14);
        panelEliminacionCliente.add(lblProvinciaEliminacion);
        
        provinciaEliminacion = new JTextField();
        provinciaEliminacion.setEditable(false);
        provinciaEliminacion.setColumns(10);
        provinciaEliminacion.setBounds(150, 396, 150, 20);
        panelEliminacionCliente.add(provinciaEliminacion);
        
        //Botones eliminar cliente.
        buscarClienteEliminacion = new JButton("");
        buscarClienteEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
        buscarClienteEliminacion.setBounds(300, 21, 30, 20);
        panelEliminacionCliente.add(buscarClienteEliminacion);
        
        JLabel labelCelularEliminacion = new JLabel("Celular");
        labelCelularEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelCelularEliminacion.setBounds(38, 434, 86, 14);
        panelEliminacionCliente.add(labelCelularEliminacion);
        
        celularEliminacion = new JTextField();
        celularEliminacion.setEditable(false);
        celularEliminacion.setColumns(10);
        celularEliminacion.setBounds(150, 431, 150, 20);
        panelEliminacionCliente.add(celularEliminacion);
        
        JLabel labelTelefonoEliminacion = new JLabel("Tel\u00E9fono");
        labelTelefonoEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
        labelTelefonoEliminacion.setBounds(38, 475, 86, 14);
        panelEliminacionCliente.add(labelTelefonoEliminacion);
        
        telefonoEliminacion = new JTextField();
        telefonoEliminacion.setEditable(false);
        telefonoEliminacion.setColumns(10);
        telefonoEliminacion.setBounds(150, 472, 150, 20);
        panelEliminacionCliente.add(telefonoEliminacion);
        
        JPanel panelAccionesEliminacion = new JPanel();
        panelAccionesEliminacion.setLayout(null);
        panelAccionesEliminacion.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelAccionesEliminacion.setBounds(50, 536, 399, 87);
        panelEliminacion.add(panelAccionesEliminacion);
        
        eliminarCliente = new JButton("");
        eliminarCliente.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\eliminar.png"));
        eliminarCliente.setBounds(90, 16, 48, 48);
        panelAccionesEliminacion.add(eliminarCliente);
        
        cancelarEliminacion = new JButton("");
        cancelarEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
        cancelarEliminacion.setBounds(295, 16, 48, 48);
        panelAccionesEliminacion.add(cancelarEliminacion);
        
        JLabel labelEliminar = new JLabel("Eliminar");
        labelEliminar.setBounds(90, 62, 48, 14);
        panelAccionesEliminacion.add(labelEliminar);
        
        JLabel labelSalirEliminacion = new JLabel("Salir");
        labelSalirEliminacion.setBounds(304, 62, 39, 14);
        panelAccionesEliminacion.add(labelSalirEliminacion);
        
        
        //Consulta de Cliente.
        JPanel jPanelConsulta = new JPanel();
        panelPestanias.addTab("CONSULTA",jPanelConsulta);
        jPanelConsulta.setLayout(null);
        
        JPanel panelConsulta = new JPanel();
        panelConsulta.setLayout(null);
        panelConsulta.setBounds(0, 0, 517, 633);
        jPanelConsulta.add(panelConsulta);
        
        JPanel panelConsultaCliente = new JPanel();
        panelConsultaCliente.setLayout(null);
        panelConsultaCliente.setBorder(BorderFactory.createTitledBorder("ELIMINAR CLIENTE"));
        panelConsultaCliente.setBounds(50, 11, 399, 524);
        panelConsulta.add(panelConsultaCliente);
        
        JLabel labelDniConsulta = new JLabel("DNI");
        labelDniConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelDniConsulta.setBounds(38, 27, 46, 14);
        panelConsultaCliente.add(labelDniConsulta);
        
        dniConsulta = new JTextField();
        dniConsulta.setColumns(10);
        dniConsulta.setBounds(150, 21, 150, 20);
        panelConsultaCliente.add(dniConsulta);
        
        JLabel labelNombreConsulta = new JLabel("Nombre");
        labelNombreConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombreConsulta.setBounds(38, 64, 46, 14);
        panelConsultaCliente.add(labelNombreConsulta);
        
        nombreConsulta = new JTextField();
        nombreConsulta.setEditable(false);
        nombreConsulta.setColumns(10);
        nombreConsulta.setBounds(150, 58, 150, 20);
        panelConsultaCliente.add(nombreConsulta);
        
        JLabel lbaelApellidoConsulta = new JLabel("Apellido");
        lbaelApellidoConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellidoConsulta.setBounds(38, 104, 46, 14);
        panelConsultaCliente.add(lbaelApellidoConsulta);
        
        apellidoConsulta = new JTextField();
        apellidoConsulta.setEditable(false);
        apellidoConsulta.setColumns(10);
        apellidoConsulta.setBounds(150, 98, 150, 20);
        panelConsultaCliente.add(apellidoConsulta);
        
        JLabel labelCalleConsulta = new JLabel("Calle");
        labelCalleConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalleConsulta.setBounds(38, 146, 46, 14);
        panelConsultaCliente.add(labelCalleConsulta);
        
        calleConsulta = new JTextField();
        calleConsulta.setEditable(false);
        calleConsulta.setColumns(10);
        calleConsulta.setBounds(150, 140, 150, 20);
        panelConsultaCliente.add(calleConsulta);
        
        JLabel labelNroCasaConsulta = new JLabel("Nro. Casa");
        labelNroCasaConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasaConsulta.setBounds(38, 194, 64, 14);
        panelConsultaCliente.add(labelNroCasaConsulta);
        
        JLabel labelPisoConsulta = new JLabel("Piso");
        labelPisoConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelPisoConsulta.setBounds(38, 237, 64, 14);
        panelConsultaCliente.add(labelPisoConsulta);
        
        JLabel labelDptoConsulta = new JLabel("Dpto.");
        labelDptoConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelDptoConsulta.setBounds(38, 277, 64, 14);
        panelConsultaCliente.add(labelDptoConsulta);
        
        pisoConsulta = new JTextField();
        pisoConsulta.setEditable(false);
        pisoConsulta.setColumns(10);
        pisoConsulta.setBounds(150, 231, 150, 20);
        panelConsultaCliente.add(pisoConsulta);
        
        nroCasaConsulta = new JTextField();
        nroCasaConsulta.setEditable(false);
        nroCasaConsulta.setColumns(10);
        nroCasaConsulta.setBounds(150, 187, 150, 20);
        panelConsultaCliente.add(nroCasaConsulta);
        
        departamentoConsulta = new JTextField();
        departamentoConsulta.setEditable(false);
        departamentoConsulta.setColumns(10);
        departamentoConsulta.setBounds(150, 274, 150, 20);
        panelConsultaCliente.add(departamentoConsulta);
        
        JLabel labelCodigoPostalConsulta = new JLabel("C\u00F3digo Postal");
        labelCodigoPostalConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostalConsulta.setBounds(38, 316, 86, 14);
        panelConsultaCliente.add(labelCodigoPostalConsulta);
        
        codigoPostalConsulta = new JTextField();
        codigoPostalConsulta.setEditable(false);
        codigoPostalConsulta.setColumns(10);
        codigoPostalConsulta.setBounds(150, 313, 150, 20);
        panelConsultaCliente.add(codigoPostalConsulta);
        
        JLabel lblLocalidadConsulta = new JLabel("Localidad");
        lblLocalidadConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidadConsulta.setBounds(38, 358, 86, 14);
        panelConsultaCliente.add(lblLocalidadConsulta);
        
        localidadConsulta = new JTextField();
        localidadConsulta.setEditable(false);
        localidadConsulta.setColumns(10);
        localidadConsulta.setBounds(150, 355, 150, 20);
        panelConsultaCliente.add(localidadConsulta);
        
        JLabel lblProvinciaConsulta = new JLabel("Provincia");
        lblProvinciaConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvinciaConsulta.setBounds(38, 399, 86, 14);
        panelConsultaCliente.add(lblProvinciaConsulta);
        
        provinciaConsulta = new JTextField();
        provinciaConsulta.setEditable(false);
        provinciaConsulta.setColumns(10);
        provinciaConsulta.setBounds(150, 396, 150, 20);
        panelConsultaCliente.add(provinciaConsulta);
        
        JLabel labelCelularEliminacionConsulta = new JLabel("Celular");
        labelCelularEliminacionConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelCelularEliminacionConsulta.setBounds(38, 434, 86, 14);
        panelConsultaCliente.add(labelCelularEliminacionConsulta);
        
        celularConsulta = new JTextField();
        celularConsulta.setEditable(false);
        celularConsulta.setColumns(10);
        celularConsulta.setBounds(150, 431, 150, 20);
        panelConsultaCliente.add(celularConsulta);
        
        JLabel labelTelefonoEliminacionConsulta = new JLabel("Tel\u00E9fono");
        labelTelefonoEliminacionConsulta.setFont(new Font("Arial", Font.BOLD, 12));
        labelTelefonoEliminacionConsulta.setBounds(38, 475, 86, 14);
        panelConsultaCliente.add(labelTelefonoEliminacionConsulta);
        
        telefonoConsulta = new JTextField();
        telefonoConsulta.setEditable(false);
        telefonoConsulta.setColumns(10);
        telefonoConsulta.setBounds(150, 472, 150, 20);
        panelConsultaCliente.add(telefonoConsulta);
        
        JPanel panelAccionesConsulta = new JPanel();
        panelAccionesConsulta.setLayout(null);
        panelAccionesConsulta.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelAccionesConsulta.setBounds(50, 536, 399, 87);
        panelConsulta.add(panelAccionesConsulta);
        
        buscarConsulta = new JButton("");
        buscarConsulta.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscarCliente.png"));
        buscarConsulta.setBounds(90, 16, 48, 48);
        panelAccionesConsulta.add(buscarConsulta);
        
        cancelarConsulta = new JButton("");
        cancelarConsulta.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
        cancelarConsulta.setBounds(295, 16, 48, 48);
        panelAccionesConsulta.add(cancelarConsulta);
        
        JLabel labelEliminar_1 = new JLabel("Buscar");
        labelEliminar_1.setBounds(90, 62, 48, 14);
        panelAccionesConsulta.add(labelEliminar_1);
        
        JLabel labelSalirEliminacion_1 = new JLabel("Salir");
        labelSalirEliminacion_1.setBounds(304, 62, 39, 14);
        panelAccionesConsulta.add(labelSalirEliminacion_1);
	
        
        
        
        //Eventos de botones.
        
        ControlCliente cC=new ControlCliente(this);
        buscarClienteActualizacion.addActionListener(cC);
        buscarClienteEliminacion.addActionListener(cC); 
        buscarConsulta .addActionListener(cC);
        cancelarConsulta.addActionListener(cC);
    	actualizarCliente.addActionListener(cC);
    	cancelarActualizacion.addActionListener(cC); 
    	eliminarCliente.addActionListener(cC);
    	cancelarEliminacion.addActionListener(cC);
    	registrarRegistro.addActionListener(cC);
    	cancelarRegistro.addActionListener(cC);
    	
    	//Evento escritura en JTextField de registro.
		dniRegistro.addKeyListener(cC);
		nombreRegistro.addKeyListener(cC);
		apellidoRegistro.addKeyListener(cC);
		calleRegistro.addKeyListener(cC);
		pisoRegistro.addKeyListener(cC);
		nroCasaRegistro.addKeyListener(cC);
		departamentoRegistro.addKeyListener(cC);
		codigoPostalRegistro.addKeyListener(cC);
		localidadRegistro.addKeyListener(cC);
		provinciaRegistro.addKeyListener(cC);
		celularRegistro.addKeyListener(cC);
		telefonoRegistro.addKeyListener(cC);
		
		//Evento escritura en JTextField de actualizacion.
		dniActualizacion.addKeyListener(cC);
		nombreActualizacion.addKeyListener(cC);
		apellidoActualizacion.addKeyListener(cC);
		calleActualizacion.addKeyListener(cC);
		pisoActualizacion.addKeyListener(cC);
		nroDeCasaActualizacion.addKeyListener(cC);
		departamentoActualizacion.addKeyListener(cC);
		codigoPostalActualizacion.addKeyListener(cC);
		localidadActualizacion.addKeyListener(cC);
		provinciaActualizacion.addKeyListener(cC);
		celularActualizacion.addKeyListener(cC);
		telefonoActualizacion.addKeyListener(cC);
        
	}
	
	// Setter y getters de registro cliente

	public String getDniRegistro() {
		return dniRegistro.getText();
	}

	public void setDniRegistro(String dniRegistro) {
		this.dniRegistro.setText(dniRegistro);
	}

	public String getNombreRegistro() {
		return nombreRegistro.getText();
	}

	public void setNombreRegistro(String nombreRegistro) {
		this.nombreRegistro.setText(nombreRegistro);
	}

	public String getApellidoRegistro() {
		return apellidoRegistro.getText();
	}

	public void setApellidoRegistro(String apellidoRegistro) {
		this.apellidoRegistro.setText(apellidoRegistro);
	}

	public String getCalleRegistro() {
		return this.calleRegistro.getText();
	}

	public void setCalleRegistro(String calleRegistro) {
		this.calleRegistro.setText(calleRegistro);
	}

	public int getPisoRegistro() {
		 
		if (!this.pisoRegistro.getText().equals("") && this.pisoRegistro.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(nroCasaRegistro.getText());

			
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.pisoRegistro.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}

		 
	}

	public void setPisoRegistro(String pisoRegistro) {
		this.pisoRegistro.setText(pisoRegistro);
	}

	public int getNroCasaRegistro() {

		if (!this.nroCasaRegistro.getText().equals("") && this.nroCasaRegistro.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(nroCasaRegistro.getText());

			
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.nroCasaRegistro.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}

		
	}

	public void setNroCasaRegistro(String nroCasaRegistro) {
		this.nroCasaRegistro.setText(nroCasaRegistro);
	}

	public String getDepartamentoRegistro() {
		return departamentoRegistro.getText();
	}

	public void setDepartamentoRegistro(String departamentoRegistro) {
		this.departamentoRegistro.setText(departamentoRegistro);
	}

	public String getCodigoPostalRegistro() {
		return codigoPostalRegistro.getText();
	}

	public void setCodigoPostalRegistro(String codigoPostalRegistro) {
		this.codigoPostalRegistro.setText(codigoPostalRegistro);
	}

	public String getLocalidadRegistro() {
		return localidadRegistro.getText();
	}

	public void setLocalidadRegistro(String localidadRegistro) {
		this.localidadRegistro.setText(localidadRegistro);
	}

	public String getProvinciaRegistro() {
		return provinciaRegistro.getText();
	}

	public void setProvinciaRegistro(String provinciaRegistro) {
		this.provinciaRegistro.setText(provinciaRegistro);
	}

	public String getCelularRegistro() {
		return celularRegistro.getText();
	}

	public void setCelularRegistro(String celularRegistro) {
		this.celularRegistro.setText(celularRegistro);
		
	}

	public String getTelefonoRegistro() {
		return telefonoRegistro.getText();
	}

	public void setTelefonoRegistro(String telefonoRegistro) {
		this.telefonoRegistro.setText(telefonoRegistro);
	}

	public JButton getRegistrarRegistro() {
		return registrarRegistro;
	}

	public JButton getCancelarRegistro() {
		return cancelarRegistro;
	}

	// Setter y getters de actualizacion de cliente
	public String getDniActualizacion() {
		return dniActualizacion.getText();
	}

	public void setDniActualizacion(String dniRegistro) {
		this.dniActualizacion.setText(dniRegistro);
	}

	public String getNombreActualizacion() {
		return nombreActualizacion.getText();
	}

	public void setNombreActualizacion(String nombreRegistro) {
		this.nombreActualizacion.setText(nombreRegistro);
	}

	public String getApellidoActualizacion() {
		return apellidoActualizacion.getText();
	}

	public void setApellidoActualizacion(String apellidoRegistro) {
		this.apellidoActualizacion.setText(apellidoRegistro);
	}

	public String getCalleActualizacion() {
		return calleActualizacion.getText();
	}

	public void setCalleActualizacion(String calleRegistro) {
		this.calleActualizacion.setText(calleRegistro);
	}

	public int getPisoActualizacion() {
		
		if (!this.pisoActualizacion.getText().equals("") && this.pisoActualizacion.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(pisoActualizacion.getText());

			
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.pisoActualizacion.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
 
	}

	public void setPisoActualizacion(String pisoRegistro) {
		this.pisoActualizacion.setText(pisoRegistro);
	}

	public int getNroCasaActualizacion() {

		if (!this.nroDeCasaActualizacion.getText().equals("") && this.nroDeCasaActualizacion.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(nroDeCasaActualizacion.getText());
			
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.nroDeCasaActualizacion.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		 
	}

	public void setNroCasaActualizacion(String nroCasaRegistro) {
		this.nroDeCasaActualizacion.setText(nroCasaRegistro);
	}

	public String getDepartamentoActualizacion() {
		return departamentoActualizacion.getText();
	}

	public void setDepartamentoActualizacion(String departamentoRegistro) {
		this.departamentoActualizacion.setText(departamentoRegistro);
	}

	public String getCodigoPostalActualizacion() {
		return codigoPostalActualizacion.getText();
	}

	public void setCodigoPostalActualizacion(String codigoPostalRegistro) {
		this.codigoPostalActualizacion.setText(codigoPostalRegistro);
	}

	public String getLocalidadActualizacion() {
		return localidadActualizacion.getText();
	}

	public void setLocalidadActualizacion(String localidadRegistro) {
		this.localidadActualizacion.setText(localidadRegistro);
	}

	public String getProvinciaActualizacion() {
		return provinciaActualizacion.getText();
	}

	public void setProvinciaActualizacion(String provinciaRegistro) {
		this.provinciaActualizacion.setText(provinciaRegistro);
	}

	public JButton getRegistrarActualizacion() {
		return this.actualizarCliente;
	}

	public JButton getCancelarActualizacion() {
		return this.cancelarActualizacion;
	}

	public JButton buscarClienteActualizacion() {
		return this.buscarClienteActualizacion;
	}

	public String getCelularActualizacion() {
		return celularActualizacion.getText();
	}

	public void setCelularActualizacion(String celularRegistro) {
		this.celularActualizacion.setText(celularRegistro);
		 
	}

	public String getTelefonoActualizacion() {
		return telefonoActualizacion.getText();
	}

	public void setTelefonoActualizacion(String telefonoRegistro) {
		this.telefonoActualizacion.setText(telefonoRegistro);
	}

	// Setter y getters de eliminacion de cliente
	public String getDniEliminacion() {
		return dniEliminacion.getText();
	}

	public void setDniEliminacion(String dniRegistro) {
		this.dniEliminacion.setText(dniRegistro);
	}

	public String getNombreEliminacion() {
		return nombreEliminacion.getText();
	}

	public void setNombreEliminacion(String nombreRegistro) {
		this.nombreEliminacion.setText(nombreRegistro);
	}

	public String getApellidoEliminacion() {
		return apellidoEliminacion.getText();
	}

	public void setApellidoEliminacion(String apellidoRegistro) {
		this.apellidoEliminacion.setText(apellidoRegistro);
	}

	public String getCalleEliminacion() {
		return calleEliminacion.getText();
	}

	public void setCalleEliminacion(String calleRegistro) {
		this.calleEliminacion.setText(calleRegistro);
	}

	public String getPisoEliminacion() {
		return pisoEliminacion.getText();
	}

	public void setPisoEliminacion(String pisoRegistro) {
		this.pisoEliminacion.setText(pisoRegistro);
	}

	public String getNroCasaEliminacion() {
		return nroDeCasaEliminacion.getText();
	}

	public void setNroCasaEliminacion(String nroCasaRegistro) {
		this.nroDeCasaEliminacion.setText(nroCasaRegistro);
	}

	public String getDepartamentoEliminacion() {
		return departamentoEliminacion.getText();
	}

	public void setDepartamentoEliminacion(String departamentoRegistro) {
		this.departamentoEliminacion.setText(departamentoRegistro);
	}

	public String getCodigoPostalEliminacion() {
		return codigoPostalEliminacion.getText();
	}

	public void setCodigoPostalEliminacion(String codigoPostalRegistro) {
		this.codigoPostalEliminacion.setText(codigoPostalRegistro);
	}

	public String getLocalidadEliminacion() {
		return localidadEliminacion.getText();
	}

	public void setLocalidadEliminacion(String localidadRegistro) {
		this.localidadEliminacion.setText(localidadRegistro);
	}

	public String getProvinciaEliminacion() {
		return provinciaEliminacion.getText();
	}

	public void setProvinciaEliminacion(String provinciaRegistro) {
		this.provinciaEliminacion.setText(provinciaRegistro);
	}

	public JButton getRegistrarEliminacion() {
		return this.eliminarCliente;
	}

	public JButton getCancelarEliminacion() {
		return this.cancelarEliminacion;
	}

	public JButton buscarClienteEliminacion() {
		return this.buscarClienteEliminacion;
	}

	public String getCelularEliminacion() {
		return celularEliminacion.getText();
	}

	public void setCelularEliminacion(String celularRegistro) {
		this.celularEliminacion.setText(celularRegistro);
		 
	}

	public String getTelefonoEliminacion() {
		return telefonoEliminacion.getText();
	}

	public void setTelefonoEliminacion(String telefonoRegistro) {
		this.telefonoEliminacion.setText(telefonoRegistro);
	}
	

	// Setter y getters de consulta de cliente

	public String getDniConsulta() {
		return this.dniConsulta.getText();
	}

	public void setDniConsulta(String dniRegistro) {
		this.dniConsulta.setText(dniRegistro);
	}

	 
	public void setNombreConsulta(String nombreRegistro) {
		this.nombreConsulta.setText(nombreRegistro);
	}

	 

	public void setApellidoConsulta(String apellidoRegistro) {
		this.apellidoConsulta.setText(apellidoRegistro);
	}

	 

	public void setCalleConsulta(String calleRegistro) {
		this.calleConsulta.setText(calleRegistro);
	}

	 

	public void setPisoConsulta(String pisoRegistro) {
		this.pisoConsulta.setText(pisoRegistro);
	}

	 

	public void setNroCasaConsulta(String nroCasaRegistro) {
		this.nroCasaConsulta.setText(nroCasaRegistro);
	}

	 

	public void setDepartamentoConsulta(String departamentoRegistro) {
		this.departamentoConsulta.setText(departamentoRegistro);
	}

	 

	public void setCodigoPostalConsulta(String codigoPostalRegistro) {
		this.codigoPostalConsulta.setText(codigoPostalRegistro);
	}

	 

	public void setLocalidadConsulta(String localidadRegistro) {
		this.localidadConsulta.setText(localidadRegistro);
	}

	 

	public void setProvinciaConsulta(String provinciaRegistro) {
		this.provinciaConsulta.setText(provinciaRegistro);
	}

	 
	public void setCelularConsulta(String celularRegistro) {
		this.celularConsulta.setText(celularRegistro);
		 
	}

	public void setTelefonoConsulta(String telefonoRegistro) {
		this.telefonoConsulta.setText(telefonoRegistro);
	}
	
	public JButton getCancelarConsulta() {
		return cancelarConsulta;
	}

	public JButton getBuscarConsulta() {
		return buscarConsulta;
	}
	
	//Getter JTextField 

	public JTextField getJTextFieldDniRegistro() {
		return dniRegistro;
	}

	public JTextField getJTextFieldNombreRegistro() {
		return nombreRegistro;
	}

	public JTextField getJTextFieldApellidoRegistro() {
		return apellidoRegistro;
	}

	public JTextField getJTextFieldCalleRegistro() {
		return calleRegistro;
	}

	public JTextField getJTextFieldPisoRegistro() {
		return pisoRegistro;
	}

	public JTextField getJTextFieldNroCasaRegistro() {
		return nroCasaRegistro;
	}

	public JTextField getJTextFieldDepartamentoRegistro() {
		return departamentoRegistro;
	}

	public JTextField getJTextFieldCodigoPostalRegistro() {
		return codigoPostalRegistro;
	}

	public JTextField getJTextFieldLocalidadRegistro() {
		return localidadRegistro;
	}

	public JTextField getJTextFieldProvinciaRegistro() {
		return provinciaRegistro;
	}

	public JTextField getJTextFieldDniActualizacion() {
		return dniActualizacion;
	}

	public JTextField getJTextFieldNombreActualizacion() {
		return nombreActualizacion;
	}

	public JTextField getJTextFieldApellidoActualizacion() {
		return apellidoActualizacion;
	}

	public JTextField getJTextFieldCalleActualizacion() {
		return calleActualizacion;
	}

	public JTextField getJTextFieldPisoActualizacion() {
		return pisoActualizacion;
	}

	public JTextField getJTextFieldNroDeCasaActualizacion() {
		return nroDeCasaActualizacion;
	}

	public JTextField getJTextFieldDepartamentoActualizacion() {
		return departamentoActualizacion;
	}

	public JTextField getJTextFieldCodigoPostalActualizacion() {
		return codigoPostalActualizacion;
	}

	public JTextField getJTextFieldLocalidadActualizacion() {
		return localidadActualizacion;
	}

	public JTextField getJTextFieldProvinciaActualizacion() {
		return provinciaActualizacion;
	}

	public JTextField getJTextFieldDniEliminacion() {
		return dniEliminacion;
	}

	public JTextField getJTextFieldNombreEliminacion() {
		return nombreEliminacion;
	}

	public JTextField getJTextFieldApellidoEliminacion() {
		return apellidoEliminacion;
	}

	public JTextField getJTextFieldCalleEliminacion() {
		return calleEliminacion;
	}

	public JTextField getJTextFieldPisoEliminacion() {
		return pisoEliminacion;
	}

	public JTextField getJTextFieldNroDeCasaEliminacion() {
		return nroDeCasaEliminacion;
	}

	public JTextField getJTextFieldDepartamentoEliminacion() {
		return departamentoEliminacion;
	}

	public JTextField getJTextFieldCodigoPostalEliminacion() {
		return codigoPostalEliminacion;
	}

	public JTextField getJTextFieldLocalidadEliminacion() {
		return localidadEliminacion;
	}

	public JTextField getJTextFieldProvinciaEliminacion() {
		return provinciaEliminacion;
	}

	public JTextField getJTextFieldCelularRegistro() {
		return celularRegistro;
	}

	public JTextField getJTextFieldTelefonoRegistro() {
		return telefonoRegistro;
	}

	public JTextField getJTextFieldCelularActualizacion() {
		return celularActualizacion;
	}

	public JTextField getJTextFieldTelefonoActualizacion() {
		return telefonoActualizacion;
	}

	public JTextField getJTextFieldCelularEliminacion() {
		return celularEliminacion;
	}

	public JTextField getJTextFieldTelefonoEliminacion() {
		return telefonoEliminacion;
	}
}
