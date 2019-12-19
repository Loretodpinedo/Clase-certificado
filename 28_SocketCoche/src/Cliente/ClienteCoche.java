package Cliente;

import java.awt.List;
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

		System.out.println("Introduce el id ");
		String id = sc.nextLine();
		System.out.println("Introduzce la matricula ");
		String matricula = sc.nextLine();
		System.out.println("Introduzce la marca ");
		String marca = sc.nextLine();
		System.out.println("Introduzce el modelo ");
		String modelo = sc.nextLine();
		
		


		try (Socket socket = new Socket("127.0.0.1", 2019);
				PrintStream ps = new PrintStream(socket.getOutputStream());) {

			ps.println(id + "-" + matricula + "-" + marca + "-" + modelo );

			InputStreamReader isr = new InputStreamReader(socket.getInputStream());

			BufferedReader bf = new BufferedReader(isr);

			System.out.println("El coche se ha dado de alta correctamente" + bf.readLine());
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
