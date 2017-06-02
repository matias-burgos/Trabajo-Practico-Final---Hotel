package Paquete;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
		System.out.println("Tipo de usuario: Administrador");
		MostrarUsuario();
	}
	
	//Ejemplo.
	/*
	FileInputStream inHistorial;
	try
	{
		inHistorial=new FileInputStream("Historial.sd");
		ObjectInputStream lectura=new ObjectInputStream(inHistorial);
		Habitacion aux=(Habitacion)lectura.readObject();
	}
	catch(NullPointerException ex)
	{
		System.out.println("El archivo esta vacio: "+ex);
	}
	catch(IOException ex)
	{
		System.out.println("No se pudo leer el archivo: "+ex);
	}
	catch(ClassNotFoundException ex)
	{
		System.out.println("No se pudo leer el archivo: "+ex);
	}
		
	}*/
}
