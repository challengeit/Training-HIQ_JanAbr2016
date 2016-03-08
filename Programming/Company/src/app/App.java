package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import loggers.ConsoleLogger;
import messages.DebugMessage;
import messages.InfoMessage;
import model.Employee;
import model.Engineer;
import model.ILogger;
import model.Manager;
import model.Person;
import model.Person.Hobby;

public class App {

	public static final ILogger LOGGER = new ConsoleLogger();
	
	public static void main(String[] args) throws ParseException {
		//		Employee emp1 = new Employee(null, "Ricardo", null, 0);
		//		Employee emp2 = new Employee(null, "Ze", null, 1);
		//		Employee emp3 = new Employee(null, "Rui", null, 2);
		//		
		//		Employee emp4 = new Employee(null, "Ze", null, 1);
		//		
		//		Manager manager = new Manager(null, "Diogo", null, 3);
		//		manager.addEmployee(emp1);
		//		manager.addEmployee(emp2);
		//		manager.addEmployee(emp3);
		//		manager.addEmployee(new Manager(null, "Luis", null, 10));
		//		
		//		System.out.println(manager.delEmployee(emp4));

		//		Manager manager = (Manager)new Employee(null, 0);
		//		Engineer engineer = new Engineer(null, "Ricardo", null, 4);
		//		System.out.println(manager.getName());

		//		Engineer engineer = new Engineer(null, "Ricardo", null, 4);
		//		engineer.work();
		
//		Employee emp = new Employee(new SimpleDateFormat("yyyy-MM-dd").parse("1989-04-08"), 
//				"Ricardo", 
//				"Av. XXX", 
//				1) {
//			
//			@Override
//			public String getName() {
//				return "Ze";
//			}
//		
//		};
		
		final int[] x = new int[1];
		Employee emp2 = new Employee(new SimpleDateFormat("yyyy-MM-dd").parse("1989-04-08"), 
														  "Ricardo", 
														  "Av. XXX", 
														  1) {
			
			@Override
			public String getName() {
				class B {
					
				}
				
				x[0] = 2;
				
				
				System.out.println(x);
				
				// TODO Auto-generated method stub
				return super.getName();
			}
		};
	
		System.out.println(emp2.getName());
//		System.out.println(emp.getAge());
//		System.out.println("Person: " + (emp instanceof Person));
//		System.out.println("Employee: " + (emp instanceof Employee));
//		System.out.println("Manager: " + (emp instanceof Manager));
//		System.out.println("Engineer: " + (emp instanceof Engineer));
		
		LOGGER.write(new DebugMessage("OLA MUNDO"));
		
		Person p = new Manager(null, "Ze", null, 1);
		Hobby hobby = p. new Hobby("andar de bicicleta");
		p.addHobby(hobby);
		p.addHobby(p. new Hobby("tomar banho"));
		
		System.out.println(p.getHobbies());
	}
}
