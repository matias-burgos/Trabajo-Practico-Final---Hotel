package Paquete;

import java.util.ArrayList;

public class Extras //extends Ocupacion
{
	double totalGastos;
	Pan pan;
	Netflix netflix;
	Snacks snack;
	Bebidas bebida;
	
	public Extras ()
	{
		pan=new Pan(0, 20);
		netflix=new Netflix(0, 0.50);
		snack=new Snacks("papas",50);
		bebida=new Bebidas("Paso de los Toros", 40);
	}
	
	//Muestra los extrs y las cantidades con sus respectivos precios.
	public void MostrarExtras()
	{
		System.out.println("Panes: " + pan.getpaquete()+"Costo: "+pan.calcularPrecio());
		System.out.println("Netflix: " + netflix.getTiempo() + "Costo: " + netflix.calcularPrecio());
		System.out.println("Snacks: " + snack.getCantidad() + "Costo:" + snack.calcularPrecio());
		System.out.println("Bebidas: " + bebida.getCantidad() + "Costo: " + bebida.calcularPrecio());
	}
	
	
	//Retorna la cantidad total a pagar de los extras.
	public double TotalExtras()
	{
		double costoFinal = 0;
		costoFinal = pan.calcularPrecio() + netflix.calcularPrecio() + snack.calcularPrecio() + bebida.calcularPrecio();
		return costoFinal;
	}
	
}
