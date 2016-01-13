
public class ShoppingCart {
	
	/*
	 * Attributes
	 */
	float total;
	boolean finish;
	Customer costumer;
	Product[] products;
	int cartSize;
	
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
		
		if(cartSize < products.length) {
			products[cartSize++] = product;
			total += product.price;			
		}
	}
	
	public void removeProduct(int id) {
		for (int i = 0; i < products.length; i++) {
			if(products[i].id == id) {
				products[i] = null;
			}
		}
	}
	
	public boolean isFinished() {
		return finish;
	}
}
