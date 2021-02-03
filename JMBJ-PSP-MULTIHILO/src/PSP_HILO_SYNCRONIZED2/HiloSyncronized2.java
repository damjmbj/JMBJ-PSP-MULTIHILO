package PSP_HILO_SYNCRONIZED2;

class Cuenta {
	private int saldo;

	Cuenta(int s) {
		saldo = s;
	}

	int getSaldo() {
		return saldo;
	}

	void restar(int cantidad) {
		saldo -= cantidad;
	}
	void RetirarDinero(int cant, String nom) {
		if (getSaldo() >= cant) {
			System.out.println(nom +": SE VA RETIRAR SALDO (ACTUAL ES : "+getSaldo() + ")");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				restar(cant);
				System.out.println("\t" +nom + " retira =>" +cant+ " ACTUAL (" + getSaldo()+ ")");
			}
		}else {
			System.out.println("no se puede retirar dinero, SALDO INSUFICIENTE " + getSaldo());
		}
		
		if (getSaldo() < 0) {
			System.out.println("SU SALDO ES NEGATIVO " +getSaldo());
		}
	}

}

class SacarDinero extends Thread {
	private Cuenta c;

	public SacarDinero(String n, Cuenta c) {
		super(n);
		this.c = c;
	}

	public void run() {
		for (int x = 1; x <= 4; x++) {
			c.RetirarDinero(10, getName());
		}
	}
}

public class HiloSyncronized2 {

	public static void main(String[] args) {

		Cuenta c = new Cuenta(40);
		SacarDinero h1 = new SacarDinero("JOSE", c);
		SacarDinero h2 = new SacarDinero("MANUEL", c);
		
		h1.start();
		h2.start();
	}

}
