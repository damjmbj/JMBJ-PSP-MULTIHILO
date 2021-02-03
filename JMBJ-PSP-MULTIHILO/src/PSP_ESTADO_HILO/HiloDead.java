package PSP_ESTADO_HILO;


/**
 * 
 * @author JMBJ
 *
 *	DETIENE EL HILO DE FORMA SEGURA USANDO UNA VARIABLE
 */
public class HiloDead extends Thread {

	private boolean stopHilo = false;
	
	public void pararHilo() {
		stopHilo=true;
	}
	
	public void run() {
		while(!stopHilo) {
			System.out.println("En el hilo...");
		}
	}
	
	public static void main(String[] args) {
		HiloDead h = new HiloDead();
		
		h.start();
		// No hago nada
		for (int i = 0; i < 100000; i++) 
			h.pararHilo();
		
	}
}
