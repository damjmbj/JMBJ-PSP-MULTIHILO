package PSP_RUNNABLE;
/**
 * 
 * @author JMBJ
 * 
 * Lo que mostrara quien se ejecuta y q clase o el hilo 
 * Posible salidas Primero mostrar la linea 24 5veces.
 * y luego de la clase Hilo5Runnable que implementa Runnable
 * imprimera la linea 20 de la clase Hilo5Runnable
 * o Hilo5RunnableUsar ,Hilo5Runnable,Hilo5Runnable,Hilo5RunnableUsar
 */

public class Hilo5RunnableUsar {

	public static void main(String[] args) {

		Hilo5Runnable h = new Hilo5Runnable();
		
		Thread t = new Thread(h);
		
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Soy la clase PRINCIPAL");
		}

	}

}
