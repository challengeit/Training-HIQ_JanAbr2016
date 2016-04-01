package app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import loggers.ConsoleLogger;
import model.ILogger;

public class App {

	public static final ILogger LOGGER = new ConsoleLogger();
	
	public static final Properties PROPS;
	
	static {
		PROPS = new Properties();
		FileInputStream fin;
		try {
			fin = new FileInputStream("config");
			PROPS.load(fin);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
//		if(args.length == 0)
//			return;
//		
//		String[] personArgs = args[0].split(", ");
//		
//		for (String arg : personArgs)
//			System.out.println(arg);
//		
//		System.out.println("------------------------------");
//		
//		StringTokenizer tokenizer = new StringTokenizer(args[0], ",/- ");
//		
//		while(tokenizer.hasMoreTokens()) {
//			System.out.println(tokenizer.nextToken());
//		}
//		
//		System.out.println("------------------------------");
//		
//		try(Scanner aux = new Scanner(args[0]);
//			Scanner scanner = aux.useDelimiter(", ")) {
//			
//			while(scanner.hasNextInt()) {
//				int value = scanner.nextInt();
//				System.out.println(value);
//			}
//		}
		
//		Properties props = new Properties();
//		props.put("username", "Ricardo");
//		props.put("password", "pass");
//		
//		System.out.println(props.getProperty("username"));
//		System.out.println(props.getProperty("password"));
		
		System.out.println(PROPS.getProperty("username"));
		System.out.println(PROPS.getProperty("password"));
		System.out.println(PROPS.getProperty("db_url"));
		
		System.out.println("-------------------------------");
		
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		
		String name = "Ricardo";
		double age = 26.5;
		String local = "Lisbon";
		
		String str = String.format("name=%s, age=%f, local=%s", name, age, local);
		System.out.println(str);
		System.out.printf("name=%s, age=%f, local=%s\n", name, age, local);
	}
}
