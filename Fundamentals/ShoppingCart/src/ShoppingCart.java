
public class ShoppingCart {
	
	/*
	 * Attributes
	 */
	private float total;
	private boolean finish;
	private Customer customer;
	private Product[] products;
	private int cartSize;
	
	/*
	 * Actions
	 */
	public void addProduct(Product product) {
		// total = total + product.price;
//		for (int i = 0; i < products.length; i++) {
//			if(products[i] != null)
//				continue;
//			products[i] = product;

//			if(products[i] == null) {
//				products[i] = product; 
//				total += product.price;
//				break;
//			}
//		}
		//if(!finish) {
			if(!finish && cartSize < products.length) {
				products[cartSize++] = product;
				total += product.getPrice();			
			}			
		//}
	}
	
	public void removeProduct(int id) {
		if(finish) return;
		for (int i = 0; i < products.length; i++) {
			if(products[i].getId() == id) {
				total -= products[i].getPrice();
				products[i] = products[--cartSize];
				products[cartSize] = null;
				break;
			}
		}
	}
	
	public boolean isFinished() {
		return finish;
	}
	
	public void finish() {
		finish = true;
	}
	
	public void printProducts() {
		for (int i = 0; i < products.length; i++) {
			if(products[i] != null)
				System.out.println(products[i].getId());
		}
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setProducts(int size) {
		if(products == null)
			products = new Product[size];
	}
}