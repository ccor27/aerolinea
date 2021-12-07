package views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;

import controller.GestionDeTripulacionController;
import model.Auxiliar;
import model.CaribeAirlines;
import model.CoPiloto;
import model.Persona;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.viewers.TableViewerColumn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.jface.databinding.viewers.ObservableSetContentProvider;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.beans.PojoObservables;
import model.Piloto;
import model.Tripulantes;

import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import model.Aeronave;
import org.eclipse.core.databinding.observable.list.IObservableList;

public class GestionDeTripulacion extends Composite {
	private DataBindingContext m_bindingContext;

	GestionDeTripulacionController gestionDeTripulacioncontroller = new GestionDeTripulacionController();
	CaribeAirlines cariberAirlines = gestionDeTripulacioncontroller.getCaribeAirlines();
	private Table table;
	private Table table_1;
	private Table table_2;
	private Table table_3;
	private TableViewer tableViewer;
	private Set<Persona> listaTripulantes = new HashSet<>();
	private Piloto pilotoSeleccionado;
	private CoPiloto coPilotoSeleccionado;
	private Auxiliar auxiliarSeleccionado;
	private Aeronave aeronaveSeleccionada;
	private Set<Auxiliar> listaAuxiliares = new HashSet<>();
	private TableViewer tableViewer_1;
	private TableViewer tableViewer_2;
	private ComboViewer comboViewer;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GestionDeTripulacion(Composite parent, int style) {
		super(parent, style);

		Group grpPilotos = new Group(this, SWT.NONE);
		grpPilotos.setText("Pilotos");
		grpPilotos.setBounds(30, 62, 189, 160);

		tableViewer = new TableViewer(grpPilotos, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setBounds(10, 20, 169, 130);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNombre = tableViewerColumn.getColumn();
		tblclmnNombre.setWidth(165);
		tblclmnNombre.setText("Nombre");

		Group grpCopilotos = new Group(this, SWT.NONE);
		grpCopilotos.setText("CoPilotos");
		grpCopilotos.setBounds(243, 62, 189, 160);

		tableViewer_1 = new TableViewer(grpCopilotos, SWT.BORDER | SWT.FULL_SELECTION);
		table_1 = tableViewer_1.getTable();
		table_1.setLinesVisible(true);
		table_1.setHeaderVisible(true);
		table_1.setBounds(10, 22, 169, 128);

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer_1, SWT.NONE);
		TableColumn tblclmnNombre_2 = tableViewerColumn_3.getColumn();
		tblclmnNombre_2.setWidth(164);
		tblclmnNombre_2.setText("Nombre");

		Group grpAuxiliares = new Group(this, SWT.NONE);
		grpAuxiliares.setText("Auxiliares");
		grpAuxiliares.setBounds(457, 62, 189, 160);

		tableViewer_2 = new TableViewer(grpAuxiliares, SWT.BORDER | SWT.FULL_SELECTION);
		table_2 = tableViewer_2.getTable();
		table_2.setLinesVisible(true);
		table_2.setHeaderVisible(true);
		table_2.setBounds(10, 24, 157, 126);

		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer_2, SWT.NONE);
		TableColumn tblclmnNombre_3 = tableViewerColumn_4.getColumn();
		tblclmnNombre_3.setWidth(135);
		tblclmnNombre_3.setText("Nombre");

		Button btnAgregarPiloto = new Button(this, SWT.NONE);
		btnAgregarPiloto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				pilotoSeleccionado = (Piloto)table.getItem(table.getSelectionIndex()).getData();
				boolean pilotoExistente = false;
				if(pilotoSeleccionado != null ){

					for (Persona persona : listaTripulantes) {

						if(persona.getClass() == Piloto.class){
							pilotoExistente = true;
						}

					}

					if(pilotoExistente == false){
					listaTripulantes.add(pilotoSeleccionado);
					pilotoSeleccionado = null;
					llenarTablaDetalle();
					}else{
						JOptionPane.showMessageDialog(null, "Ya existe un Piloto en la tripulacion");
					}
				}
			}
		});
		btnAgregarPiloto.setBounds(75, 237, 97, 25);
		btnAgregarPiloto.setText("Agregar Piloto");

		Button btnAgregarCopiloto = new Button(this, SWT.NONE);
		btnAgregarCopiloto.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				coPilotoSeleccionado = (CoPiloto)table_1.getItem(table_1.getSelectionIndex()).getData();
				boolean coPilotoExistente = false;
				if(coPilotoSeleccionado != null){

					for (Persona persona : listaTripulantes) {

						if(persona.getClass() == CoPiloto.class){
							coPilotoExistente = true;
						}

					}

					if(coPilotoExistente ==  false){
					listaTripulantes.add(coPilotoSeleccionado);
					coPilotoSeleccionado = null;
					llenarTablaDetalle();
					}else{
						JOptionPane.showMessageDialog(null, "Ya existe un CoPiloto");
					}
				}
			}
		});
		btnAgregarCopiloto.setBounds(279, 237, 111, 25);
		btnAgregarCopiloto.setText("Agregar CoPiloto");

		Button btnAgregarAuxiliar = new Button(this, SWT.NONE);
		btnAgregarAuxiliar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				auxiliarSeleccionado = (Auxiliar)table_2.getItem(table_2.getSelectionIndex()).getData();

				if(auxiliarSeleccionado != null){
					listaTripulantes.add(auxiliarSeleccionado);
					listaAuxiliares.add(auxiliarSeleccionado);
					auxiliarSeleccionado = null;
					llenarTablaDetalle();
					System.out.println("agrego auxiliar");
				}
			}
		});
		btnAgregarAuxiliar.setBounds(503, 237, 111, 25);
		btnAgregarAuxiliar.setText("Agregar Auxiliar");

		Group grpTripulacion = new Group(this, SWT.NONE);
		grpTripulacion.setText("Tripulacion");
		grpTripulacion.setBounds(30, 281, 628, 150);

		TableViewer tableViewer_3 = new TableViewer(grpTripulacion, SWT.BORDER | SWT.FULL_SELECTION);
		table_3 = tableViewer_3.getTable();
		table_3.setLinesVisible(true);
		table_3.setHeaderVisible(true);
		table_3.setBounds(10, 22, 496, 118);

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer_3, SWT.NONE);
		TableColumn tblclmnNombre_1 = tableViewerColumn_1.getColumn();
		tblclmnNombre_1.setWidth(136);
		tblclmnNombre_1.setText("Nombre");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer_3, SWT.NONE);
		TableColumn tblclmnIdentificacion = tableViewerColumn_2.getColumn();
		tblclmnIdentificacion.setWidth(163);
		tblclmnIdentificacion.setText("Identificacion");

		TableViewerColumn tableViewerColumn_5 = new TableViewerColumn(tableViewer_3, SWT.NONE);
		TableColumn tblclmnCorreo = tableViewerColumn_5.getColumn();
		tblclmnCorreo.setWidth(189);
		tblclmnCorreo.setText("Correo");

		Button btnEliminarTripulante = new Button(grpTripulacion, SWT.NONE);
		btnEliminarTripulante.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				int posicionEliminar = table_3.getSelectionIndex();

				if(posicionEliminar >=0){
					System.out.println(posicionEliminar);
					listaTripulantes.remove(posicionEliminar);
					System.out.println("elimino");
					table_3.removeAll();
				}
				llenarTablaDetalle();
			}
		});
		btnEliminarTripulante.setBounds(512, 65, 110, 25);
		btnEliminarTripulante.setText("Eliminar Tripulante");

		Button btnAsignarTripulacion = new Button(this, SWT.NONE);
		btnAsignarTripulacion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Piloto piloto = null;
				CoPiloto coPiloto = null;
				Set<Auxiliar> listaAuxiliar = new HashSet<>();

				for (Persona persona : listaTripulantes) {

					if(persona != null && piloto == null && persona.getClass() == Piloto.class ){
						piloto = (Piloto) persona;
					}else{

					};
					if(persona != null && coPiloto == null && persona.getClass() == CoPiloto.class){
						coPiloto = (CoPiloto) persona;
					}if(persona != null && persona.getClass() == Auxiliar.class){
						listaAuxiliar.add((Auxiliar) persona);
					}
				}
				gestionDeTripulacioncontroller.asignarTripulacion(piloto, coPiloto, listaAuxiliar, aeronaveSeleccionada);
				table_3.removeAll();

			}
		});
		btnAsignarTripulacion.setBounds(237, 444, 173, 25);
		btnAsignarTripulacion.setText("Asignar Tripulacion");

		comboViewer = new ComboViewer(this, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				IStructuredSelection iStructuredSelection = comboViewer.getStructuredSelection();
				Object firsElement = iStructuredSelection.getFirstElement();
				aeronaveSeleccionada = (Aeronave) firsElement;
			}
		});
		combo.setBounds(258, 21, 229, 23);

		Label lblAeronave = new Label(this, SWT.NONE);
		lblAeronave.setBounds(100, 24, 152, 25);
		lblAeronave.setText("Codigo De La Aeronave :");
		m_bindingContext = initDataBindings();

	}

	public void llenarTablaDetalle(){

		table_3.removeAll();

		for (Persona persona : listaTripulantes) {

			TableItem item1 = new TableItem(table_3, SWT.NONE);
			item1.setText(new String[] {persona.getNombre() , persona.getIdentificacion() , persona.getCorreoElectronico()});
		}
		}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}


	public Set<Persona> getListaTripulantes() {
		return listaTripulantes;
	}

	public void setListaTripulantes(Set<Persona> listaTripulantes) {
		this.listaTripulantes = listaTripulantes;
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		ObservableSetContentProvider setContentProvider = new ObservableSetContentProvider();
		IObservableMap observeMap = PojoObservables.observeMap(setContentProvider.getKnownElements(), Piloto.class, "nombre");
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap));
		tableViewer.setContentProvider(setContentProvider);
		//
		IObservableSet listaPilotosCariberAirlinesObserveSet = PojoProperties.set("listaPilotos").observe(cariberAirlines);
		tableViewer.setInput(listaPilotosCariberAirlinesObserveSet);
		//
		ObservableSetContentProvider setContentProvider_1 = new ObservableSetContentProvider();
		IObservableMap observeMap_1 = PojoObservables.observeMap(setContentProvider_1.getKnownElements(), CoPiloto.class, "nombre");
		tableViewer_1.setLabelProvider(new ObservableMapLabelProvider(observeMap_1));
		tableViewer_1.setContentProvider(setContentProvider_1);
		//
		IObservableSet listaCoPilotosCariberAirlinesObserveSet = PojoProperties.set("listaCoPilotos").observe(cariberAirlines);
		tableViewer_1.setInput(listaCoPilotosCariberAirlinesObserveSet);
		//
		ObservableSetContentProvider setContentProvider_2 = new ObservableSetContentProvider();
		IObservableMap observeMap_2 = PojoObservables.observeMap(setContentProvider_2.getKnownElements(), Auxiliar.class, "nombre");
		tableViewer_2.setLabelProvider(new ObservableMapLabelProvider(observeMap_2));
		tableViewer_2.setContentProvider(setContentProvider_2);
		//
		IObservableSet listaAuxiliaresCariberAirlinesObserveSet = PojoProperties.set("listaAuxiliares").observe(cariberAirlines);
		tableViewer_2.setInput(listaAuxiliaresCariberAirlinesObserveSet);
		//
		ObservableListContentProvider listContentProvider = new ObservableListContentProvider();
		IObservableMap observeMap_3 = PojoObservables.observeMap(listContentProvider.getKnownElements(), Aeronave.class, "codigo");
		comboViewer.setLabelProvider(new ObservableMapLabelProvider(observeMap_3));
		comboViewer.setContentProvider(listContentProvider);
		//
		IObservableList listaAeronavesCariberAirlinesObserveList = PojoProperties.list("listaAeronaves").observe(cariberAirlines);
		comboViewer.setInput(listaAeronavesCariberAirlinesObserveList);
		//
		return bindingContext;
	}
}
