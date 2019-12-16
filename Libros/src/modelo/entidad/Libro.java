package modelo.entidad;

public class Libro {
	
	private String isbn = "", titulo = "", editorial = "", añoPublicacion = "";
	
	

	@Override
	public String toString() {
		return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", añoPublicacion="
				+ añoPublicacion + "]";
		
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

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	
	

}
