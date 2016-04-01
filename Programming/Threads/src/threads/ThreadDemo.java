package threads;

public class ThreadDemo {
	
	public static class NetworkThread extends Thread {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Network request...");
		}
	}
	
	public static class NetworkRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			System.out.println("Network request...");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Thread t1 = new Thread(new NetworkRunnable());
		t1.start();
		System.out.println("Finish");
	}
}
