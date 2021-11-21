package model;

public class Persona {

	private String identificacion;
	private String nombre;
	private String direccion;
	private String correoElectronico;

	//constructores
	public Persona() {
		super();
	}

	public Persona(String identificacion, String nombre, String direccion, String correoElectronico) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
	}


	//gets y sets

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}





}
