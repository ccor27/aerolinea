package model;

public enum TipoRuta {

	NACIONAL(0) , INTERNACIONAL(1);

	private int numRuta;

	private TipoRuta(int numRuta) {
		this.numRuta = numRuta;
	}

	public int getNumRuta() {
		return numRuta;
	}

	public void setNumRuta(int numRuta) {
		this.numRuta = numRuta;
	}

	public String toSTring() {
		String ruta = "";

		if(numRuta == 0) {
			ruta = "NACIONAL";
		}

		if(numRuta == 1) {
			ruta = "INTERNACIONAL";
		}

		return ruta;
	}

}
