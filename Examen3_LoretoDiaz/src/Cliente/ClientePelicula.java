package Cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClientePelicula {

			public static void main(String[] args) {

				
				Scanner sc = new Scanner(System.in);
				String  titulo = "", director = "", id = "", nid ="",opcion = "";
				
				do {
					System.out.println("Bienvenido al cliente de peliculas, seleccione que opcion desea realizar: \n 1. Dar de alta nueva pelicula. \n 2. Buscar pelicula por ID. \n 3.Baja de pelicula por ID. \n Pulse 0 para salir.");
					opcion = sc.nextLine();
					
				if (opcion.equals("1")) {
					System.out.println("Bienvenido a la opcion alta.");

				System.out.println("Introduzca el titulo de la pelicula que quiere dar de alta.");
				titulo = sc.nextLine();
				System.out.println("Introduzca el director de la pelicula que quiere dar de alta.");
				director = sc.nextLine();
				System.out.println("Introduzca la id de la pelicula que quiere dar de alta.");
				id = sc.nextLine();

				try (Socket socket = new Socket("127.0.0.1", 2019);
						PrintStream ps = new PrintStream(socket.getOutputStream());) {

					ps.println(opcion + "-" + titulo + "-" + director + "-" + id);

					InputStreamReader isr = new InputStreamReader(socket.getInputStream());

					BufferedReader bf = new BufferedReader(isr);

					System.out.println("La pelicula "+bf.readLine()+" ha sido dada de alta correctamente ");
				} catch (UnknownHostException e) {

					e.printStackTrace();
				} catch (IOException e) {

					e.printStackTrace();
				}
				}else if (opcion.equals("2")){
					System.out.println("Bienvenido a la busqueda de peliculas. \n Introduzca el Id de la pelicula que desea buscar.");
					nid=sc.nextLine();
					try 
						(Socket socket = new Socket("192.168.1.82", 2019);
						PrintStream ps = new PrintStream(socket.getOutputStream());){

							ps.println(opcion+"-"+id);
							InputStreamReader isr = new InputStreamReader(socket.getInputStream());

							BufferedReader bf = new BufferedReader(isr);

							System.out.println(bf.readLine());
						
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					}else if (opcion.equals("3")){
						System.out.println("Bienvenido a la baja de peliculas. \n Introduzca el Id de la pelicula que desea dar de baja.");
						nid=sc.nextLine();
						try 
							(Socket socket = new Socket("192.168.1.82", 2019);
							PrintStream ps = new PrintStream(socket.getOutputStream());){

								ps.println(opcion+"-"+id);
								InputStreamReader isr = new InputStreamReader(socket.getInputStream());

								BufferedReader bf = new BufferedReader(isr);

								System.out.println(bf.readLine());
						} catch (UnknownHostException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					
					
					
					
					}	
					}
				while (!opcion.equals("0"));
				System.out.println("Hasta pronto");
				}
		

}


