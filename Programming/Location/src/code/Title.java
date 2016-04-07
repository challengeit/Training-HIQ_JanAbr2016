package code;

import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Locale;

/**
 * Example of multi-language title.
 * @author Challenge.IT
 */
public class Title 
{
	/**
	 * Available locals for my title.
	 */
	private static Locale[] locales = { 
			Locale.FRANCE,
		    Locale.GERMANY,
		    Locale.UK,
		    Locale.forLanguageTag("pt"),
		    Locale.ITALY
		};
	
	/**
	 * Default bundle.
	 */
	private static ResourceBundle bundle = ResourceBundle.getBundle("labels");
	
	public static void main(String[] args) 
	{
		try(Scanner scanner = new Scanner(System.in)) 
		{
			while (true) 
			{
				System.out.println(bundle.getString("title"));
				int index = scanner.nextInt();
				if(index < 0 || index >= locales.length)
					continue;
				bundle = ResourceBundle.getBundle("labels", locales[index]);
	            System.out.println();
	        }
		}
	}
}