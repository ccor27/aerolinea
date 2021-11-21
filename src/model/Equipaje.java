package model;

import java.util.ArrayList;

public class Equipaje {

	private ArrayList<Pieza> listaPiezas;


	//constructores
	public Equipaje() {
		super();
	}
	public Equipaje(ArrayList<Pieza> listaPiezas) {
		super();
		this.listaPiezas = listaPiezas;
	}



	//gets y sets
	public ArrayList<Pieza> getListaPiezas() {
		return listaPiezas;
	}

	public void setListaPiezas(ArrayList<Pieza> listaPiezas) {
		this.listaPiezas = listaPiezas;
	}


}
