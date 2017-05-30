package Paquete;

public class Bebidas extends Extras 
{
	 String nombre;
	 double precio;
	 int cantidad;
	 
	 public Bebidas()
	 {
		 nombre = "";
		 precio = 0;
		 cantidad = 0;
	 }
	 
	 public Bebidas(String nombre, double precio)
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
