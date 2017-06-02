package Paquete;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArchivoHabitaciones 
{
	static void escribir() throws IOException 
	{
		FileOutputStream bn = new FileOutputStream("Habitaciones.dat");
		ObjectOutputStream fobj = new ObjectOutputStream(bn);
		Habitacion h1 = new Habitacion(1,1,5);
		fobj.writeObject(h1);
		Habitacion h2 = new Habitacion(2,1,5);
		fobj.writeObject(h2);
		Habitacion h3 = new Habitacion(3,1,5);
		fobj.writeObject(h3);
		fobj.close();
	}
}
