package Paquete;

public class Snacks extends Extras
{
	String nombre;
	double precio;
	
	public Snacks()
	 {
		 nombre = "";
		 precio = 0;
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
}
