package controller;

import java.util.ArrayList;
import java.util.Set;

import model.Aeronave;
import model.Auxiliar;
import model.CaribeAirlines;
import model.CoPiloto;
import model.Piloto;
import model.Vuelo;

public class CompraDeTiqueteController {

	ModelFactoryController modelFactoryController;
	CaribeAirlines caribeAirlines;

	public CompraDeTiqueteController() {
		modelFactoryController = ModelFactoryController.getInstance();
		caribeAirlines = modelFactoryController.getCaribeAirlines();
	}
	public void asignarTripulacion( Piloto piloto, CoPiloto coPiloto, Set<Auxiliar> listaAuxiliares , Aeronave aeronave){
		modelFactoryController.asignarTripulacion( piloto, coPiloto, listaAuxiliares, aeronave);
	}

	public ArrayList<Vuelo> buscarVuelos(String fecha){
		return modelFactoryController.buscarVuelos(fecha);
	}

	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}
	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}
}
