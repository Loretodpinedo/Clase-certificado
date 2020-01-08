
public abstract class Personaje {

	
	private String nombre;
	private Arma arma;
	private int vida;
	
	public abstract void atacar();
	
	//con este metodo puedo atacar a otro personaje
	public abstract void atacarPersonaje(Personaje p);

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

}
