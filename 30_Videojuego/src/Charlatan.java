
public class Charlatan extends Personaje {

	public void atacar() {

		Charlatan charlatan = null;
		System.out.println("Soy el charlatan " + getNombre() + " te convencere de lo que quiera");
		getArma().usar();

	}

	public void atacarPersonaje(Personaje p) {
		int danio = getArma().getDanio();
		int vida = p.getVida();
		int nuevaVida = vida - danio;
		p.setVida(nuevaVida);

	}

}
