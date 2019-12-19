package Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCalculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que operacion quieres hacer"
				+ "\n1-Sumar"
				+ "\n2-Restar"
				+ "\n3-Multiplicar"
				+ "\n4-Dividir");
		
		int operacion = sc.nextInt();
		System.out.println("Introduzca el primer numero ");	
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero ");	
		int numero2 = sc.nextInt();
		
		try(Socket socket = new Socket("127.0.0.1",2019);
				PrintStream ps = new PrintStream(socket.getOutputStream());
						) {
					
			
			ps.println(operacion + "-" + numero1 + "-" + numero2);
			
			
			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			
			
			BufferedReader bf = new BufferedReader(isr);
			
			System.out.println("El resultado es " + bf.readLine());
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		}
}
		
		
		

	


