package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Bastian Escalona","00001", 200000);
		Cliente cl2 = new Cliente("Colson Baker","00002", 300000);
		Cliente cl3 = new Cliente("Halsey","00003", 500000);
		Cliente cl4 = new Cliente("Arsene Wenger","00004", 700000);
		Cliente cl5 = new Cliente("Bastian Escalona","00001", 200000);
		
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		Iterator<Cliente> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			
			if(nombre_cliente.equals("Bastian Escalona")) {
				it.remove();
			}
		}
		
		for (Cliente cliente : clientesBanco) {
			System.out.println(cliente.getNombre() + " " + 
					cliente.getN_cuenta() + " " + 
					cliente.getSaldo());
		}
		
//		Iterator<Cliente> it = clientesBanco.iterator();
//		
//		while(it.hasNext()) {
//			String nombre_cliente = it.next().getNombre();
//			System.out.println(nombre_cliente);
//		}
	}

}
