package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ClaseServidora {

	public static void main(String[] args) {
		//ServerSocket ss = new ServerSocket(2019);
		//abrimos el puerto y escuchamos las peticiones del socket.
		
		System.out.println("Escuchando peticiones...");
		
		try (ServerSocket ss = new ServerSocket(2019);
				Socket socket = ss.accept();){
			
			//Socket socket = ss.accept();
			//Este metodo se quedara parado el hilo de ejecucion
			//hasta que llegue la peticion de un cliente
			//cuando llegue la peticion de un cliente
			//se continuara ejecutando el codigo y se nos
			//creara un objeto de tipo Socket.
			
			//para leer del canuto del inputStream con esta clase solo puedo leer caracter a caracter, para leer
			//por frases usamos la sig clase BufferedReader que se apoya en la primera.
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			//Creamos una variable de la clase BufferedReader para que guarde lo leido.
			BufferedReader bf = new BufferedReader(isr);
			String cadena = bf.readLine();
			System.out.println("Ha llega lo siguiente al servidor " + cadena);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
