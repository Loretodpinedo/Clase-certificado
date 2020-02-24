package curso.modelo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Entity
@Component
@XmlRootElement
public class Jabon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String ing1;
	private String ing2;
	private String ing3;
	private double peso;
	
	@Override
	public String toString() {
		return "Jabon [id=" + id + ", nombre=" + nombre + ", ing1=" + ing1 + ", ing2=" + ing2 + ", ing3=" + ing3
				+ ", peso=" + peso + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIng1() {
		return ing1;
	}
	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}
	public String getIng2() {
		return ing2;
	}
	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}
	public String getIng3() {
		return ing3;
	}
	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	

}
