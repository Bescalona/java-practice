package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);

		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];

		personal[0] = jefe;

		personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);

		personal[2] = new Empleado("Luis", 18000, 2012, 9, 15);
		
		try {
			ObjectOutputStream writing_file = new ObjectOutputStream(new FileOutputStream("C:/Users/Bastián/Desktop/Vaper/empleados.dat"));
			writing_file.writeObject(personal);
			writing_file.close();
			
			ObjectInputStream recovering_file =new ObjectInputStream (new FileInputStream("C:/Users/Bastián/Desktop/Vaper/empleados.dat"));
			Empleado[] workers_recovered = (Empleado[])recovering_file.readObject();
			recovering_file.close();
			
			for(Empleado e:workers_recovered) {
				System.out.println(e);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}	

	class Empleado implements Serializable {
		
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 3115148724781994316L;
		String nombre;
		double sueldos;
		Date fechaContrato;

		public Empleado(String n, double s, int agno, int mes, int dia) {
			nombre = n;
			sueldos = s;
			GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
			fechaContrato = calendario.getTime();
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double getSueldo() {
			return sueldos;
		}

		public void setSueldo(double sueldo) {
			this.sueldos = sueldo;
		}

		public Date getFechaContrato() {
			return fechaContrato;
		}

		public void setFechaContrato(Date fechaContrato) {
			this.fechaContrato = fechaContrato;
		}

		public void SubirSueldo(double porcentaje) {
			double aumento = sueldos * porcentaje / 100;
			sueldos += aumento;
		}

		public String toString() {
			return "Noombre = " + nombre + " ,sueldo = " + sueldos + " , fecha de contrato: " + fechaContrato;
		}

	}

	class Administrador extends Empleado{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1881056236380136510L;
		private double incentivo;
		 public Administrador(String n, double s, int agno, int mes, int dia){
		  super(n,s,agno,mes,dia);
		  incentivo = 0;
		 }
		 public double getSueldo() {
		  double sueldoBase = super.getSueldo();
		  return sueldoBase+incentivo;
		 }
		 public void setIncentivo(double incentivo) {
		  this.incentivo = incentivo;
		 }
		 public String toString(){
		  return super.toString()+ " Incentivo = " + incentivo;
		 }
		 

	}
	
	
