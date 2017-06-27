package Paquete;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;



public class Pasajero extends UserHotel implements Serializable
{
	
	String ciudadOrigen;//Ciudad de origen.
	String domicilioOrigen;//Domicilio en el que vive.
	Habitacion actual;//Informacion sobre la habitacion en la que se encuentra.
	ArrayList<Habitacion >historial=new ArrayList<>();
	
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
	
	
	
	
	public void setHistorial(Habitacion actual)//Crea un archivo y almacena las habitaciones en las que el pasajero estuvo.
	{
		historial.add(actual);
		
	}
	public Habitacion getActual()//Retorna la habitacion actual en la que se encuentra el pasajero.
	{
		return actual;
		
	}
	
	
	public String getCiudad()
	{
		return ciudadOrigen;
	}
	public String getDomicilio()
	{
		return domicilioOrigen;
	}
	public ArrayList getHistorial()
	{
		return historial;
	}

	
	
	
}
