import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		
//		int numbers[];
//		int[] numbers;
//		numbers = new int[4];
//		display(numbers);
//		
//		numbers[1] = 5;
//		display(numbers);
//		
//		numbers[numbers.length-1] = 10;
//		display(numbers);
//		
//		int[] numbers2 = {1,2,3,4};
//		display(numbers2);
		
//		Object[] objs = {new Object(), new Object()};
//		Person[] persons = {new Person(),  new Person()};
		
//		String[] strings = new String[4];
//		String[] strings = {"Ola", " ", "Mundo"};
//		display(strings);
//		strings[1] = null;
//		display(strings);
//		
//		String str = strings[1];
//		System.out.println(str);
//		
//		String[][] strings2d = new String[2][];
//		strings2d[0] = new String[2];
//		strings2d[1] = new String[4];
//		
//		strings2d[0][0] = "Ola";
//		strings2d[1][2] = "Mundo";
//		display(strings2d);
		
//		String[][][] strings3d = new String[2][3][2];
//		strings3d[0][0][0] = "Ola";
//		strings3d[0][2][1] = "Mundo"; 
//		strings3d[1][1][0] = "AHAHA";
//		
//		display(strings3d);
		
//		String[][][] strings3d = {{{"Ola"},{,},{"Mundo"}}, 
//								  {{},{"AHAHA"},{}}
//								 };
//		
//		System.out.println(strings3d[0][1].length);
//		display(strings3d);
		
//		display(strings3d[1]);
		
		
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Ola");
		strings.add("Mundo");
//		strings.add(1, " EHEHE");
		strings.set(1, " EHEHE");
		System.out.println("strings: " + strings);
		
		System.out.println(Parser.parseToString(strings));
		
		System.out.println(strings.size());
		System.out.println(strings.isEmpty());
		System.out.println(strings.remove(0));
		System.out.println("strings: " + strings);
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(0);
//		numbers.remove((Integer)0);
		
		System.out.println(numbers.indexOf(0));
		
		System.out.println(numbers);
	}
	
	private static void display(String[][][] strings) {
		for(String[][] arrays : strings)
			display(arrays);
	}
	
	private static void display(String[][] strings) {
		for(String[] array : strings)
			display(array);
	}
	
	private static void display(int[] numbers) {
		for (int number : numbers)
			System.out.print(number);
		
		System.out.println();
	}
	
	private static void display(String[] strings) {
		for (String string : strings)
			System.out.print(string);
		
		System.out.println();
	}
}
