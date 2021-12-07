package model;

public class Silla {

	private static final long serialVersionUID = 1L;

	private String referencia;
	private Estado estado;
	private TipoClase tipoClase;

	//constructores

	public Silla() {
		super();
	}

	public Silla(String referencia, Estado estado, TipoClase tipoClase) {
		super();
		this.referencia = referencia;
		this.estado = estado;
		this.tipoClase = tipoClase;
	}

	//set y gets
	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoClase getTipoClase() {
		return tipoClase;
	}

	public void setTipoClase(TipoClase tipoClase) {
		this.tipoClase = tipoClase;
	}



}
