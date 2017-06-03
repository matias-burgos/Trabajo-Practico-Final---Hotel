package extras;

public class Netflix
{
	double tiempo;
	double costo;
	
	public Netflix()
	{
		tiempo=0;
		costo=0;
	}
	public Netflix(double tiempo, double costo)//Tiempo es 0 porque se le agrega el tiempo pedido en otro metodo.
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
	
	public double calcularPrecio()
	{
		double precioFinal= tiempo*costo;
		return precioFinal;
	}
	
	public void tiempoPedido(double tiempoPedido)
	{
		tiempo = tiempoPedido;
	}
}
