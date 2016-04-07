package synchronizers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Phaser;

public class CyclicBarrier {
	
	public static void main(String[] args) throws InterruptedException {
//		final java.util.concurrent.CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(2);
//		
//		Thread t1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try { barrier.await(); } catch (InterruptedException | BrokenBarrierException e) {}
//				System.out.println("Thread T1");
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try { barrier.await(); } catch (InterruptedException | BrokenBarrierException e) {}
//				System.out.println("Thread T2");
//			}
//		});
//		
//		t1.start();
//		t2.start();
		
		final Phaser phaser = new Phaser(4);
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				phaser.arrive();
				System.out.println("Thread T1");
				phaser.arriveAndAwaitAdvance();
				System.out.println("Thread T1 after");
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				phaser.arriveAndAwaitAdvance();
				System.out.println("Thread T2");
			}
		});
		
		t1.start();
		t2.start();
	}
}
