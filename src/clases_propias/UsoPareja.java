package clases_propias;

public class UsoPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pareja<String> una = new Pareja<String>();
		una.setPrimero("bastian");
		System.out.println(una.getPrimero());
		Persona pers1 = new Persona("pedro");
		Pareja<Persona> dos = new Pareja<Persona>();
		dos.setPrimero(pers1);
		System.out.println(dos.getPrimero().toString());
	}

}

class Persona {
	
	private String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}	
	
}
