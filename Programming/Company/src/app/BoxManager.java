package app;

import model.Manager;

public class BoxManager {
	
	private final Manager _manager;
	
	public BoxManager(Manager manager) {
		_manager = manager;
	}
	
	public Manager getManager() {
		return _manager;
	}
}
