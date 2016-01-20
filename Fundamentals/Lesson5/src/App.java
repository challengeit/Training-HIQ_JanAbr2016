
public class App {
	public static void main(String[] args) {
		
		{
			int a;
			a = 1;
			short s = 1;
			
			double d = 0.0;
			float f = 0.0f;
			
			//char c = 'A' + 2_000_000_000;
			//int number = c;
			
			int number = 100 + 24 + 4;
			//byte b = number;
			//short vs = number * 2 + 430;
			
			
			final int NUM_CONST = 200_000_000;
			
			//NUM_CONST = 2;
			System.out.println((int) Character.MAX_VALUE);
		}
		
		{
			
			int number = (1+2) + (3+4); //10
			
			// Operator Precedence:
			// 1) Parentheses
			// 2) Increment/Decrement ++i i++ --i i--
			// 3) * / %
			// 4) + -
			//                        10             10-2=8
			//                        10             10-2=8
			int total = number++ * (23 - 13) + ((--number) - 2);
			//          number++ * (23 - 13) + (--number - 2)
			System.out.println(total);
		}
		
	}
}
