package arrays;

import javax.swing.JOptionPane;

public class Array1 {

	public static void main(String[] args) {
//		 String [] paises = new String [8];
//		
//		 paises[0] = "Chile";
//		 paises[1] = "Argentina";
//		 paises[2] = "Peru";
//		 paises[3] = "Espa�a";
//		 paises[4] = "Noruega";
//		 paises[5] = "Honduras";
//		 paises[6] = "Ecuador";
//		 paises[7] = "Venezuela";

//		String[] paises = { "Chile", "Argentina", "Peru", "Espa�a", "Noruega", "Honduras", "Ecuador", "Venezuela" };
		
//		for(int i=0; i<paises.length;i++) {
//			paises[i] = JOptionPane.showInputDialog("Introduce pa�s" +(i+1));
//		}
//
//		for (String pais : paises) {
//			System.out.println("Pa�s: " + pais);
//		}
		
		int[] aleatorios = new int[150];
		
		for(int i=0; i<aleatorios.length;i++) {
			aleatorios[i] = (int) Math.round(Math.random()*100);
		}
		
		for(int aleatorio:aleatorios) {
			System.out.println(aleatorio);
		}

	}

}
