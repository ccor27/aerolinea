package controller;

import model.CaribeAirlines;

public class GestionDeTripulacionController {

	ModelFactoryController modelFactoryController;
	CaribeAirlines caribeAirlines;

	public GestionDeTripulacionController() {
		modelFactoryController = ModelFactoryController.getInstance();
		caribeAirlines = modelFactoryController.getCaribeAirlines();
	}

	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}
	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}
}
