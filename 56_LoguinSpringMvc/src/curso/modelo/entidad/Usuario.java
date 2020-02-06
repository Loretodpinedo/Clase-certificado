package curso.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Usuario {
	
	private String nombre;
	private String direccion;
	private String edad;
	private String hobbies;
	private String contrase�a;
	
	@Override
	public String toString() {
		return "Usuario nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + ", hobbies=" + hobbies
				+ ", contrase�a=" + contrase�a;
	}
	
	
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	
}
