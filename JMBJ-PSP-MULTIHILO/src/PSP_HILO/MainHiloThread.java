package PSP_HILO;

public class MainHiloThread {

	public static void main(String[] args) {
		
		HiloThread hilo = new HiloThread();
		hilo.start();
		System.out.println(" soy la clase que lanza el hilo...");

	}

}
