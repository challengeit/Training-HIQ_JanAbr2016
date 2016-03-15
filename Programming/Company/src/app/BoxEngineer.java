package app;

import model.Engineer;

public class BoxEngineer {
	
	private final Engineer _engineer;
	
	public BoxEngineer(Engineer engineer) {
		_engineer = engineer;
	}
	
	public Engineer getEngineer() {
		return _engineer;
	}
}
