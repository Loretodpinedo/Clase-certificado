package modelo.entidad;

public class Pelicula {

	private String titulo = "", genero = "", a�oEstreno = "";
	private Director director;

	@Override
	public String toString() {
		return "El titulo es " + titulo + ", el genero es " + genero + ", se estreno en el a�o " + a�oEstreno
				+ ", fue dirigida por " + director;

	}

	public Pelicula() {
		super();
	}

	public Pelicula(String titulo, String genero, String a�oEstreno, Director director) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.a�oEstreno = a�oEstreno;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getA�oEstreno() {
		return a�oEstreno;
	}

	public void setA�oEstreno(String a�oEstreno) {
		this.a�oEstreno = a�oEstreno;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}
