package threads;

public class Counter {
	
	private volatile int _counter;
	
//	private final Object monitor = new Object();
	
	public Counter(int initValue) {
		_counter = initValue;
	}
	
	public void increment() {
//		synchronized (monitor) {
//			_counter++;			
//		}
		System.out.println("invoked");
		synchronized (this) {
			_counter++;			
		}
	}
	
	public int getValue() {
		return _counter;
	}
}
