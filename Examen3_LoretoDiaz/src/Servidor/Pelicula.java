package Servidor;

import java.util.List;

public class Pelicula {

	String id = "", titulo = "", director = "";
	
	
	

	@Override
	public String toString() {
		return "El id la pelicula es " + id + ", el titulo es " + titulo + ", el director es " + director + "\n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pelicula))
			return false;
		Pelicula other = (Pelicula) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	*/
	
	
	
	
	
	
	
	
}