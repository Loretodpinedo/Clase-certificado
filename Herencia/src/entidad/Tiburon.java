package entidad;

public class Tiburon extends Pez{

	@Override
	public void comer(Object comida) {
		//super.comer(comida);//Esto es el metodo heredado del padre, puedo borrarlo o añadirle, en este caso se ejecutaria primero el padre.
		
		if (comida instanceof Pez) {
			Pez pez = (Pez) comida;
			System.out.println("Soy el tiburon " + getNombre() + " " + "y me voy a comer al pez " + pez.getClass().getSimpleName() + " que se llama " + pez.getNombre()); 
			
		}else {
			System.out.println("Soy un tiburon asesino y solo como peces");
		}
	}

}
