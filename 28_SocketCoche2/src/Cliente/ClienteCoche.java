package Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCoche {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String  matricula = "", marca = "", modelo = "",opcion = "";
		
		do {
			System.out.println("Si quieres dar de alta un coche marca 1, si quieres salir de la aplicacion marca 2");
			opcion = sc.nextLine();
			
		if (opcion.equals("1")) {

		System.out.println("Introduzce la matricula ");
		marca = sc.nextLine();
		System.out.println("Introduzce la marca ");
		modelo = sc.nextLine();
		System.out.println("Introduzce el modelo ");
		matricula = sc.nextLine();

		try (Socket socket = new Socket("127.0.0.1", 2019);
				PrintStream ps = new PrintStream(socket.getOutputStream());) {

			ps.println(marca + "-" + modelo + "-" + matricula);

			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			BufferedReader bf = new BufferedReader(isr);

			System.out.println("El coche se ha dado de alta correctamente" + bf.readLine());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		}else {
			System.out.println("Hasta pronto");
			}
		}while (!opcion.equals("2"));
		}

}