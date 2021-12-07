package model;

import java.util.Comparator;

public class ComparationPiloto implements Comparator<Persona> {

	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return (o1.getIdentificacion().compareToIgnoreCase(o2.getIdentificacion()));
	}

}
