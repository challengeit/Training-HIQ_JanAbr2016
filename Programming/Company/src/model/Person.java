package model;

//import static model.Gender.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public abstract class Person {
	
	private String name;
	private final Date birthday;
	private String address;
	private Gender gender;
	
	private List<Hobby> hobbies;
	
	public Person(Date birthday) {
		super();
		this.birthday = birthday;
	}
	
	public Person(Date birthday, String name, String address, Gender gender) {
		this(birthday);
		setName(name);
		setAddress(address);
		setGender(gender);
		
		gender = Gender.M;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
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
	
	public List<Hobby> getHobbies() {
		return hobbies;
	}
	
	public void addHobby(Hobby hobby) {
		if(hobbies == null)
			hobbies = new ArrayList<Hobby>();
		
		hobbies.add(hobby);
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
	
	enum SimpleGender { C, D; } 
	
	public void abc() {
		model.SimpleGender a = model.SimpleGender.F;
		SimpleGender b = Person.SimpleGender.C;
	
		switch(gender) {
		case M: System.out.println("M"); break;
		case F: System.out.println("F"); break;
		}
	}
	
	public class Hobby {
		
		private final String name;
		
		public Hobby(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {			
//			return Person.this.name + ":" + name;
			return getName() + ":" + name;
		}
	}
}

