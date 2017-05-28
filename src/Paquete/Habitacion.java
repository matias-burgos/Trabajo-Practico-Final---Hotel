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
		Extras cargosExtras;
		
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
		public boolean getReservado()//Retorna un boolean si la habitacion estareservada o no.
		{
			return reservada;
		}
		public Pasajero getReserva()//Retorna el pasajero que reservo la habitacion.
		{
			return reserva;
		}
		
		
		
		//***********Hacer metodo para agregar extras.*************
		public void InfoExtras()
		{
			cargosExtras.MostrarExtras();//Muestra todos los cargos extras junto a la cantidad y precio total de cada uno.
			float resultado=cargosExtras.TotalExtras();//Obtiene la cantidad a pagar de los extras de la habitacion.
			System.out.println("El cargo total a pagar por los servicios extras es de: $"+resultado);//Muestra el resultado final a pagar.
			
			
		}
		
		
		public void Reserva(Pasajero responsable)//Asigna a reserva el pasajero que realiza la reserva.
		{
			reserva=responsable;
			reservada=true;
		}
		public boolean getOcupada()
		{
			return ocupada;
		}
		public void MostrarHabitacion()//Muestra todos los datos de la habitacion.
		{
			System.out.println("Numero de habitacion: "+getNumero());
			System.out.println("Piso de la habitacion: "+getPiso());
			System.out.println("Cantidad maxima de habitantes de la habitacion: "+getMaxHabi());
			if(getReservado()==true)//Evalua si hay alguna reserva hecha para mostrar info del responsable.
			{
				System.out.println("La habitacion se encuentra reservada");
				System.out.println("El responsable de la reserva: "+getReserva());
			}
			else
			{
				System.out.println("La habitacion no esta reservada");
			}
			if(getOcupada()==true)//Evalua si la habitacion esta ocupada para mostrar la info del responsable y sus habitantes.
			{
				System.out.println("La habitacion se encuentra ocupada ");
				System.out.println("Responsable de la habitacion:");
				getResponsable();
				System.out.println("Lista de Habitantes de la habitacion:");
				getHabitantes();
				System.out.println("Periodo de ocupacion: "+getPeriodo());
				//System.out.println("Cargos extras: "+getCargos());
			}
			else 
			{
				System.out.println("La habitacion se encuentra desocupada");
			}
			
			
			
		}
		
}
