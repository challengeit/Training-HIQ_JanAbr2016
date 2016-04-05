package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger _counter;
	
	public Counter(int initValue) {
		_counter = new AtomicInteger(initValue);
	}
	
	public void increment() {
		_counter.incrementAndGet();
	}
	
	public void incrementIfEqualThan(int value) {
		int val = _counter.get() +1;
		_counter.compareAndSet(value, val);
	}
	
	public int getValue() {
		return _counter.get();
	}
}
