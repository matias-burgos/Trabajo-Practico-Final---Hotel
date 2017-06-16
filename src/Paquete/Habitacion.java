package Paquete;


import java.io.Serializable;
import java.util.ArrayList;

public class Habitacion implements Serializable {
		
		//Datos de habitacion:
		int numero;//Numero de habitacion.
		int piso;//Piso de habitacion.
		int cantMax;//Cantidad maxima de pasajeros.
		boolean ocup;//Atributo que designa la ocupacion de la habitacion.
		boolean reserv;//Atrivuto que designa la reserva de la habitacion.
		
		public Habitacion()//Inicializacion.
		{
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
		
		
		public boolean getReserv()
		{
			return reserv;
		}
		public boolean getOcup()
		{
			return ocup;
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
			if(ocup==true)
			{
				System.out.println("La habitacion se encuentra ocupada");
			}
			if(reserv==true)
			{
				System.out.println("La habitacion se encuentra reservada");
			}
			System.out.println("Numero de habitacion: "+getNumero());
			System.out.println("Piso de la habitacion: "+getPiso());
			System.out.println("Cantidad maxima de habitantes de la habitacion: "+getMaxHabi());
			
		}
		
}
