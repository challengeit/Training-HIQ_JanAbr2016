package model;

public class Product {
	
	public static int ID = 1;
	int _id = 1;
	
	public String toString() {
		Product p = new Product();
		return "I'm a Product! " + ID;
	}
	
	public static void staticMethod() {
		System.out.println(ID);
	}

}
