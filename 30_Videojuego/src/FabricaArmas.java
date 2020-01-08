
public class FabricaArmas {

	public static Arma crear(String tipo) {
		Arma arma = null;

		switch (tipo) {

		case "Espada":
			arma = new Espada();
			arma.setDanio(1);
			break;

		case "Charla":
			arma = new CharlaInterminable();
			arma.setDanio(4);
			break;

		case "Hechizo":
			arma = new Hechizo();
			arma.setDanio(5);
			break;

		case "Hacha":
			arma = new Hacha();
			arma.setDanio(2);
			break;
		case "Arco":
			arma = new Arco ();
			arma.setDanio(3);
			break;

		default:
			System.out.println("Tu personaje no tiene arma y morira por ello");
			break;
		}
		return arma;
	}
}
