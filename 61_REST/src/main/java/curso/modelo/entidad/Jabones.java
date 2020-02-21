package curso.modelo.entidad;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Jabones {
	
	private List<Jabon>listaJabon;
	
	public List<Jabon>getListaJabon(){
		return listaJabon;
	}

	public void setListaJabon(List<Jabon>listaJabon) {
		
		this.listaJabon = listaJabon;
	}
}
