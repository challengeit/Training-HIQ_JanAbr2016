package serialize;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Wheel implements Serializable {
	
	private final String _brand;
	private final String _model;
	
	public Wheel(String brand, String model) {
		_brand = brand;
		_model = model;
	}
	
	public String getBrand() {
		return _brand;
	}
	
	public String getModel() {
		return _model;
	}
}
