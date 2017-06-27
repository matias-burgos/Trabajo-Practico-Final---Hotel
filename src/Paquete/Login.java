package Paquete;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Login implements Serializable
{
	/**
	 * 
	 * @param usuario
	 * @param pass
	 * @return 1 si es pasejero - 0 si es conseje - 2 si es administrador - (-1) si no es nada
	 */
	public static int iniciar()
	{
		int rta=-1;
		String nombre=InicioSesion.nombreUsuario.getText();
		String contraseña=InicioSesion.contraseñaUsuario.getText();
		ArrayList<Conserje>auxConserje=new ArrayList<>();
		FileInputStream salidaConserje;
		try {
			salidaConserje=new FileInputStream("Conserjes.dat");
			ObjectInputStream lecturaConserje=new ObjectInputStream(salidaConserje);
			ArrayList<Conserje>auxLista=(ArrayList<Conserje>)lecturaConserje.readObject();
			//Recorrido del archivo de conserjes.
			for(Conserje aux:auxLista)//Recorrido del archivo
			{
				//Comprobacion.
				if(nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha())/* nombre.equals(nombreEjemplo) && contraseña.equals(contraseñaEjemplo)*/)
				{
					rta=0;
					
				}
				
			}
			lecturaConserje.close();
		} catch (Exception e2) {
			System.out.println("Error al usar archivo de conserje: "+e2);
		} 
		if(rta!=0)
		{
	
			FileInputStream salidaPasajero=null;
			int comprob=0;//Comprueba si el nombre de usuario y la contraseña es encontrada.
			Pasajero auxPasajero=new Pasajero();
			try {
				salidaPasajero=new FileInputStream("Pasajeros.dat");
				ObjectInputStream lecturaPasajero=new ObjectInputStream(salidaPasajero); 
				ArrayList<Pasajero>auxLista=(ArrayList<Pasajero>)lecturaPasajero.readObject();
				//Recorrido por el archivo de usuarios.
				for(Pasajero aux:auxLista)//Recorrido del archivo
				{
					//Comprobacion.
					if(nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha()))
					{
						rta=1;
						
						
					}
					
					
				
				}
				lecturaPasajero.close();
			} catch (Exception e2) {
				System.out.println("Problemas al usar el archivo de pasajeros"+e2);
			}
		
		}
		if(rta!=1 && rta!=2)
		{
			
			FileInputStream salidaAdministrador;
			try {
				salidaAdministrador=new FileInputStream("Administradores.dat");
				ObjectInputStream lecturaAdministrador=new ObjectInputStream(salidaAdministrador);
				ArrayList<Administrador>auxLista=(ArrayList<Administrador>)lecturaAdministrador.readObject();
				//Recorrido del archivo de administrador.
				for(Administrador aux:auxLista)//Recorrido del archivo
				{
						//Comprobacion.
						if(nombre.equals(aux.getUser()) && contraseña.equals(aux.getContrasenha())/* nombre.equals(nombreEjemplo) && contraseña.equals(contraseñaEjemplo)*/)
						{
							rta=2;
							
							
						}
						
					}
					lecturaAdministrador.close();
			} catch (Exception e2) {
				System.out.println("Error al usar archivo de administrador: "+e2);
			}
		}
		return rta;
	}
}
