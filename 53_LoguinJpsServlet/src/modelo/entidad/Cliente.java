package modelo.entidad;

public class Cliente {
	
	private String nombre;
	private String contrase�a;
	
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", contrase�a=" + contrase�a;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	
}
