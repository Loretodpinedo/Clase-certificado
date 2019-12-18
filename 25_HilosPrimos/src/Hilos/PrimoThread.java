package Hilos;

public class PrimoThread extends Thread{
	
	private String primoHilo;

	public PrimoThread(String primoHilo) {
		
		this.primoHilo = primoHilo;
	}
	
	int i = 0, c1 = 0, n1 = 0;
	
	@Override
	public void run() {
		
		for(i = 1; i <= n1; i++)
	     {
	         if((n1 % i) == 0)
	         {
	             c1++;
	         }
	     }

	     if(c1 <= 2)
	     {
	         System.out.println("El numero es primo");
	     }else{
	         System.out.println("El numero no es primo");
	     }
		
		
	}
	
	

	

}
