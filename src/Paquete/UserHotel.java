package Paquete;

import java.util.Scanner;

public class UserHotel extends Persona{
	String user;//Nombre de usuario.
	protected String contrasenha;//Contraseña del usuario.
	String mail;
	int telefono;
	Scanner sc=new Scanner(System.in);
	public UserHotel()
	{
		super();
		user="";
		contrasenha="";
		mail="";
		telefono=0;
		
	}
	public UserHotel(String nombre, int dni, String user, String contrasenha, String mail, int telefono)
	{
		super(nombre, dni);
		this.user=user;
		this.contrasenha=contrasenha;
		this.mail=mail;
		this.telefono=telefono;
	}
	
	//Ingresar usuario (nombre-contrase�a).
	public String getUser()
	{
		return user;
	}
	public void setUser(String user)
	{
		this.user=user;
	}
	

	public String getMail()
	{
		return mail;
	}
	public void setMail(String mail)
	{
		this.mail=mail;
	}
	
	public int getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(int telefono)
	{
		this.telefono=telefono;
	}
	private void setContrasenha(String contra)
	{
		contrasenha=contra;
	}
	private String getContrasenha()
	{
		return contrasenha;
	}
	
	public void MostrarUsuario()
	{
		
		System.out.println("Nombre de la persona: "+getNombre());
		System.out.println("Nombre de usuario: "+getUser());
		System.out.println("DNI: "+getDNI());
		
	}
	
	//Cambiar contrase�a del usuario.
	public void setNewContrasenha()//Ingresa una nueva contrase�a y se llama a la funcion que hace la comprobacion y el cambio.
	{
		String comprobar="s";
		String newContrasenha;
		do
		{
			System.out.println("Ingrese la nueva contrasenha: ");
			newContrasenha=sc.nextLine();
			System.out.println("La contrasenha ingresada fue: "+newContrasenha);
			System.out.println("�Desea cambiarla? s/n: ");
			comprobar=sc.nextLine();
		}while(comprobar.equals("s"));
		CambiarContrasenha(newContrasenha);
	}
	
	public void CambiarContrasenha(String newContrasenha)//Realiza la comprobacion y el cambio de contrase�a.
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
