package Servidor;

import java.awt.List;
import Servidor.DaoCoche;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServidorCoche {


	public static void main(String[] args) {

		// ArrayList<Coche> listaCoches = new ArrayList<Coche>();

		ServerSocket ss = null;
		try {
			ss = new ServerSocket(2019);
			// System.out.println("Server escuchando por el puerto 2019");
		} catch (IOException e1) {

			e1.printStackTrace();
			return;
		}

		while (true) {
			// System.out.println("Escuchando peticiones...");
			try (Socket socket = ss.accept();) {

				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				// para leer por frases, podemos usar la siguiente clase
				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				// System.out.println("Ha llegado lo siguiente al servidor: " + cadena);
				String[] coches = cadena.split("-");

				String matricula = coches[3];
				String marca = coches[1];
				String modelo = coches[2];

				Coche c1 = new Coche();

				c1.setMatricula(matricula);
				c1.setMarca(marca);
				c1.setModelo(modelo);

				DaoCoche dc = new DaoCoche();
				dc.abrirConexion();
				dc.alta(c1);

				// listaCoches.add(c1);

				// System.out.println(listaCoches);

				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println("");

				System.out.println("Fin del servidor");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
