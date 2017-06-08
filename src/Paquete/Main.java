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
		Pasajero aux=new Pasajero("pepe", 1230, "mardel", "asdas120", "Pepe10", "1230");
		
		FileOutputStream nuevo=null;
		try {
			nuevo=new FileOutputStream("Pasajero.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(nuevo);
			escritura.writeObject(aux);
			escritura.close();
		} catch (Exception e) 
		{
			System.out.println("Se rompio "+e);
		}
		finally
		{	
		}
		FileInputStream salida;
		try {
			salida=new FileInputStream("Pasajero.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			Pasajero auxPasajero=(Pasajero)lectura.readObject();
			auxPasajero.MostrarPasajero();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
		

}
