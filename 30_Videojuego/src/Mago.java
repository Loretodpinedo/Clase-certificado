
public class Mago extends Personaje{

	
	public void atacar() {
		
		System.out.println("Yo te hechizoooo ");
		getArma().usar();
		
		
	}

	@Override
	public void atacarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		
	}

}
