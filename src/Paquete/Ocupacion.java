package Paquete;

import java.util.ArrayList;

public class Ocupacion {

	boolean ocupada;//Si la habitacion se encuentra ocupada (true) o disponible (false)
	int periodoOcupacion;//Es el periodo por el que la habitacion esta ocupada.
	Extras cargosExtras;//Cargos extras pedidos por los habitantes de la habitacion.
	Pasajero responsable;//Persona que alquila la habitacion.
	ArrayList<Pasajero>listaHabitantes=new ArrayList<>();//Lista de personas en la habitacion.
	
	
	public Ocupacion()//Inicializacion.
	{
		ocupada=false;
		periodoOcupacion=0;
		cargosExtras=new Extras();
		responsable=new Pasajero();
	}
	
	public void asignarHabitacion(Pasajero responsable, ArrayList<Pasajero> pasajeros, int periodo)//Asigna y ocupa una habitacion.
	{
		this.responsable=responsable;
		periodoOcupacion=periodo;
		listaHabitantes=pasajeros;
		ocupada=true;
	}
	//Metodo para extras.
	
	
	
	public void InfoExtras()
	{
		cargosExtras.MostrarExtras();//Muestra todos los cargos extras junto a la cantidad y precio total de cada uno.
		double resultado=cargosExtras.TotalExtras();//Obtiene la cantidad a pagar de los extras de la habitacion.
		System.out.println("El cargo total a pagar por los servicios extras es de: $"+resultado);//Muestra el resultado final a pagar.
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
	public int getPeriodo()
	{
		return periodoOcupacion;
	}
	public void getResponsable()//Muestra la informacion del pasajeros que alquila la habitacion.
	{
		responsable.MostrarDatos();
	}
	public boolean getOcupada()
	{
		return ocupada;
	}
	
	
	public void MuestreoOcupantes()
	{
		//Crear y asignar cuando se hagan pedidos
		int comprob=0;//Comprueba si es que se realizo algun pedido.
		System.out.println("La habitacion se encuentra ocupada ");
		System.out.println("Responsable de la habitacion:");
		getResponsable();
		System.out.println("Lista de Habitantes de la habitacion:");
		getHabitantes();
		System.out.println("Periodo de ocupacion: "+getPeriodo());
		System.out.println("Cargos extras: ");
		comprob=cargosExtras.MostrarExtras();
		if(comprob==1)
		{
			System.out.println("Cuenta total a pagar por cargos extras: $"+cargosExtras.TotalExtras());
		}
		
	}
	
	
	
}
