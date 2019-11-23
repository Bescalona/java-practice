package programacion_generica;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombres[] = {"Anibal","Jose", "Maria","Ana","Pepe"};
		
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		/*Empleado listaEmpleados[] = { new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500),
				new Empleado("Ana", 45, 2500)
		};
		
		System.out.println(MisMatrices.getElementos(listaEmpleados));*/
		
		GregorianCalendar fechas[] = {new GregorianCalendar(2019,11,14),
				new GregorianCalendar(2019,11,05),
				new GregorianCalendar(2019,06,14),
				new GregorianCalendar(2019,07,14)
				
		};
		
		System.out.println(MisMatrices.getMenor(fechas).getTime());
		
		System.out.println(MisMatrices.getMenor(nombres));
	}

}

class MisMatrices {
	
	public static<T> String getElementos(T[]a) {
		return 	"El array tiene " + a.length + " elementos";
	}
	
	public static<T extends Comparable> T getMenor(T[]a) {
		
		if(a==null || a.length==0) {
			return null;
		}
		
		T elementoMenor=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor= a[i];
			}
			
		}
		
		return elementoMenor;
	}
}