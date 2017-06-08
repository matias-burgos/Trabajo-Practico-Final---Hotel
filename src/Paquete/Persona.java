package Paquete;

import java.io.Serializable;

public class Persona implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7424629624387745945L;
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
	 
	 public void MostrarPersona()
	 {
		 System.out.println("Nombre de la persona: "+getNombre());
		 System.out.println("DNI: "+getDNI());
	 }
}
