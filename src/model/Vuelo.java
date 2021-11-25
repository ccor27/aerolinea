package model;

public class Vuelo {
	
	private Aeronave nave;
    private Ruta ruta;
    private TipoVuelo tipoVuelo;
	
	public Vuelo() {
		// TODO Auto-generated constructor stub
	}

	public Vuelo(Aeronave nave,Ruta ruta, TipoVuelo tipoVuelo) {
		super();
		this.nave = nave;
		this.ruta = ruta;
		this.tipoVuelo = tipoVuelo;

	}

   
	public TipoVuelo getTipoVuelo() {
		return tipoVuelo;
	}

	public void setTipoVuelo(TipoVuelo tipoVuelo) {
		this.tipoVuelo = tipoVuelo;
	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

	public Aeronave getNave() {
		return nave;
	}

	public void setNave(Aeronave nave) {
		this.nave = nave;
	}

	
	

}
