package synchronizers;

import java.util.concurrent.CountDownLatch;

public class Park {
	
	private final CountDownLatch _latch;
	
	public Park(int count) {
		_latch = new CountDownLatch(count);
	}
	
	
	public void enterCar() {
		_latch.countDown();
	}
	
	public void closeGate() {
		do {
			try { _latch.await(); } catch (InterruptedException e) {}
			if(_latch.getCount() == 0)
				return;
			
		}while(true);
	}
	
	public static void main(String[] args) throws InterruptedException {
		final Park park = new Park(3);
		
		Runnable runnable = new Runnable() {	
			@Override
			public void run() {
				System.out.println("Car entered... " + Thread.currentThread().getName());
				park.enterCar();
			}
		};
		
		Thread t1 = new Thread(runnable, "Ferrari");
		Thread t2 = new Thread(runnable, "Porsche");
		Thread t3 = new Thread(runnable, "Lamborghini");
		
		Thread gate = new Thread(new Runnable() {
			@Override
			public void run() {
				park.closeGate();
				System.out.println("GATE CLOSED");
			}
		});
		
		gate.start();
		t1.start();
		t2.start();
		t3.start();
		
		gate.join();
		t1.join();
		t2.join();
		t3.join();
	}
}
