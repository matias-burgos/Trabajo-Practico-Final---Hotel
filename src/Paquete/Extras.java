package Paquete;


public class Extras //extends Ocupacion
{
	double totalGastos;
	Pan pan;
	Netflix netflix;
	Snacks snack;
	Bebidas bebida;
	
	public Extras ()//Se le ingresan los valores predeterminados que van a tener los productos ofrecidos.
	{
		pan=new Pan(0, 20);
		netflix=new Netflix(0, 0.50);
		snack=new Snacks("papas", 50);
		bebida=new Bebidas("pepsi", 40);
	}
	
	//Metodos de ingreso de pedidos de los pasajeros.
	public void IngresarCantPan(int cant)//Ingresa la cantidad de paquetes de pan que pida el pasajero.
	{
		pan.setPaquete(cant);
	}
	
	public void IngresarTempoNetflix(int tiempo)//Ingresa el tiempo de uso que utilizo el pasajero.
	{
		netflix.setTiempo(tiempo);
	}
	
	public void IngresarCantSnacks(int cant)//Ingresa la cantidad de snacks pedidos por el pasajero.
	{
		snack.setCantidad(cant);
	}
	
	public void IngresarCantBebidas(int cant)//Ingresa la cantidad de bebidas pedidas por el pasajero.
	{
		bebida.setCantidad(cant);
	}
	
	
	
	//Muestra los extras y las cantidades con sus respectivos precios.
	public void MostrarExtras()//Se evalua si las cnatidades son diferentes a 0(diferente a 0, hubo pedido, sino nunca se produjo dicho pedido).
	{
		if(pan.getpaquete()!=0)
		{
			System.out.println("Panes: " + pan.getpaquete()+"Costo: "+pan.calcularPrecio());
		}
		if(netflix.getTiempo()!=0)
		{
			System.out.println("Netflix: " + netflix.getTiempo() + "Costo: " + netflix.calcularPrecio());
		}
		if(snack.getCantidad()!=0)
		{
			System.out.println("Snacks: " + snack.getCantidad() + "Costo:" + snack.calcularPrecio());
		}
		if(bebida.getCantidad()!=0)
		{
			System.out.println("Bebidas: " + bebida.getCantidad() + "Costo: " + bebida.calcularPrecio());
		}
		
	}
	
	
	
	//Retorna la cantidad total a pagar de los extras.
	public double TotalExtras()
	{
		double costoFinal = 0;
		costoFinal = pan.calcularPrecio() + netflix.calcularPrecio() + snack.calcularPrecio() + bebida.calcularPrecio();
		return costoFinal;
	}
	
}
