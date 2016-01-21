
public class App {
	
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);

		for (String arg : args)
			System.out.println(arg);
		
		{
			int i = 0;
			while(i < args.length) {
				System.out.println(args[i]);
				i++;
			}			
		}
		
		{
			int i = 0;
			do {
				System.out.println(args[i]);
				i++;
			} while(i < args.length);			
		}
	}
}
