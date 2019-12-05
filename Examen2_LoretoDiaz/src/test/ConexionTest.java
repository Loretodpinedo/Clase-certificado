package test;

import modelo.persistencia.DaoPelicula;

public class ConexionTest {

	public static void main(String[] args) {
		
		
			
			DaoPelicula daopelicula = new DaoPelicula();
			boolean estaConectado = daopelicula.abrirConexion();
			System.out.println(estaConectado);
		}

	}


