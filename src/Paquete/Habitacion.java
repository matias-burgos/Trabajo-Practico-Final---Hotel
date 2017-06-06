package Paquete;


import java.util.ArrayList;

public class Habitacion {
		
		//Datos de habitacion:
		int numero;//Numero de habitacion.
		int piso;//Piso de habitacion.
		int cantMax;//Cantidad maxima de pasajeros.
		
		Ocupacion ocup;//Atributo que designa la ocupacion de la habitacion.
		Reserva reserv;//Atrivuto que designa la reserva de la habitacion.
		
		public Habitacion()//Inicializacion.
		{
			ocup=new Ocupacion();
			reserv=new Reserva();
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
		
		
		public void asignarHabitacion(Pasajero responsable, ArrayList<Pasajero> pasajeros, int periodo)//Llama a la funcion de Ocupacion para ocupar la habitacion.
		{
			ocup.asignarHabitacion(responsable, pasajeros, periodo);
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
			if(ocup.ocupada==true)
			{
				ocup.MuestreoOcupantes();
			}
		
			
			
		}
		
}
