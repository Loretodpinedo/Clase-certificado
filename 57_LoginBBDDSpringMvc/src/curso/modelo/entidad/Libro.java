package curso.modelo.entidad;

import java.awt.Image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "libros")
@Component
@Scope("prototype")
public class Libro {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int añioPublicacion;
	private String titulo;
	private String autor;
	private String editorial;


	@Override
	public String toString() {
		return "Libro [id=" + id + ", añioPublicacion=" + añioPublicacion + ", titulo=" + titulo + ", autor=" + autor
				+ ", editorial=" + editorial + ", sinopsis=" + "foto autor=" +  "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAñioPublicacion() {
		return añioPublicacion;
	}

	public void setAñioPublicacion(int añioPublicacion) {
		this.añioPublicacion = añioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	
}
