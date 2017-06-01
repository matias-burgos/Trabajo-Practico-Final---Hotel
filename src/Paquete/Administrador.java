package Paquete;

public class Administrador extends UserHotel{
	
	public Administrador()
	{
		super();
	}
	public Administrador(String nombre, int dni, String user, String contrasenha, String mail, int telefono)
	{
		super(nombre, dni, user, contrasenha, mail, telefono);
	}
	
	public void getAdmin()
	{
		System.out.println("Tipo de usuario: Administrador");
		MostrarUsuario();
	}
	
	
	
	
	
	
}
