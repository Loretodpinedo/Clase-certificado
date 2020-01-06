package basico;

public class HiloRunnable implements Runnable {

	private String nombreHilo;

	public HiloRunnable(String nombreHilo) {
		this.nombreHilo = nombreHilo;

	}

	// El hilo arranca en este metodo y morira cuando
	// acabe este metodo.

	@Override
	public void run() {

		System.out.println("Hola mundo Runnable");
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