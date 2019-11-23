package programacion_generica;

public class Jefe extends Empleado{

	public Jefe(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		// TODO Auto-generated constructor stub
	}
	
	double incentivo(double inc) {
		return inc;
	}
}
