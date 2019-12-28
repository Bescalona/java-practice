package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TreeSet<String> ordenaPersonas = new TreeSet<>();
//		
//		ordenaPersonas.add("Sandra");
//		ordenaPersonas.add("Bastian");
//		ordenaPersonas.add("Pablo");
//		
//		for (String s : ordenaPersonas) {
//			System.out.println(s);
//		}
		
		Articulo a1 = new Articulo(1,"primero");
		Articulo a2 = new Articulo(20,"segundo");
		Articulo a3 = new Articulo(3,"tercero");
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<>();
		
		ordenaArticulos.add(a3);
		ordenaArticulos.add(a1);
		ordenaArticulos.add(a2);
		
		for (Articulo ar : ordenaArticulos) {
			System.out.println(ar.getDescripcion());
		}
		
		//ComparadorArticulo comparatorArticulo2 = new ComparadorArticulo();
		//Articulo comparatorArticulo = new Articulo();
		
		//Clase interna
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<>(new Comparator<Articulo>() {

			@Override
			public int compare(Articulo o1, Articulo o2) {
				String descripcionA = o1.getDescripcion();
				String descripcionB = o2.getDescripcion();
				
				return descripcionA.compareTo(descripcionB);
			}
			
		});
		
		ordenaArticulos2.add(a2);
		ordenaArticulos2.add(a3);
		ordenaArticulos2.add(a1);
		
		for (Articulo ar : ordenaArticulos2) {
			System.out.println(ar.getDescripcion());
		}
	}

}

//Treeset ordena en base a la interfaz comparable
//Si el objeto no implementa la interfaz comparable, podemos implemetar la interfaz comparator
//class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
class Articulo implements Comparable<Articulo>{
	
	private int num_articulo;
	private String descripcion;
	
	/*public Articulo() {
		
	}*/

	public Articulo(int num_articulo, String descripcion) {
		this.num_articulo = num_articulo;
		this.descripcion = descripcion;
	}

	public int getNum_articulo() {
		return num_articulo;
	}

	public void setNum_articulo(int num_articulo) {
		this.num_articulo = num_articulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return num_articulo-o.num_articulo;
	}

//	@Override
//	public int compare(Articulo o1, Articulo o2) {
//		String descripcionA = o1.getDescripcion();
//		String descripcionB = o2.getDescripcion();
//		
//		return descripcionA.compareTo(descripcionB);
//	}
	
}

/*class ComparadorArticulo implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		return descripcionA.compareTo(descripcionB);
	}
	
}*/
