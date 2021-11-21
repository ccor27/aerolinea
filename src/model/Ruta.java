package model;

public class Ruta {

	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	private String tiempoDuracion;
	private String tiempoSalida;

	//constructores
	public Ruta() {
		super();
	}

	public Ruta(Ciudad ciudadOrigen, Ciudad ciudadDestino, String tiempoDuracion) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.tiempoDuracion = tiempoDuracion;
	}

	//gets y sets

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

	public String getTiempoDuracion() {
		return tiempoDuracion;
	}

	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}




}
