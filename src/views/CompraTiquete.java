package views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.Style;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;

import controller.CompraDeTiqueteController;
import controller.GestionDeTripulacionController;
import model.Aeronave;
import model.CaribeAirlines;
import model.Persona;
import model.Vuelo;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.internal.ole.win32.COMObject;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.viewers.TableViewerColumn;

public class CompraTiquete extends Composite {

	CompraDeTiqueteController compraDeTiqueteController = new CompraDeTiqueteController();
	CaribeAirlines cariberAirlines = compraDeTiqueteController.getCaribeAirlines();
	private Text txtNumPasajeros;
	private Text txtinicio;
	private Text txtRegreso;
	private Table tblVuelos;
	private ArrayList<Vuelo> vuelosDisponibles = new ArrayList<Vuelo>();
	

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CompraTiquete(Composite parent, int style) {
		super(parent, style);

		Group grpDatosDelVuelo = new Group(this, SWT.NONE);
		grpDatosDelVuelo.setText("Datos del vuelo");
		grpDatosDelVuelo.setBounds(20, 10, 623, 221);

		Label lblSelecioneElVuelo = new Label(grpDatosDelVuelo, SWT.NONE);
		lblSelecioneElVuelo.setBounds(10, 45, 105, 15);
		lblSelecioneElVuelo.setText("Selecione el vuelo");

		ComboViewer comboViewer = new ComboViewer(grpDatosDelVuelo, SWT.NONE);
		Combo cmbxTipoVuelo = comboViewer.getCombo();
		comboViewer.add("IDA");
		comboViewer.add("IDA Y VUELTA");
		cmbxTipoVuelo.setBounds(132, 42, 142, 23);

		Label lblNewLabel = new Label(grpDatosDelVuelo, SWT.NONE);
		lblNewLabel.setBounds(10, 105, 105, 15);
		lblNewLabel.setText("Seleccione la clase");

		ComboViewer comboViewer_1 = new ComboViewer(grpDatosDelVuelo, SWT.NONE);
		Combo cmbxTipoClase = comboViewer_1.getCombo();
		comboViewer_1.add("ECONOMICA");
		comboViewer_1.add("EJECUTIVA");
		cmbxTipoClase.setBounds(132, 102, 142, 23);

		Label lblFechaInicio = new Label(grpDatosDelVuelo, SWT.NONE);
		lblFechaInicio.setBounds(353, 43, 75, 15);
		lblFechaInicio.setText("Fecha inicio");

		Label lblFechaRegreso = new Label(grpDatosDelVuelo, SWT.NONE);
		lblFechaRegreso.setBounds(353, 103, 75, 15);
		lblFechaRegreso.setText("Fecha regreso");

		Label lblNumeroDePasajeros = new Label(grpDatosDelVuelo, SWT.NONE);
		lblNumeroDePasajeros.setBounds(10, 173, 119, 15);
		lblNumeroDePasajeros.setText("Numero de pasajeros");

		txtNumPasajeros = new Text(grpDatosDelVuelo, SWT.BORDER);
		txtNumPasajeros.setBounds(132, 170, 142, 21);

		txtinicio = new Text(grpDatosDelVuelo, SWT.BORDER);
		txtinicio.setBounds(434, 42, 142, 21);

		txtRegreso = new Text(grpDatosDelVuelo, SWT.BORDER);
		txtRegreso.setBounds(437, 99, 142, 21);

		Button btnBuscarVuelos = new Button(grpDatosDelVuelo, SWT.NONE);
		btnBuscarVuelos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				if(txtinicio != null){
					vuelosDisponibles = compraDeTiqueteController.buscarVuelos(txtinicio.getText());
					System.out.println(vuelosDisponibles);
					llenarTablaVuelos();
				}
			}
		});
		btnBuscarVuelos.setBounds(404, 163, 105, 25);
		btnBuscarVuelos.setText("Buscar Vuelos");

		Group grpVuelos = new Group(this, SWT.NONE);
		grpVuelos.setText("Vuelos");
		grpVuelos.setBounds(26, 246, 617, 190);

		TableViewer tableViewer = new TableViewer(grpVuelos, SWT.BORDER | SWT.FULL_SELECTION);
		tblVuelos = tableViewer.getTable();
		tblVuelos.setLinesVisible(true);
		tblVuelos.setHeaderVisible(true);
		tblVuelos.setBounds(10, 24, 597, 109);

		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnOrigen = tableViewerColumn.getColumn();
		tblclmnOrigen.setWidth(132);
		tblclmnOrigen.setText("Origen");

		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnDestino = tableViewerColumn_1.getColumn();
		tblclmnDestino.setWidth(110);
		tblclmnDestino.setText("Destino");

		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnHoraSalida = tableViewerColumn_2.getColumn();
		tblclmnHoraSalida.setWidth(125);
		tblclmnHoraSalida.setText("Hora Salida");

		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnFecha = tableViewerColumn_3.getColumn();
		tblclmnFecha.setWidth(109);
		tblclmnFecha.setText("Fecha");

		TableViewerColumn tableViewerColumn_4 = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnAvion = tableViewerColumn_4.getColumn();
		tblclmnAvion.setWidth(114);
		tblclmnAvion.setText("Avion");

		Button btnSeleccionarPuestos = new Button(grpVuelos, SWT.NONE);
		btnSeleccionarPuestos.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//sfdf
				int num = tblVuelos.getSelectionIndex();
				Vuelo vuelo = vuelosDisponibles.get(num);
			    Asig a = new Asig();
			    a.setNave(vuelo.getNave());
			    a.open();
			    
			}
		});
		btnSeleccionarPuestos.setBounds(251, 151, 128, 25);
		btnSeleccionarPuestos.setText("Seleccionar Puestos");

		Button btnRegistrarPasajeros = new Button(this, SWT.NONE);
		btnRegistrarPasajeros.setBounds(202, 442, 277, 25);
		btnRegistrarPasajeros.setText("Registrar Pasajeros");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public void llenarTablaVuelos(){
		tblVuelos.removeAll();

		for (Vuelo vuelo: vuelosDisponibles) {

			TableItem item1 = new TableItem(tblVuelos, SWT.NONE);
			item1.setText(new String[] {vuelo.getRuta().getOrigen(), vuelo.getRuta().getDestino(), vuelo.getFechaSalida(),
					vuelo.getFechaSalida(),vuelo.getNave().getTipoNave().toString()});
		}

	}
}
