package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import model.Aeronave;
import model.Auxiliar;
import model.CaribeAirlines;
import model.Cliente;
import model.CoPiloto;
import model.Equipaje;
import model.Piloto;
import model.Ruta;
import model.Tarjeta;
import model.TipoClase;
import model.TipoNave;
import model.TipoTarjeta;
import model.TipoVuelo;
import model.Tiquete;
import model.Vuelo;
import persistencia.ArchivoUtil;
import persistencia.Persistencia;



public class ModelFactoryController {

	CaribeAirlines caribeAirlines;
	Persistencia persistencia;

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	public ModelFactoryController() {
		caribeAirlines = new CaribeAirlines();
		try {
			caribeAirlines = persistencia.cargarRecursoXMLAerolinea();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//inicializarDatos();
	}

	private void inicializarDatos() {
		System.out.println("hola");

		//al agregar un piloto, el metodo retorna true si lo agrega, false si no, ya que no deja repetidos
		System.out.println(caribeAirlines.agregarPiloto("10013698", "cristian", "osorio", "cris@gmail.com", "bachiller, aviacion en la universidad del quindio"));;
		System.out.println(caribeAirlines.agregarPiloto("10013698", "cristian", "osorio", "cris@gmail.com", "bachiller, aviacion en la universidad del quindio"));
		System.out.println(caribeAirlines.agregarPiloto("11365897", "yeferson", "zuluaga", "zuluaga@gmail.com", "bachiller, aviacion , medico"));
	   Tarjeta t = new Tarjeta(TipoTarjeta.DEBITO, 1000000);
	   Equipaje e = new Equipaje();
	   Cliente c1 = new Cliente("1005085241", "x", "xxx","adsd.cpm", "xx","x",t,e);


		Aeronave aeronave1 = new Aeronave("123" ,TipoNave.AIRBUS_A320);
		Aeronave aeronave2 = new Aeronave("124" , TipoNave.AIRBUS_A330);
		Aeronave aeronave3 = new Aeronave("152" , TipoNave.BOEING_787);

		caribeAirlines.getListaAeronaves().add(aeronave1);
		caribeAirlines.getListaAeronaves().add(aeronave2);
		caribeAirlines.getListaAeronaves().add(aeronave3);

		Ruta ruta = new Ruta("cmdx","bogota");

		Vuelo vuelo = new Vuelo(aeronave1,ruta,TipoVuelo.INTERNACIONA, "15/10/2022");
		caribeAirlines.getListaVuelos().add(vuelo);

		Tiquete tiquete = new Tiquete(vuelo, TipoClase.ECONOMICA, "11-2-21", "12-3-22", c1);
		c1.setTiquete(tiquete);
		System.out.println(c1);
		System.out.println(tiquete);
		System.out.println(aeronave1);
		System.out.println(aeronave2);
		System.out.println(aeronave3);

		Auxiliar auxiliar = new Auxiliar("123459","santiago", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar1 = new Auxiliar("456165","camila", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar2 = new Auxiliar("98762","juliana", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar3 = new Auxiliar("3315648","carlos", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar4 = new Auxiliar("56123","yeferson", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar5 = new Auxiliar("87166","francisco", "xxx", "persona@gmail.com","bachiller");
		Auxiliar auxiliar6 = new Auxiliar("45981","camilo", "xxx", "persona@gmail.com","bachiller");

		caribeAirlines.getListaAuxiliares().add(auxiliar1);
		caribeAirlines.getListaAuxiliares().add(auxiliar2);
		caribeAirlines.getListaAuxiliares().add(auxiliar3);
		caribeAirlines.getListaAuxiliares().add(auxiliar5);
		caribeAirlines.getListaAuxiliares().add(auxiliar4);
		caribeAirlines.getListaAuxiliares().add(auxiliar6);
		caribeAirlines.getListaAuxiliares().add(auxiliar);

		System.out.println(caribeAirlines.agregarCopiloto("5615615", "juan", "armenia", "juan@gmail.com", "aviacion"));


	/*	Set<Piloto> listaPilotos = new HashSet<Piloto>();
		Piloto piloto = new Piloto("10013698", "cristian", "osorio", "cris@gmail.com", "bachiller, aviacion en la universidad del quindio");
	//	caribeAirlines.getListaPilotos().add(piloto);
		Piloto piloto1 = new Piloto("11365897", "yeferson", "zuluaga", "zuluaga@gmail.com", "bachiller, aviacion , medico");
	//	caribeAirlines.getListaPilotos().add(piloto1);
		Piloto piloto2 = new Piloto("12447836", "juliana", "arias", "julianita@gmail.com", "bachiller, aviacion , ingeniera aeroespacial");
	//	caribeAirlines.getListaPilotos().add(piloto2);
		listaPilotos.add(piloto);
		listaPilotos.add(piloto1);
		listaPilotos.add(piloto2);
		caribeAirlines.setListaPilotos(listaPilotos);

		CoPiloto coPiloto = new CoPiloto("1687533", "juan uran", "armenia", "uran@gmail.com", "primaria");
		CoPiloto coPiloto2 = new CoPiloto("65789", "juan osorio", "armenia", "osorio@gmail.com", "primaria");
		CoPiloto coPiloto3 = new CoPiloto("987545", "santiago carmona", "armenia", "carmona@gmail.com", "primaria");
		caribeAirlines.getListaCoPilotos().add(coPiloto);
		caribeAirlines.getListaCoPilotos().add(coPiloto2);
		caribeAirlines.getListaCoPilotos().add(coPiloto3);

		Auxiliar auxiliar = new Auxiliar("456987", "sandra milena", "armenia", "milenita@gmail.com", "bachiller");
		Auxiliar auxiliar2 = new Auxiliar("9512357", "pedro acero", "armenia", "pedro@gmail.com", "bachiller");
		Auxiliar auxiliar3 = new Auxiliar("31210", "camilo torres", "armenia", "torres@gmail.com", "bachiller");
		caribeAirlines.getListaAuxiliares().add(auxiliar);
		caribeAirlines.getListaAuxiliares().add(auxiliar2);
		caribeAirlines.getListaAuxiliares().add(auxiliar3);
*/
		/*try {
		//	persistencia.guardarRecursoXMLRelojeria(caribeAirlines);
			caribeAirlines = persistencia.cargarRecursoXMLRelojeria();
			//caribeAirlines = (CaribeAirlines) ArchivoUtil.cargarRecursoXML("");
			caribeAirlines.getListaPilotos();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		try {
			persistencia.guardarRecursoXMLAerolinea(caribeAirlines);

			//caribeAirlines = persistencia.cargarRecursoXMLAerolinea();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


	public CaribeAirlines getCaribeAirlines() {
		return caribeAirlines;
	}

	public void setCaribeAirlines(CaribeAirlines caribeAirlines) {
		this.caribeAirlines = caribeAirlines;
	}

	public boolean comprarTiquete(Vuelo vuelo, TipoClase tipoClase, String fechaInicio,
			String fechaRegreso, Cliente cliente){

		return caribeAirlines.comprarTiquete(vuelo, tipoClase, fechaInicio, fechaRegreso, cliente);
	}
	public void asignarTripulacion( Piloto piloto, CoPiloto coPiloto, Set<Auxiliar> listaAuxiliares , Aeronave aeronave){
		caribeAirlines.asignarTripulacion( piloto, coPiloto, listaAuxiliares, aeronave);
	}

	public ArrayList<Vuelo> buscarVuelos(String fecha){
		return caribeAirlines.buscarVuelos(fecha);
	}
}