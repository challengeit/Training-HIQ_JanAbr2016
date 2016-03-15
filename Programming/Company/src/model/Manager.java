package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Manager extends Employee {
	
	private List<Employee> employees;
	
	public Manager(Date birthday, String name, String address, int id, Gender gender) {
		super(birthday, name, address, id, gender);
	}
	
	public boolean addEmployee(Employee emp) {
		if(emp instanceof Manager)
			return false;
		
		if(employees == null)
			employees = new ArrayList<Employee>();
		
		return employees.add(emp);
	}
	
	public boolean delEmployee(Employee emp) {
		return employees.remove(emp);
	}
}
