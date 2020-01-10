package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {

	// 1º CREAR!!
	// Esta referencia llevara el objeto de contexto de spring
	// este objeto llevara el ciclo de vida de todos los objetos que hayamos creado
	// en el XML
	// ApplicationContext es una interface
	public static ApplicationContext context;

	public static void main(String[] args) {

		// damos de alta el contexto de spring, a partir de un fichero xml
		// este contexto llevara el ciclo de vida de todos los beans(objetos)
		// que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beans.xml");

		// a partir de este monento, a traves del contexto
		// de spring podemos acceder a cualquier bean
		// mediante su id
		// getBean devuelve una referencia de tipo Object
		// has de hacer tu el casting a la clase de la que lo
		// hayas creado. En este caso tipo Persona.
		Persona p1 = (Persona) context.getBean("persona1");

		Persona p2 = new Persona();
		// Diferencias entre uno y otro
		// aqui no puerdo el objeto por me lo gestiona spring
		// IoC
		p1 = null;
		// aqui pierdo el objeto porque lo gestiono yo
		p2 = null;

		p1 = (Persona) context.getBean("persona1");

		p1.setNombre("Jarry Poter");

		p1 = null;

		p1 = (Persona) context.getBean("persona1");

		// Asi tambien se hace castin a clase persona.
		Persona bud = context.getBean("bud", Persona.class);
		System.out.println(bud.getEdad());
		System.out.println(bud);

	}

}
