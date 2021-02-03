package PSP_HILO_PRIORIDAD;
/**
 * 
 * @author JMBJ 
 *
 */
public class HiloPrioridad1 {

	public static void main(String[] args) {
		HiloPrioridad h1 = new HiloPrioridad("Hilo1");
		HiloPrioridad h2 = new HiloPrioridad("Hilo2");
		HiloPrioridad h3 = new HiloPrioridad("Hilo3");

		/**
		 * declaramos la PRIORIDAD
		 */
		h1.setPriority(Thread.NORM_PRIORITY);
		h2.setPriority(Thread.MAX_PRIORITY);
		h3.setPriority(Thread.MIN_PRIORITY);
		
		/**
		 * INICIAMOS LOS HILOS
		 */
		
		h1.start();
		h2.start();
		h3.start();
		
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		h1.pararHilo();
		h2.pararHilo();
		h3.pararHilo();
		
		System.out.println("hilo 1 [PRIORIDAD NORMAL] " +h1.getContador());
		System.out.println("hilo 2 [PRIORIDAD MAXIMA] " +h2.getContador());
		System.out.println("hilo 3 [PRIORIDAD MINIMA] " +h3.getContador());


	}

}
