package model;

import java.util.ArrayList;

public class CarroEmbarque {

	private static final long serialVersionUID = 1L;

	private Aeronave aeronaveAsiganada;
	private ArrayList<Equipaje> listaEquipaje;
	private int pesoTotal;



	public CarroEmbarque() {
		super();
	}
	public Aeronave getAeronaveAsiganada() {
		return aeronaveAsiganada;
	}
	public void setAeronaveAsiganada(Aeronave aeronaveAsiganada) {
		this.aeronaveAsiganada = aeronaveAsiganada;
	}
	public ArrayList<Equipaje> getListaEquipaje() {
		return listaEquipaje;
	}
	public void setListaEquipaje(ArrayList<Equipaje> listaEquipaje) {
		this.listaEquipaje = listaEquipaje;
	}
	public int getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(int pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}




}
