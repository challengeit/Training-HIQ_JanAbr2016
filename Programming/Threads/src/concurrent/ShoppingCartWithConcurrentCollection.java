package concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ShoppingCartWithConcurrentCollection {

	private final List<Item> _items = new CopyOnWriteArrayList<>();

	public void addItem(Item item) {
		_items.add(item);
	}

	public int getNumberOfItems() {
		return _items.size();
	}

	public String getSummary() {
		StringBuilder builder = new StringBuilder("Summary:\n");

		for (Item item : _items) {
			builder.append(item.toString());
		}
		builder.append("\nTotal: ").append(getTotalPrice());

		return builder.toString();
	}

	public double getTotalPrice() {
		double total = 0;

		for (Item item : _items) {
			total += item.getPrice();
		}			

		return total;
	}
}
