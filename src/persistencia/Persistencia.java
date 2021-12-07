package persistencia;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import model.CaribeAirlines;




public class Persistencia {

	// RUTAS DE LOS ARCHIVOS

	public static final String RUTA_ARCHIVO_MODELO_XML = "src\\persistencia\\model.xml";


	public static void guardarRecursoXMLAerolinea(CaribeAirlines caribeAirlines) throws Exception {

		ArchivoUtil.guardarRecursoXML(RUTA_ARCHIVO_MODELO_XML, caribeAirlines);

	}

	public static CaribeAirlines cargarRecursoXMLAerolinea() throws Exception {

		Object object = null;
		CaribeAirlines caribeAirlines = null;

		object = ArchivoUtil.cargarRecursoXML(RUTA_ARCHIVO_MODELO_XML);

		caribeAirlines = (CaribeAirlines) object;
		return caribeAirlines;
	}

	}



