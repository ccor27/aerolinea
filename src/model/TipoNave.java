package model;

public enum TipoNave {

	AIRBUS_A320(0), AIRBUS_A330(1),BOEING_787(2);
	private int numNave;
	
	private TipoNave(int numNave) {
		this.numNave = numNave;
	}
	

}
