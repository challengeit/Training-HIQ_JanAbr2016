package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ShoppingCart {
	
	private final List<Item> _items = new ArrayList<>();
	
	private final ReadWriteLock _readWriteLock = new ReentrantReadWriteLock(false);
	
	public void addItem(Item item) {
		boolean aquireLock;
		try {
			aquireLock = _readWriteLock.writeLock().tryLock(1, TimeUnit.MILLISECONDS);
			if(aquireLock) {
				_items.add(item);
				_readWriteLock.writeLock().unlock();			
			}
		} catch (InterruptedException e) {}
	}
	
	public int getNumberOfItems() {
		int size;
		_readWriteLock.readLock().lock();
			size = _items.size();
		_readWriteLock.readLock().unlock();
		return size;
	}
	
	public String getSummary() {
		StringBuilder builder = new StringBuilder("Summary:\n");
		
		_readWriteLock.readLock().lock();
			for (Item item : _items) {
				builder.append(item.toString());
			}
			builder.append("\nTotal: ").append(getTotalPrice());			
		_readWriteLock.readLock().unlock();
		
		return builder.toString();
	}
	
	public double getTotalPrice() {
		double total = 0;
		
		// Reentrant
		_readWriteLock.readLock().lock();
			for (Item item : _items) {
				total += item.getPrice();
			}			
		_readWriteLock.readLock().unlock();
		
		return total;
	}
}
