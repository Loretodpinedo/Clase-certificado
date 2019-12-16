package modelo.entidad;

import java.util.ArrayList;

public class Libreria {
	
	private String nombreLibreria;
	private ArrayList<Libro> favoritos;
	
	@Override
	public String toString() {
		return "Libreria [nombreLibreria=" + nombreLibreria + ", favoritos=" + favoritos + "]";
	}
	
	
	public String getNombreLibreria() {
		return nombreLibreria;
	}
	public void setNombreLibreria(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
	}
	public ArrayList<Libro> getFavoritos() {
		return favoritos;
	}
	public void setFavoritos(ArrayList<Libro> favoritos) {
		this.favoritos = favoritos;
	}
	
	
	
	
	
	
	
	
	

}
