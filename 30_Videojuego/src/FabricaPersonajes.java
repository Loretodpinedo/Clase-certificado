
public class FabricaPersonajes {

	public static Personaje crear(String tipo) {

		Personaje personaje = null;

		switch (tipo) {

		case "Charlatan":
			personaje = new Charlatan();
			personaje.getNombre();
			personaje.getArma();

			break;

		case "Guerrero":
			personaje = new Guerrero();
			personaje.getNombre();
			personaje.getArma();
			break;

		default:

			break;
		}
		return personaje;
	}

}
