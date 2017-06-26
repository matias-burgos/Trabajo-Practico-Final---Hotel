package Paquete;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

abstract public class Principal implements Serializable
{
	
	public ArrayList ListaHabitOcupadas()
	{
		ArrayList<Habitacion>ocupadas=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitaciones");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>auxHabi=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion aux:auxHabi)
			{
				if(aux.getOcup()==true)
				{
					ocupadas.add(aux);
				}
			}
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ocupadas;
	}
	public ArrayList ListaHabitReservadas()//Retorna una list con las habitaciones que se encuentran reservadas.
	{
		ArrayList<Habitacion>reservadas=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitaciones");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>auxHabi=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion aux:auxHabi)
			{
				if(aux.getReserv()==true)
				{
					reservadas.add(aux);
				}
			}
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reservadas;
	}
}
