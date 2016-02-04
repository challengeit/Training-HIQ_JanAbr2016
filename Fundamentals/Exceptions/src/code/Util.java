package code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Exceptions utility class.
 * @author Challenge.IT
 */
public class Util {
	
	private static void workerMethod() {
		int[] numbers = new int[10];
		numbers[9] = 10;
		
		//throw new IOException("Já foste");
	}
	
	public static void exceptionMethod() {
//		try {
			workerMethod();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch(Exception e) {
//			
//		}
	}
	
	public static void errorMethod() {
		ArrayList<String> list = new ArrayList<>();
		while(true) {
			String temp = "A test String";
			list.add(temp);
			if(list.size()%1000000 == 0)
				System.out.println("[List Size]: " + list.size()/1000000);
		}
	}
	
	public static void fileAccessMethod(String filename) throws IOException, IndexOutOfBoundsException, NullPointerException, OutOfMemoryError {
		BufferedReader br = new BufferedReader(new FileReader(filename));
		System.out.println(br.readLine());
		br.close();
	}
	
	public static void multipleExceptions(String filename) throws IOException {
		exceptionMethod();
		fileAccessMethod(filename);
	}
}
