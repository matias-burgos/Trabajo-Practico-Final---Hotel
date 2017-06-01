package Paquete;

public class Pan 
{
	int paquete;
	double costo; //por paquete
	
	public Pan()
	{
		paquete=0;
		costo=0;
	}
	
	public Pan(int paquete, double costo)//paquete posee 0, ya que se lñe agrega la cantidad en otro metodo.
	{
		this.paquete=paquete;
		this.costo=costo;
	}
	
	public double getpaquete()
	{
		return paquete;
	}
	public void setPaquete(int paquete)
	{
		this.paquete=paquete;
	}
	
	public double getCosto()
	{
		return costo;
	}
	public void setCosto(double costo)
	{
		this.costo=costo;
	}
	
	public double calcularPrecio()
	{
		double precioFinal = paquete*costo;
		return precioFinal;
	}
	
	public void pedidos(int cantidad) // Le mete a la variable "paquete" la cantidad pedida de pansito
	{
		paquete = cantidad;
	}
}
