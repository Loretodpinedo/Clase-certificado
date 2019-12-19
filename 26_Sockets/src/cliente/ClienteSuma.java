package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSuma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// system.in es un stream de entrada.

		System.out.println("¿Que numero quieres sumar?");
		int numero1 = sc.nextInt();
		System.out.println("¿Con que numero lo quieres sumar?");
		int numero2 = sc.nextInt();

		// nos conectamos al servidor para mandarle
		// los numeros
		// Creamos un objeto de la clase Socket y
		// le decimos la ip y el puerto por el que vamos a conectar
		//ponemos entre los parentesis del try las variables para que se cierren automaticamente cuando acabe el try
		try (Socket socket = new Socket("127.0.0.1", 2019);
				PrintStream ps = new PrintStream(socket.getOutputStream()))// surrended by try/catch){// lo pide al crear el objeto de clase Socket, da error.
			
		{
			// Esta calse extiende de la clase autputstream. Creamos un objeto para escribir
			// en el socket utilizando
			// el metodo getOutStream
			

			ps.println(numero1 + "-" + numero2);
			
			//para leer la info del servidor			
			InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			//para leer por frases
			BufferedReader bf = new BufferedReader(isr);
			//en esta linea se queda parado hasta que el servidor responda
			System.out.println("Cliente: " + bf.readLine());
			
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
