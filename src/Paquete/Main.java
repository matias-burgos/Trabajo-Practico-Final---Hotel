package Paquete;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1618722919678697885L;

	public static void main(String[] args) {
		Persona aux=new Pasajero("pepe", 1230, "mardel", "asdas120", "Pepe10", "1230");
		
		FileOutputStream nuevo=null;
		try {
			nuevo=new FileOutputStream("Pasajero.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(nuevo);
			System.out.println("asdasd");
			escritura.writeObject(aux);
			System.out.println("asdasd");
			escritura.close();
			System.out.println("asdasd");
		} catch (Exception e) {
			System.out.println("Se rompio"+e);
		}
		finally
		{
			
				
			
		}
	}
		

}
