package model;

public enum Estado {

	DISPONIBLE(0), OCUPADO(1);

	private int numEstado;

	private Estado(int numEstado) {
		this.numEstado = numEstado;
	}

	public int getNumEstado() {
		return numEstado;
	}

	public void setNumEstado(int numEstado) {
		this.numEstado = numEstado;
	}


	public String toSTring() {
		String estado = "";

		if(numEstado == 0) {
			estado = "DISPONIBLE";
		}

		if(numEstado == 1) {
			estado = "OCUPADA";
		}

		return estado;
	}
}
