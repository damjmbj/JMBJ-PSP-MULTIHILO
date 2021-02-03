package PSP_HILO_INTERRUPCION;
 /**
  * 
  * @author JMBJ 
  *	Parada segura
  * Para suspender de forma segura un hilo se debe introducir en el hilo una variable
  * (bool) y comprobar su valor dentro del método run(). 
  * El método suspend()(obsoleto) tiende a producir situaciones de interbloqueo.

  * Otra forma de finalizar el hilo es mediante una interrupción.
  */
public class Interrupcion extends Thread{

	
	public void run() {
		try {
			while(!isInterrupted()) {
				System.out.println("En el hilo");
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			System.out.println("Ha ocurrido una excepcion");
		}
		System.out.println("FIN HILO");
	}
	
	//Otra forma de finalizar el hilo es mediante una interrupción.
	public void interrumpir() {
		interrupt();
	}
	
	
	public static void main(String[] args) {
		Interrupcion h = new Interrupcion();
		h.start();

		/**
		 * Una vez llame al metodo interrumpir se 
		 * escribira la linea 19 
		 * FIN HILO
		 */
		for (int i = 0; i < 10000000; i++) {
			h.interrumpir();
		}
		
		/**
		 * Miesntras que no se llame al metodo interrumpir 
		 * se escribira en bucle la linea 13
		 * EN EL HILO
		 */
	}

}
