package PSP_HILO1;

/**
 * 
 * @author JMBJ
 *
 */
public class HiloThread extends Thread{

	private int x;
	
	public HiloThread(int x) {

		this.x= x;
	}
	
	public void run() {
		for (int i = 0; i < x; i++) {
			System.out.println("En el hilo..." + (i+1));
		}
	}
	
	public static void main(String[] args) {
		//Se le pasa un valor x para que en el run muestre en que porque hilo va
		HiloThread p = new HiloThread(5);
		p.start();
	}
}
