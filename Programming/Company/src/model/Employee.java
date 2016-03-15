package model;

import java.util.Date;

public class Employee extends Person {
	
	private final int id;
	
	public Employee(Date birthday, int id) {
		this(birthday, null, null, id, null);
	}
	
	public Employee(Date birthday, String name, String address, int id, Gender gender) {
		super(birthday, name, address, gender);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Employee))
			return false;
		
		return super.equals(obj)  && (this.getId() == ((Employee)obj).getId());
	}
}
