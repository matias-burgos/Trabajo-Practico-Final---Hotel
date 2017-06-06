/*
 * Administrador: Es el encargado de las funciones administrativas del sistema.
 *  Dentro de sus funciones está la realización de back ups de la información, 
 *  la creación de otros usuarios, la asignación de permisos a usuarios, etc.
 * 
 * */
 

package Paquete;

import java.util.Scanner;

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
	/*public void aumentarPermisos(Conserje conserje)
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
	}*/
	
	//Recorre el archivo de empleados (conserje) y retorna la cantidad.
	public int cantidadEmpleados() 
	{
		int cant=0;
		
		return cant;
	}
	
	
	//Muestra un empleado del archivo.
	public void verUnEmpleado()
	{
		FileInputStream empleados;
		try
		{
			empleados = new FileInputStream("Empleados.dat");
			ObjectInputStream lectura = new ObjectInputStream(empleados);
			Conserje aux=(Conserje)lectura.readObject();
			System.out.println("Nombre: " + aux.getNombre());
			System.out.println("DNI: " + aux.getDNI());
			
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
	}
	
	
	
	
	
	//Recorre el archivo y muestra a todos los empleados.
	public void verEmpleados()
	{
		FileInputStream empleados;
		try
		{
			empleados = new FileInputStream("Empleados.dat");
			ObjectInputStream lectura = new ObjectInputStream(empleados);
			Conserje aux=(Conserje)lectura.readObject();
			//System.out.println("Nombre: " + Conserje.getNombre());
			//System.out.println("DNI: " + Conserje.getDNI());	
			
			while(aux != null)
			{
				aux=(Conserje)lectura.readObject();
				System.out.println("Nombre: " + aux.getNombre());
				System.out.println("DNI: " + aux.getDNI());	
			}
			
			
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
	}
	
	
	//Pide al usuario los datos necesarios para crear un objeto de tipo conserje
	public Conserje crearConserje()
	{
		
		
		Scanner sc = new Scanner(System.in);
		String n;//nombre
		int d;//dni
		String u;//usuario
		String c;//contraseña
		String id;//ID de empleado
		
		System.out.println("Nombre: ");
		n = sc.nextLine();
		
		System.out.println("DNI: ");
		d = sc.nextInt();
		
		System.out.println("Usuario: ");
		u = sc.nextLine();
		
		System.out.println("Contraseña: ");
		c = sc.nextLine();
		
		System.out.println("ID de empleado: ");
		id= sc.nextLine();
		
		Conserje conserje = new Conserje(n, d, u, c, id);
		
		sc.close();
		
		return conserje;
	}
	
	
	//Agrega un empleado al archivo de empleados.
	public void agregarEmpleado()
	{
		
	}
	
	
	//Recorre un archivo de empleados y elimina un empleado buscandolo por su nombre y apellido
	public void eliminarEmpleado()
	{
		
	}
	
	
	//Recorre un archivo de habitaciones y la elmina segun el numero de habitacion
	public void eliminarHabitacion()
	{
		
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
