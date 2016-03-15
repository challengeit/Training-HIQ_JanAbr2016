package model;

import java.util.Date;

import static app.App.LOGGER;
import messages.DebugMessage;

public class Engineer extends Employee implements Worker, Comparable<Engineer> {

	private static volatile Engineer singleton; //= new Engineer(null, "Ze", null, 0);

	public static Engineer getInstance() {
		if(singleton == null) {
			synchronized (Engineer.class) {
				if(singleton == null)
					singleton = new Engineer(null, "Ze", null, 0, null);				
			}
		}

		return singleton;
	}

	public Engineer(Date birthday, String name, String address, int id, Gender gender) {
		super(birthday, name, address, id, gender);
	}

	@Override
	public void work() {
		while(true) {
			LOGGER.write(new DebugMessage("TRABALHA AI"));
		}
	}
	
	@Override
	public int compareTo(Engineer o) {
		if(this.getAge() == o.getAge())
			return 0;
		if(this.getAge() < o.getAge())
			return -1;
		
		return 1;
	}
}
