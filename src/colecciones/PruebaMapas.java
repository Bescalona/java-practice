package colecciones;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		personal.put("145", new Empleado("Bastian"));
		personal.put("146", new Empleado("Pablo"));
		personal.put("147", new Empleado("Alonso"));
		personal.put("148", new Empleado("Cony"));
		
		System.out.println(personal);
		personal.remove("145");
		System.out.println(personal);
		personal.put("148", new Empleado("Sandra"));
		System.out.println(personal);
		
		System.out.println(personal.entrySet());
		
		for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave: " + clave +" Valor: " + valor);
		}
	}

}

class Empleado{
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
}