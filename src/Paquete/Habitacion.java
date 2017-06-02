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
		/*
		public void asignarHabitacion(Pasajero responsable, ArrayList<Pasajero> pasajeros)//Asigna y ocupa una habitacion.
		{
			this.responsable=responsable;
			listaHabitantes=pasajeros;
			ocupada=true;
		}
		*/
		//*********** Gets/Sets: *************
		/*
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
		*/
		/*
		public boolean getReservado()//Retorna un boolean si la habitacion estareservada o no.
		{
			return reservada;
		}
		public Pasajero getReserva()//Retorna el pasajero que reservo la habitacion.
		{
			return reserva;
		}*/
		
		
		
		//Metodo para agregar extras.
		/*
		public void PonerExtras()
		{
			if(getOcupada()==true)
			{
				cargosExtras=new Extras();
			}
		}*/
		
		//Muestreo de informacion de extras.
		/*
		public void InfoExtras()
		{
			cargosExtras.MostrarExtras();//Muestra todos los cargos extras junto a la cantidad y precio total de cada uno.
			double resultado=cargosExtras.TotalExtras();//Obtiene la cantidad a pagar de los extras de la habitacion.
			System.out.println("El cargo total a pagar por los servicios extras es de: $"+resultado);//Muestra el resultado final a pagar.
			
			
		}
		
		
		public void RealizarReserva(Pasajero responsable)//Asigna a reserva el pasajero que realiza la reserva.
		{
			reserva=responsable;
			reservada=true;
		}
		
		public boolean getOcupada()
		{
			return ocupada;
		}*/
		public void MostrarHabitacion()//Muestra todos los datos de la habitacion.
		{
			System.out.println("Numero de habitacion: "+getNumero());
			System.out.println("Piso de la habitacion: "+getPiso());
			System.out.println("Cantidad maxima de habitantes de la habitacion: "+getMaxHabi());
			if(ocup.ocupada==true)
			{
				ocup.MuestreoOcupantes();
			}
			//if(reserv.reservada==true)
			{
				//reserv,
			}
			/*
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
			*/
			
			
		}
		
}
