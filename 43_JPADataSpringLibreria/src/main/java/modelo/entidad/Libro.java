package modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "libreria")
@Component
@Scope("prototype")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String isbn;
	private String titulo;
	private String editorial;
	private int anioPublicacion;

	public Libro() {
		super();
	}

	public Libro(int id, String isbn, String titulo, String editorial, int anioPublicacion) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.anioPublicacion = anioPublicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\n Id: " + id + ", isbn: " + isbn + ", titulo: " + titulo + ", editorial: " + editorial
				+ ", año de publicacion: " + anioPublicacion + ".\n";
	}

}
