package controller;

import model.CaribeAirlines;
import model.CoPiloto;
import model.Piloto;

import java.util.Set;

import model.Auxiliar;

public class GestionDeTripulacionController {

	ModelFactoryController modelFactoryController;
	CaribeAirlines caribeAirlines;

	public GestionDeTripulacionController() {
		modelFactoryController = ModelFactoryController.getInstance();
		caribeAirlines = modelFactoryController.getCaribeAirlines();
	}
	public void asignarTripulacion( Piloto piloto, CoPiloto coPiloto, Set<Auxiliar> listaAuxiliares , String codigoAeronave){
		modelFactoryController.asignarTripulacion( piloto, coPiloto, listaAuxiliares, codigoAeronave);
	}

	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}
	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}
}
