package Paquete;

public class Netflix 
{
	double tiempo;
	double costo;
	
	public Netflix()
	{
		tiempo=0;
		costo=0;
	}
	public Netflix(double tiempo, double costo)
	{
		this.tiempo=tiempo;
		this.costo=costo;
	}
	
	public double getTiempo()
	{
		return tiempo;
	}
	public void setTiempo(double tiempo)
	{
		this.tiempo=tiempo;
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
