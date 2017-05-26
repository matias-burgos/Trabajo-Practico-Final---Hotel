package Paquete;

public class Pan extends Extras
{
	double peso;
	double costo; //por kilo
	
	public Pan()
	{
		peso=0;
		costo=0;
	}
	
	public Pan(double peso, double costo)
	{
		this.peso=peso;
		this.costo=costo;
	}
	
	public double getPeso()
	{
		return peso;
	}
	public void setPeso(double peso)
	{
		this.peso=peso;
	}
	
	public double getCosto()
	{
		return costo;
	}
	public void setCosto(double costo)
	{
		this.costo=costo;
	}
	
	public double calcularPrecio(double tiempo, double costo)
	{
		double precioFinal=0;
		precioFinal = tiempo*costo;
		return precioFinal;
	}
}
