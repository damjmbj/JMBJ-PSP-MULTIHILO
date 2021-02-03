package PSP_HILO2;
/**
 * 
 * @author JMBJ 
 *
 */
public class HiloThread2 extends Thread {

	public HiloThread2(String nombre) {
		super(nombre);
		System.out.println("CREANDO HILO: " + getName());
	}
	/**
	 * Creara al azar cualquier hilo puede ser 1 3 2 ||  3 2 1 || en orden 1, 2, 3
	 * lo que si el run creara su 5 hilo
	 */
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo: " +getName() + " C = " + i);
		}
	}
	
	public static void main (String[] args) {
		String hilo1 = "Hilo1";
		String hilo2 = "Hilo2";
		String hilo3 = "Hilo3";

		HiloThread2 h1 =new HiloThread2(hilo1);
		HiloThread2 h2 =new HiloThread2(hilo2);
		HiloThread2 h3 =new HiloThread2(hilo3);
		
		h1.start();
		h2.start();
		h3.start();

		System.out.println("3 Hilos Iniciados.");

	}
}
