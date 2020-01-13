package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Casa;

public class MainCasaSpring {

	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("beans.xml");

		Casa c1 = (Casa) context.getBean("c1");

		System.out.println(c1);

	}

}
