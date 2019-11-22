package accesoFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura_Bytes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int input_data[] = new int [3686573];
		
		int counter = 0;
		
		try {
			FileInputStream archivo_lectura = new FileInputStream("C:/Users/Bastián/Desktop/Vaper/IMG_20190826_215834.jpg");
			
			boolean final_ar = false;
			
			while(!final_ar) {
				int byte_entrada = archivo_lectura.read();
				
				if(byte_entrada!=-1) {
					input_data[counter]= byte_entrada;
				}else {
					final_ar = true;
				}
				
				//System.out.println(input_data[counter-2]);
				counter++;
				
			}
			long filesize= archivo_lectura.getChannel().size();
			System.out.println(filesize);
			System.out.println(counter);
			archivo_lectura.close();	
		} catch (IOException e) {
			System.out.println("Error al acceder a la imagen");
		}
		
		create_file(input_data);
	}
	
	static void create_file(int new_data_file[]) {
		
		try {
			FileOutputStream new_file = new FileOutputStream ("C:/Users/Bastián/Desktop/Vaper/nuevo.jpg");
			
			for(int i =0; i<new_data_file.length; i++) {
				new_file.write(new_data_file[i]);
			}
			
			new_file.close();
		} catch (IOException e) {
			System.out.println("Error al crear al archivo");
		}
	}

}
