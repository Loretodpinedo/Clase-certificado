package curso.modelo.entidad;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Entity
@Table(name = "usuario")
@Component
@SessionScope
public class Usuario {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreU;
	private String pass;
	
	@Transient
	private boolean registrado;
	
	//Con esta anotacion no creara este atributo a la hora de crear la base de datos. 
	@Transient
	private List<Producto>listaPedido;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreU=" + nombreU + ", pass=" + pass + ", listaPedido=" + listaPedido + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreU() {
		return nombreU;
	}
	public void setNombreU(String nombreU) {
		this.nombreU = nombreU;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pss) {
		this.pass = pss;
	}
	public List<Producto> getListaPedido() {
		return listaPedido;
	}
	public void setListaPedido(List<Producto> listaPedido) {
		this.listaPedido = listaPedido;
	}


	public boolean isRegistrado() {
		return registrado;
	}


	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}
	
	

}
