package modelo;

import vista.Producto;

public class ABMLProducto {
	
	private Producto producto;
	private ConexionBBDD conexionBBDD;
	
	public ABMLProducto(Producto p)
	{
		producto=p;
		conexionBBDD=new ConexionBBDD();
	}
	
	

}
