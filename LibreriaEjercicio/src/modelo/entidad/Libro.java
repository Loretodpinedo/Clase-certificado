package modelo.entidad;

public class Libro {
	
	private String isbn = "", titulo = "", editorial = "", a�oPublicacion = "";
	
	

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", a�oPublicacion="
				+ a�oPublicacion + "]";
		
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

	public String getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(String a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
	}
	
	
	

}
