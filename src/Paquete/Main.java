package Paquete;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Persona auxi=new Pasajero("pepe", 1230, "mardel", "asdas120", "Pepe10", "1230");
		FileOutputStream nuevo;
		try {
			nuevo=new FileOutputStream("Pasajero.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(nuevo);
			escritura.writeObject(auxi);
			System.out.println("asdasd");
			
		} catch (Exception e) {
			System.out.println("Se rompio"+e);
		}
		finally
		{
			try {
				escritura.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
				
			
		}
	}
		

}
