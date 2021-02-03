package PSP_HILO_JOIN;
/**
 * 
 * @author JMBJ 
 *
 */
public class HiloJoin extends Thread {

	private int n;
	public HiloJoin(String nom, int n) {
		super(nom);
		this.n=n;
	}
	
	public void run() {
		for (int i = 1; i <= n; i++) {
			System.out.println(getName() + ": " +i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		System.out.println("Fin bucle " +getName());
	}
}
