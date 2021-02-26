package vista;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JButton registrarRegistro;
	private JButton cancelarRegistro ;
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
	
	public Cliente() {

		// Caracteristicas de la ventana.
		setTitle("CLIENTE");
		setSize(546, 681);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	
       
        //Lamina principal.
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBounds(0, 0, 532, 642);
        getContentPane().add(panelPrincipal);
        
        //Panel con pesta�as.
        panelPrincipal.setLayout(new CardLayout(5, 5));
        JTabbedPane panelPestanias = new JTabbedPane(JTabbedPane.TOP);
        panelPrincipal.add(panelPestanias);
        
        JPanel jPanelRegistro = new JPanel();
        panelPestanias.addTab("REGISTRO",jPanelRegistro);
        jPanelRegistro.setLayout(null);
        
        //Registro Cliente
        JPanel panelRegistroCliente = new JPanel();
        panelRegistroCliente.setBorder(BorderFactory.createTitledBorder("REGISTRAR CLIENTE"));
        panelRegistroCliente.setBounds(50, 11, 399, 484);
        jPanelRegistro.add(panelRegistroCliente);
        panelRegistroCliente.setLayout(null);
        
        JLabel labelDni = new JLabel("DNI");
        labelDni.setFont(new Font("Arial", Font.BOLD, 12));
        labelDni.setBounds(38, 27, 46, 14);
        panelRegistroCliente.add(labelDni);
        
        dniRegistro = new JTextField();
        dniRegistro.setBounds(150, 21, 150, 20);
        panelRegistroCliente.add(dniRegistro);
        dniRegistro.setColumns(10);
        
        JLabel labelNombre = new JLabel("Nombre");
        labelNombre.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombre.setBounds(38, 64, 46, 14);
        panelRegistroCliente.add(labelNombre);
        
        nombreRegistro = new JTextField();
        nombreRegistro.setColumns(10);
        nombreRegistro.setBounds(150, 58, 150, 20);
        panelRegistroCliente.add(nombreRegistro);
        
        JLabel lbaelApellido = new JLabel("Apellido");
        lbaelApellido.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellido.setBounds(38, 104, 46, 14);
        panelRegistroCliente.add(lbaelApellido);
        
        apellidoRegistro = new JTextField();
        apellidoRegistro.setColumns(10);
        apellidoRegistro.setBounds(150, 98, 150, 20);
        panelRegistroCliente.add(apellidoRegistro);
        
        JLabel labelCalle = new JLabel("Calle");
        labelCalle.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalle.setBounds(38, 146, 46, 14);
        panelRegistroCliente.add(labelCalle);
        
        calleRegistro = new JTextField();
        calleRegistro.setColumns(10);
        calleRegistro.setBounds(150, 140, 150, 20);
        panelRegistroCliente.add(calleRegistro);
        
        JLabel labelNroCasa_1 = new JLabel("Nro. Casa");
        labelNroCasa_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasa_1.setBounds(38, 194, 64, 14);
        panelRegistroCliente.add(labelNroCasa_1);
        
        JLabel labelPiso = new JLabel("Piso");
        labelPiso.setFont(new Font("Arial", Font.BOLD, 12));
        labelPiso.setBounds(38, 237, 64, 14);
        panelRegistroCliente.add(labelPiso);
        
        JLabel labelDpto = new JLabel("Dpto.");
        labelDpto.setFont(new Font("Arial", Font.BOLD, 12));
        labelDpto.setBounds(38, 277, 64, 14);
        panelRegistroCliente.add(labelDpto);
        
        pisoRegistro = new JTextField();
        pisoRegistro.setColumns(10);
        pisoRegistro.setBounds(150, 231, 150, 20);
        panelRegistroCliente.add(pisoRegistro);
        
        nroCasaRegistro = new JTextField();
        nroCasaRegistro.setColumns(10);
        nroCasaRegistro.setBounds(150, 187, 150, 20);
        panelRegistroCliente.add(nroCasaRegistro);
        
        departamentoRegistro = new JTextField();
        departamentoRegistro.setColumns(10);
        departamentoRegistro.setBounds(150, 274, 150, 20);
        panelRegistroCliente.add(departamentoRegistro);
        
        JLabel labelCodigoPostal = new JLabel("C\u00F3digo Postal");
        labelCodigoPostal.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostal.setBounds(38, 316, 86, 14);
        panelRegistroCliente.add(labelCodigoPostal);
        
        codigoPostalRegistro = new JTextField();
        codigoPostalRegistro.setColumns(10);
        codigoPostalRegistro.setBounds(150, 313, 150, 20);
        panelRegistroCliente.add(codigoPostalRegistro);
        
        JLabel lblLocalidad = new JLabel("Localidad");
        lblLocalidad.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidad.setBounds(38, 358, 86, 14);
        panelRegistroCliente.add(lblLocalidad);
        
        localidadRegistro = new JTextField();
        localidadRegistro.setColumns(10);
        localidadRegistro.setBounds(150, 355, 150, 20);
        panelRegistroCliente.add(localidadRegistro);
        
        JLabel lblProvincia = new JLabel("Provincia");
        lblProvincia.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvincia.setBounds(38, 399, 86, 14);
        panelRegistroCliente.add(lblProvincia);
        
        provinciaRegistro = new JTextField();
        provinciaRegistro.setColumns(10);
        provinciaRegistro.setBounds(150, 396, 150, 20);
        panelRegistroCliente.add(provinciaRegistro);
       
        //Botones registro cliente.
        JPanel panelAccionesRegistro = new JPanel();
        panelAccionesRegistro.setBounds(50, 506, 399, 87);
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
        panelActualizar.setBounds(0, 0, 517, 604);
        jPanelActualizar.add(panelActualizar);
        
        JPanel panelActualizarCliente = new JPanel();
        panelActualizarCliente.setLayout(null);
        panelActualizarCliente.setBorder(BorderFactory.createTitledBorder("REGISTRAR CLIENTE"));
        panelActualizarCliente.setBounds(50, 11, 399, 484);
        panelActualizar.add(panelActualizarCliente);
        
        JLabel labelDni_1 = new JLabel("DNI");
        labelDni_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelDni_1.setBounds(38, 27, 46, 14);
        panelActualizarCliente.add(labelDni_1);
        
        dniActualizacion = new JTextField();
        dniActualizacion.setColumns(10);
        dniActualizacion.setBounds(150, 21, 150, 20);
        panelActualizarCliente.add(dniActualizacion);
        
        JLabel labelNombre_1 = new JLabel("Nombre");
        labelNombre_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombre_1.setBounds(38, 64, 46, 14);
        panelActualizarCliente.add(labelNombre_1);
        
        nombreActualizacion = new JTextField();
        nombreActualizacion.setColumns(10);
        nombreActualizacion.setBounds(150, 58, 150, 20);
        panelActualizarCliente.add(nombreActualizacion);
        
        JLabel lbaelApellido_1 = new JLabel("Apellido");
        lbaelApellido_1.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellido_1.setBounds(38, 104, 46, 14);
        panelActualizarCliente.add(lbaelApellido_1);
        
        apellidoActualizacion = new JTextField();
        apellidoActualizacion.setColumns(10);
        apellidoActualizacion.setBounds(150, 98, 150, 20);
        panelActualizarCliente.add(apellidoActualizacion);
        
        JLabel labelCalle_1 = new JLabel("Calle");
        labelCalle_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalle_1.setBounds(38, 146, 46, 14);
        panelActualizarCliente.add(labelCalle_1);
        
        calleActualizacion = new JTextField();
        calleActualizacion.setColumns(10);
        calleActualizacion.setBounds(150, 140, 150, 20);
        panelActualizarCliente.add(calleActualizacion);
        
        JLabel labelNroCasa_1_1 = new JLabel("Nro. Casa");
        labelNroCasa_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasa_1_1.setBounds(38, 194, 64, 14);
        panelActualizarCliente.add(labelNroCasa_1_1);
        
        JLabel labelPiso_1 = new JLabel("Piso");
        labelPiso_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelPiso_1.setBounds(38, 237, 64, 14);
        panelActualizarCliente.add(labelPiso_1);
        
        JLabel labelDpto_1 = new JLabel("Dpto.");
        labelDpto_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelDpto_1.setBounds(38, 277, 64, 14);
        panelActualizarCliente.add(labelDpto_1);
        
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
        
        JLabel labelCodigoPostal_1 = new JLabel("C\u00F3digo Postal");
        labelCodigoPostal_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostal_1.setBounds(38, 316, 86, 14);
        panelActualizarCliente.add(labelCodigoPostal_1);
        
        codigoPostalActualizacion = new JTextField();
        codigoPostalActualizacion.setColumns(10);
        codigoPostalActualizacion.setBounds(150, 313, 150, 20);
        panelActualizarCliente.add(codigoPostalActualizacion);
        
        JLabel lblLocalidad_1 = new JLabel("Localidad");
        lblLocalidad_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidad_1.setBounds(38, 358, 86, 14);
        panelActualizarCliente.add(lblLocalidad_1);
        
        localidadActualizacion = new JTextField();
        localidadActualizacion.setColumns(10);
        localidadActualizacion.setBounds(150, 355, 150, 20);
        panelActualizarCliente.add(localidadActualizacion);
        
        JLabel lblProvincia_1 = new JLabel("Provincia");
        lblProvincia_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvincia_1.setBounds(38, 399, 86, 14);
        panelActualizarCliente.add(lblProvincia_1);
        
        provinciaActualizacion = new JTextField();
        provinciaActualizacion.setColumns(10);
        provinciaActualizacion.setBounds(150, 396, 150, 20);
        panelActualizarCliente.add(provinciaActualizacion);
        
        //Botones actualizar cliente.
        buscarClienteActualizacion = new JButton("");
        buscarClienteActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
        buscarClienteActualizacion.setBounds(300, 21, 30, 20);
        panelActualizarCliente.add(buscarClienteActualizacion);
        
        JPanel panelAccionesActualizar = new JPanel();
        panelAccionesActualizar.setLayout(null);
        panelAccionesActualizar.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelAccionesActualizar.setBounds(50, 506, 399, 87);
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
        panelEliminacion.setBounds(0, 0, 517, 604);
        jPanelEliminar.add(panelEliminacion);
        
        JPanel panelEliminacionCliente = new JPanel();
        panelEliminacionCliente.setLayout(null);
        panelEliminacionCliente.setBorder(BorderFactory.createTitledBorder("REGISTRAR CLIENTE"));
        panelEliminacionCliente.setBounds(50, 11, 399, 484);
        panelEliminacion.add(panelEliminacionCliente);
        
        JLabel labelDni_1_1 = new JLabel("DNI");
        labelDni_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelDni_1_1.setBounds(38, 27, 46, 14);
        panelEliminacionCliente.add(labelDni_1_1);
        
        dniEliminacion = new JTextField();
        dniEliminacion.setColumns(10);
        dniEliminacion.setBounds(150, 21, 150, 20);
        panelEliminacionCliente.add(dniEliminacion);
        
        JLabel labelNombre_1_1 = new JLabel("Nombre");
        labelNombre_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelNombre_1_1.setBounds(38, 64, 46, 14);
        panelEliminacionCliente.add(labelNombre_1_1);
        
        nombreEliminacion = new JTextField();
        nombreEliminacion.setEnabled(false);
        nombreEliminacion.setColumns(10);
        nombreEliminacion.setBounds(150, 58, 150, 20);
        panelEliminacionCliente.add(nombreEliminacion);
        
        JLabel lbaelApellido_1_1 = new JLabel("Apellido");
        lbaelApellido_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lbaelApellido_1_1.setBounds(38, 104, 46, 14);
        panelEliminacionCliente.add(lbaelApellido_1_1);
        
        apellidoEliminacion = new JTextField();
        apellidoEliminacion.setEnabled(false);
        apellidoEliminacion.setColumns(10);
        apellidoEliminacion.setBounds(150, 98, 150, 20);
        panelEliminacionCliente.add(apellidoEliminacion);
        
        JLabel labelCalle_1_1 = new JLabel("Calle");
        labelCalle_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelCalle_1_1.setBounds(38, 146, 46, 14);
        panelEliminacionCliente.add(labelCalle_1_1);
        
        calleEliminacion = new JTextField();
        calleEliminacion.setEnabled(false);
        calleEliminacion.setColumns(10);
        calleEliminacion.setBounds(150, 140, 150, 20);
        panelEliminacionCliente.add(calleEliminacion);
        
        JLabel labelNroCasa_1_1_1 = new JLabel("Nro. Casa");
        labelNroCasa_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelNroCasa_1_1_1.setBounds(38, 194, 64, 14);
        panelEliminacionCliente.add(labelNroCasa_1_1_1);
        
        JLabel labelPiso_1_1 = new JLabel("Piso");
        labelPiso_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelPiso_1_1.setBounds(38, 237, 64, 14);
        panelEliminacionCliente.add(labelPiso_1_1);
        
        JLabel labelDpto_1_1 = new JLabel("Dpto.");
        labelDpto_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelDpto_1_1.setBounds(38, 277, 64, 14);
        panelEliminacionCliente.add(labelDpto_1_1);
        
        pisoEliminacion = new JTextField();
        pisoEliminacion.setEnabled(false);
        pisoEliminacion.setColumns(10);
        pisoEliminacion.setBounds(150, 231, 150, 20);
        panelEliminacionCliente.add(pisoEliminacion);
        
        nroDeCasaEliminacion = new JTextField();
        nroDeCasaEliminacion.setEnabled(false);
        nroDeCasaEliminacion.setColumns(10);
        nroDeCasaEliminacion.setBounds(150, 187, 150, 20);
        panelEliminacionCliente.add(nroDeCasaEliminacion);
        
        departamentoEliminacion = new JTextField();
        departamentoEliminacion.setEnabled(false);
        departamentoEliminacion.setColumns(10);
        departamentoEliminacion.setBounds(150, 274, 150, 20);
        panelEliminacionCliente.add(departamentoEliminacion);
        
        JLabel labelCodigoPostal_1_1 = new JLabel("C\u00F3digo Postal");
        labelCodigoPostal_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        labelCodigoPostal_1_1.setBounds(38, 316, 86, 14);
        panelEliminacionCliente.add(labelCodigoPostal_1_1);
        
        codigoPostalEliminacion = new JTextField();
        codigoPostalEliminacion.setEnabled(false);
        codigoPostalEliminacion.setColumns(10);
        codigoPostalEliminacion.setBounds(150, 313, 150, 20);
        panelEliminacionCliente.add(codigoPostalEliminacion);
        
        JLabel lblLocalidad_1_1 = new JLabel("Localidad");
        lblLocalidad_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblLocalidad_1_1.setBounds(38, 358, 86, 14);
        panelEliminacionCliente.add(lblLocalidad_1_1);
        
        localidadEliminacion = new JTextField();
        localidadEliminacion.setEnabled(false);
        localidadEliminacion.setColumns(10);
        localidadEliminacion.setBounds(150, 355, 150, 20);
        panelEliminacionCliente.add(localidadEliminacion);
        
        JLabel lblProvincia_1_1 = new JLabel("Provincia");
        lblProvincia_1_1.setFont(new Font("Arial", Font.BOLD, 12));
        lblProvincia_1_1.setBounds(38, 399, 86, 14);
        panelEliminacionCliente.add(lblProvincia_1_1);
        
        provinciaEliminacion = new JTextField();
        provinciaEliminacion.setEnabled(false);
        provinciaEliminacion.setColumns(10);
        provinciaEliminacion.setBounds(150, 396, 150, 20);
        panelEliminacionCliente.add(provinciaEliminacion);
        
        //Botones eliminar cliente.
        buscarClienteEliminacion = new JButton("");
        buscarClienteEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
        buscarClienteEliminacion.setBounds(300, 21, 30, 20);
        panelEliminacionCliente.add(buscarClienteEliminacion);
        
        JPanel panelEliminacionRegistro = new JPanel();
        panelEliminacionRegistro.setLayout(null);
        panelEliminacionRegistro.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
        panelEliminacionRegistro.setBounds(50, 506, 399, 87);
        panelEliminacion.add(panelEliminacionRegistro);
        
        eliminarCliente = new JButton("");
        eliminarCliente.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\eliminar.png"));
        eliminarCliente.setBounds(90, 16, 48, 48);
        panelEliminacionRegistro.add(eliminarCliente);
        
        cancelarEliminacion = new JButton("");
        cancelarEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
        cancelarEliminacion.setBounds(295, 16, 48, 48);
        panelEliminacionRegistro.add(cancelarEliminacion);
        
        JLabel labelEliminar = new JLabel("Eliminar");
        labelEliminar.setBounds(90, 62, 48, 14);
        panelEliminacionRegistro.add(labelEliminar);
        
        JLabel labelSalirEliminacion = new JLabel("Salir");
        labelSalirEliminacion.setBounds(304, 62, 39, 14);
        panelEliminacionRegistro.add(labelSalirEliminacion);
	}

	//Setter y getters de registro cliente
	
	public String getDniRegistro() {
		return dniRegistro.getText();
	}


	public void setDniRegistro(String dniRegistro) {
		this.dniRegistro .setText(dniRegistro);
	}


	public String getNombreRegistro() {
		return nombreRegistro.getText();
	}


	public void setNombreRegistro(String nombreRegistro) {
		this.nombreRegistro .setText(nombreRegistro);
	}


	public String getApellidoRegistro() {
		return apellidoRegistro.getText();
	}


	public void setApellidoRegistro(String apellidoRegistro) {
		this.apellidoRegistro.setText(apellidoRegistro);
	}


	public String getCalleRegistro() {
		return calleRegistro.getText();
	}


	public void setCalleRegistro(String calleRegistro) {
		this.calleRegistro.setText(calleRegistro);
	}


	public String getPisoRegistro() {
		return pisoRegistro.getText();
	}


	public void setPisoRegistro(String pisoRegistro) {
		this.pisoRegistro.setText(pisoRegistro);
	}


	public String getNroCasaRegistro() {
		return nroCasaRegistro.getText();
	}


	public void setNroCasaRegistro(String nroCasaRegistro) {
		this.nroCasaRegistro .setText(nroCasaRegistro);
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


	public JButton getRegistrarRegistro() {
		return registrarRegistro;
	}


	public JButton getCancelarRegistro() {
		return cancelarRegistro;
	}
	
	//Setter y getters de actualizacion de cliente
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


	public String getPisoActualizacion() {
		return pisoActualizacion.getText();
	}


	public void setPisoActualizacion(String pisoRegistro) {
		this.pisoActualizacion.setText(pisoRegistro);
	}


	public String getNroCasaActualizacion() {
		return nroDeCasaActualizacion.getText();
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
	
	public JButton BuscarClienteActualizacion()
	{
		return this.buscarClienteActualizacion;
	}
	
	//Setter y getters de eliminacion de cliente
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
	
	public JButton BuscarClienteEliminacion()
	{
		return this.buscarClienteEliminacion;
	}
	
}
