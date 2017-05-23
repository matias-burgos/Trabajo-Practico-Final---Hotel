package Paquete;

public class UserHotel extends Persona{
	String user;//Nombre de usuario.
	String contrasenha;//Contraseña del usuario.
	
	public UserHotel()
	{
		super();
		user="";
		contrasenha="";
		
	}
	public UserHotel(String nombre, int dni, String user, String contrasenha)
	{
		super(nombre, dni);
		this.user=user;
		this.contrasenha=contrasenha;
	}
}
