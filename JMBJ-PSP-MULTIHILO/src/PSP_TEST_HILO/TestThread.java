package PSP_TEST_HILO;

public class TestThread {

	public static void main(String[] args) {

		MiThread m = new MiThread("Hilo1");
		m.start();
		
		MiThread m2 = new MiThread("Hilo2");
		m2.start();
		
		System.out.println("*******FIN*******");
	}

	public static class MiThread extends Thread {
		private String name;

		public MiThread(String name) {
			this.name = name;
		}
		
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(name + ": " + i);
			}
		}
	}
}
