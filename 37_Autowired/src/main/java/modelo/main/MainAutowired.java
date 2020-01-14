package modelo.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Pelicula;

public class MainAutowired {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("beans.xml");

		Pelicula p = context.getBean("pelicula", Pelicula.class);
		System.out.println(p);

	}

}
