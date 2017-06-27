package Paquete;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	
	
	public static void main(String[] args) {
		Habitacion nuevaHabi=new Habitacion(1,1,2);
		ArrayList<Habitacion>listHabi=new ArrayList<>();
		listHabi.add(nuevaHabi);
		FileOutputStream entrada;
		try {
			entrada=new FileOutputStream("Habitaciones.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(entrada);
			escritura.writeObject(entrada);
			escritura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Pasajero nuevoPasj=new Pasajero("pepe", 123, "Mardel", "kappa", "Pepe", "1230");
		FileOutputStream entradaPasajeros;
		try
		{
			entradaPasajeros=new FileOutputStream("Pasajeros.dat");
			ObjectOutputStream escrituraPasaj=new ObjectOutputStream(entradaPasajeros);
			escrituraPasaj.writeObject(nuevoPasj);
			escrituraPasaj.close();
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error al usar el archivo de pasajeros: ");
			e.printStackTrace();
			
		} 
		catch (IOException e)
		{
			System.out.println("Error al usar el archivo de pasajeros: ");
			e.printStackTrace();
		}
		
		Administrador nuevoAdmin=new Administrador("Ivo", 1214, "ivo", "1230");
		FileOutputStream entradaAdmin;
		try
		{
			entradaAdmin=new FileOutputStream("Administrador.dat");
			ObjectOutputStream escrituraAdmin=new ObjectOutputStream(entradaAdmin);
			escrituraAdmin.writeObject(nuevoAdmin);
			escrituraAdmin.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Error al usar el archivo de conserje: ");
			e.printStackTrace();
			
		} 
		catch (IOException e)
		{
			System.out.println("Error al usar el archivo de conserje: ");
			e.printStackTrace();
		}
		
		Conserje nuevoConserje=new Conserje("Lucas", 122, "Lucas", "1212", "a1");
		FileOutputStream entradaConserje;
		try
		{
			entradaConserje=new FileOutputStream("Conserjes.dat");
			ObjectOutputStream escrituraConserj=new ObjectOutputStream(entradaConserje);
			escrituraConserj.writeObject(nuevoConserje);
			escrituraConserj.close();
		} catch (FileNotFoundException e)
		{
			System.out.println("Error al usar el archivo de conserje: ");
			e.printStackTrace();
			
		} 
		catch (IOException e)
		{
			System.out.println("Error al usar el archivo de conserje: ");
			e.printStackTrace();
		}
		
		InicioSesion comienzo=new InicioSesion();
		comienzo.setVisible(true);
		
		
		

	}

}
