package PSP_HILO_COMPARTIR;
/**
 * 
 * @author JMBJ 
 *
 */
class Contador {
	
	private int c= 0;
	
	Contador(int c ){
		this.c=c;
	}
	
	public void incrementa() {
		c+=1;
	}
	
	public void decrementa() {
		c-=1;
	}
	
	public int getValor() {
		return c;
	}
}


class HiloA extends Thread{
	private Contador contador;
	
	public HiloA(String n, Contador c) {
		setName(n);
		contador= c;
	}
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			contador.incrementa();
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
		}
		
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}

class  HiloB extends Thread {
	
	private Contador contador;
	
	public HiloB(String n, Contador c) {
		setName(n);
		contador = c;
	}
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			contador.decrementa();
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
		}
		System.out.println(getName() + " contador vale " + contador.getValor());
	}
}

public class HiloCompartir {

	public static void main(String[] args) {

		Contador cont = new Contador(100);
		HiloA a = new HiloA("Hilo A", cont);
		HiloB b = new HiloB("Hilo B" , cont);
		
		a.start();
		b.start();

		
	}

}
