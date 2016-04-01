package threads;

public class ThreadDemoShutdown {
	
	private static class WaitForShutdownProcess implements Runnable {
		
		private volatile boolean shutdown;
		
		@Override
		public void run() {
			while(!shutdown); //{
				//System.out.println("loop");
			//}
			System.out.println("Shutdown Process");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WaitForShutdownProcess runnable = new WaitForShutdownProcess();
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		Thread.sleep(5000);
		
		runnable.shutdown = true;
		System.out.println("FINISH");
	}
}
