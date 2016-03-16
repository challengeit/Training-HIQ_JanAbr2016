package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import loggers.ConsoleLogger;
import messages.DebugMessage;
import messages.InfoMessage;
import model.Employee;
import model.Engineer;
import model.Gender;
import model.ILogger;
import model.Manager;
import model.Person;
import model.Person.Hobby;
import model.Worker;

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
		
//		final int[] x = new int[1];
//		Employee emp2 = new Employee(new SimpleDateFormat("yyyy-MM-dd").parse("1989-04-08"), 
//														  "Ricardo", 
//														  "Av. XXX", 
//														  1) {
//			
//			@Override
//			public String getName() {
//				class B {
//					
//				}
//				
//				x[0] = 2;
//				
//				
//				System.out.println(x);
//				
//				// TODO Auto-generated method stub
//				return super.getName();
//			}
//		};
	
//		System.out.println(emp2.getName());
//		System.out.println(emp.getAge());
//		System.out.println("Person: " + (emp instanceof Person));
//		System.out.println("Employee: " + (emp instanceof Employee));
//		System.out.println("Manager: " + (emp instanceof Manager));
//		System.out.println("Engineer: " + (emp instanceof Engineer));
		
//		LOGGER.write(new DebugMessage("OLA MUNDO"));
//		Person p = new Manager(null, "Ze", null, 1);
//		Hobby hobby = p. new Hobby("andar de bicicleta");
//		p.addHobby(hobby);
//		p.addHobby(p. new Hobby("tomar banho"));
//		System.out.println(p.getHobbies());
		
//		Box<String> boxStr = new Box<>("String");
//		Box<Integer> boxInt = new Box<>(10);
//		System.out.println(boxStr.get().length());
//		System.out.println(boxInt.get().intValue());
		
//		Box engineerBox = new Box(new Engineer(null, "Maria", null, 0, Gender.F));
//		Box.displayBox(engineerBox);
//		Box.displayBox(new Box<Engineer>(null));
//		Box<Person> managerBox = new Box<>(new Manager(null, null, null, 0, null));
//		Person man = managerBox.get();
//		Box.<Manager>displayBox(managerBox);
		
//		List<Integer> strs = new ArrayList<>();
//		strs.add(10);
//		int num3 = strs.get(0);
//		System.out.println(num3);
//		Integer num1 = 10;//Autoboxing //new Integer(10);
//		int num2 = 20;
//		num2 = num1; // Unboxing
//		System.out.println(num2);
		
//		List<Integer> strs = new ArrayList<>();
//		strs.add(10);
//		strs.add(0, 20);
//		System.out.println(strs);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
//		Set<Engineer> engs = new TreeSet<>();
//		engs.add(new Engineer(df.parse("1988-04-08"), "Ricardo", "Olaias", 1, Gender.M));
//		engs.add(new Engineer(df.parse("1989-05-10"), "Diogo", "Olaias", 2, Gender.M));
//		
//		for (Engineer engineer : engs) {
//			System.out.println(engineer.getName());
//		}
		
		List<Engineer> engs = new ArrayList<>();
		engs.add(new Engineer(df.parse("1988-04-08"), "Ricardo", "Olaias", 1, Gender.M));
		engs.add(new Engineer(df.parse("1989-05-10"), "Diogo", "Olaias", 2, Gender.M));
		
		Collections.sort(engs, new Comparator<Engineer>() {
			@Override
			public int compare(Engineer o1, Engineer o2) {
				if(o1.getAge() == o2.getAge())
					return 0;
				if(o1.getAge() < o2.getAge())
					return -1;
				
				return 1;
			}
		});
		
		for (Engineer engineer : engs) {
			System.out.println(engineer.getName());
		}
		
		System.out.println();
		
		Collections.sort(engs, new Comparator<Engineer>() {
			@Override
			public int compare(Engineer o1, Engineer o2) {
				if(o1.getId() == o2.getId())
					return 0;
				if(o1.getId() < o2.getId())
					return -1;
				
				return 1;
			}
		});
		
		for (Engineer engineer : engs) {
			System.out.println(engineer.getName());
		}
	}
}
