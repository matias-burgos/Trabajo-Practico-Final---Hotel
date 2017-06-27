package Paquete;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class CrearUsuario {
	static int cantCuentas;
	
	public CrearUsuario()
	{
		cantCuentas=cantCuentas++;
	}
	
	public void CrearCuentaPasajero(String nombre, int dni, String ciudad, String domicilio, String usuario, String contraseña)//Crea una cuenta.
	{
		Pasajero nuevo=new Pasajero(nombre, dni, ciudad, domicilio, usuario, contraseña);
		ArrayList<Pasajero>aux=new ArrayList<>();
		aux.add(nuevo);
		FileOutputStream entrada;
		try {
			entrada=new FileOutputStream("Pasajeros.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(entrada);
			escritura.writeObject(aux);
			escritura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void CrearCuentaConserje(String nombre, int dni, String user, String contrasenha, String empleadoID)
	{
		Conserje nuevo=new Conserje(nombre, dni, user, contrasenha, empleadoID);
		ArrayList<Conserje>aux=new ArrayList<>();
		aux.add(nuevo);
		FileOutputStream entrada;
		try {
			entrada=new FileOutputStream("Conserjes.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(entrada);
			escritura.writeObject(aux);
			escritura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void CrearCuentaAdmin(String nombre, int dni, String user, String contrasenha)
	{
		Administrador nuevo=new Administrador(nombre, dni, user, contrasenha);
		ArrayList<Administrador>aux=new ArrayList<>();
		aux.add(nuevo);
		FileOutputStream entrada;
		try {
			entrada=new FileOutputStream("Administradores.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(entrada);
			escritura.writeObject(aux);
			escritura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
