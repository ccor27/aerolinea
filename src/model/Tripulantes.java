package model;

import java.util.ArrayList;

public class Tripulantes {

	private String codigoTripulacion;
	private Piloto piloto;
	private CoPiloto coPiloto;
	private ArrayList<Auxiliar> listaAuxiliares;


	//constructor

	public Tripulantes() {
		super();
	}

	public Tripulantes(String codigoTripulacion, Piloto piloto, CoPiloto coPiloto,
			ArrayList<Auxiliar> listaAuxiliares) {
		super();
		this.codigoTripulacion = codigoTripulacion;
		this.piloto = piloto;
		this.coPiloto = coPiloto;
		this.listaAuxiliares = listaAuxiliares;
	}

	//set y gets

	public String getCodigoTripulacion() {
		return codigoTripulacion;
	}

	public void setCodigoTripulacion(String codigoTripulacion) {
		this.codigoTripulacion = codigoTripulacion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public CoPiloto getCoPiloto() {
		return coPiloto;
	}

	public void setCoPiloto(CoPiloto coPiloto) {
		this.coPiloto = coPiloto;
	}

	public ArrayList<Auxiliar> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public void setListaAuxiliares(ArrayList<Auxiliar> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}




}
