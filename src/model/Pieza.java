package model;

public class Pieza {

	private int peso;
	private double alto;
	private double largo;
	private double ancho;

	//constructores
	public Pieza() {
		super();
	}

	public Pieza(int peso, double alto, double largo, double ancho) {
		super();
		this.peso = peso;
		this.alto = alto;
		this.largo = largo;
		this.ancho = ancho;
	}

	//gets y sets

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}



}
