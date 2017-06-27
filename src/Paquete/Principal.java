package Paquete;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal implements Serializable
{
	public boolean ComprobacionPeriodo( FEcha desde, FEcha hasta, Habitacion habitacion)//Devuelve true si el periodo que se indica es valido para su reserva, si retorna false la habitacion esta ocupada/reservada en algun momento del periodo.
	{
		boolean rta=false;
		ArrayList<Reserva>listReservas=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Reservas.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			listReservas=(ArrayList<Reserva>)lectura.readObject();
			for(Reserva aux:listReservas)
			{
				if(aux.getReservado().numero==habitacion.getNumero())
				{
					if(desde.getAño()>=aux.getDesde().getAño() && hasta.getAño()<=hasta.getAño())//Comprueba que los datos ingresados por el pasajero esten entre el margen de disponible de año, mes y dia.
						{
							if(desde.getMes()>=aux.getDesde().getMes() && hasta.getMes()<=hasta.getMes())
							{
								if(desde.getDia()>=aux.getDesde().getDia() && hasta.getDia()<=hasta.getDia())
								{
									rta=true;//Si se encuentra disponible el retorno es true.
								}
							}
						}
				}
			}
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rta;
	}
	
	public void Reservar(Persona responsable, Habitacion seleccionada, FEcha desde, FEcha hasta )//crea una reserva y la guarda en el archivo.
	{
		Reserva nueva=new Reserva(responsable, seleccionada, desde, hasta);
		FileInputStream salida;
		FileOutputStream entrada;
		FileOutputStream nuevo;//Reemplaza al viejo archivo actualizando los datos
		try {
			
			salida=new FileInputStream("Reserva.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Reserva>listReserva=(ArrayList<Reserva>)lectura.readObject();
			listReserva.add(nueva);
			lectura.close();
			entrada=new FileOutputStream("Reserva.dat");
			ObjectOutputStream escritura=new ObjectOutputStream(entrada);
			escritura.writeObject(listReserva);
			escritura.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public Habitacion BuscarHabitacion(int seleccionada)//Busca la habitacion en base al numero.
	{
		Habitacion retorno=new Habitacion();//Habitacion encontrada.
		ArrayList<Habitacion>listaAux=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitacion.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			listaAux=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion auxHabi:listaAux)
			{
				if(auxHabi.getNumero()==seleccionada)
				{
					retorno =auxHabi;
				}
			}
			lectura.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return retorno;
	}

	public ArrayList ListaHabitOcupadas()//Retorna una lista con las habitaciones ocupadas.
	{
		ArrayList<Habitacion>ocupadas=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitaciones");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>auxHabi=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion aux:auxHabi)
			{
				if(aux.getOcup()==true)
				{
					ocupadas.add(aux);
				}
			}
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ocupadas;
	}
	public ArrayList ListaHabitReservadas()//Retorna una list con las habitaciones que se encuentran reservadas.
	{
		ArrayList<Habitacion>reservadas=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitaciones");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Habitacion>auxHabi=(ArrayList<Habitacion>)lectura.readObject();
			for(Habitacion aux:auxHabi)
			{
				if(aux.getReserv()==true)
				{
					reservadas.add(aux);
				}
			}
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reservadas;
	}
	public ArrayList AperturaArchivoHabitacion()//Abre un archivo de habitaciones y retorna la lista de la misma.
	{
		ArrayList<Habitacion>listaHabitacion=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Habitaciones.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			listaHabitacion=(ArrayList<Habitacion>)lectura.readObject();
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaHabitacion;
	}
	public ArrayList AperturaArchivoPasajerosHistorial(String cuenta)
	{
		ArrayList<Pasajero>listaHabitacion=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Pasajeros.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			ArrayList<Pasajero> listaPasajero=(ArrayList<Pasajero>)lectura.readObject();
			for(Pasajero aux:listaPasajero)
			{
				if(aux.getUser()==cuenta)
				{
					listaHabitacion=aux.getHistorial();
				}
			}
			
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaHabitacion;
	}
	public ArrayList AperturaArchivoPasajeros()
	{
		ArrayList<Pasajero>listaPasajero=new ArrayList<>();
		FileInputStream salida;
		try {
			salida=new FileInputStream("Pasajeros.dat");
			ObjectInputStream lectura=new ObjectInputStream(salida);
			listaPasajero=(ArrayList<Pasajero>)lectura.readObject();
			lectura.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaPasajero;
		
	}
	public void CrearCuenta(String nombreAux,String apellidoAux,int dniAux,String contraseñaAux,String usuarioAux, String tipoUsuario)
	{
		if(tipoUsuario.equals("Administrador"))
		{
			Administrador nuevo=new Administrador(nombreAux, dniAux, usuarioAux, contraseñaAux);
		}
		if(tipoUsuario.equals("Conserje"))
		{
			Conserje nuevo=new Conserje();
		}
		if(tipoUsuario.equals("Pasajero"))
		{
			//Pasajero nuevo=new Pasajero(nombreAux, dniAux, usuarioAux, contraseñaAux);
		}
	}
}
