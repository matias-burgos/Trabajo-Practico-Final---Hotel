package Paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Reserva {
	
	Pasajero responsable;//Responsable de la reserva de la habitacion.
	Habitacion reservada;//Habitacion que se reservara.
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
	
	
	
	public int BuscarHabitacion(int cantPasajeros, int periodo/*cambiar cuando tengamos metodo fecha*/, Pasajero responsable, int piso)//Busca habitaciones en base a los datos pedidos por los pasajeros.
	{	
		int comprob=0;//Comprueba que se hayan encontrado habitaciones.
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitacion.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			Habitacion aux=(Habitacion)lectura.readObject();
			while(aux!=null)
			{
				if(aux.getMaxHabi()==cantPasajeros && aux.getPiso()==piso && aux.getOcup()==false && aux.getOcup()==false)
				{
					aux.MostrarHabitacion();
					comprob=comprob++;
				}
				aux=(Habitacion)lectura.readObject();
			}
			
			lectura.close();
		} catch (Exception e) {
			System.out.println("Error en la lectura del archivo: "+e);
		}
		finally
		{
			if(comprob==0)
			{
				System.out.println("No se han encontrado habitaciones");
			}
		}
		return comprob;
	}
	
	
	
	
	public void ReservarHabitacion()
	{
		
	}
	
	
	
	public Reserva()
	{
		reservada=new Habitacion();
		responsable=new Pasajero();
	}
	
	public void RealizarReserva(Pasajero responsable, Habitacion reservada)//Asigna a reserva el pasajero que realiza la reserva.
	{
		this.responsable=responsable;
		this.reservada=reservada;
	}	
	
	public void MostrarReserva()
	{
		System.out.println("La habitacion se encuentra reservada");
		System.out.println("El responsable de la reserva: "+getResponsable());
		System.out.println("Habitacion reservada: ");
		reservada.MostrarHabitacion();
		
	}
	
	public Habitacion getHabitacionReservada()//Retorna un boolean si la habitacion estareservada o no.
	{
		return reservada;
	}
	public Pasajero getResponsable()//Retorna el pasajero que reservo la habitacion.
	{
		return responsable;
	}
}
