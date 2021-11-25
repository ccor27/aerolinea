package model;

import java.util.ArrayList;

public class Aeronave {

	private TipoNave tipoNave;
	private Tripulantes tripulantes;
	private int numeroPasajeros;
	private double capacidadKg;
	private int numEjecutivos;
	private int numEconnomicos;
	private Silla[][] puestosEjecutivos;
	private Silla[][] puestosEconomicos;
	private ArrayList<Equipaje> listaEquipajes;



	public Aeronave(TipoNave tipoNave) {
		super();
		//this.numeroPasajeros = numeroPasajeros;
		//this.capacidadKg = capacidadKg;
		//this.numEjecutivos = numEjecutivos;
		//this.numEconnomicos = numEconnomicos;
		this.tipoNave=tipoNave;
		caracteristicaNaveSegunTipo();
	}
	public Aeronave(Tripulantes tripulantes, int numeroPasajeros, double capacidadKg, int numEjecutivos,
			int numEconnomicos, Silla[][] puestosEjecutivos, Silla[][] puestosEconomicos,
			ArrayList<Equipaje> listaEquipajes) {
		super();
		this.tripulantes = tripulantes;
		this.numeroPasajeros = numeroPasajeros;
		this.capacidadKg = capacidadKg;
		this.numEjecutivos = numEjecutivos;
		this.numEconnomicos = numEconnomicos;
		this.puestosEjecutivos = puestosEjecutivos;
		this.puestosEconomicos = puestosEconomicos;
		this.listaEquipajes = listaEquipajes;
	}
	
	//seleccion de caracteristicas de la nave segun su tipo
	public void caracteristicaNaveSegunTipo(){
		
		if(tipoNave==TipoNave.AIRBUS_A320){
			puestosEjecutivos = new Silla[6][6];
			puestosEconomicos = new Silla[23][6];
			capacidadKg = 19000;
			numeroPasajeros = 150;
			numEconnomicos=138;
			numEjecutivos=12;
		}else{
			if(tipoNave==TipoNave.AIRBUS_A330){
				puestosEjecutivos = new Silla[6][5];
				puestosEconomicos = new Silla[37][6];
				capacidadKg = 52000;
				numeroPasajeros = 252;
				numEconnomicos=222;
				numEjecutivos=30;
			}else{
				puestosEjecutivos = new Silla[7][4];
				puestosEconomicos = new Silla[37][6];
				capacidadKg = 50000;
				numeroPasajeros = 250;
				numEconnomicos=222;
				numEjecutivos=28;
			}
		}
	}
	
	//gets y sets
	public Tripulantes getTripulantes() {
		return tripulantes;
	}
	public void setTripulantes(Tripulantes tripulantes) {
		this.tripulantes = tripulantes;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public double getCapacidadKg() {
		return capacidadKg;
	}
	public void setCapacidadKg(double capacidadKg) {
		this.capacidadKg = capacidadKg;
	}
	public int getNumEjecutivos() {
		return numEjecutivos;
	}
	public void setNumEjecutivos(int numEjecutivos) {
		this.numEjecutivos = numEjecutivos;
	}
	public int getNumEconnomicos() {
		return numEconnomicos;
	}
	public void setNumEconnomicos(int numEconnomicos) {
		this.numEconnomicos = numEconnomicos;
	}
	public Silla[][] getPuestosEjecutivos() {
		return puestosEjecutivos;
	}
	public void setPuestosEjecutivos(Silla[][] puestosEjecutivos) {
		this.puestosEjecutivos = puestosEjecutivos;
	}
	public Silla[][] getPuestosEconomicos() {
		return puestosEconomicos;
	}
	public void setPuestosEconomicos(Silla[][] puestosEconomicos) {
		this.puestosEconomicos = puestosEconomicos;
	}
	public ArrayList<Equipaje> getListaEquipajes() {
		return listaEquipajes;
	}
	public void setListaEquipajes(ArrayList<Equipaje> listaEquipajes) {
		this.listaEquipajes = listaEquipajes;
	}
	@Override
	public String toString() {
		return "Aeronave [tipoNave=" + tipoNave + ", numeroPasajeros=" + numeroPasajeros + ", capacidadKg="
				+ capacidadKg + ", numEjecutivos=" + numEjecutivos + ", numEconnomicos=" + numEconnomicos + "]";
	}

    

}
