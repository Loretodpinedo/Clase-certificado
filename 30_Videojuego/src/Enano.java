
public class Enano extends Personaje{

	
	public void atacar() {
		
		Enano enano = null;
		
		System.out.println("Aijop, aijop!!!");
		enano.getVida();
		getArma().usar();
		
	}

		public void atacarPersonaje(Personaje p) {
		int danio = getArma().getDanio();
		int vida = p.getVida();
		int nuevaVida = vida - danio;
		p.setVida(nuevaVida);
	}
	
	

}
