package threads;

public class CounterDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		final Counter counter = new Counter(0);
		
		Runnable runnable = new Runnable() {	
			@Override
			public void run() {
				try { Thread.sleep(500); }catch (InterruptedException e) {}
				counter.increment();
			}
		};
		
		final int MAX_THREADS = 1000;
		Thread[] threads = new Thread[MAX_THREADS];
		
		for (int i = 0; i < threads.length; i++)
			threads[i] = new Thread(runnable);
		
		for (Thread thread : threads) 
			thread.start();
		
		for (Thread thread : threads) 
			thread.join();
		
		System.out.println(counter.getValue());
	}
}
