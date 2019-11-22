package constantes;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.setSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente=1;
	
	public Empleados(String nombre) {
		this.nombre=nombre;
		this.seccion="Administración";
		this.id=this.idSiguiente;
		idSiguiente++;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public static String dameIdSiguiente() {
		return "El idSiguiente es: "+idSiguiente;
	}

	public String devuelveDatos() {
		return "El nombre es: "+this.nombre+" la sección es "+this.seccion+" y el id="+this.id;
	}
}
