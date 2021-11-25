package views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CompraTiquete extends Composite {
	private Text txtId;
	private Text txtNombre;
	private Text txtApellido;
	private Text txtNacimiento;
	private Text txtDireccion;
	private Text txtCorreo;
	private Text txtNumPasajeros;
	private Text txtinicio;
	private Text txtRegreso;

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
		cmbxTipoVuelo.setBounds(132, 42, 142, 23);
		
		Label lblNewLabel = new Label(grpDatosDelVuelo, SWT.NONE);
		lblNewLabel.setBounds(10, 105, 105, 15);
		lblNewLabel.setText("Seleccione la clase");
		
		ComboViewer comboViewer_1 = new ComboViewer(grpDatosDelVuelo, SWT.NONE);
		Combo cmbxTipoClase = comboViewer_1.getCombo();
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
		
		Button btnEmpezar = new Button(grpDatosDelVuelo, SWT.NONE);
		btnEmpezar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				obtenerFechas();
			}
		});
		btnEmpezar.setBounds(411, 168, 75, 25);
		btnEmpezar.setText("Empezar");
		
		txtinicio = new Text(grpDatosDelVuelo, SWT.BORDER);
		txtinicio.setBounds(434, 42, 142, 21);
		
		txtRegreso = new Text(grpDatosDelVuelo, SWT.BORDER);
		txtRegreso.setBounds(437, 99, 142, 21);
		
		Group grpDatosDelCliente = new Group(this, SWT.NONE);
		grpDatosDelCliente.setText("Datos cliente");
		grpDatosDelCliente.setBounds(20, 237, 623, 255);
		
		Label lblIdenrtificacion = new Label(grpDatosDelCliente, SWT.NONE);
		lblIdenrtificacion.setBounds(10, 47, 85, 15);
		lblIdenrtificacion.setText("Identificacion");
		
		Label lblNombre = new Label(grpDatosDelCliente, SWT.NONE);
		lblNombre.setBounds(10, 98, 55, 15);
		lblNombre.setText("Nombre");
		
		Label lblApellido = new Label(grpDatosDelCliente, SWT.NONE);
		lblApellido.setBounds(10, 153, 55, 15);
		lblApellido.setText("Apellido");
		
		Label lblDireccion = new Label(grpDatosDelCliente, SWT.NONE);
		lblDireccion.setBounds(322, 98, 55, 15);
		lblDireccion.setText("Direccion");
		
		Label lblCorreo = new Label(grpDatosDelCliente, SWT.NONE);
		lblCorreo.setBounds(322, 153, 55, 15);
		lblCorreo.setText("Correo");
		
		Label lblFechaNacimiento = new Label(grpDatosDelCliente, SWT.NONE);
		lblFechaNacimiento.setBounds(322, 47, 101, 15);
		lblFechaNacimiento.setText("Fecha nacimiento");
		
		txtId = new Text(grpDatosDelCliente, SWT.BORDER);
		txtId.setBounds(101, 47, 175, 21);
		
		txtNombre = new Text(grpDatosDelCliente, SWT.BORDER);
		txtNombre.setBounds(101, 92, 175, 21);
		
		txtApellido = new Text(grpDatosDelCliente, SWT.BORDER);
		txtApellido.setBounds(101, 147, 175, 21);
		
		txtNacimiento = new Text(grpDatosDelCliente, SWT.BORDER);
		txtNacimiento.setBounds(429, 47, 175, 21);
		
		txtDireccion = new Text(grpDatosDelCliente, SWT.BORDER);
		txtDireccion.setBounds(429, 92, 175, 21);
		
		txtCorreo = new Text(grpDatosDelCliente, SWT.BORDER);
		txtCorreo.setBounds(429, 147, 175, 21);
		
		Button btnComprar = new Button(grpDatosDelCliente, SWT.NONE);
		btnComprar.setBounds(279, 208, 75, 25);
		btnComprar.setText("Comprar");

	}
	//25-10-2021
	public void obtenerFechas(){
		
		System.out.println(txtinicio.getText());
		System.out.println(txtRegreso.getText());

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
