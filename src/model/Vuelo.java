package model;

public class Vuelo {

	private static final long serialVersionUID = 1L;

	private Aeronave nave;
    private Ruta ruta;
    private TipoVuelo tipoVuelo;
    private String fechaSalida;

	public Vuelo() {
		// TODO Auto-generated constructor stub
	}

	public Vuelo(Aeronave nave,Ruta ruta, TipoVuelo tipoVuelo , String fechaSalida) {
		super();
		this.nave = nave;
		this.ruta = ruta;
		this.tipoVuelo = tipoVuelo;
		this.fechaSalida = fechaSalida;

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

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}






}
