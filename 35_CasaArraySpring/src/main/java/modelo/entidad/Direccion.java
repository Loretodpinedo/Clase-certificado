package modelo.entidad;

public class Direccion {

	private String tipoVia, via, ciudad;

	@Override
	public String toString() {
		return  tipoVia + "/ " + via + " ," + ciudad;
	}

	public Direccion() {
		super();
	}

	public Direccion(String tipoVia, String via, String ciudad) {
		super();
		this.tipoVia = tipoVia;
		this.via = via;
		this.ciudad = ciudad;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
