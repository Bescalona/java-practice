package programacion_generica;

import java.io.File;

public class UsoArrayList {

	public static void main(String[] args) {

		ArrayList archivos = new ArrayList(5);
		
		archivos.add("bastian");
		archivos.add("maria");
		archivos.add("pepe");
		archivos.add("jose");
		archivos.add(new File("prueba.txt"));
		
		String nombrePersona = (String)archivos.get(4);
		
		System.out.println(nombrePersona);
	}

}
