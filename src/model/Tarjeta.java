package model;

public class Tarjeta {

	private TipoTarjeta tipoTarjeta;
	private int saldo;

	//constructores

	public Tarjeta() {
		super();
	}

	public Tarjeta(TipoTarjeta tipoTarjeta, int saldo) {
		super();
		this.tipoTarjeta = tipoTarjeta;
		this.saldo = saldo;
	}

	//set y gets

	public TipoTarjeta getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(TipoTarjeta tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}



}
