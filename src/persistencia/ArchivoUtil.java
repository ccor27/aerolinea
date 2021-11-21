package persistencia;



import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.imageio.stream.FileImageInputStream;

public class ArchivoUtil {

	public static void guardarArchivo(String rutaArchivo, String contenido, boolean flagSobreEscribir) throws IOException{

		FileWriter fw = new FileWriter(rutaArchivo,flagSobreEscribir);
		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write(contenido);
		bfw.close();
		fw.close();
	}

	public static ArrayList<String> leerArchivo(String rutaArchivo) throws IOException{

		ArrayList<String> contenido = new ArrayList<>();
		FileReader fr = new FileReader(rutaArchivo);
		BufferedReader br = new BufferedReader(fr);

		String linea = "";

		while ((linea = br.readLine())!= null) {
			contenido.add(linea);

		}
		br.close();

		return contenido;
	}
	public static void guardarRegistroLog (String rutaArchivo, int nivel, String mensajeLog, String accion)
	{
		String log = "";
		Logger LOGGER = Logger.getLogger(accion);
		FileHandler fileHandler =  null;
		try {
			fileHandler = new FileHandler(rutaArchivo,true);
			fileHandler.setFormatter(new SimpleFormatter());
			LOGGER.addHandler(fileHandler);
			switch (nivel) {
			case 1:
				LOGGER.log(Level.INFO,accion+","+mensajeLog) ;
//				LOGGER.log(Level.INFO,accion+","+mensajeLog+","+fechaSistema) ;
				break;
			case 2:
				LOGGER.log(Level.WARNING,accion+","+mensajeLog) ;
//				LOGGER.log(Level.WARNING,accion+","+mensajeLog+","+fechaSistema) ;
				break;
			case 3:
				LOGGER.log(Level.SEVERE,accion+","+mensajeLog) ;
//				LOGGER.log(Level.SEVERE,accion+","+mensajeLog+","+fechaSistema) ;
				break;
			default:
				break;
			}
		} catch (SecurityException e) {
			LOGGER.log(Level.SEVERE,e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			LOGGER.log(Level.SEVERE,e.getMessage());
			e.printStackTrace();
		}
		finally {
			fileHandler.close();
		}
	}

	public static void salvarRecursoSerializadoXML(String rutaArchivo, Object objeto) throws IOException {

        XMLEncoder codificadorXML;

        codificadorXML = new XMLEncoder(new FileOutputStream(rutaArchivo));
        codificadorXML.writeObject(objeto);
        codificadorXML.close();

    }

	// SERIALIZA EL OBJETO
	public static void guardarRecursoBinario(String rutaArchivo, Object object) throws Exception {

		ObjectOutputStream oss = null;
		try {
			oss = new ObjectOutputStream(new FileOutputStream(rutaArchivo));
			oss.writeObject(object);
		}catch ( Exception e){
			throw e;
		}finally {
			if(oss != null)
				oss.close();
		}
	}

	// DESERIALIZAR EL OBJETO
	public static Object cargarRecursoBinario(String rutaArchivo) throws Exception{
		Object aux = null;

		ObjectInputStream ois = null;

		try{
			ois = new ObjectInputStream(new FileInputStream(rutaArchivo));

			aux = ois.readObject();

		}catch (Exception e2){
			throw e2;
		}finally {
			if (ois != null)
				ois.close();
		}
		return aux;
	}

	public static void guardarRecursoXML(String rutaArchivo, Object object) throws Exception {

		XMLEncoder codificadorXML;

		codificadorXML= new XMLEncoder(new FileOutputStream(rutaArchivo));
		codificadorXML.writeObject(object);
		codificadorXML.close();
	}

	public static Object cargarRecursoXML(String rutaArchivo) throws Exception {

		XMLDecoder decodificadorXML;
		Object objetoXMLP;

		decodificadorXML = new XMLDecoder(new FileInputStream(rutaArchivo));
		objetoXMLP = decodificadorXML.readObject();
		decodificadorXML.close();
		return objetoXMLP;

	}

}
