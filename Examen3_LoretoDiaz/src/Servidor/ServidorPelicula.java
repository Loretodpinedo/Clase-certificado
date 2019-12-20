package Servidor;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorPelicula {

	public static void main(String[] args) {

		Pelicula peliBus = new Pelicula();
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();

		ServerSocket ss = null;
		try {
			ss = new ServerSocket(2019);

		} catch (IOException e1) {

			e1.printStackTrace();
			return;
		}

		while (true) {

			try (Socket socket = ss.accept();) {

				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();

				String[] peliculas = cadena.split("-");

				String opcion = peliculas[0];
				String titulo = peliculas[1];
				String director = peliculas[2];
				String id = peliculas[3];

				switch (opcion) {

				case "1":

					System.out.println("alta");

					Pelicula p = new Pelicula();

					p.setId(id);
					p.setTitulo(titulo);
					p.setDirector(director);

					listaPeliculas.add(p);

				case "2":

					String idB = peliculas[1];
					for (Pelicula p1 : listaPeliculas) {
						if (p1.getId().equals(idB)) {
							peliBus = p1;

							break;
						}
					}

				case "3":

					String idJ = peliculas[3];
					for (Pelicula p1 : listaPeliculas) {
						if (p1.getId().equals(idJ)) {
							peliBus = p1;
							listaPeliculas.remove(peliBus);

							break;
						}
					}

				}

				System.out.println(listaPeliculas);

				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println(peliBus.getTitulo() + "-" + peliBus.getDirector());

				// System.out.println("Fin del servidor");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
