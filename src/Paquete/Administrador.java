package Paquete;

public class Administrador extends UserHotel{
	
	public Administrador()
	{
		super();
	}
	public Administrador(String nombre, int dni, String user, String contrasenha)
	{
		super(nombre, dni, user, contrasenha);
	}
	
	public void getAdmin()
	{
		System.out.println("Nombre del administrador: "+getNombre());
		System.out.println("DNI del administrador: "+getDNI());
		System.out.println("Nombre de usuario del administrador: "+getUser());
		
	}
	
	
}
