package Sockets;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

//Implements Runnable to listen to another client
class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		nick = new JTextField(5);
		add(nick);
	
		JLabel texto=new JLabel("-CHAT-");
		
		ip = new JTextField(8);
		add(ip);
		
		add(texto);
		
		campochat = new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviarTexto mievento = new EnviarTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);
		
		Thread mihilo = new Thread(this);
		
		mihilo.start();
		
	}
	
	class EnviarTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(campo1.getText());
			
			try {
				//We create a socket to send the data, the socket is like a bridge
				Socket misocket = new Socket("192.168.10.15",9999); 
				
				PaqueteEnvio datos = new PaqueteEnvio();
				datos.setIp(ip.getText());
				datos.setNick(nick.getText());
				datos.setMensaje(campo1.getText());
				
				//We create a object flow that carry the data through the socket
				ObjectOutputStream paqueteDatos = new ObjectOutputStream(misocket.getOutputStream());
				paqueteDatos.writeObject(datos);
				misocket.close();
				
				//We create a flow that carry the data through the socket
				/*DataOutputStream flujoSalida = new DataOutputStream(misocket.getOutputStream());
				flujoSalida.writeUTF(campo1.getText());
				flujoSalida.close();*/
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		}
		
	}
	
		
	private JTextArea campochat;	
		
	private JTextField campo1, nick, ip;
	
	private JButton miboton;

	@Override
	public void run() {
		
		try {
			ServerSocket servidor_cliente = new ServerSocket(9090);
			Socket cliente;
			PaqueteEnvio paquete_recibido;
			while(true) {
				cliente = servidor_cliente.accept();
				ObjectInputStream flujoentrada = new ObjectInputStream(cliente.getInputStream());
				paquete_recibido = (PaqueteEnvio) flujoentrada.readObject();
				campochat.append(paquete_recibido.getNick() + ": "+ paquete_recibido.getMensaje() +"\n");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

//Encapsulates the info to send
class PaqueteEnvio implements Serializable{
	
	private String ip, nick, mensaje;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}