package model;

public enum TipoTarjeta {

	DEBITO(0), CREDITO(1);

	private int numTarjeta;



	private TipoTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String toSTring() {
		String tarjeta = "";

		if(numTarjeta == 0) {
			tarjeta = "DEBITO";
		}

		if(numTarjeta == 1) {
			tarjeta = "CREDITO";
		}

		return tarjeta;
	}

}
