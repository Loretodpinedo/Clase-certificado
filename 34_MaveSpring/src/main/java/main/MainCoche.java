package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Coche;
import modelo.entidad.Motor;

public class MainCoche {

	public static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("beans.xml");

		Motor m1 = context.getBean("m1", Motor.class);
		Motor m2 = context.getBean("m2", Motor.class);
		Motor m3 = context.getBean("m3", Motor.class);
		Motor m4 = context.getBean("m4", Motor.class);

		System.out.println("Los motores son " + m1 + m2 + m3 + m4);

		Coche c1 = context.getBean("c1", Coche.class);
		Coche c2 = context.getBean("c2", Coche.class);
		Coche c3 = context.getBean("c3", Coche.class);
		Coche c4 = context.getBean("c4", Coche.class);
		Coche c5 = context.getBean("c5", Coche.class);

		System.out.println("Marca " + c1.getMarca() + ", modelo " + c1.getModelo() + ", matricula " + c1.getMatricula()
				+ ", segunda mano " + c1.toString() + ", precio " + c1.getPrecio() + ", peso " + c1.getMarca()
				+ ", " + c1.getMotor());
		System.out.println("Marca " + c2.getMarca() + ", modelo " + c2.getModelo() + ", matricula " + c2.getMatricula()
				+ ", segunda mano " + c2.toString() + ", precio " + c2.getPrecio() + ", peso " + c2.getMarca() + ", " + c2.getMotor());
		System.out.println("Marca " + c3.getMarca() + ", modelo " + c3.getModelo() + ", matricula " + c3.getMatricula()
				+ ", segunda mano " + c3.toString() + ", precio " + c3.getPrecio() + ", peso " + c3.getMarca() + c3.getMotor());
		System.out.println("Marca " + c4.getMarca() + ", modelo " + c4.getModelo() + ", matricula " + c4.getMatricula()
				+ ", segunda mano " + c4.toString() + ", precio " + c4.getPrecio() + ", peso " + c4.getMarca() + c4.getMotor());
		System.out.println("Marca " + c5.getMarca() + ", modelo " + c5.getModelo() + ", matricula " + c5.getMatricula()
				+ ", segunda mano " + c5.toString() + ", precio " + c5.getPrecio() + ", peso " + c5.getMarca()
				+ ", con un motor " + c5.getMotor());

	}

}
