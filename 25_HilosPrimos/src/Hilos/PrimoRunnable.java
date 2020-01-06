package Hilos;

import java.util.Scanner;

public class PrimoRunnable implements Runnable {

	private String primoHilo;

	public PrimoRunnable(String primoHilo) {

		this.primoHilo = primoHilo;
	}

	Scanner sc = new Scanner(System.in);

	long i = 0, c1 = 0, n1 = 0;

	@Override
	public void run() {

		
		n1 = sc.nextLong();

		for (i = 1; i <= n1; i++) {
			if ((n1 % i) == 0) {
				c1++;
			}
		}

		if (c1 <= 2) {
			System.out.println("El numero es primo");
		} else {
			System.out.println("El numero no es primo");
		}

	}
}