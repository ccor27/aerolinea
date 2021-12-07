package views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Composite;

public class CaribeAirlinesView {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CaribeAirlinesView window = new CaribeAirlinesView();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(733, 549);
		shell.setText("SWT Application");

		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		tabFolder.setBounds(10, 10, 697, 496);

		TabItem tbtmGestionDeTripulacion = new TabItem(tabFolder, SWT.NONE);
		tbtmGestionDeTripulacion.setText("Gestion De Tripulacion");

		Composite composite = new GestionDeTripulacion(tabFolder, SWT.NONE);
		tbtmGestionDeTripulacion.setControl(composite);

		TabItem tbtmCompraDeTiquete = new TabItem(tabFolder, SWT.NONE);
		tbtmCompraDeTiquete.setText("Compra de Tiquete");

		Composite compositeTiquete = new CompraTiquete(tabFolder, SWT.NONE);
		tbtmCompraDeTiquete.setControl(compositeTiquete);

		TabItem tbtmRegistroPasajeros = new TabItem(tabFolder, SWT.NONE);
		tbtmRegistroPasajeros.setText("Registro Pasajeros");

		Composite registroPasajeros = new RegistroPasajeros(tabFolder, SWT.NONE);
		tbtmRegistroPasajeros.setControl(registroPasajeros);

	}
}
