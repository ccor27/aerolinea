package app;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.widgets.Display;

import views.CaribeAirlinesView;



public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				Display display = Display.getDefault();
				Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
					public void run() {
						try {

							CaribeAirlinesView caribeAirlinesView = new CaribeAirlinesView();
							caribeAirlinesView.open();

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});

	}

}
