package domain.toys;

import domain.Product;

public abstract class Toy extends Product {
	
	private int minimumAge;
	
	public Toy(int id, String name, float price) {
		super(id, name, price);
	}
	
	public Toy(int id, String name, float price, int minimumAge) {
		this(id, name, price);
		setMinimumAge(minimumAge);
	}
	
	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}
	
	public int getMinimumAge() {
		return minimumAge;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", minimumAge: " + getMinimumAge();
	}
	
	@Override
	public float calculateIVA() {
		return 1.23F;
	}
}
