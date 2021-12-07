package model;

import java.util.ArrayList;
import java.util.Set;

public class Tripulantes {

	private static final long serialVersionUID = 1L;
	private String codigoTripulacion;
	private Piloto piloto;
	private CoPiloto coPiloto;
	private Set<Auxiliar> listaAuxiliares;


	//constructor

	public Tripulantes() {
		super();
	}

	public Tripulantes( Piloto piloto, CoPiloto coPiloto,
			Set<Auxiliar> listaAuxiliares) {
		super();
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

	public Set<Auxiliar> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public void setListaAuxiliares(Set<Auxiliar> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}






}
