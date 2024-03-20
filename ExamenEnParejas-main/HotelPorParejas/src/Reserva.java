
public class Reserva {

	//Atributos 
	private Cliente cliente;
	private Vehiculo vehiculo;
	private String fechaInicio;
	private int diasAlquilado;
	
	//Constructor
	public Reserva(Cliente cliente, Vehiculo vehiculo, String fechaInicio, int diasAlquilado) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaInicio = fechaInicio;
		this.diasAlquilado = diasAlquilado;
	}
	
	//Getters y setters

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getDiasAlquilado() {
		return diasAlquilado;
	}

	public void setDiasAlquilado(int diasAlquilado) {
		this.diasAlquilado = diasAlquilado;
	}
	
	
}
