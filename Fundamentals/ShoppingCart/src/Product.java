
public class Product {
	
	/*
	 * Attributes
	 */
	private int id;
	private String name;
	private float price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
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
				.append("}")
				.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getId() == ((Product)obj).getId() && 
			   this.getName().equals(((Product)obj).getName());
	}
}
