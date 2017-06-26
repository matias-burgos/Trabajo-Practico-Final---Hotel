package Paquete;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Principal
{
	public ArrayList RealizarReserva(FEcha desde, FEcha hasta)
	{
		ArrayList<Habitacion>listaHabitaciones=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitacion ");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>aux=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion auxHabi:aux)
			{
				if(auxHabi.ocup==false && auxHabi.reserv==false)	
				{
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listaHabitaciones;
		
	}
}
