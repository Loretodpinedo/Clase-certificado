package Hilos;

import java.util.Scanner;

public class LanzadoraHilos {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	PrimoThread pt1 = new PrimoThread("pt1");
	PrimoThread pt2 = new PrimoThread("pt2");
	PrimoThread pt3 = new PrimoThread("pt3");
	PrimoThread pt4 = new PrimoThread("pt4");
	PrimoThread pt5 = new PrimoThread("pt5");
	
	System.out.println("Dime 5 numeros y te dire si son primos");
	
	
	
	pt1.start();
	pt2.start();
	pt3.start();
	pt4.start();
	pt5.start();
	
	

	

	
	
	//PrimoRunnable pr1 = new PrimoRunnable("pr1");
	//Thread t1 = new 
	
	}

}
