package entidad;

public class Placton {

	private int calorias = 0;

	@Override
	public String toString() {
		return "El placton tiene " + calorias + " calorias";
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

}
