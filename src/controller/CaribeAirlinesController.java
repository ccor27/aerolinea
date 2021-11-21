package controller;

import model.CaribeAirlines;

public class CaribeAirlinesController {

	ModelFactoryController modelFactoryController;
	CaribeAirlines caribeAirlines;

	public CaribeAirlinesController() {
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
