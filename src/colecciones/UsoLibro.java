package colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("P de java", "Bastian", 23);
		Libro l2 = new Libro("P de java", "Bastian", 23);
		
//		l1=l2;
		
		if(l1.equals(l2)) {
			System.out.println("Es el mismo libro");
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
		}else {
			System.out.println("No es el mismo libro");
			System.out.println(l1.hashCode());
			System.out.println(l2.hashCode());
		}
	}

}
