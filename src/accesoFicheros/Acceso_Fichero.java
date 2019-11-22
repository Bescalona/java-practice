package accesoFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {

		Leer_Fichero accediendo = new Leer_Fichero();
		accediendo.lee();

	}

}

class Leer_Fichero {

	public void lee() {

		try {
			FileReader entrada = new FileReader("C:/Users/Bastian/Desktop/streams.txt");
			BufferedReader mibuffer = new BufferedReader(entrada);
			// int c = entrada.read();
			String linea = "";
			// while (c != -1) {
			while (linea != null) {

				linea = mibuffer.readLine();
				// casteando el unicode
				/* char letra = (char) c; */
				if (linea != null) {
					System.out.println(linea);
				}

				// c = entrada.read();
			}
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
}
