package PSP_HILO;

public class HiloThread extends Thread {

	public void run () {
		for (int i = 0; i < 5; i++) {
			System.out.println("Soy un hilo y me estoy ejecutando");
		}
	}
}
