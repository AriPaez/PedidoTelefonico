package modelo;

import vista.Login;
import vista.Registro;

public class LoginRegistro {
	
	public Login login;
	public Registro registro;
	
	public LoginRegistro(Login l)
	{
		login=l;
	}
	
	public LoginRegistro(Registro r)
	{
		registro=r;
	}
	
	
	
	public boolean login()
	{
		return true;
	}
	
	
	public void registrar()
	{
		
	}
	

}
