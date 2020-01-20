package modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "peliculas")
@Component
@Scope("prototype")
public class Pelicula {

	@Id // define la primary key de la bbdd
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Hace la primari key autoincremental.
	private int id;
	private String titulo;
	private String director;
	private String genero;
	private int year;

	@Override
	public String toString() {
		return "Id: " + id + ", titulo: " + titulo + ", director: " + director + ", genero: " + genero + ", year: "
				+ year;
	}

	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String director, String genero, int year) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.year = year;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
