
public class Store {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.name = "Diogo";
		
		Product p1 = new Product();
		p1.id = 1;
		p1.name = "Batatas";
		p1.price = 2.3F;
		
		Product p2 = new Product();
		p2.id = 2;
		p2.name = "Couves";
		p2.price = 0.6F;
		
		Product p3 = new Product();
		p3.id = 3;
		p3.name = "Cenouras";
		p3.price = 1.4F;
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setCustomer(customer);
		shoppingCart.setProducts(10);
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);		
		
		shoppingCart.setProducts(0);
		
		System.out.println("Total: " + shoppingCart.getTotal());
		shoppingCart.getCustomer().name = "Ricardo";
		System.out.println("Customer's Name: " + customer.name);
		System.out.println("SC Customer's Name: " + shoppingCart.getCustomer().name);
		shoppingCart.printProducts();
		
		shoppingCart.removeProduct(p2.id);
		//System.out.println(shoppingCart.products);
		shoppingCart.printProducts();
		
		shoppingCart.removeProduct(p1.id);
		shoppingCart.printProducts();
		
		shoppingCart.removeProduct(p3.id);
		shoppingCart.printProducts();
		
		System.out.println("[B] isFinished? " + shoppingCart.isFinished());
		shoppingCart.finish();
		System.out.println("[A] isFinished? " + shoppingCart.isFinished());
		
		shoppingCart.addProduct(p1);
		shoppingCart.printProducts();
		
		shoppingCart.removeProduct(p1.id);
		shoppingCart.printProducts();
	}
}
