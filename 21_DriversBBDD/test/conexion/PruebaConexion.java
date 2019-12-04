package conexion;

import modelo.persistencia.DaoCoche;

public class PruebaConexion {

	public static void main(String[] args) {
		
		DaoCoche daocoche = new DaoCoche();
		boolean estaConectado = daocoche.abrirConexion();
		System.out.println(estaConectado);
	}

}
