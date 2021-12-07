package model;

public class Ruta {

	private static final long serialVersionUID = 1L;

	private String origen;
	private String destino;
	private String tiempoDuracion;
	private String tiempoSalida;

	//constructores
	public Ruta() {
		super();
	}



	public Ruta(String origen, String destino) {
		super();
		this.origen = origen;
		this.destino = destino;

	}

	public void caracteristicasSegunOrigenDestino(String o, String d){

		if(o.equalsIgnoreCase("cdmx")){

			switch (d) {
			case "Monterrey":
				tiempoDuracion = "2(H) 45(M)";
				tiempoSalida = "6:00 am";
				break;
			case "Cancun":
				tiempoDuracion = "3(H) 12(M)";
				tiempoSalida = "8:00 am";
				break;
			case "Buenos Aires":
				tiempoDuracion = "9(H) 5(M)";
				tiempoSalida = "11:30 pm";
				break;
			case "Los Angeles":
				tiempoDuracion = "3(H) 25(M)";
				tiempoSalida = "9:045 am";
				break;
			case "Bogota":
				tiempoDuracion = "3(H) 45(M)";
				tiempoSalida = "1:30 pm";
				break;
			case "Panama":
				tiempoDuracion = "2(H) 55(M)";
				tiempoSalida = "2:45 pm";
				break;
			default:
				break;
			}
		}else{
			System.out.println("no puede hacer vuelos si el origen no es cdmx");
		}
	}

	//gets y sets




	public String getTiempoDuracion() {
		return tiempoDuracion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}



	public String getDestino() {
		return destino;
	}



	public void setDestino(String destino) {
		this.destino = destino;
	}



	public void setTiempoDuracion(String tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}




}
