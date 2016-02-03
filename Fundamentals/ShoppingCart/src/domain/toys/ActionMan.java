package domain.toys;

public class ActionMan extends Toy {

	private final String type;
	
	public ActionMan(int id, String name, float price, int minimumAge, String type) {
		super(id, name, price, minimumAge);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", type: " + getType() + "}";
	}
}