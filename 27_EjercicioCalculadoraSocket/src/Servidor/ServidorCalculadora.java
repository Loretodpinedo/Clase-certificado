package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCalculadora {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(2019);
			System.out.println("Server escuchando por el puerto 2019");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		}
		
		while (true) {
			try (Socket socket = ss.accept();){
				
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				int resultado = 0;
				
				
				String[] numeros = cadena.split("-");
				
				String numero1 = numeros[1];
				String numero2 = numeros[2];
				String operacion = numeros[0];

				int iNumero1 = Integer.parseInt(numero1);
				int iNumero2 = Integer.parseInt(numero2);
				int iOperacion = Integer.parseInt(operacion);
				
				switch (iOperacion) {
				
				case 1:
					resultado = (iNumero1 + iNumero2);
					break;
				case 2:
					resultado = (iNumero1 - iNumero2);
					break;
				case 3:
					resultado = (iNumero1 * iNumero2);
					break;
				case 4:
					resultado = (iNumero1 / iNumero2);
					break;
					default:
						System.out.println("Esta opcion no existe");
				}
			

				//int resultado = iNumero1 + iNumero2;

				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println("El resultado es " + resultado);

				System.out.println("Fin del servidor");
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException nfe) {
				System.out.println("No es un numero lo que han mandado");	
			}
			
		}
		
		
		
		

	}

}
