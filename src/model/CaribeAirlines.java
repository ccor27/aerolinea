package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class CaribeAirlines {

	private static final long serialVersionUID = 1L;

	private Set<Piloto> listaPilotos;
	private Set<CoPiloto> listaCoPilotos;
	private Set<Auxiliar> listaAuxiliares;
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Aeronave> listaAeronaves;
    private Set<Tripulantes> listaTripulacion;
    private ArrayList<Vuelo>listaVuelos;



	// Constructores



	public CaribeAirlines() {
		super();
		this.listaCoPilotos = new TreeSet<>(new ComparationPiloto());
		this.listaPilotos = new TreeSet<Piloto>(new ComparationPiloto());
		this.listaAuxiliares = new TreeSet<>(new ComparationPiloto());
		this.listaClientes = new ArrayList<>();
		this.listaAeronaves = new ArrayList<>();
		this.listaTripulacion = new TreeSet<>();
		this.listaVuelos = new ArrayList<>();
	}


	// CRUD
	public boolean agregarPiloto(String identificacion, String nombre, String direccion, String correoElectronico,
			String estudiosRealizados){

		Piloto piloto = new Piloto(identificacion, nombre, direccion, correoElectronico, estudiosRealizados);
	    return listaPilotos.add(piloto);

	}

	public boolean agregarCopiloto(String identificacion, String nombre, String direccion, String correoElectronico,
			String estudiosRealizados){

		CoPiloto coPiloto = new CoPiloto(identificacion, nombre, direccion, correoElectronico, estudiosRealizados);
		return listaCoPilotos.add(coPiloto);
	}

	public boolean agregarAuxiliares(String identificacion, String nombre, String direccion, String correoElectronico,
			String estudiosRealizados){

		Auxiliar auxiliar = new Auxiliar(identificacion, nombre, direccion, correoElectronico, estudiosRealizados);
		return listaAuxiliares.add(auxiliar);
	}
	public boolean agregarCLiente(String identificacion, String nombre, String direccion, String correoElectronico, String apellido,
			String direccionResidencia, Tarjeta tarjeta, Equipaje equipaje, Tiquete tiquete){

		if(verificarCliente(nombre)==false){
			Cliente cliente = new Cliente(identificacion, nombre, direccion, correoElectronico, apellido, direccionResidencia, tarjeta, equipaje);
			listaClientes.add(cliente);
			return true;//se creo y agrego el cliente
		}else{
			return false;//el cliente ya existe
		}

	}

	public ArrayList<Vuelo> buscarVuelos(String fecha){

		ArrayList<Vuelo> listaVuelosDisponibles = new ArrayList<>();

		for (int i = 0; i < listaVuelos.size(); i++) {
			if(listaVuelos.get(i).getFechaSalida().equals(fecha)){
				listaVuelosDisponibles.add(listaVuelos.get(i));
			}
		}

		return listaVuelosDisponibles;
	}

	public void asignarTripulacion( Piloto piloto, CoPiloto coPiloto, Set<Auxiliar> listaAuxiliares , Aeronave aeronave){

		System.out.println(piloto.toString());
		System.out.println(coPiloto.toString());
		System.out.println(listaAuxiliares);
		System.out.println(listaAeronaves);
		int posicionAeronave = buscarAeronave(aeronave.getCodigo());

		Tripulantes tripulantes = new Tripulantes(piloto, coPiloto, listaAuxiliares);
		if(posicionAeronave >=0 ){

		//	listaTripulacion.add(tripulantes);
			listaAeronaves.get(posicionAeronave).setTripulantes(tripulantes);
			System.out.println(listaAeronaves.get(posicionAeronave).getTripulantes());
			JOptionPane.showMessageDialog(null, "Se asigno exitosamente");

		}
	}

	public int buscarAeronave(String codigo){

		int posicion = -1;

		for (int i = 0; i < listaAeronaves.size(); i++) {

			if(listaAeronaves.get(i).getCodigo().equals(codigo)){
				posicion=i;
			}
		}

		return posicion;
	}

	public boolean comprarTiquete(Vuelo vuelo, TipoClase tipoClase, String fechaInicio,
			String fechaRegreso, Cliente cliente){
		Tiquete t = new Tiquete(vuelo, tipoClase, fechaInicio, fechaRegreso, cliente);

		return true;
	}

	/**
	 * metodo para verificar la existencia de un cliente
	 * @param nombre
	 * @return
	 */
	public boolean verificarCliente(String nombre){

		boolean centinela = false;
		for (Cliente cliente : listaClientes) {
			if(cliente.getNombre().equalsIgnoreCase(nombre)){
				centinela = true;
				break;
			}
		}
		return centinela;
	}

	// Get y Set


	public Set<Auxiliar> getListaAuxiliares() {
		return listaAuxiliares;
	}

	public Set<Piloto> getListaPilotos() {
		return listaPilotos;
	}


	public void setListaPilotos(Set<Piloto> listaPilotos) {
		this.listaPilotos = listaPilotos;
	}


	public Set<CoPiloto> getListaCoPilotos() {
		return listaCoPilotos;
	}


	public void setListaCoPilotos(Set<CoPiloto> listaCoPilotos) {
		this.listaCoPilotos = listaCoPilotos;
	}


	public void setListaAuxiliares(Set<Auxiliar> listaAuxiliares) {
		this.listaAuxiliares = listaAuxiliares;
	}

	public ArrayList<Aeronave> getListaAeronaves() {
		return listaAeronaves;
	}

	public void setListaAeronaves(ArrayList<Aeronave> listaAeronaves) {
		this.listaAeronaves = listaAeronaves;
	}


	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	public Set<Tripulantes> getListaTripulacion() {
		return listaTripulacion;
	}


	public void setListaTripulacion(Set<Tripulantes> listaTripulacion) {
		this.listaTripulacion = listaTripulacion;
	}


	public ArrayList<Vuelo> getListaVuelos() {
		return listaVuelos;
	}


	public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
