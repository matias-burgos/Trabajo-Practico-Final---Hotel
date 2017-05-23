package Paquete;

public class Habitacion {
		boolean ocupada;//Si la habitacion se encuentra ocupada (true) o disponible (false)
		int numero;//Numero de habitacion.
		int piso;//Piso de habitacion.
		int cantMax;//Cantidad maxima de pasajeros.
		 
		
		int periodoOcupacion;//Es el periodo por el que la habitacion esta ocupada.
		//Datos del cliente que alquila la habitacion.
		String nombre;
		int dni;
		String ciudadOrigen;
		String domicilioOrigen;
		
		public Habitacion()
		{
			ocupada=true;
			
			//
			periodoOcupacion=0;
			nombre="";
			dni=0;
			ciudadOrigen="";
			domicilioOrigen="";
		}
		
		public int getPeriodo()
		{
			return periodoOcupacion;
		}
		public String getNombreClient()
		{
			return nombre;
		}
		
		public int getDNI()
		{
			return dni;
		}
		
		public String getCiudadClient()
		{
			return ciudadOrigen;
		}
		public String getDomicilioClient()
		{
			return domicilioOrigen;
		}
		public boolean getCupada()
		{
			return ocupada;
		}
		
}
