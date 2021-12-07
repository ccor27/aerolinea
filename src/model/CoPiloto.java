package model;

public class CoPiloto extends Persona {

	private String estudiosRealizados;
	private static final long serialVersionUID = 1L;

	//constructores

	public CoPiloto() {
		super();
	}


	public CoPiloto(String identificacion, String nombre, String direccion, String correoElectronico,
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
