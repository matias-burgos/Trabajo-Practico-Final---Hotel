package Paquete;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Pasajero extends Persona implements Serializable 
{
	String ciudadOrigen;//Ciudad de origen.
	String domicilioOrigen;//Domicilio en el que vive.
	//Hacer metodo para almacenar historial de pasajero en el hotel.
	/*
	FileOutputStream historial;
	try
	{
		historial new FileOutputStream("Historial.sd");//Posible opcion para almacenar el historial de cada pasajero.
	}
	catch(FileNotFoundException ex)
	{
		System.out.println("No se pudo crear el archivo: "+ex);
	}
	
	*/
	
	public Pasajero()
	{
		super();
		ciudadOrigen="";
		domicilioOrigen="";
	}
	public Pasajero(String nombre, int dni, String ciudad, String domicilio)
	{
		super(nombre, dni);
		ciudadOrigen=ciudad;
		domicilioOrigen=domicilio;
	}
	public String getCiudad()
	{
		return ciudadOrigen;
	}
	public String getDomicilio()
	{
		return domicilioOrigen;
	}
	public void MostrarDatos()//Muestra todos los gets juntos.
	{
		System.out.println("Nombre: "+ getNombre());
		System.out.println("DNI: "+getDNI());
		System.out.println("Ciudad de origen: "+getCiudad());
		System.out.println("Domicilio de procedenci: "+getDomicilio());
		
	}
	
}
