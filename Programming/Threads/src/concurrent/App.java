package concurrent;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		final ShoppingCart shoppingCart = new ShoppingCart();
		
//		shoppingCart.addItem(new Item("Apple Mackbook Pro", 1500));
//		shoppingCart.addItem(new Item("Apple Iphone 5S", 600));
//		shoppingCart.addItem(new Item("Apple Ipad Air", 800));
//		shoppingCart.addItem(new Item("Apple Magic Mouse", 60));
//		System.out.println(shoppingCart.getSummary());
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Mackbook Pro", 1500));
				System.out.println(shoppingCart.getNumberOfItems());
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Iphone 5S", 600));
				System.out.println(shoppingCart.getNumberOfItems());
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Ipad Air", 800));
				System.out.println(shoppingCart.getNumberOfItems());
			}
		});
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(shoppingCart.getNumberOfItems());
				shoppingCart.addItem(new Item("Apple Magic Mouse", 60));
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		System.out.println(shoppingCart.getSummary());
	}
}
