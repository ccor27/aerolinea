package model;

public class Auxiliar extends Persona {

	private String estudiosRealizados;



	public Auxiliar(String identificacion, String nombre, String direccion, String correoElectronico,
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
