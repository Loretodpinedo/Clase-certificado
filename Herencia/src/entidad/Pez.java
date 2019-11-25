package entidad;

public class Pez extends Animal {//para heredar una clase de otra se utiliza la palabra reservada exteds

	@Override
	public void comer(Object comida) {
		
		Placton p = (Placton) comida;//hago casting de placton a comida.
		//preguntamos la clase del objeto al que apuntamos
		if (comida instanceof Placton) {
			System.out.println("Soy un pez llamo " + nombre +  " y me voy a comer un placton " + p.getCalorias());
			//al ser protected con el nombre ctr + esp se puede usar. 
		}else {
				System.out.println("Puaaaaj no me gusta el placton ");
			}
		}
		
		
	}
	


