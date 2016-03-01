package model;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public abstract class Person {
	
	private String name;
	private final Date birthday;
	private String address;
	
	public Person(Date birthday) {
		super();
		this.birthday = birthday;
	}
	
	public Person(Date birthday, String name, String address) {
		this(birthday);
		setName(name);
		setAddress(address);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		LocalDate now 		= new LocalDate();
		LocalDate birthdayD = new LocalDate(this.birthday.getTime());
		
		Period period = new Period(birthdayD, now, PeriodType.yearMonthDay());
		return period.getYears();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Person))
			return false;
		
		return this.getName().equals(((Person)obj).getName());
	}
}
