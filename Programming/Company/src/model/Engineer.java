package model;

import java.util.Date;

import static app.App.LOGGER;
import messages.DebugMessage;

public class Engineer extends Employee implements Worker {

	private static volatile Engineer singleton; //= new Engineer(null, "Ze", null, 0);

	public static Engineer getInstance() {
		if(singleton == null) {
			synchronized (Engineer.class) {
				if(singleton == null)
					singleton = new Engineer(null, "Ze", null, 0);				
			}
		}

		return singleton;
	}


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
