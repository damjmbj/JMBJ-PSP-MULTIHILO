package PSP_HILO_PRIORIDAD;
/**
 * 
 * @author JMBJ 
 *
 */
public class HiloPrioridad extends Thread{

	private int c = 0;
	private boolean stopHilo = false;
	
	public HiloPrioridad(String nombre) {
		super(nombre);
	}
	
	public int getContador() {
		return c;
	}
	
	public void pararHilo() {
		stopHilo = true;
	}
	
	public void run() {
		while (!stopHilo) {
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				// TODO: handle exception
			}
			c++;
		}
		System.out.println("Fin hilo "+ this.getName());
	}
}
