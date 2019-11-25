package entidad;

public class Persona {

	private String nombre;
	private int edad;
	public static int numeroPersonas = 0;// Se declara con la clase. en este caso
											// Persona.

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	// Este es un metodo dinamico, el cciclo de vida de este metodo depende
	// del objeto. Un metodo dinamico se crea sin poner ESTATIC.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
