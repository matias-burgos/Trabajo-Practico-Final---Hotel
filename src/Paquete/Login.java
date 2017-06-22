package Paquete;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Login 
{
	/**
	 * 
	 * @param usuario
	 * @param pass
	 * @return 1 si es pasejero - 0 si es conseje - 2 si es administrador - (-1) si no es nada
	 */
	public static int iniciar(String nombre, String contraseņa)
	{
		int rta=-1;
		
		FileInputStream salidaConserje;
		try {
			salidaConserje=new FileInputStream("Conserjes.dat");
			ObjectInputStream lecturaConserje=new ObjectInputStream(salidaConserje);
			Conserje auxConserje=(Conserje)lecturaConserje.readObject();
			//Recorrido del archivo de conserjes.
			while(auxConserje!=null)//Recorrido del archivo
			{
				//Comprobacion.
				if(nombre.equals(auxConserje.getUser()) && contraseņa.equals(auxConserje.getContrasenha())/* nombre.equals(nombreEjemplo) && contraseņa.equals(contraseņaEjemplo)*/)
				{
					rta=0;
					
				}
				auxConserje=(Conserje)lecturaConserje.readObject();
			}
			lecturaConserje.close();
		} catch (Exception e2) {
			System.out.println("Error al usar archivo de conserje: "+e2);
		} 
		if(rta!=0)
		{
	
			FileInputStream salidaPasajero=null;
			int comprob=0;//Comprueba si el nombre de usuario y la contraseņa es encontrada.
			Pasajero auxPasajero=new Pasajero();
			try {
				salidaPasajero=new FileInputStream("Pasajeros.dat");
				ObjectInputStream lecturaPasajero=new ObjectInputStream(salidaPasajero); 
				auxPasajero=(Pasajero)lecturaPasajero.readObject();
				//Recorrido por el archivo de usuarios.
				while(auxPasajero!=null)//Recorrido del archivo
				{
					//Comprobacion.
					if(nombre.equals(auxPasajero.getUser()) && contraseņa.equals(auxPasajero.getContrasenha()))
					{
						rta=1;
						
						
					}
					
					
					auxPasajero=(Pasajero)lecturaPasajero.readObject();
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
				salidaAdministrador=new FileInputStream("Administrador.dat");
				ObjectInputStream lecturaAdministrador=new ObjectInputStream(salidaAdministrador);
				Administrador auxAdministrador=(Administrador)lecturaAdministrador.readObject();
				//Recorrido del archivo de administrador.
				while(auxAdministrador!=null)//Recorrido del archivo
				{
						//Comprobacion.
						if(nombre.equals(auxAdministrador.getUser()) && contraseņa.equals(auxAdministrador.getContrasenha())/* nombre.equals(nombreEjemplo) && contraseņa.equals(contraseņaEjemplo)*/)
						{
							rta=2;
							
							
						}
						auxAdministrador=(Administrador)lecturaAdministrador.readObject();
					}
					lecturaAdministrador.close();
			} catch (Exception e2) {
				System.out.println("Error al usar archivo de administrador: "+e2);
			}
		}
		return rta;
	}
}
