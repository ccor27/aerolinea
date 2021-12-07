package views;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import model.Aeronave;
import model.TipoNave;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Button;

public class Asig {

	protected Shell panel;

	
	private Aeronave nave;
	private int[][] puestosEjecutivos;
	private int[][] puestosEconomicos;
	private int filasEco;
	private int colmEco;
	private int filasEje;
	private int colmEje;
	private Button[][] matrizPuestosEco;
	private Composite composite;
	private Button btnNewButton;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Asig window = new Asig();
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
		panel.open();
		panel.layout();
		while (!panel.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		panel = new Shell();
		panel.setSize(603, 406);
		panel.setText("SWT Application");
		
		composite = new Composite(panel, SWT.NONE);
		composite.setBounds(10, 10, 504, 336);
		
//		btnNewButton = new Button(composite, SWT.NONE);
//		btnNewButton.setBounds(67, 66, 75, 25);
//		btnNewButton.setText("New Button");

	}
	

	public Aeronave getNave() {
		return nave;
	}

	public void setNave(Aeronave nave) {
		this.nave = nave;
		crearPuestos();
		crearBotonesPuestos();
	}
	
	public void crearPuestos(){
	  
		if(nave.getTipoNave()==TipoNave.AIRBUS_A320){
			puestosEjecutivos= new int[6][6];
			puestosEconomicos= new int[23][6];
			filasEco=6;
			colmEco=6;
			filasEje=23;
			colmEje=6;
			matrizPuestosEco=new Button[filasEco][colmEco];
					
		}else{
			if(nave.getTipoNave()==TipoNave.AIRBUS_A330){
				puestosEjecutivos= new int[6][5];
				puestosEconomicos= new int[37][6];
				filasEco=6;
				colmEco=5;
				filasEje=37;
				colmEje=6;
			}else{
				puestosEjecutivos= new int[7][4];
				puestosEconomicos= new int[37][6];
				filasEco=7;
				colmEco=4;
				filasEje=37;
				colmEje=6;
			}
		}
	}
	
	public void crearBotonesPuestos(){

		int x=5;
		int y=10;
		for(int i=0;i<filasEco;i++){
			
			for(int j=0;j<colmEco;j++){
				
				matrizPuestosEco[i][j]= new Button(composite, SWT.NONE);
				matrizPuestosEco[i][j].setBounds(x,y,30,20);
				matrizPuestosEco[i][j].setText("silla");
				x+=26;
				
			}
			x=5;
			y+=16;
		}
	}
}
