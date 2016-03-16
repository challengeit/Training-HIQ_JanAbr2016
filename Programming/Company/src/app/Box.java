package app;

import model.Manager;
import model.Worker;

public class Box<T extends Worker> {
	
	private final T _obj;
	
	public Box(T obj) {
		_obj = obj;
	}
	
	final public T get() {
		return _obj;
	}
	
	public static void displayBox(Box<?> box) {
		System.out.println(box.get());
	}
}
