package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("C:/Users/Basti�n/Desktop/Vaper"+File.separator+"newfile.txt");
		
		ruta.delete();
	}

}
