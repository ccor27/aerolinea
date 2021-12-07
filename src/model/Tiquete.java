package model;

public class Tiquete {

	private static final long serialVersionUID = 1L;

	private String origen;
	private String destino;
	private TipoClase tipoClase;
	private String fechaInicio;
	private String fechaRegreso;
	private Cliente cliente;
	private double costo;
	private ModalidadVuelo modalidadVuelo;
	private Vuelo vuelo;

	//contructores

	public Tiquete() {
		super();
	}
	public Tiquete(Vuelo vuelo, TipoClase tipoClase, String fechaInicio,
			String fechaRegreso, Cliente cliente) {
		super();

		this.vuelo=vuelo;
		this.origen=vuelo.getRuta().getOrigen();
		this.destino=vuelo.getRuta().getDestino();
		this.tipoClase = tipoClase;
		this.fechaInicio = fechaInicio;
		this.fechaRegreso = fechaRegreso;
		this.cliente = cliente;
		costoTiquete();

	}


	public void costoTiquete(){

		if(tipoClase==TipoClase.ECONOMICA){

			if(vuelo.getTipoVuelo()==TipoVuelo.INTERNACIONA){
				costo = 100000+(0.97*100000);
			}else{
				costo = 100000+(0.8*100000);
			}
		}else{

			if(vuelo.getTipoVuelo()==TipoVuelo.INTERNACIONA){
				costo = 150000+(0.97*150000);
			}else{
				costo = 150000+(0.8*150000);
			}

		}
	}

	//100
	//get y sets

	public TipoClase getTipoClase() {
		return tipoClase;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public void setTipoClase(TipoClase tipoClase) {
		this.tipoClase = tipoClase;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaRegreso() {
		return fechaRegreso;
	}
	public void setFechaRegreso(String fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Tiquete [origen=" + origen + ", destino=" + destino + ", tipoClase=" + tipoClase + ", fechaInicio="
				+ fechaInicio + ", fechaRegreso=" + fechaRegreso + ", cliente=" + cliente + ", costo=" + costo
				+ ", modalidadVuelo=" + modalidadVuelo + ", vuelo=" + vuelo + "]";
	}





}
