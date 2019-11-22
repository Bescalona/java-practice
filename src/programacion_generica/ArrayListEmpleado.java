package programacion_generica;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class ArrayListEmpleado {

	public static void main(String[] args) {
		
		/*Empleado listaEmpleados[] = new Empleado[3];
		
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		listaEmpleados[0] = new Empleado("Antonio", 55, 2000);
		listaEmpleados[0] = new Empleado("Maria", 25, 2600);*/
		
		ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		//Reservar un espacio determinado en la memoria (espacio para un ArrayList de 20 elementos)
		listaEmpleados.ensureCapacity(20);
		
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Bastian", 24, 1600));
		
		//Recorta el espacio de memoria que ocupa un ArrayList en este ejemplo el ArrayList es de 20 espacios y solo ocupo 11 entonces corta el ArrayList en 11
		listaEmpleados.trimToSize();
		
		System.out.println(listaEmpleados.size());
		
		for(Empleado empleado:listaEmpleados) {
			System.out.println(empleado.dameDatos());
		}
	}

}

class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {

		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String dameDatos() {
		
		return "El empleado se llama " + nombre + " Tiene " + edad + " años " + "Y un salario de " + salario;
	}
}
