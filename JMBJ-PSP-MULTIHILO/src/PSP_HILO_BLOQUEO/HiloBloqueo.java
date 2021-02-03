package PSP_HILO_BLOQUEO;

/**
 * 
 * @author JMBJ 
 *
 */

class ObjectoCompartido{
	public void MostrarCadena(String s) {
		System.out.println(s);
	}
}

class HiloCadena extends Thread{
	
	private ObjectoCompartido objeto;
	String cadena;
	
	public HiloCadena(ObjectoCompartido c, String s) {
		this.objeto = c;
		this.cadena = s;
	}
	/**
	 * Recorrera 10 veces para pintar cada uno de los hilo
	 * y hasta que no acabe no entrara el otro
	 */
	public void run() {
		synchronized (objeto) {
			for (int i = 0; i < 10; i++) {
				objeto.MostrarCadena(cadena);
			}
			System.out.println("\n" +cadena+ " finalizado \n");
		}
	}
}
public class HiloBloqueo {

	public static void main(String[] args) {
		ObjectoCompartido compartido = new ObjectoCompartido();
		
		HiloCadena a = new HiloCadena(compartido, " A ");
		HiloCadena b = new HiloCadena(compartido, " B ");
		
		a.start();
		b.start();
	}
}
