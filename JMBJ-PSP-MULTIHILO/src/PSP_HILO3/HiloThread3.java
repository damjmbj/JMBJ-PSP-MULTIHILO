package PSP_HILO3;
/**
 * 
 * @author JMBJ 
 *
 */
public class HiloThread3 extends Thread {

	@SuppressWarnings("static-access")
	public void run() {
		System.out.println(" dentro del hilo : " + Thread.currentThread().getName() +
				"\n\t Prioridad : " + Thread.currentThread().getPriority() + 
				"\n\t ID : " +Thread.currentThread().getId() + 
				"\n\t Hilos activos : " +Thread.currentThread().activeCount());
	}
	public static void main(String[] args) {
		Thread.currentThread().setName("Principal");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().toString());
		
		HiloThread3 h = null;
		for (int i = 0; i < 3; i++) {
			h = new HiloThread3(); //CREAMOS EL HILO
			h.setName("HILO" +i); // DAMOS NOMBRE AL HILO
			h.setPriority(i+1); // DAMOS PRIORIDAD
			h.start(); // INICIAMOS EL HILO
			System.out.println("Informacion del " + h.getName() + ": " +h.toString());
			
		}
		System.out.println("3 HILOS CREADOS....");
		System.out.println("Hilos activos: " + Thread.activeCount());
	}
}
