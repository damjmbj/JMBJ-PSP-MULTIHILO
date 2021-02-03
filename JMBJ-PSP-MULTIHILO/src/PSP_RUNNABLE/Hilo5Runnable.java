package PSP_RUNNABLE;

/**
 * 
 * @author JMBJ
 * 
 * implements Runnable
 */
public class Hilo5Runnable implements Runnable {

	/**
	 * Al utilizar la interfaz Runnable 
	 * se implementa obligatoriamente
	 * run()
	 */
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Soy el hilo, me estoy ejecutando ");
		}
	}

}
