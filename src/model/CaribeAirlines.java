package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class CaribeAirlines {

	private Set<Piloto> listaPilotos;
	private Set<CoPiloto> listaCoPilotos;
	private Set<Auxiliar> listaAuxiliares;
	private ArrayList<Cliente> listaClientes;




	// Constructores

	public CaribeAirlines() {
		super();
		this.listaCoPilotos = new TreeSet<>(new ComparationPiloto());
		this.listaPilotos = new TreeSet<Piloto>(new ComparationPiloto());
		this.listaAuxiliares = new TreeSet<>(new ComparationPiloto());
		this.listaClientes = new ArrayList<>();

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
			Cliente cliente = new Cliente(identificacion, nombre, direccion, correoElectronico, apellido, direccionResidencia, tarjeta, equipaje, tiquete);
			listaClientes.add(cliente);
			return true;//se creo y agrego el cliente
		}else{
			return false;//el cliente ya existe
		}

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

}