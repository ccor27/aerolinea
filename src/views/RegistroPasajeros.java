package views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class RegistroPasajeros extends Composite {
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public RegistroPasajeros(Composite parent, int style) {
		super(parent, style);

		Group grpDatosDelCliente = new Group(this, SWT.NONE);
		grpDatosDelCliente.setText("Datos cliente");
		grpDatosDelCliente.setBounds(10, 10, 668, 255);

		Label lblIdenrtificacion = new Label(grpDatosDelCliente, SWT.NONE);
		lblIdenrtificacion.setText("Identificacion");
		lblIdenrtificacion.setBounds(10, 47, 85, 15);

		Label lblNombre = new Label(grpDatosDelCliente, SWT.NONE);
		lblNombre.setText("Nombre");
		lblNombre.setBounds(10, 98, 55, 15);

		Label lblApellido = new Label(grpDatosDelCliente, SWT.NONE);
		lblApellido.setText("Apellido");
		lblApellido.setBounds(10, 153, 55, 15);

		Label lblDireccion = new Label(grpDatosDelCliente, SWT.NONE);
		lblDireccion.setText("Direccion");
		lblDireccion.setBounds(322, 98, 55, 15);

		Label lblCorreo = new Label(grpDatosDelCliente, SWT.NONE);
		lblCorreo.setText("Correo");
		lblCorreo.setBounds(322, 153, 55, 15);

		Label lblFechaNacimiento = new Label(grpDatosDelCliente, SWT.NONE);
		lblFechaNacimiento.setText("Fecha nacimiento");
		lblFechaNacimiento.setBounds(322, 47, 101, 15);

		text = new Text(grpDatosDelCliente, SWT.BORDER);
		text.setBounds(101, 47, 175, 21);

		text_1 = new Text(grpDatosDelCliente, SWT.BORDER);
		text_1.setBounds(101, 92, 175, 21);

		text_2 = new Text(grpDatosDelCliente, SWT.BORDER);
		text_2.setBounds(101, 147, 175, 21);

		text_3 = new Text(grpDatosDelCliente, SWT.BORDER);
		text_3.setBounds(429, 47, 175, 21);

		text_4 = new Text(grpDatosDelCliente, SWT.BORDER);
		text_4.setBounds(429, 92, 175, 21);

		text_5 = new Text(grpDatosDelCliente, SWT.BORDER);
		text_5.setBounds(429, 147, 175, 21);

		Button btnRegistrarPasajero = new Button(grpDatosDelCliente, SWT.NONE);
		btnRegistrarPasajero.setBounds(246, 197, 131, 25);
		btnRegistrarPasajero.setText("Registrar Pasajero");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
