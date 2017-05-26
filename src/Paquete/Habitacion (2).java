package Paquete;


import java.util.ArrayList;

public class Habitacion {
		
		//Datos de habitacion:
		int numero;//Numero de habitacion.
		int piso;//Piso de habitacion.
		int cantMax;//Cantidad maxima de pasajeros.
		boolean ocupada;//Si la habitacion se encuentra ocupada (true) o disponible (false)
		int periodoOcupacion;//Es el periodo por el que la habitacion esta ocupada.
		boolean reservada;//Si la habitacion se encuentra reservada (true) o disponible(false)
		
		
		//Datos de habitantes de la habitacion.
		Pasajero reserva;//Guarda los datos de la persona que realiza la reserva.
		ArrayList<Pasajero>listaHabitantes=new ArrayList<>();//Lista de personas en la habitacion.
		Pasajero responsable;//Persona que alquila la habitacion.
		Extras cargossExtras;
		
		public Habitacion()//Inicializacion.
		{
			ocupada=true;
			reservada=false;
			numero=0;
			piso=0;
			cantMax=0;
			//
			periodoOcupacion=0;
		}
		public Habitacion(int numero, int piso, int cantMax)//Asigna valores a la habitacion cuando es creada por el administrador.
		{
			this.numero=numero;
			this.piso=piso;
			this.cantMax=cantMax;
		}
		
		
		//*********** Gets/Sets: *************
		public void asignarHabitacion(Pasajero responsable, ArrayList<Pasajero> pasajeros)//Asigna y ocupa una habitacion.
		{
			this.responsable=responsable;
			listaHabitantes=pasajeros;
			ocupada=true;
		}
		
		
		public int getPeriodo()
		{
			return periodoOcupacion;
		}
		public void getResponsable()//Muestra la informacion del pasajeros que alquila la habitacion.
		{
			responsable.MostrarDatos();
		}
		public void getHabitantes()
		{
			int i=1;//Utilizado para contar cantidad de personas y para muestreo.
			for(Pasajero aux:listaHabitantes)
			{
				System.out.println("------------------------------------------ Habitante "+i+"------------------------------------------");
				aux.MostrarDatos();
				i++;
			}
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
		public Pasajero getReserva()//Retorna el pasajero que reservo la habitacion.
		{
			return reserva;
		}
	
		//***********Hacer metodo para agregar extras.*************
		
		
		
		public void Reserva(Pasajero responsable)
		{
			reserva=responsable;
			reservada=true;
		}
		public boolean getCupada()
		{
			return ocupada;
		}
		
}
