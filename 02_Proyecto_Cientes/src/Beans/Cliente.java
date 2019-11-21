package Beans;

import javax.crypto.CipherInputStream;

public class Cliente {

	
	private String usuario, pw, nombre, apellidos, direccion;
	

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pw=" + pw + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}
	
	

	public Cliente() {
		super();
	}



	public Cliente(String usuario, String pw, String nombre, String apellidos, String direccion) {
		super();
		this.usuario = usuario;
		this.pw = pw;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public static Cliente [] dameClientes() {
		Cliente [] clientes = {
		
			   new Cliente("Lore", "Piña", "Loreto", "Colada", "Casa"),
			   new Cliente("Javibi", "Colada", "Javier", "Serrano", "Casa Linda"),
			   new Cliente("Piñeta", "123", "Piña", "Diaz Serrano", "Casita linda y querida")};
		return clientes;	   
	}

	public static Cliente dameCliente () {
		
		return new Cliente("Ire", "Iri", "Irene", "Diaz", "Beatiful house");
		
	}
	
		
}

