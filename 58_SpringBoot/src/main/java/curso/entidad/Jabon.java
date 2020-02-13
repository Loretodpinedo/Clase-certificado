package curso.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "jabones")
@Component
@Scope("prototype")
public class Jabon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String aceite;
	private String aceite2;
	private String facuosa;
	private String alcali;
	
	
	
	@Override
	public String toString() {
		return " " + nombre + " \n Ingredientes: " + "\n" + "aceite: " + aceite + "\n" + "aceite2: " + aceite2 + "\n" + "fase acuosa: " + facuosa + "\n" + "Alcali: " + alcali;
	}
	
	public String getAceite() {
		return aceite;
	}
	public void setAceite(String aceite) {
		this.aceite = aceite;
	}
	public String getAceite2() {
		return aceite2;
	}
	public void setAceite2(String aceite2) {
		this.aceite2 = aceite2;
	}
	public String getFacuosa() {
		return facuosa;
	}
	public void setFacuosa(String facuosa) {
		this.facuosa = facuosa;
	}
	public String getAlcali() {
		return alcali;
	}
	public void setAlcali(String alcali) {
		this.alcali = alcali;
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
	
	
}
