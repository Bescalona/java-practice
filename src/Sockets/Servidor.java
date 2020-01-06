package Sockets;



import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

//Implement Runnable to be able to use threads
class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		//The Thread will execute when we call to the method MarcoServidor
		Thread mihilo = new Thread(this);
		
		mihilo.start();
		
		}
	
	private	JTextArea areatexto;

//Runnable force to implement the method run
	@Override
	public void run() {
		
		//System.out.println("Estoy a la escucha");
		
		try {
			//We create a socket to listen to the client
			ServerSocket servidor = new ServerSocket(9999);
			
			String nick, ip, mensaje;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true) {
				//We accept the data flow of the client
				Socket misocket = servidor.accept();
				ObjectInputStream paqueteDatos = new ObjectInputStream(misocket.getInputStream());
				paqueteRecibido= (PaqueteEnvio) paqueteDatos.readObject();
				
				nick = paqueteRecibido.getNick();
				ip = paqueteRecibido.getIp();
				mensaje = paqueteRecibido.getMensaje();
				
				areatexto.append(nick + ": "+ mensaje + " para " + ip +"\n");
				
				//Create a socket to resend the info
				Socket enviaDestinatario = new Socket(ip, 9090);
				ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());
				paqueteReenvio.writeObject(paqueteRecibido);
				enviaDestinatario.close();
				
				misocket.close();
				
				/*DataInputStream flujoEntrada = new DataInputStream(misocket.getInputStream());	
				String mensajeentrada = flujoEntrada.readUTF();
				
				areatexto.append("\n"+mensajeentrada);
				misocket.close();*/
			}
					
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
