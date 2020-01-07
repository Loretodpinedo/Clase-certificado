
public class FabricaArmas {

	public static Arma crear(String tipo) {
		Arma arma = null;

		switch (tipo) {

		case "Espada":
			arma = new Espada();
			break;

		case "Charla":
			arma = new CharlaInterminable();
			break;
		default:
			System.out.println("Tu personaje no tiene arma y morira por ello");
			break;
		}
		return arma;
	}
}
