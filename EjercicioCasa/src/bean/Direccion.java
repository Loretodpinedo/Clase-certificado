package bean;

public class Direccion {
	
	//Declaracion de variables
	
	private String tipoVia, nombreVia, ciudad, cp;
	
	//Generar geter and seter

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombreVia() {
		return nombreVia;
	}

	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	//Generar toString.
	@Override
	public String toString() {
		return   tipoVia + " " + nombreVia + ", en la ciudad de " + ciudad + ", el codigo postal es " + cp;
	}
	
	
	

}
