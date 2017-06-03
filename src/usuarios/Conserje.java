package usuarios;

public class Conserje extends UserHotel{
	
	private String empleadoID; //clave unica de identificacion de empleado
	
	//constructores
	public Conserje()
	{
		super();
		empleadoID="";
	}
	
	public Conserje(String nombre, int dni, String user, String contrasenha, String empleadoID)
	{
		super(nombre, dni, user, contrasenha);
		this.empleadoID=empleadoID;
	}
	
	//getters y setters
	public String getEmpleadoID()
	{
		return empleadoID;
	}
	
	public void setEmpleadoID(String empleadoID)
	{
		this.empleadoID=empleadoID;
	}
	
	/*muestra la info completa del conserje (sobreescribe el metodo de UserHotel, muestra
	tambien la ID de empleado*/
	@Override
	public void MostrarUsuario()
	{
		super.MostrarUsuario();
		System.out.println("ID de empleado: "+getEmpleadoID());
	}
	
	public void verReserva()
	{
		
	}
	
	public void cancelarReserva()
	{
		
	}
	
}