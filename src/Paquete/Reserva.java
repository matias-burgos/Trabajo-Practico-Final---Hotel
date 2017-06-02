package Paquete;

public class Reserva {
	
	boolean reservada;//Si la habitacion se encuentra reservada (true) o disponible(false)
	Pasajero responsable;//Guarda los datos de la persona que realiza la reserva.
	
	public Reserva()
	{
		reservada=false;
		responsable=new Responsable();
	}
	
	public void RealizarReserva(Pasajero responsable)//Asigna a reserva el pasajero que realiza la reserva.
	{
		this.responsable=responsable;
		reservada=true;
	}	
	
	public boolean getReservado()//Retorna un boolean si la habitacion estareservada o no.
	{
		return reservada;
	}
	public Pasajero getResponsable()//Retorna el pasajero que reservo la habitacion.
	{
		return responsable;
	}
}
