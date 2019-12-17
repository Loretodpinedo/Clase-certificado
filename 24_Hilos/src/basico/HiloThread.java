package basico;

//para crear un hilo en java tenemos que extyender
//de la clase Thread o implementar la interface Runnable

public class HiloThread extends Thread {

	private String nombreHilo;

	public HiloThread(String nombreHilo) {
		this.nombreHilo = nombreHilo;

	}

	// El hilo arranca en este metodo y morira cuando
	// acabe este metodo.

	@Override
	public void run() {

		System.out.println("Hola mundo Thread");
		for (int i = 0; i <= 100; i++) {
			System.out.println("Hilo " + nombreHilo + "Contador: " + i);

			try {
				Thread.sleep(200);// dormimos el hilo 200 milisegundo
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
