package Paquete;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;



public class Pasajero extends UserHotel implements Serializable 
{
	Scanner sc=new Scanner(System.in);
	String ciudadOrigen;//Ciudad de origen.
	String domicilioOrigen;//Domicilio en el que vive.
	Habitacion actual;//Informacion sobre la habitacion en la que se encuentra.
	
	
	public Pasajero()
	{
		super();
		ciudadOrigen="";
		domicilioOrigen="";
	}
	public Pasajero(String nombre, int dni, String ciudad, String domicilio, String usuario, String contraseña)
	{
		super(nombre, dni, usuario, contraseña);
		ciudadOrigen=ciudad;
		domicilioOrigen=domicilio;
	}
	
	
	
	
	public void AgregarHistorial(Habitacion actual)//Crea un archivo y almacena las habitaciones en las que el pasajero estuvo.
	{
		FileOutputStream outHistorial;
		
		try
		{
			outHistorial= new FileOutputStream("Historial.sd");
			ObjectOutputStream escritura=new ObjectOutputStream(outHistorial);
			escritura.writeObject(actual);//Asignacion de habitacion en el archivo.
			System.out.println("La habitacion "+actual.getNumero()+" fue cargada en el historial del pasajero");
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
	
	public void MostrarHistorial()//Muestra historial
	{
		FileInputStream inHistorial;
		try
		{
			inHistorial=new FileInputStream("Historial.dat");
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
	}
	
	
	public void AsignarHabitacion(Habitacion nueva)//Agarra la nueva habitacion en la que se encuentra y la guarda en el archivo de historial.
	{
		actual=nueva;
		AgregarHistorial(actual);
	}
	public void reservarHabitacion()//Terminar
	{
		System.out.println("Ingresar el piso de la habitacion: ");
		int piso=sc.nextInt();
		System.out.println("Ingresar la cantidad de personas que habitaran la habitacion:  ");
		int cant=sc.nextInt();
		System.out.println("Ingresar ");
		
	}
	
	
	public String getCiudad()
	{
		return ciudadOrigen;
	}
	public String getDomicilio()
	{
		return domicilioOrigen;
	}
	public void MostrarPasajero()//Muestra todos los gets juntos.
	{
		System.out.println("Tipo de usuario: Pasajero");
		MostrarUsuario();
		System.out.println("Ciudad de origen: "+getCiudad());
		System.out.println("Domicilio de procedenci: "+getDomicilio());
		
	}
	
}
