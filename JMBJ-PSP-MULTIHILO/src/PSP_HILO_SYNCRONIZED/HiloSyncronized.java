package PSP_HILO_SYNCRONIZED;


class Contador2{
	private int c= 0;
	public Contador2(int c) {
		this.c =c;
	}
	public void incrementa(){
		c=c+1;
	}
	public void decrementa() {
		c=c-1;
	}
	public int getValor() {
		return c;
	}
}

class HiloA extends Thread{
	private Contador2 contador;
	
	public HiloA(String n, Contador2 c) {
		setName(n);
		contador = c;
	}
	
	public void run() {
		synchronized (contador) {
			for (int i = 0; i < 300; i++) {
				contador.incrementa();
			}
			System.out.println(getName() + " contador vale "+ contador.getValor());
		}
	}
}

class HiloB extends Thread {
	
	private Contador2 contador;
	
	public HiloB(String n, Contador2 c) {
		setName(n);
		contador = c;
	}
	
	public void run() {
		synchronized (contador) {
			for (int i = 0; i < 300; i++) {
				contador.decrementa();
			}
			
			System.out.println(getName() + " contador vale " + contador.getValor());
		}
	}
}

public class HiloSyncronized {

	public static void main(String[] args) {
		Contador2 cont = new Contador2(100);
		
		HiloA a = new HiloA("HiloA", cont);
		HiloB b = new HiloB("HiloB", cont);
		
		a.start();
		b.start();
	}
}
