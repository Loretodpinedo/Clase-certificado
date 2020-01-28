package entidades;

import java.util.ArrayList;

public abstract class Ingredientes {
	
	abstract void altaIngrediente();	
	abstract void calculoCosteReceta();
	abstract void calculoRecetaPorcentaje();
	abstract void precioIngrediente();
	abstract void receta();
	String nombre = "", propiedades = "";
	double precio = 0.0;
	ArrayList ingredientes;
	
	 
	

}
