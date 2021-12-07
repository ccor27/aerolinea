package model;

import java.util.ArrayList;

public class Flota {

	private static final long serialVersionUID = 1L;

	private ArrayList<Aeronave> listaAeronaves;
	private TipoRuta tipoRuta;

	//constructores
	public Flota() {
		super();
	}


	public Flota(ArrayList<Aeronave> listaAeronaves, TipoRuta tipoRuta) {
		super();
		this.listaAeronaves = listaAeronaves;
		this.tipoRuta = tipoRuta;
	}


	//gets y sets
	public ArrayList<Aeronave> getListaAeronaves() {
		return listaAeronaves;
	}
	public void setListaAeronaves(ArrayList<Aeronave> listaAeronaves) {
		this.listaAeronaves = listaAeronaves;
	}
	public TipoRuta getTipoRuta() {
		return tipoRuta;
	}
	public void setTipoRuta(TipoRuta tipoRuta) {
		this.tipoRuta = tipoRuta;
	}


}
