package application;

import model.Product;
import static model.Product.*;
//import static model.Customer.*; - Atenção

public class App {
	
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.toString());
		ID = 2;
		System.out.println(ID);
		staticMethod();
		
		float ageInYears = 100;
		//String str = 170.5F;	
	}
	
	public void nonStaticMethod() {
		System.out.println(Product.ID);
		staticMethod();
	}
}
