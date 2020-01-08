
public class FabricaPersonajes {

	public static Personaje crear(String tipo) {

		Personaje personaje = null;

		switch (tipo) {

		case "Charlatan":
			personaje = new Charlatan();
			personaje.getNombre();
			personaje.getArma();
			personaje.setVida(20);

			break;

		case "Guerrero":
			personaje = new Guerrero();
			personaje.getNombre();
			personaje.getArma();
			personaje.setVida(10);

			break;

		case "Mago":
			personaje = new Mago();
			personaje.getNombre();
			personaje.getArma();
			personaje.setVida(15);

			break;

		case "Enano":
			personaje = new Enano();
			personaje.getNombre();
			personaje.getArma();
			personaje.setVida(19);

			break;

		default:

			break;
		}
		return personaje;
	}

}
