package modelo.entidad;

public class Pelicula {
	
	private int id = 0;
	private String titulo = "", director = "", genero = "", aņoPublicacion = "";
	
	@Override
	public String toString() {
		return "pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero
				+ ", aņoPublicacion=" + aņoPublicacion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAņoPublicacion() {
		return aņoPublicacion;
	}

	public void setAņoPublicacion(String aņoPublicacion) {
		this.aņoPublicacion = aņoPublicacion;
	}
	
	

}
