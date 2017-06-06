package Paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Reserva {
	
	Persona responsable=new Pasajero();//Responsable de la reserva de la habitacion.
	Habitacion reservada=new Habitacion();//Habitacion que se reservara.
	int periodo=0;//Periodo en el que se reservara.
	
	Scanner sc=new Scanner(System.in);
	int numeroHabitacion=0;//Numero de la habitacion que se desea reservar.
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
	
	
	
	public String BuscarHabitacion(int piso, int periodo, int cantHabitantes)//Busca habitaciones en base a los datos pedidos por los pasajeros.
	{
		String s=null;//Variable la cual se utilizara para comprobar si el pasajero quiere realizar nuevamente la busqueda con otros datos.
		FileInputStream habitaciones;
		int comprob=0;//Comprueba la existencia de la habitacion solicitada
		try{
			habitaciones=new FileInputStream("Habitaciones.dat");
			ObjectInputStream lectura=new ObjectInputStream(habitaciones);
			Habitacion aux=(Habitacion)lectura.readObject();
			System.out.println("Habitaciones disponibles: ");
			while(aux!=null)
			{
				if(aux.getPiso()==piso)
				{
					if(aux.getMaxHabi()==cantHabitantes)
					{
						if(aux.ocup.getPeriodo()==periodo)
						{
							aux.MostrarHabitacion();
							comprob=comprob+1;
						}
					}
				}
				aux=(Habitacion)lectura.readObject();
			}
		}
		
		catch (ClassNotFoundException e) {
			System.out.println("Se produjo un erro en el manejo de la escritura: ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Se produjo un erro en el manejo de la escritura: ");
			e.printStackTrace();
		} 
		
		if(comprob==0)
		{
			System.out.println("No se encuentran habitacionescon esos datos");
			System.out.println("¿Desea buscarcon otros datos? s/n: ");
			s=sc.nextLine();
		}
		else{
			System.out.println("¿Desea buscarcon otros datos? s/n: ");
			s=sc.nextLine();
			if(s.equals("n"))
			{
				System.out.println("Elija alguna habitacion: ");
				numeroHabitacion=sc.nextInt();
			}
			
		}
		return s;
	}
	
	
	public void ReservarHabitacion()
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
