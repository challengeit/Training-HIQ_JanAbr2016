package domain;

public abstract class Product {
	
	/*
	 * Attributes
	 */
	private final int id;
	private String name;
	private float price;
	
	public Product(int id) {
		this.id = id;
	}
	
	public Product(int id, String name, float price) {
		this(id);
		setName(name);
		setPrice(price);
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	protected abstract float calculateIVA();

	public final float getPrice() {
		return price * calculateIVA();
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("{id: ")
				.append(this.getId())
				.append(", name: ")
				.append(this.getName())
				.append(", price: ")
				.append(this.getPrice())
//				.append("}")
				.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product))
			return false;
		
		return this.getId() == ((Product)obj).getId() && 
			   this.getName().equals(((Product)obj).getName());
	}
}