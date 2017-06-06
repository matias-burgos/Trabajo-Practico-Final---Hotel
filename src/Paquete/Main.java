package Paquete;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		
		Pasajero nuevo=new Pasajero("Pepe", 1230,  "Mar",  "Carasa 4444",  "Pepe98",  "1542");
		FileOutputStream ejemplo;
		try {
			ejemplo=new FileOutputStream("Pasajero.dat");
			ObjectOutputStream nuevos=new ObjectOutputStream(ejemplo);
			nuevos.writeObject(nuevo);
			File nuevoss=new File("PAsajero.dat");
			nuevoss.
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
