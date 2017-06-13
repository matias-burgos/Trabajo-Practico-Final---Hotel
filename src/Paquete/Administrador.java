/*
 * Administrador: Es el encargado de las funciones administrativas del sistema.
 *  Dentro de sus funciones está la realización de back ups de la información, 
 *  la creación de otros usuarios, la asignación de permisos a usuarios, etc.
 * 
 * */
 

package Paquete;

import java.util.Scanner;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Administrador extends UserHotel implements Serializable {
	
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
	
	
	//Recorre el archivo de empleados (conserje) y retorna la cantidad.
	public int cantidadEmpleados() 
	{
		int cant=0;
		FileInputStream empleados;
		try
		{
			empleados = new FileInputStream("Empleados.dat");
			ObjectInputStream lectura = new ObjectInputStream(empleados);
			Conserje aux=(Conserje)lectura.readObject();
						
			while(aux != null)
			{
				aux=(Conserje)lectura.readObject();
				cant++;	
			}	
			lectura.close();
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
			lectura.close();
			
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
			
			lectura.close();
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
	
	
	
	
	
	
	/*
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
	*/
	
	//Crea y a su vez agrega un empleado al archivo de empleados.
	public void crearEmpleado(String nombre,int dni, String usuario, String pass, String id)
	{
		
		Conserje nuevo = new Conserje (nombre,dni,usuario,pass,id);
		
		
		FileOutputStream empleados;
		
		try
		{
			empleados=new FileOutputStream("empleados.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(empleados);
			escritura.writeObject(nuevo);
			escritura.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("No se pudo crear el archivo: "+ex);
		}
		catch(IOException ex)
		{
			System.out.println("No se pudo crear el archivo:"+ex);
		}
		
	}
	
	
	//Recorre un archivo de empleados y elimina un empleado buscandolo por su ID
	//Este metodo recorre el archivo y vuelve null al objeto que tenga la misma id 
	//que la pasada por parametro. En caso de que no sirva, hacer un metodo que cree un nuevo
	//archivo con lo mismo pero sin el que se quiera eliminar
	public void eliminarEmpleado(String id)
	{
		FileInputStream empleados;
		try
		{
			empleados = new FileInputStream("Empleados.dat");
			ObjectInputStream lectura = new ObjectInputStream(empleados);
			Conserje aux=(Conserje)lectura.readObject();
						
			while(aux != null)
			{
				aux=(Conserje)lectura.readObject();
				
				if(aux.getEmpleadoID()==id)
				{
					aux = null;
				}			
			}
			lectura.close();
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
