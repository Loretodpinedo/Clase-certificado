package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Pelicula {

	private String titulo = "", genero = "", añoEstreno = "";

	@Autowired // de esta manera se inyecta director en pelicula.
	@Qualifier("director") // va en conjunto con @Autowired, especificamos entre comillas el objeto a
	// inyectar. Si no por defecto buscara por name, al contrario que en xml
	// que buscara por tipo.
	private Director director;

	@Override
	public String toString() {
		return "El titulo es " + titulo + ", el genero es " + genero + ", se estreno en el año " + añoEstreno
				+ ", fue dirigida por " + director;

	}

	public Pelicula() {
		super();
	}

	public Pelicula(String titulo, String genero, String añoEstreno, Director director) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.añoEstreno = añoEstreno;
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

	public String getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(String añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

}
