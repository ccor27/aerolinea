package model;

public class Cliente extends Persona {

	private String apellido;
	private String direccionResidencia;
	private Tarjeta tarjeta;
	private Equipaje equipaje;
	private Tiquete tiquete;

	//contrsuctores
	public Cliente(String identificacion, String nombre, String direccion, String correoElectronico, String apellido,
			String direccionResidencia, Tarjeta tarjeta, Equipaje equipaje, Tiquete tiquete) {
		super(identificacion, nombre, direccion, correoElectronico);
		this.apellido = apellido;
		this.direccionResidencia = direccionResidencia;
		this.tarjeta = tarjeta;
		this.equipaje = equipaje;
		this.tiquete = tiquete;
	}
	public Cliente() {
		super();
	}
	//gets y sets

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccionResidencia() {
		return direccionResidencia;
	}
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public Equipaje getEquipaje() {
		return equipaje;
	}
	public void setEquipaje(Equipaje equipaje) {
		this.equipaje = equipaje;
	}
	public Tiquete getTiquete() {
		return tiquete;
	}
	public void setTiquete(Tiquete tiquete) {
		this.tiquete = tiquete;
	}



}
