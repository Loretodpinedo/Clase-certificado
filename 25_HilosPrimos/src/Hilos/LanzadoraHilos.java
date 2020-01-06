package Hilos;

public class LanzadoraHilos {

	public static void main(String[] args) {

		/*
		 * System.out.println("Dime 5 numeros y te dire si son primos");
		 * 
		 * PrimoThread pt1 = new PrimoThread("pt1"); PrimoThread pt2 = new
		 * PrimoThread("pt2"); PrimoThread pt3 = new PrimoThread("pt3"); PrimoThread pt4
		 * = new PrimoThread("pt4"); PrimoThread pt5 = new PrimoThread("pt5");
		 * 
		 * pt1.start(); pt2.start(); pt3.start(); pt4.start(); pt5.start();
		 */
		// Runnable

		System.out.println("Dime 5 numeros y te dire si son primos ");

		PrimoRunnable pr1 = new PrimoRunnable("A");
		PrimoRunnable pr2 = new PrimoRunnable("B");
		PrimoRunnable pr3 = new PrimoRunnable("C");
		PrimoRunnable pr4 = new PrimoRunnable("D");
		PrimoRunnable pr5 = new PrimoRunnable("E");

		Thread t1 = new Thread(pr1);
		Thread t2 = new Thread(pr2);
		Thread t3 = new Thread(pr3);
		Thread t4 = new Thread(pr4);
		Thread t5 = new Thread(pr5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
