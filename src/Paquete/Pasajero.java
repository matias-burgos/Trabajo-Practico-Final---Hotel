package Paquete;

public class Pasajero extends Persona
{
	String ciudadOrigen;//Ciudad de origen.
	String domicilioOrigen;//Domicilio en el que vive.
	//Hacer metodo para almacenar historial de pasajero en el hotel.
	
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
	
}
