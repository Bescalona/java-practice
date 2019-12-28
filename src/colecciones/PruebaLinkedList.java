package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> personas = new LinkedList<String>();
		
		personas.add("bastian");
		personas.add("pablo");
		personas.add("alonso");
		personas.add("cony");
		
		System.out.println(personas.size());
		
		//ListIterator permite moverse hacia adelante y atras de la lista
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("Sandra");
		
		for (String persona : personas) {
			System.out.println(persona);
		}
	}

}
