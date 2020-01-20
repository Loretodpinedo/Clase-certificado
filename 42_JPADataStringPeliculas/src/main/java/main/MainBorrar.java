package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.negocio.GestorPelicula;

public class MainBorrar {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);

		GestorPelicula gp = context.getBean("gestorPelicula", GestorPelicula.class);

		gp.borrar(2);

	}

}
