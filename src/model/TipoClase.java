package model;

public enum TipoClase {

	ECONOMICA(0) , EJECUTIVA(1) ;

	private int numClase;

	private TipoClase(int numClase) {
		this.numClase = numClase;
	}

	public int getNumClase() {
		return numClase;
	}

	public void setNumClase(int numClase) {
		this.numClase = numClase;
	}

	public String toSTring() {
		String categoria = "";

		if(numClase == 0) {
			categoria = "ECONOMICA";
		}

		if(numClase == 1) {
			categoria = "EJECUTIVA";
		}

		return categoria;
	}


}
