package domain.toys;

import domain.Chef;

public class ActionMan extends Toy implements Chef {

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

//	@Override
//	public int getStatus() {
//		return 100;
//	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descatate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		System.out.println("M1");
	}
}