package Paquete;

import java.io.Serializable;
import java.util.ArrayList;

public class Ocupacion implements Serializable {

	//Es el periodo por el que la habitacion esta ocupada.
	FEcha desde;
	FEcha hasta;
	Extras cargosExtras;//Cargos extras pedidos por los habitantes de la habitacion.
	Persona responsable;//Persona que alquila la habitacion.
	ArrayList<Pasajero>listaHabitantes=new ArrayList<>();//Lista de personas en la habitacion.
	int comprob;//Atributo que comprueba si se ha realizado algun pedido, y los suma.
	
	
	public Ocupacion()//Inicializacion.
	{
		desde=new FEcha();
		hasta=new FEcha();
		cargosExtras=new Extras();
		responsable=new Pasajero();
		comprob=0;
	}
	
	public Ocupacion(Persona responsable, ArrayList<Pasajero> pasajeros, FEcha desde, FEcha hasta)//Asigna y ocupa una habitacion.
	{
		this.responsable=responsable;
		this.desde=desde;
		this.hasta=hasta;
		listaHabitantes=pasajeros;
	}
	//Metodo para extras.

	public void InfoExtras()
	{
		cargosExtras.MostrarExtras();//Muestra todos los cargos extras junto a la cantidad y precio total de cada uno.
		double resultado=cargosExtras.TotalExtras();//Obtiene la cantidad a pagar de los extras de la habitacion.
		System.out.println("El cargo total a pagar por los servicios extras es de: $"+resultado);//Muestra el resultado final a pagar.
	}
	
	//Pedidos.
	public void PedidosBebidas(int cant)
	{
		cargosExtras.IngresarCantBebidas(cant);
		comprob=comprob+1;
	}
	public void PedidosSnacks(int cant)
	{
		cargosExtras.IngresarCantSnacks(cant);
		comprob=comprob+1;
	}
	public void PedidoPan(int cant)
	{
		cargosExtras.IngresarCantPan(cant);
		comprob=comprob+1;
	}
	public void PedidoNetflix(int tiempo)
	{
		cargosExtras.IngresarTempoNetflix(tiempo);
		comprob=comprob+1;
	}
	
	// Gets-Sets.
	public ArrayList getHabitantes()
	{
		return listaHabitantes;
	}
	public FEcha getDesde()
	{
		return desde;
	}
	public FEcha getHasta()
	{
		return hasta;
	}
	public Persona getResponsable()//Muestra la informacion del pasajeros que alquila la habitacion.
	{
		return responsable;
	}
	
	
	
	
	
}
