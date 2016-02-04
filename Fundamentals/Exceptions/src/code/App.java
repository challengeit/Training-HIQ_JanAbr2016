package code;

import java.io.IOException;

/**
 * Exceptions application sand box.
 * @author Challenge.IT
 */
public class App {
	
	public static void main(String[] args) {
		
		// First Example - Stack Trace
		{
			//Util.exceptionMethod();
		}
		
		// Second Example - Error
		{
			//Util.errorMethod();
		}
		
		// Third Example - Exception
		{
			//Util.fileAccessMethod("test.txt");
		}
		
		{
			int hexa = 0x898989;
			
//			String String = "String";
			try {
				Util.multipleExceptions("text.txtt");
			} catch (IOException e) {
				System.out.println("Ficheiro não encontrado.");
			}
		}
	}
}
