package Paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
	
	Persona responsable=new Pasajero();//Responsable de la reserva de la habitacion.
	Habitacion reservada=new Habitacion();//Habitacion que se reservara.
	int periodo=0;//Periodo en el que se reservara.
	
	
	int numeroHabitacion=0;//Numero delahabitacion que se desea reservar.
	//Hacerfechas buscar: Date, Day, Before, After, etc.
	
	/*https://geekytheory.com/tip-java-obtener-fecha-y-hora
	package fechahora;
	import java.text.DateFormat;
	import java.text.SimpleDateFormat;
	import java.util.Date; 
	public class FechaHora {
	public static void main(String[] args) {
	Date date = new Date();
	//Caso 1: obtener la hora y salida por pantalla con formato:
	DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
	System.out.println("Hora: "+hourFormat.format(date));
	//Caso 2: obtener la fecha y salida por pantalla con formato:
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Fecha: "+dateFormat.format(date));
	//Caso 3: obtenerhora y fecha y salida por pantalla con formato:
	DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	System.out.println("Hora y fecha: "+hourdateFormat.format(date));
	}
	}*/
	
	
	
	public ArrayList BuscarHabitacion(int cantPasajeros, FEcha desde, FEcha hasta/*cambiar cuando tengamos metodo fecha*/, int piso)//Busca las habitaciones disponibles en base a los datos ingresados.
	{	
		ArrayList<Habitacion>listaHabitaciones=new ArrayList<>();//Comprueba que se hayan encontrado habitaciones.
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitacion.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			Habitacion aux=(Habitacion)lectura.readObject();
			while(aux!=null)
			{
				if(aux.ocup==false && aux.reserv==false)
				{
					if(aux.getMaxHabi()==cantPasajeros && aux.getPiso()==piso && aux.ComprobacionPeriodo(desde, hasta)==true)//Comprueba si los datos ingresados concuerdan con la habitacion, si esta libre para ser reservada.
					{
						
						listaHabitaciones.add(aux);
					}
				}
				aux=(Habitacion)lectura.readObject();
			}
			
			lectura.close();
		} catch (Exception e) {
			System.out.println("Error en la lectura del archivo: "+e);
		}
		return listaHabitaciones;
	}
	
	
	
	
	public void ReservarHabitacion(Persona responsable, Habitacion seleccionada)
	{
		
	}
	
	
	
	
	
	
	
	
	
	/*
	boolean reservada;//Si la habitacion se encuentra reservada (true) o disponible(false)
	Pasajero responsable;//Guarda los datos de la persona que realiza la reserva.
	
	public Reserva()
	{
		reservada=false;
		responsable=new Pasajero();
	}
	
	public void RealizarReserva(Pasajero responsable)//Asigna a reserva el pasajero que realiza la reserva.
	{
		this.responsable=responsable;
		reservada=true;
	}	
	
	public void MostrarReserva()
	{
		if(reservada==true)
		{
			System.out.println("La habitacion se encuentra reservada");
			System.out.println("El responsable de la reserva: "+getResponsable());
		}
		else{
			System.out.println("No se ha realizado ninguna reserva");
		}
		
	}
	
	public boolean getReservado()//Retorna un boolean si la habitacion estareservada o no.
	{
		return reservada;
	}
	public Pasajero getResponsable()//Retorna el pasajero que reservo la habitacion.
	{
		return responsable;
	}*/
}
