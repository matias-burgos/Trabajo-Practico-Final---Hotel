package Paquete;

import java.io.Serializable;

public class UserHotel extends Persona implements Serializable {
	
	String user;//Nombre de usuario.
	transient String contrasenha;//ContraseÃ±a del usuario.

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
	//Opcional
	public String toString(){
	    String texto=(contrasenha==null) ? "(no disponible)" : contrasenha;
	    texto+=nombre;
	    return texto;
	  }
	
	
	//Gets/Sets.
	
	public String getUser()
	{
		return user;
	}
	public void setUser(String user)
	{
		this.user=user;
	}
	
	
	public void setContrasenha(String contra)
	{
		contrasenha=contra;
	}
	public String getContrasenha()
	{
		return contrasenha;
	}
	
	public void MostrarUsuario()
	{
		MostrarPersona();
		System.out.println("Nombre de usuario: "+getUser());	
	}
	
	
	
	
	public void CambiarContrasenha(String newContrasenha)//Realiza la comprobacion y el cambio de contraseña.
	{
		setContrasenha(newContrasenha);//Al pasar la verificacion se ingresa la nueva contrasenha.
	}
}
