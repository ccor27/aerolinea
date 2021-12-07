package model;

public class Piloto extends Persona {

	private static final long serialVersionUID = 1L;

	private String estudiosRealizados;

	//costructores
	public Piloto() {
		super();
	}



	public Piloto(String identificacion, String nombre, String direccion, String correoElectronico,
			String estudiosRealizados) {
		super(identificacion, nombre, direccion, correoElectronico);
		this.estudiosRealizados = estudiosRealizados;
	}



	//gets y sets
	public String getEstudiosRealizados() {
		return estudiosRealizados;
	}

	public void setEstudiosRealizados(String estudiosRealizados) {
		this.estudiosRealizados = estudiosRealizados;
	}



}
