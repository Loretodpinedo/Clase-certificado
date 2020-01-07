
public class Charlatan extends Personaje {

	public void atacar() {
		System.out.println("Soy el charlatan " + getNombre() + " te convencere de lo que quiera");
		getArma().usar();
	}

}
