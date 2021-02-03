package PSP_HILO_BLOQUEO;
/**
 * 
 * @author JMBJ 
 *
 */

class ObjetoCompartido2{
	public void MostrarCadena(String s) {
		System.out.println(s);
	}
}

class HiloCadena2 extends Thread{
	private ObjetoCompartido2 objeto;
	String cadena;
	public HiloCadena2 (ObjetoCompartido2 c, String s) {
		this.cadena = s;
		this.objeto = c;
	}
	/**
	 * lo que hara es intercalandose los hilos
	 * A B A B A B y acabar a la misma vez
	 */
	
	public void run() {
		synchronized (objeto) {
			for (int i = 0; i < 10; i++) {
				objeto.MostrarCadena(cadena);
				//AVISO DE QUE LO EH USADO EL OBJETO
				objeto.notify();
				try {
					//ESPERA A QUE LE LLEGUE UN 
					//	notify()
					objeto.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/**
			 * Despertar a todos los wait sobre el objeto
			 */
			objeto.notify();
		}
		System.out.println("\n " +cadena + " finalizado");
	}
}
public class HiloBloqueo2 {

	public static void main(String [] args) {
		ObjetoCompartido2 compartido = new ObjetoCompartido2();
		HiloCadena2 a = new HiloCadena2(compartido, " A ");
		HiloCadena2 b = new HiloCadena2(compartido, " B ");
		
		a.start();
		b.start();

		
	}
}
