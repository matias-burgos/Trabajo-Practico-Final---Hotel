/*
 * Administrador: Es el encargado de las funciones administrativas del sistema.
 *  Dentro de sus funciones está la realización de back ups de la información, 
 *  la creación de otros usuarios, la asignación de permisos a usuarios, etc.
 * 
 * */
 

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
	
	
	
	// Aumenta el nivel de permisos del conserje. Si ya tiene el maximo tira un mensaje
	public void aumentarPermisos(Conserje conserje)
	{
		if(conserje.getPermisos()==3)
		{
			System.out.println("El conserje ya tiene el nivel maximo de permisos");
		}
		else
		{
			int aux = conserje.getPermisos();
			conserje.setPermisos(aux+1);
			System.out.println("Permisos aumentados");
		}
	}
	
	// Quita un nivel de permisos al conserje. Si ya tiene el nivel minimo, da un mensaje
	public void quitarPermisos(Conserje conserje)
	{
		if(conserje.getPermisos()==1)
		{
			System.out.println("El conserje ya tiene el nivel minimo de permisos");
		}
		else
		{
			int aux = conserje.getPermisos();
			conserje.setPermisos(aux-1);
			System.out.println("Permisos quitados");
		}
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
