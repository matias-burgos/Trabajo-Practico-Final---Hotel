package Paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva implements Serializable{
	
	Persona responsable=new Persona();//Responsable de la reserva de la habitacion.
	Habitacion reservada=new Habitacion();//Habitacion que se reservara.
	FEcha desde;
	FEcha hasta;

	public Reserva()
	{
		desde=new FEcha();
		hasta=new FEcha();
		reservada=new Habitacion();
		responsable=new Pasajero();
	}
	
	public Reserva(Persona responsable, Habitacion seleccionada, FEcha desde, FEcha hasta)//Crea la nueva reserva.
	{
		this.desde=desde;
		this.hasta=hasta;
		this.responsable=responsable;
		reservada=seleccionada;
	}	
	
	
	public ArrayList BuscarHabitacion(int cantPasajeros, FEcha desde, FEcha hasta, int piso)//Busca las habitaciones disponibles en base a los datos ingresados.
	{	
		ArrayList<Habitacion>listaHabitaciones=new ArrayList<>();//Comprueba que se hayan encontrado habitaciones.
		boolean comprob=false;
		FileInputStream salida;
		Principal principal=new Principal();
		try {
			salida=new FileInputStream("Habitacion.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>auxHabi=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion aux:auxHabi)
			{
				if(aux.ocup==false && aux.reserv==false)
				{
					if(aux.getMaxHabi()>=cantPasajeros && aux.getPiso()==piso)//Comprueba si los datos ingresados concuerdan con la habitacion, si esta libre para ser reservada.
					{
						listaHabitaciones.add(aux);
					}
				}
				else{
					comprob=principal.ComprobacionPeriodo(desde, hasta, aux);
					if(comprob==true)//Si la habitacion esta disponible en ese periodo.
					{
						if(aux.getMaxHabi()==cantPasajeros && aux.getPiso()==piso)//Comprueba si los datos ingresados concuerdan con la habitacion, si esta libre para ser reservada.
						{
							listaHabitaciones.add(aux);
						}
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
	

	public void setDesde(FEcha desde)
	{
		this.desde=desde;
	}
	public FEcha getDesde()
	{
		return desde;
	}
	public void setHasta(FEcha hasta)
	{
		this.hasta=hasta;
	}
	public FEcha getHasta()
	{
		return hasta;
	}
	

	
	public Habitacion getReservado()//Retorna la habitacion reservada.
	{
		return reservada;
	}
	public Persona getResponsable()//Retorna la persona que reservo la habitacion.
	{
		return responsable;
	}
}
