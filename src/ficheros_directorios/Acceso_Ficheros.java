package ficheros_directorios;

import java.io.File;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("C:/Users/Bastián/Desktop/Vaper");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombres = ruta.list();
		
		for(String nombre : nombres) {
			System.out.println(nombre);
			
			File f = new File(ruta.getAbsoluteFile(), nombre);
			
			if(f.isDirectory()) {
				String[] archivos_subcarpeta = f.list();
				
				for(String archivo:archivos_subcarpeta) {
					System.out.println(archivo);
				}
			}
		}
	}
}
