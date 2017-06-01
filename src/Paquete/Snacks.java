package Paquete;

public class Snacks 
{
	String nombre;
	double precio;
	int cantidad; //Para saber cuantos agarro
	
	public Snacks()
	 {
		 nombre = "";
		 precio = 0;
		 cantidad = 0;
	 }
	 
	 public Snacks(String nombre, double precio)
	 {
		 this.nombre=nombre;
		 this.precio=precio;
	 }
	 
	 public String getNombre()
	 {
		 return nombre;
	 }
	 
	 public void setNombre(String nombre)
	 {
		 this.nombre=nombre;
	 }
	
	 public double getPrecio()
	 {
		 return precio;
	 }
	 
	 public void setPrecio(double precio)
	 {
		 this.precio=precio;
	 }
	 
	 public int getCantidad()
	 {
		 return cantidad;
	 }
	 
	 public void setCantidad(int cantidad)
	 {
		 this.cantidad=cantidad;
	 }
	 
	
	 
	 
	 public double calcularPrecio()
	 {
		 double precioFinal = precio * cantidad;
		 return precioFinal;
	 }
	 
	 public void cantidadPedida(int cantidadPedida)
	 {
		 cantidad = cantidadPedida;
	 }
}
