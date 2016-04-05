package synchronizers;

import java.util.concurrent.Semaphore;

public class WC {
	
	private final Semaphore _semaphore;
	
	public WC(int numberOfToilets) {
		_semaphore = new Semaphore(numberOfToilets, true);
	}
	
	public void enter() throws InterruptedException {
		_semaphore.acquire();
		System.out.println("Estou em esforço... " + Thread.currentThread().getName());
		Thread.sleep(5000);
	}
	
	public void exit() {		
		_semaphore.release();
	}
	
	public static void main(String[] args) throws InterruptedException {
		final WC wc = new WC(2);
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try { wc.enter(); } catch (InterruptedException e) {}
				wc.exit();
			}
		};
		
		Thread t1 = new Thread(runnable, "Artur");
		Thread t2 = new Thread(runnable, "Jacinta");
		Thread t3 = new Thread(runnable, "Américo");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}
}
