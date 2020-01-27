package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Aeropuerto;
import modelo.entidad.Asiento;

public class MainAeropuerto {

	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("beans.xml");

		Aeropuerto ae1= (Aeropuerto) context.getBean("aero1");
		Aeropuerto ae2= (Aeropuerto) context.getBean("aero2");
		System.out.println(ae1);
		System.out.println(ae2);

	}

}
