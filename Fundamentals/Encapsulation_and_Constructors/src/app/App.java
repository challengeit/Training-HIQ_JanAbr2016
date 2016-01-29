package app;

import domain.Person;

public class App {
	
	public static void main(String[] args) {
		Person p = new Person("Ricardo", 26, 123467);
		System.out.println(p.setAge(10));
		p.setName("Diogo");
		
		System.out.println(p);
		
	}
}
