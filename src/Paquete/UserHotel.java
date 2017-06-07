package Paquete;

import java.util.Scanner;

public class UserHotel extends Persona{
	String user;//Nombre de usuario.
	transient String contrasenha;//ContraseÃ±a del usuario.
	Scanner sc=new Scanner(System.in);
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
	
	//Cambiar contraseña del usuario.
	public void setNewContrasenha()//Ingresa una nueva contraseña y se llama a la funcion que hace la comprobacion y el cambio.
	{
		String comprobar="s";
		String newContrasenha;
		do
		{
			System.out.println("Ingrese la nueva contrasenha: ");
			newContrasenha=sc.nextLine();
			System.out.println("La contrasenha ingresada fue: "+newContrasenha);
			System.out.println("¿Desea cambiarla? s/n: ");
			comprobar=sc.nextLine();
		}while(comprobar.equals("s"));
		CambiarContrasenha(newContrasenha);
	}
	
	public void CambiarContrasenha(String newContrasenha)//Realiza la comprobacion y el cambio de contraseña.
	{
		System.out.println("Ingrese la contraseha vieja: ");
		String verific=sc.nextLine();//Contrasenha ingresada por el usuario que quiere cambiar la contrasenha, utilizada para verificar si conincide con la ya ingresada.
		if(getContrasenha()==verific)
		{
			setContrasenha(newContrasenha);//Al pasar la verificacion se ingresa la nueva contrasenha.
		}
		else{
			System.out.println("La contraseha es incorrecta");//Si no pasa la verificacion da mensaje del error.
		}
	}
}
