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

import controlador.ControlProducto;
import javax.swing.JComboBox;

public class Producto extends JFrame {
	
	private JTextField idProductoRegistro;
	private JTextField nombreRegistro;
	private JTextField descripcionRegistro;
	private JTextField unidadMedidaRegistro;
	private JTextField cantidadRegistro;
	private JTextField precioRegistro;
	private JTextField idProductoActualizacion;
	private JTextField nombreActualizacion;
	private JTextField descripcionActualizacion;
	private JTextField unidadMedidaActualizacion;
	private JTextField cantidadActualizacion;
	private JTextField precioActualizacion;
	private JTextField idProductoEliminacion;
	private JTextField nombreEliminacion;
	private JTextField descripcionEliminacion;
	private JTextField unidadMedidaEliminacion;
	private JTextField cantidadEliminacion;
	private JTextField precioEliminacion;
	private JTextField categoriaEliminacion;
	private JTextField idProductoConsulta;
	private JTextField nombreConsulta;
	private JTextField descripcionConsulta;
	private JTextField unidadMedidaConsulta;
	private JTextField cantidadConsulta;
	private JTextField precioConsulta;
	private JTextField categoriaConsulta;
	private JButton cancelarConsulta;
	private JButton consultar; 
	private JButton buscarProductoEliminacion; 
	private JButton eliminar; 
	private JButton cancelarEliminacion; 
	private JButton cancelarActualizacion; 
	private JButton registrarActualizacion; 
	private JButton buscarProductoActualizacion;
	private JButton registrarProducto;
	private JButton cancelarRegistro;
	private JComboBox categoriaRegistro;
	private JComboBox categoriaActualizacion;
	
	public Producto() 
	{
		
		// Caracteristicas de la ventana.
		setTitle("PRODUCTO");
		setSize(530, 510);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);

		
		
		// Lamina principal.
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 520, 471);
		getContentPane().add(panelPrincipal);

		// Panel con pestañas.
		panelPrincipal.setLayout(new CardLayout(5, 5));
		JTabbedPane panelPestanias = new JTabbedPane(JTabbedPane.TOP);
		panelPrincipal.add(panelPestanias);

		
		//PANEL DE REGISTRO DE PRODUCTO.
		
		JPanel jPanelRegistro = new JPanel();
		panelPestanias.addTab("REGISTRO", jPanelRegistro);
		jPanelRegistro.setLayout(null);

		// Registro Cliente
		JPanel panelRegistroProducto = new JPanel();
		panelRegistroProducto.setBorder(BorderFactory.createTitledBorder("REGISTRAR PRODUCTO"));
		panelRegistroProducto.setBounds(50, 11, 399, 313);
		jPanelRegistro.add(panelRegistroProducto);
		panelRegistroProducto.setLayout(null);

		JLabel labelidRegistro = new JLabel("ID");
		labelidRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelidRegistro.setBounds(38, 27, 46, 14);
		panelRegistroProducto.add(labelidRegistro);

		idProductoRegistro = new JTextField();
		idProductoRegistro.setBounds(150, 21, 150, 20);
		panelRegistroProducto.add(idProductoRegistro);
		idProductoRegistro.setColumns(10);

		JLabel labelNombreRegistro = new JLabel("Nombre");
		labelNombreRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelNombreRegistro.setBounds(38, 64, 46, 14);
		panelRegistroProducto.add(labelNombreRegistro);

		nombreRegistro = new JTextField();
		nombreRegistro.setColumns(10);
		nombreRegistro.setBounds(150, 58, 150, 20);
		panelRegistroProducto.add(nombreRegistro);

		JLabel lbaelDescripcionRegistro = new JLabel("Descripci\u00F3n");
		lbaelDescripcionRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		lbaelDescripcionRegistro.setBounds(38, 104, 86, 14);
		panelRegistroProducto.add(lbaelDescripcionRegistro);

		descripcionRegistro = new JTextField();
		descripcionRegistro.setColumns(10);
		descripcionRegistro.setBounds(150, 98, 150, 20);
		panelRegistroProducto.add(descripcionRegistro);

		JLabel labelUnidadMedidaRegistro = new JLabel("Ud. Medida (g)");
		labelUnidadMedidaRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelUnidadMedidaRegistro.setBounds(38, 146, 86, 14);
		panelRegistroProducto.add(labelUnidadMedidaRegistro);

		unidadMedidaRegistro = new JTextField();
		unidadMedidaRegistro.setColumns(10);
		unidadMedidaRegistro.setText("");
		unidadMedidaRegistro.setBounds(150, 140, 150, 20);
		panelRegistroProducto.add(unidadMedidaRegistro);

		JLabel labelPrecioRegistro = new JLabel("Precio");
		labelPrecioRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelPrecioRegistro.setBounds(38, 194, 64, 14);
		panelRegistroProducto.add(labelPrecioRegistro);

		JLabel labelCantidadRegistro = new JLabel("Cantidad");
		labelCantidadRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelCantidadRegistro.setBounds(38, 237, 64, 14);
		panelRegistroProducto.add(labelCantidadRegistro);

		cantidadRegistro = new JTextField();
		cantidadRegistro.setColumns(10);
		cantidadRegistro.setBounds(150, 231, 150, 20);
		panelRegistroProducto.add(cantidadRegistro);

		precioRegistro = new JTextField();
		precioRegistro.setText("");
		precioRegistro.setColumns(10);
		precioRegistro.setBounds(150, 187, 150, 20);
		panelRegistroProducto.add(precioRegistro);
		
		JLabel labelCategoriaRegistro = new JLabel("Categor\u00EDa");
		labelCategoriaRegistro.setFont(new Font("Arial", Font.BOLD, 12));
		labelCategoriaRegistro.setBounds(38, 277, 64, 14);
		panelRegistroProducto.add(labelCategoriaRegistro);
		
		categoriaRegistro = new JComboBox();
		categoriaRegistro.addItem("Limpieza");
		categoriaRegistro.addItem("Alimento");
		categoriaRegistro.addItem("Juguetería");
		categoriaRegistro.addItem("Ferreteria");
		categoriaRegistro.addItem("Hardware");
		categoriaRegistro.setBounds(150, 273, 150, 22);
		panelRegistroProducto.add(categoriaRegistro);

		// Botones registro cliente.
		JPanel panelAccionesRegistro = new JPanel();
		panelAccionesRegistro.setBounds(50, 335, 399, 87);
		jPanelRegistro.add(panelAccionesRegistro);
		panelAccionesRegistro.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
		panelAccionesRegistro.setLayout(null);

		registrarProducto = new JButton("");
		registrarProducto.setIcon(new ImageIcon(
		"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\guardar.png"));
		registrarProducto.setBounds(90, 16, 48, 48);
		panelAccionesRegistro.add(registrarProducto);

		cancelarRegistro = new JButton("");
		cancelarRegistro.setIcon(new ImageIcon(
		"C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		cancelarRegistro.setBounds(295, 16, 48, 48);
		panelAccionesRegistro.add(cancelarRegistro);

		JLabel labelGuardar = new JLabel("Guardar");
		labelGuardar.setBounds(90, 62, 48, 14);
		panelAccionesRegistro.add(labelGuardar);

		JLabel labelSalir = new JLabel("Salir");
		labelSalir.setBounds(304, 62, 39, 14);
		panelAccionesRegistro.add(labelSalir);
		
		
		//PANEL DE ACTUALIZACION DE PRODUCTO
		
		
		JPanel panel = new JPanel();
		panelPestanias.addTab("ACTUALIZACIÓN", panel);
		panel.setLayout(null);
		
		JPanel jPanelActualizar = new JPanel();
		jPanelActualizar.setLayout(null);
		jPanelActualizar.setBounds(0, 0, 507, 433);
		panel.add(jPanelActualizar);
		
		JPanel panelActualizarProducto = new JPanel();
		panelActualizarProducto.setLayout(null);
		panelActualizarProducto.setBorder(BorderFactory.createTitledBorder("ACTUALIZAR PRODUCTO"));
		panelActualizarProducto.setBounds(50, 11, 399, 313);
		jPanelActualizar.add(panelActualizarProducto);
		
		JLabel labelidProductoActualizar = new JLabel("ID");
		labelidProductoActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelidProductoActualizar.setBounds(38, 27, 46, 14);
		panelActualizarProducto.add(labelidProductoActualizar);
		
		idProductoActualizacion = new JTextField();
		idProductoActualizacion.setColumns(10);
		idProductoActualizacion.setBounds(150, 21, 150, 20);
		panelActualizarProducto.add(idProductoActualizacion);
		
		JLabel labelNombreActualizar = new JLabel("Nombre");
		labelNombreActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelNombreActualizar.setBounds(38, 64, 46, 14);
		panelActualizarProducto.add(labelNombreActualizar);
		
		nombreActualizacion = new JTextField();
		nombreActualizacion.setColumns(10);
		nombreActualizacion.setBounds(150, 58, 150, 20);
		panelActualizarProducto.add(nombreActualizacion);
		
		JLabel lbaelDescripcionActualizar = new JLabel("Descripci\u00F3n");
		lbaelDescripcionActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		lbaelDescripcionActualizar.setBounds(38, 104, 86, 14);
		panelActualizarProducto.add(lbaelDescripcionActualizar);
		
		descripcionActualizacion = new JTextField();
		descripcionActualizacion.setColumns(10);
		descripcionActualizacion.setBounds(150, 98, 150, 20);
		panelActualizarProducto.add(descripcionActualizacion);
		
		JLabel labelUnidadMedidaActualizar = new JLabel("Ud. Medida(g)");
		labelUnidadMedidaActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelUnidadMedidaActualizar.setBounds(38, 146, 77, 14);
		panelActualizarProducto.add(labelUnidadMedidaActualizar);
		
		unidadMedidaActualizacion = new JTextField();
		unidadMedidaActualizacion.setText("");
		unidadMedidaActualizacion.setColumns(10);
		unidadMedidaActualizacion.setBounds(150, 140, 150, 20);
		panelActualizarProducto.add(unidadMedidaActualizacion);
		
		JLabel labelPrecioActualizar = new JLabel("Precio");
		labelPrecioActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelPrecioActualizar.setBounds(38, 194, 64, 14);
		panelActualizarProducto.add(labelPrecioActualizar);
		
		JLabel labelCantidadActualizar = new JLabel("Cantidad");
		labelCantidadActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelCantidadActualizar.setBounds(38, 237, 64, 14);
		panelActualizarProducto.add(labelCantidadActualizar);
		
		cantidadActualizacion = new JTextField();
		cantidadActualizacion.setColumns(10);
		cantidadActualizacion.setBounds(150, 231, 150, 20);
		panelActualizarProducto.add(cantidadActualizacion);
		
		precioActualizacion = new JTextField();
		precioActualizacion.setText("");
		precioActualizacion.setColumns(10);
		precioActualizacion.setBounds(150, 187, 150, 20);
		panelActualizarProducto.add(precioActualizacion);
		
		JLabel labelCategoriaActualizar = new JLabel("Categor\u00EDa");
		labelCategoriaActualizar.setFont(new Font("Arial", Font.BOLD, 12));
		labelCategoriaActualizar.setBounds(38, 277, 64, 14);
		panelActualizarProducto.add(labelCategoriaActualizar);
		
		buscarProductoActualizacion = new JButton("");
		buscarProductoActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
		buscarProductoActualizacion.setBounds(310, 23, 30, 20);
		panelActualizarProducto.add(buscarProductoActualizacion);
		
		categoriaActualizacion = new JComboBox();
		categoriaActualizacion.addItem("Limpieza");
		categoriaActualizacion.addItem("Alimento");
		categoriaActualizacion.addItem("Juguetería");
		categoriaActualizacion.addItem("Ferreteria");
		categoriaActualizacion.addItem("Hardware");
		categoriaActualizacion.setBounds(150, 273, 150, 22);
		panelActualizarProducto.add(categoriaActualizacion);
		
		JPanel panelAccionesActualizar = new JPanel();
		panelAccionesActualizar.setLayout(null);
		panelAccionesActualizar.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
		panelAccionesActualizar.setBounds(50, 335, 399, 87);
		jPanelActualizar.add(panelAccionesActualizar);
		
		registrarActualizacion = new JButton("");
		registrarActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\actualizar.png"));
		registrarActualizacion.setBounds(90, 16, 48, 48);
		panelAccionesActualizar.add(registrarActualizacion);
		
		cancelarActualizacion = new JButton("");
		cancelarActualizacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		cancelarActualizacion.setBounds(295, 16, 48, 48);
		panelAccionesActualizar.add(cancelarActualizacion);
		
		JLabel labelGuardarActualizacion = new JLabel("Actualizar");
		labelGuardarActualizacion.setBounds(90, 62, 59, 14);
		panelAccionesActualizar.add(labelGuardarActualizacion);
		
		JLabel labelSalirActualizacion = new JLabel("Salir");
		labelSalirActualizacion.setBounds(304, 62, 39, 14);
		panelAccionesActualizar.add(labelSalirActualizacion);
		
		
		
		//PANEL DE ELIMINACION DE PRODUCTO
		
		
		JPanel panel_1 = new JPanel();
		panelPestanias.addTab("ELIMINAR", panel_1);
		panel_1.setLayout(null);
		
		JPanel jPanelEliminar = new JPanel();
		jPanelEliminar.setLayout(null);
		jPanelEliminar.setBounds(0, 0, 507, 433);
		panel_1.add(jPanelEliminar);
		
		JPanel panelEliminarProducto = new JPanel();
		panelEliminarProducto.setLayout(null);
		panelEliminarProducto.setBorder(BorderFactory.createTitledBorder("ELIMINAR PRODUCTO"));
		panelEliminarProducto.setBounds(50, 11, 399, 313);
		jPanelEliminar.add(panelEliminarProducto);
		
		JLabel labelidProductoEliminacion = new JLabel("ID");
		labelidProductoEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelidProductoEliminacion.setBounds(38, 27, 46, 14);
		panelEliminarProducto.add(labelidProductoEliminacion);
		
		idProductoEliminacion = new JTextField();
		idProductoEliminacion.setColumns(10);
		idProductoEliminacion.setBounds(150, 21, 150, 20);
		panelEliminarProducto.add(idProductoEliminacion);
		
		JLabel labelNombreEliminacion = new JLabel("Nombre");
		labelNombreEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelNombreEliminacion.setBounds(38, 64, 46, 14);
		panelEliminarProducto.add(labelNombreEliminacion);
		
		nombreEliminacion = new JTextField();
		nombreEliminacion.setEditable(false);
		nombreEliminacion.setColumns(10);
		nombreEliminacion.setBounds(150, 58, 150, 20);
		panelEliminarProducto.add(nombreEliminacion);
		
		JLabel lbaelDescripcionEliminacion = new JLabel("Descripci\u00F3n");
		lbaelDescripcionEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		lbaelDescripcionEliminacion.setBounds(38, 104, 86, 14);
		panelEliminarProducto.add(lbaelDescripcionEliminacion);
		
		descripcionEliminacion = new JTextField();
		descripcionEliminacion.setEditable(false);
		descripcionEliminacion.setColumns(10);
		descripcionEliminacion.setBounds(150, 98, 150, 20);
		panelEliminarProducto.add(descripcionEliminacion);
		
		JLabel labelUnidadMedidaEliminacion = new JLabel("Ud. Medida(g)");
		labelUnidadMedidaEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelUnidadMedidaEliminacion.setBounds(38, 146, 77, 14);
		panelEliminarProducto.add(labelUnidadMedidaEliminacion);
		
		unidadMedidaEliminacion = new JTextField();
		unidadMedidaEliminacion.setEditable(false);
		unidadMedidaEliminacion.setText("");
		unidadMedidaEliminacion.setColumns(10);
		unidadMedidaEliminacion.setBounds(150, 140, 150, 20);
		panelEliminarProducto.add(unidadMedidaEliminacion);
		
		JLabel labelPrecioEliminacion = new JLabel("Precio");
		labelPrecioEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelPrecioEliminacion.setBounds(38, 194, 64, 14);
		panelEliminarProducto.add(labelPrecioEliminacion);
		
		JLabel labelCantidadEliminacion = new JLabel("Cantidad");
		labelCantidadEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelCantidadEliminacion.setBounds(38, 237, 64, 14);
		panelEliminarProducto.add(labelCantidadEliminacion);
		
		cantidadEliminacion = new JTextField();
		cantidadEliminacion.setEditable(false);
		cantidadEliminacion.setColumns(10);
		cantidadEliminacion.setBounds(150, 231, 150, 20);
		panelEliminarProducto.add(cantidadEliminacion);
		
		precioEliminacion = new JTextField();
		precioEliminacion.setEditable(false);
		precioEliminacion.setText("");
		precioEliminacion.setColumns(10);
		precioEliminacion.setBounds(150, 187, 150, 20);
		panelEliminarProducto.add(precioEliminacion);
		
		JLabel labelCategoriaEliminacion = new JLabel("Categor\u00EDa");
		labelCategoriaEliminacion.setFont(new Font("Arial", Font.BOLD, 12));
		labelCategoriaEliminacion.setBounds(38, 277, 64, 14);
		panelEliminarProducto.add(labelCategoriaEliminacion);
		
		categoriaEliminacion = new JTextField();
		categoriaEliminacion.setEditable(false);
		categoriaEliminacion.setColumns(10);
		categoriaEliminacion.setBounds(150, 271, 150, 20);
		panelEliminarProducto.add(categoriaEliminacion);
		
		buscarProductoEliminacion = new JButton("");
		buscarProductoEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscar.png"));
		buscarProductoEliminacion.setBounds(310, 23, 30, 20);
		panelEliminarProducto.add(buscarProductoEliminacion);
		
		JPanel panelAccionesEliminar = new JPanel();
		panelAccionesEliminar.setLayout(null);
		panelAccionesEliminar.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
		panelAccionesEliminar.setBounds(50, 335, 399, 87);
		jPanelEliminar.add(panelAccionesEliminar);
		
		eliminar = new JButton("");
		eliminar.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\eliminarProducto.png"));
		eliminar.setBounds(90, 16, 48, 48);
		panelAccionesEliminar.add(eliminar);
		
		cancelarEliminacion = new JButton("");
		cancelarEliminacion.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		cancelarEliminacion.setBounds(295, 16, 48, 48);
		panelAccionesEliminar.add(cancelarEliminacion);
		
		JLabel labelEliminacion = new JLabel("Eliminar");
		labelEliminacion.setBounds(90, 62, 48, 14);
		panelAccionesEliminar.add(labelEliminacion);
		
		JLabel labelSalirEliminacion = new JLabel("Salir");
		labelSalirEliminacion.setBounds(304, 62, 39, 14);
		panelAccionesEliminar.add(labelSalirEliminacion);
		
		
		
		//PANEL DE CONSULTA DE PRODUCTO
		
		
		JPanel panel_2 = new JPanel();
		panelPestanias.addTab("CONSULTA",panel_2);
		panel_2.setLayout(null);
		
		JPanel jPanelConsulta = new JPanel();
		jPanelConsulta.setLayout(null);
		jPanelConsulta.setBounds(0, 0, 507, 443);
		panel_2.add(jPanelConsulta);
		
		JPanel panelConsultaProducto = new JPanel();
		panelConsultaProducto.setLayout(null);
		panelConsultaProducto.setBorder(BorderFactory.createTitledBorder("CONSULTA PRODUCTO"));
		panelConsultaProducto.setBounds(50, 11, 399, 313);
		jPanelConsulta.add(panelConsultaProducto);
		
		JLabel labelidProductoConsulta = new JLabel("ID");
		labelidProductoConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelidProductoConsulta.setBounds(38, 27, 46, 14);
		panelConsultaProducto.add(labelidProductoConsulta);
		
		idProductoConsulta = new JTextField();
		idProductoConsulta.setColumns(10);
		idProductoConsulta.setBounds(150, 21, 150, 20);
		panelConsultaProducto.add(idProductoConsulta);
		
		JLabel labelNombreConsulta = new JLabel("Nombre");
		labelNombreConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelNombreConsulta.setBounds(38, 64, 46, 14);
		panelConsultaProducto.add(labelNombreConsulta);
		
		nombreConsulta = new JTextField();
		nombreConsulta.setEditable(false);
		nombreConsulta.setColumns(10);
		nombreConsulta.setBounds(150, 58, 150, 20);
		panelConsultaProducto.add(nombreConsulta);
		
		JLabel lbaelDescripcionConsulta = new JLabel("Descripci\u00F3n");
		lbaelDescripcionConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		lbaelDescripcionConsulta.setBounds(38, 104, 86, 14);
		panelConsultaProducto.add(lbaelDescripcionConsulta);
		
		descripcionConsulta = new JTextField();
		descripcionConsulta.setEditable(false);
		descripcionConsulta.setColumns(10);
		descripcionConsulta.setBounds(150, 98, 150, 20);
		panelConsultaProducto.add(descripcionConsulta);
		
		JLabel labelUnidadMedidaConsulta = new JLabel("Ud. Medida(g)");
		labelUnidadMedidaConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelUnidadMedidaConsulta.setBounds(38, 146, 86, 14);
		panelConsultaProducto.add(labelUnidadMedidaConsulta);
		
		unidadMedidaConsulta = new JTextField();
		unidadMedidaConsulta.setText("");
		unidadMedidaConsulta.setEditable(false);
		unidadMedidaConsulta.setColumns(10);
		unidadMedidaConsulta.setBounds(150, 140, 150, 20);
		panelConsultaProducto.add(unidadMedidaConsulta);
		
		JLabel labelPrecioConsulta = new JLabel("Precio");
		labelPrecioConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelPrecioConsulta.setBounds(38, 194, 64, 14);
		panelConsultaProducto.add(labelPrecioConsulta);
		
		JLabel labelCantidadConsulta = new JLabel("Cantidad");
		labelCantidadConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelCantidadConsulta.setBounds(38, 237, 64, 14);
		panelConsultaProducto.add(labelCantidadConsulta);
		
		cantidadConsulta = new JTextField();
		cantidadConsulta.setEditable(false);
		cantidadConsulta.setColumns(10);
		cantidadConsulta.setBounds(150, 231, 150, 20);
		panelConsultaProducto.add(cantidadConsulta);
		
		precioConsulta = new JTextField();
		precioConsulta.setText("");
		precioConsulta.setEditable(false);
		precioConsulta.setColumns(10);
		precioConsulta.setBounds(150, 187, 150, 20);
		panelConsultaProducto.add(precioConsulta);
		
		JLabel labelCategoriaConsulta = new JLabel("Categor\u00EDa");
		labelCategoriaConsulta.setFont(new Font("Arial", Font.BOLD, 12));
		labelCategoriaConsulta.setBounds(38, 277, 64, 14);
		panelConsultaProducto.add(labelCategoriaConsulta);
		
		categoriaConsulta = new JTextField();
		categoriaConsulta.setEditable(false);
		categoriaConsulta.setColumns(10);
		categoriaConsulta.setBounds(150, 271, 150, 20);
		panelConsultaProducto.add(categoriaConsulta);
		
		JPanel panelAccionesConsulta = new JPanel();
		panelAccionesConsulta.setLayout(null);
		panelAccionesConsulta.setBorder(BorderFactory.createTitledBorder("ACCIONES"));
		panelAccionesConsulta.setBounds(50, 335, 399, 87);
		jPanelConsulta.add(panelAccionesConsulta);
		
		consultar = new JButton("");
		consultar.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\buscarCliente.png"));
		consultar.setBounds(90, 16, 48, 48);
		panelAccionesConsulta.add(consultar);
		
		cancelarConsulta = new JButton("");
		cancelarConsulta.setIcon(new ImageIcon("C:\\Users\\ArielPaez\\Desktop\\proyectosJava\\Pedidos Telef\u00F3nicos\\pedidoTelefonico\\src\\icon\\empleado\\salir.png"));
		cancelarConsulta.setBounds(295, 16, 48, 48);
		panelAccionesConsulta.add(cancelarConsulta);
		
		JLabel labelConsulta = new JLabel("Consultar");
		labelConsulta.setBounds(90, 62, 62, 14);
		panelAccionesConsulta.add(labelConsulta);
		
		JLabel labelSalirConsulta = new JLabel("Salir");
		labelSalirConsulta.setBounds(304, 62, 39, 14);
		panelAccionesConsulta.add(labelSalirConsulta);
		
		
		ControlProducto cP=new ControlProducto(this);
		
		//Eventos botones.
		
		cancelarConsulta.addActionListener(cP);
		consultar.addActionListener(cP);
		buscarProductoEliminacion.addActionListener(cP);
		eliminar.addActionListener(cP);
		cancelarEliminacion.addActionListener(cP);
		cancelarActualizacion.addActionListener(cP);
		registrarActualizacion.addActionListener(cP);
		buscarProductoActualizacion.addActionListener(cP);
		registrarProducto.addActionListener(cP);
		cancelarRegistro.addActionListener(cP);
		
		
	}

	//Getters y setter de Registro producto.
	
	public String getIdProductoRegistro() {
		return idProductoRegistro.getText();
	}


	public void setIdProductoRegistro(String idProductoRegistro) {
		this.idProductoRegistro.setText(idProductoRegistro);
	}


	public String getNombreRegistro() {
		return nombreRegistro.getText();
	}


	public void setNombreRegistro(String nombreRegistro) {
		this.nombreRegistro.setText(nombreRegistro);
	}


	public String getDescripcionRegistro() {
		return descripcionRegistro.getText();
	}


	public void setDescripcionRegistro(String descripcionRegistro) {
		this.descripcionRegistro.setText(descripcionRegistro);
	}


	public float getUnidadMedidaRegistro() {
		
		 
		if (!this.unidadMedidaRegistro.getText().equals("") && this.unidadMedidaRegistro.getText().matches("[0-9.]*"))
		{
			return Float.parseFloat(this.unidadMedidaRegistro.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.unidadMedidaRegistro.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		 
	}


	public void setUnidadMedidaRegistro(String unidadMedidaRegistro) {
		this.unidadMedidaRegistro.setText(unidadMedidaRegistro);
	}


	public int getCantidadRegistro()
	{
		
		if (!this.cantidadRegistro.getText().equals("") && this.cantidadRegistro.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(this.cantidadRegistro.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.cantidadRegistro.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		
	 
	}


	public void setCantidadRegistro(String cantidadRegistro) {
		this.cantidadRegistro.setText(cantidadRegistro);
	}


	public float getPrecioRegistro() {
		
		
		if (!this.precioRegistro.getText().equals("") && this.precioRegistro.getText().matches("[0-9].*"))
		{
			return Float.parseFloat(this.precioRegistro.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.precioRegistro.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		 
	}


	public void setPrecioRegistro(String precioRegistro) {
		this.precioRegistro.setText(precioRegistro);
	}


	public String getCategoriaRegistro() {
		return (String)categoriaRegistro.getSelectedItem();
	}


 
	public JButton getRegistrarProducto() {
		return registrarProducto;
	}

	public JButton getCancelarRegistro() {
		return cancelarRegistro;
	}
	
	 
	//Getters y setter de actualizacion producto.
	
	public String getIdProductoActualizacion() {
		return idProductoActualizacion.getText();
	}
	
	public void setIdProductoActualizacion(String idProductoRegistro) {
		this.idProductoActualizacion.setText(idProductoRegistro);
	}


	public String getNombreActualizacion() {
		return nombreActualizacion.getText();
	}


	public void setNombreActualizacion(String nombreRegistro) {
		this.nombreActualizacion.setText(nombreRegistro);
	}


	public String getDescripcionActualizacion() {
		return descripcionActualizacion.getText();
	}


	public void setDescripcionActualizacion(String descripcionRegistro) {
		this.descripcionActualizacion.setText(descripcionRegistro);
	}


	public float getUnidadMedidaActualizacion() {
		
		 
		if (!this.unidadMedidaActualizacion.getText().equals("") && this.unidadMedidaActualizacion.getText().matches("[0-9.]*"))
		{
			return Float.parseFloat(this.unidadMedidaActualizacion.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.unidadMedidaActualizacion.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		 
	}


	public void setUnidadMedidaActualizacion(String unidadMedidaRegistro) {
		this.unidadMedidaActualizacion.setText(unidadMedidaRegistro);
	}


	public int getCantidadActualizacion() {
		
		if (!this.cantidadActualizacion.getText().equals("") && this.cantidadActualizacion.getText().matches("[0-9]*"))
		{
			return Integer.parseInt(this.cantidadActualizacion.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.cantidadActualizacion.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		
		 
	}


	public void setCantidadActualizacion(String cantidadRegistro) {
		this.cantidadActualizacion.setText(cantidadRegistro);
	}


	public float getPrecioActualizacion() {
		
		
		if (!this.precioActualizacion.getText().equals("") && this.precioActualizacion.getText().matches("[0-9].*"))
		{
			return Float.parseFloat(this.precioActualizacion.getText());
		}
		//Si retorna cero e poque no el JTextFiel esta vacio
		if(this.precioActualizacion.getText().equals(""))
		{
			return 0;
		}
		else//retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}
		 
	}


	public void setPrecioActualizacion(String precioRegistro) {
		this.precioActualizacion.setText(precioRegistro);
	}


	public void setCategoriaActualizacion(String categoria) {
			 
		categoriaActualizacion.setSelectedItem(categoria);
				 
	}

	
	public String getCategoriaActualizacion() {
		return (String)categoriaActualizacion.getSelectedItem();
	}


	public JButton getActualizarProducto() {
		return registrarActualizacion;
	}

	public JButton getCancelarActualizacion() {
		return cancelarActualizacion;
	}
	
	public JButton getBuscarProductoActualizacion() {
		return buscarProductoActualizacion;
	}
	 
	// setter de eliminacion producto.
	 
	public void setNombreEliminacion(String nombreRegistro) {
		this.nombreEliminacion.setText(nombreRegistro);
	}

	public void setDescripcionEliminacion(String descripcionRegistro) {
		this.descripcionEliminacion.setText(descripcionRegistro);
	}

	public void setUnidadMedidaEliminacion(String unidadMedidaRegistro) {
		this.unidadMedidaEliminacion.setText(unidadMedidaRegistro);
	}

	public void setCantidadEliminacion(String cantidadRegistro) {
		this.cantidadEliminacion.setText(cantidadRegistro);
	}

	public void setPrecioEliminacion(String precioRegistro) {
		this.precioEliminacion.setText(precioRegistro);
	}

	public void setCategoriaEliminacion(String categoria) {

		categoriaEliminacion.setText(categoria);

	}
	 
	
	public String getIdProductoEliminacion()
	{
		return this.idProductoEliminacion.getText();
	}
	
	public JButton getEliminacionProducto(){
		return eliminar;
	}

	public JButton getCancelarEliminacion() {
		return cancelarEliminacion;
	}
	
	public JButton getBuscarProductoEliminacion() {
		return buscarProductoEliminacion;
	}

	//Getters y setter de consulta producto.
	 
	public String getIdProductoConsulta() {
		return idProductoConsulta.getText();
	}

	public String getNombreConsulta() {
		return nombreConsulta.getText();
	}

	public String getDescripcionConsulta() {
		return descripcionConsulta.getText();
	}

	public float getUnidadMedidaConsulta() {

		if (!this.unidadMedidaConsulta.getText().equals("") && this.unidadMedidaConsulta.getText().matches("[0-9.]*")) {
			return Float.parseFloat(this.unidadMedidaConsulta.getText());
		}
		// Si retorna cero e poque no el JTextFiel esta vacio
		if (this.unidadMedidaConsulta.getText().equals("")) {
			return 0;
		} else// retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}

	}

	public int getCantidadConsulta() {

		if (!this.cantidadConsulta.getText().equals("") && this.cantidadConsulta.getText().matches("[0-9].*")) {
			return Integer.parseInt(this.cantidadConsulta.getText());
		}
		// Si retorna cero e poque no el JTextFiel esta vacio
		if (this.cantidadConsulta.getText().equals("")) {
			return 0;
		} else// retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}

	}

	public float getPrecioRegistroConsulta() {

		if (!this.precioConsulta.getText().equals("") && this.precioConsulta.getText().matches("[0-9].*")) {
			return Float.parseFloat(this.precioConsulta.getText());
		}
		// Si retorna cero e poque no el JTextFiel esta vacio
		if (this.precioConsulta.getText().equals("")) {
			return 0;
		} else// retorna -1 cuando se ingresa caracteres diferentes a [0-9]
		{
			return -1;
		}

	}

	public void setNombreConsulta(String nombreRegistro) {
		this.nombreConsulta.setText(nombreRegistro);
	}

	public void setDescripcionConsulta(String descripcionRegistro) {
		this.descripcionConsulta.setText(descripcionRegistro);
	}

	public void setUnidadMedidaConsulta(String unidadMedidaRegistro) {
		this.unidadMedidaConsulta.setText(unidadMedidaRegistro);
	}

	public void setCantidadConsulta(String cantidadRegistro) {
		this.cantidadConsulta.setText(cantidadRegistro);
	}

	public void setPrecioConsulta(String precioRegistro) {
		this.precioConsulta.setText(precioRegistro);
	}

	public void setCategoriaConsulta(String categoria) {

		categoriaConsulta.setText(categoria);

	}
	  
	public String getCategoriaConsulta() {
		return categoriaConsulta.getText();
	}

	public JButton getConsultaProducto() {
		return consultar;
	}

	public JButton getCancelarConsulta() {
		return cancelarConsulta;
	}
}
