package model;

public class Tiquete {

	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private TipoClase tipoClase;
	private String fechaInicio;
	private String fechaRegreso;
	private int cantidadPersonasViajar;
	private Cliente cliente;

	//contructores

	public Tiquete() {
		super();
	}
	public Tiquete(Ciudad ciudadOrigen, Ciudad ciudadDestino, TipoClase tipoClase, String fechaInicio,
			String fechaRegreso, int cantidadPersonasViajar, Cliente cliente) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.tipoClase = tipoClase;
		this.fechaInicio = fechaInicio;
		this.fechaRegreso = fechaRegreso;
		this.cantidadPersonasViajar = cantidadPersonasViajar;
		this.cliente = cliente;
	}
	//get y sets
	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}
	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}
	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}
	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	public TipoClase getTipoClase() {
		return tipoClase;
	}
	public void setTipoClase(TipoClase tipoClase) {
		this.tipoClase = tipoClase;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaRegreso() {
		return fechaRegreso;
	}
	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
	public int getCantidadPersonasViajar() {
		return cantidadPersonasViajar;
	}
	public void setCantidadPersonasViajar(int cantidadPersonasViajar) {
		this.cantidadPersonasViajar = cantidadPersonasViajar;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



}
