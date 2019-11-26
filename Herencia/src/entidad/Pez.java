package entidad;

public class Pez extends Animal {// para heredar una clase de otra se utiliza la palabra reservada exteds

	private int numeroAletas;

	// Tenemos que cojer los getter heredados de animal ya que los atributos son
	// privados y no podemos acceder dese esta clase.
	// otra opcion hubiera sido hacerlos protected.
	@Override
	public String toString() {
		return "Este pez tiene " + numeroAletas + " aletas" + ", se llama " + nombre + ", getNombre()=" + getNombre()
				+ ", getPeso()=" + getPeso() + ", getEdad()=" + getEdad() + "]";
	}

	@Override
	public void comer(Object comida) {

		// preguntamos la clase del objeto al que apuntamos
		if (comida instanceof Placton) {// instanceof apunta a en este if la variable comida apunta a la clase Placton.
			Placton p = (Placton) comida;// Cambiamos el mando a distancia de Objet para tipo placton para mas adelante
											// poder usa el metodo get.calorias.
			System.out.println("Soy un pez llamo " + nombre + " y me voy a comer un placton " + p.getCalorias());

			p.getCalorias();// la division entre un entero siempre devuleve un entero.

			double nuevoPeso = p.getCalorias() / 1000.0;
			this.setPeso(this.getPeso() + nuevoPeso);// Esto es lo mismo que lo de abajo.
			// setPeso(getPeso() + nuevoPeso());
			// al ser protected con el nombre ctr + esp se puede usar.
		} else {
			System.out.println("Puaaaaj no me gusta esoooo!!!!! :( ");
		}
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

}
