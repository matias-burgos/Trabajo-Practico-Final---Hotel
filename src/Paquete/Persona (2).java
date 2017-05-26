package Paquete;

public class Persona {
	String nombre;
	int dni;
	
	public Persona()
	{
		nombre="";
		dni=0;
	}
	 public Persona(String nombre, int dni)
	 {
		 this.nombre=nombre;
		 this.dni=dni;
	 }
	 
	 public String getNombre()
	 {
		 return nombre;
	 }
	 public void setNombre(String nombre)
	 {
		 this.nombre=nombre;
	 }
	 
	 public int getDNI()
	 {
		 return dni;
	 }
	 public void setDNI(int dni)
	 {
		 this.dni=dni;
	 }
}
