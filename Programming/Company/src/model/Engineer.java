package model;

import java.util.Date;

import static app.App.LOGGER;
import messages.DebugMessage;

public class Engineer extends Employee implements Worker {
	
	public Engineer(Date birthday, String name, String address, int id) {
		super(birthday, name, address, id);
	}

	@Override
	public void work() {
		while(true) {
			LOGGER.write(new DebugMessage("TRABALHA AI"));
		}
	}	
}
