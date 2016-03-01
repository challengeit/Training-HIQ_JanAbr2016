package model;

import java.util.Date;

public class Engineer extends Employee implements Worker {
	
	public Engineer(Date birthday, String name, String address, int id) {
		super(birthday, name, address, id);
	}

	@Override
	public void work() {
		while(true);
	}	
}
