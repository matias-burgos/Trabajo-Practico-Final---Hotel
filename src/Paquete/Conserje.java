package Paquete;

import java.util.Scanner;

public class Conserje extends UserHotel
{
		int permiso;
		
		String nombre;
		String apellido;
		int edad;
		String dni;
		
		
		
		public int getPermisos()
		{
			return permiso;
		}
		
		public void setPermisos(int permiso)
		{
			this.permiso = permiso;
		}
		
		
		public String getNombre()
		{
			return nombre;
		}
		
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}
		
		public String getApellido()
		{
			return apellido;
		}
		
		public void setApellido(String apellido)
		{
			this.apellido = apellido;
		}
		
		public int getEdad()
		{
			return edad;
		}
		
		public void setEdad(int edad)
		{
			this.edad = edad;
		}
		
		public String getDni()
		{
			return dni;
		}
		
		public void setDni(String dni)
		{
			this.dni = dni;
		}
		
		
		public Conserje crearConserje()
		{
			Conserje conserje = new Conserje();
			
			Scanner sc = new Scanner(System.in);
			String n;
			String a;
			int e;
			String d;
			
			System.out.println("Nombre: ");
			n = sc.nextLine();
			
			System.out.println("Apellido: ");
			a = sc.nextLine();
			
			System.out.println("Edad: ");
			e = sc.nextInt();
			
			System.out.println("DNI: ");
			d = sc.nextLine();
			
			conserje.setNombre(n);
			conserje.setApellido(a);
			conserje.setEdad(e);
			conserje.setDni(d);
			
			return conserje;
				
			
		}
		
		
		
	
}
