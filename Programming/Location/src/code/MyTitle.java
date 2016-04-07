package code;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MyTitle 
{
	static Locale[] locals = { Locale.UK, Locale.ITALY, Locale.FRANCE, Locale.GERMANY, new Locale("pt", "PT") };
	
	public static void main(String[] args) 
	{
		ResourceBundle bundle;
		try(Scanner scanner = new Scanner(System.in))
		{
			while(true) {
				int index = scanner.nextInt();
				if(index < 0 || index >= locals.length) continue;
				bundle = ResourceBundle.getBundle("Labels", locals[index]);
				System.out.println(bundle.getString("title"));
			}
		}
	}
}
