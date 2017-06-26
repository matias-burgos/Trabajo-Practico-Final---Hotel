package Paquete;


import java.io.Serializable;
import java.util.ArrayList;

public class Habitacion implements Serializable {
		
		//Datos de habitacion:
		int numero;//Numero de habitacion.
		int piso;//Piso de habitacion.
		int cantMax;//Cantidad maxima de pasajeros.
		FEcha desde;
		FEcha hasta;
		boolean ocup;//Atributo que designa la ocupacion de la habitacion.
		boolean reserv;//Atrivuto que designa la reserva de la habitacion.
		
		public Habitacion()//Inicializacion.
		{
			ocup=false;
			reserv=false;
			numero=0;
			piso=0;
			cantMax=0;
			
			
		}
		public Habitacion(int numero, int piso, int cantMax)//Asigna valores a la habitacion cuando es creada por el administrador.
		{
			this.numero=numero;
			this.piso=piso;
			this.cantMax=cantMax;
		}
		
		/*
		public void asignarHabitacion(Pasajero responsable, ArrayList<Pasajero> pasajeros, int periodo)//Llama a la funcion de Ocupacion para ocupar la habitacion.
		{
			ocup.asignarHabitacion(responsable, pasajeros, periodo);
		}
		*/
		public boolean getOcup()
		{
			return ocup;
		}
		public boolean getReserv()
		{
			return reserv;
		}
		public void reservar()
		{
			reserv=true;
		}
		public void ocupar()
		{
			ocup=true;
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
		
		public int getNumero()
		{
			return numero;
		}
		public int getPiso()
		{
			return piso;
		}
		public int getMaxHabi()//Retorna la cantidad maxima de habitantes admitidos en la habitacion.
		{
			return cantMax;
		}
		
		public void MostrarHabitacion()//Muestra todos los datos de la habitacion.
		{
			System.out.println("Numero de habitacion: "+getNumero());
			System.out.println("Piso de la habitacion: "+getPiso());
			System.out.println("Cantidad maxima de habitantes de la habitacion: "+getMaxHabi());
			if(ocup==true)
			{
				
			}
		
			
			
		}
		public boolean ComprobacionPeriodo( FEcha desde, FEcha hasta)//Devuelve true si el periodo que se indica es valido para su reserva, si retorna false la habitacion esta ocupada/reservada en algun momento del periodo.
		{
			boolean rta=false;
			if((desde.año<=desde.año && desde.año>desde.año) && !(desde.año<desde.año && desde.año<hasta.año))
			{
				
			}
			return rta;
		}
		
}
