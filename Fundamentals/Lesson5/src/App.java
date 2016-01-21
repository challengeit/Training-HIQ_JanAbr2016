/**
 * Application to play with primitive types. 
 * @author Challenge.IT
 */
public class App {
	
	public static void main(String[] args) {
		/**
		 * Declaration and initialization of primitive types variables.
		 * Constants.
		 */
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
			//System.out.println((int) Character.MAX_VALUE);
		}
		
		/**
		 * Operators and precedences.
		 */
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
			//System.out.println(total);


			int i = 10;
			//System.out.println(i * 10 + i-- -2);
		}
		
		/**
		 * Initializations in if constructs.
		 */
		{
			int b, c;
			boolean bool;
			//if((b = 1) == (c = 1) )
				//System.out.println("YES");
			//if(bool = true)
				//System.out.println("YES");
		}
		
		/**
		 * Auto promotion and type casting.
		 */
		{
			byte b = 16;
			short s = b;
			b = (byte) 256;
			//System.out.println("b = " + b + " s = " + s);
		}
		
		/**
		 * Operations between different primitive types.
		 */
		{
			System.out.println(1 / 2);     // 0
			System.out.println(1.0 / 2);   // 0.5
			System.out.println(1 / 2.0);   // 0.5
			System.out.println(1.0 / 2.0); // 0.5
		}
		
		/**
		 * Primitive types comparing and compatibility.
		 */
		{
			short s1 = 'E';
			short s = 120;
			char c = 120; //'E';
			// Errado!!
			//s = c;
			//c = s;
			if(s == c) System.out.println("YES");
			
			float f = 1.2f;
			double d = 2.4;
			//f = d;
			d = f;
			if(f == d) System.out.println("YES");
		}
	}
}
