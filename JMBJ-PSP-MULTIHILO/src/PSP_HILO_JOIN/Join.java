package PSP_HILO_JOIN;

/**
 * 
 * @author JMBJ 
 *  El método join() provoca que el hilo que
 *  hace la llamada espere a la finalización 
 *  de otros hilos.
 */
public class Join {
	
	public static void main (String[] args) {
		int n1 = 2;
		int n2 = 5;
		int n3 = 7;
		HiloJoin h1 = new HiloJoin("Hilo1", n1);
		HiloJoin h2 = new HiloJoin("Hilo2", n2);
		HiloJoin h3 = new HiloJoin("Hilo3", n3);

		h1.start();
		h2.start();
		h3.start();

		/**
		 * SIN el join() la primera linea que escribia
		 * seria FIN DE PROGRAMA 
		 * 
		 * CON el join() se ejutaria el hilo1 hilo2 hilo3
		 * y por ultimo la ultima linea FIN DE PROGRAMA
		 */
//		try {
//			h1.join();
//			h2.join();
//			h3.join();
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
		System.out.println("FIN DE PROGRAMA");
	}

}
