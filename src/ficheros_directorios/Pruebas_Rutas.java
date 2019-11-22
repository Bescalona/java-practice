package ficheros_directorios;

import java.io.File;

public class Pruebas_Rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File("ejemplo_archivo");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());
	}

}
