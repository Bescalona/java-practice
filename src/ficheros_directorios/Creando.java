package ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("C:/Users/Bastián/Desktop/Vaper"+File.separator+"newfile.txt");
		
		String archivo_destino = ruta.getAbsolutePath();
		
		//Crear directorio
		//ruta.mkdir();
		
		//Crear archivo
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Escribiendo accede_es = new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	}

}

class Escribiendo {
	
	public void escribir(String ruta_archivo) {
		
		String frase = "Esto es un ejemplo, ojala salga";
		
		try {
			FileWriter escritura = new FileWriter(ruta_archivo);
			
			for(int i=0; i<frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
