package basico;

public class LanzadoraHilos {

	public static void main(String[] args) {

		HiloThread ht1 = new HiloThread("A ");
		HiloThread ht2 = new HiloThread("B ");

		// una vez creados los objetos hilos, los decimos
		// que arranquen.

		 ht1.start();
		 ht2.start();

		// de esta manera se ejecuta primero ht1 y despues ht2, abre hilos.
		// ht1.run();
		// ht2.run();

		// con runnable primero tenemos que crear el objeto runnable

		HiloRunnable hr1 = new HiloRunnable("C ");
		HiloRunnable hr2 = new HiloRunnable("D ");

		// y a continuacion crear un objeto Hilo pasandole el objeto
		// runnable
		Thread t1 = new Thread(hr1);
		Thread t2 = new Thread(hr2);

		// si pasamos el mismo objeto a ambos hilos, podemos
		// tener problemas de concurrencia, ya que ambos
		// hilos estan ejecutando el mismo objeto.

		// y ahora podemos arrancar el hilo de manera normal
		// el hilo ejecutrara el metodo run del objeto pasado
		// por parametro

		t1.start();
		t2.start();

	}

}
