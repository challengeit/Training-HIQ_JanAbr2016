
public class App {
	public static void main(String[] args) {
//		int i = 0, j = 0;
//		if(i == 0) 
//		if(j >= 0) 
//			System.out.println("sim");
//		else
//			System.out.println("não");
		
		int i = 20; 
		final int j = 10;
		switch(i) {
			default:
				System.out.println("Outra coisa");
			case 0: 
				System.out.println("0");
				break;
			case j:
				System.out.println("1");
				break;
			case 2:
			case 3:
				System.out.println("2 ou 3");
		}
		
//		boolean bool = false;
//		switch (bool) { } // Erro
		
//		byte temp = 1;
//		switch (temp) { }
		
//		short temp = 1;
//		switch (temp) { }
		
//		char temp = 'A';
//		switch (temp) { }
		
//		long temp = 1;
//		switch (temp) { } // Erro
		
//		double temp = 1.1;
//		switch (temp) { } // Erro
		
//		float temp = 1.1f;
//		switch (temp) { } // Erro
		
//		String temp = "TEMP";
//		switch (temp) { }
		
		int aux = 10;
		if(aux == 10)
			System.out.println("É 10");
		else
			System.out.println("Não é 10");
		
		// 1ª Tentativa - Erro!
		//(aux == 10) ? System.out.println("É 10") : System.out.println("Não é 10");
		
		// 2ª Tentativa
		System.out.println((aux == 10) ? "É 10" : 90);
//		String ternario = (aux == 10) ? "É 10" : 90; //Erro!
		Object ternario = (aux == 10) ? "É 10" : 90; //Integer
		
		System.out.println( j == 0 && i == 0 ? "É 10" : 90 );
		
		// && & - and
		// || | - or
		// ! - negação
		int bitabit = 2&3;
		System.out.println(bitabit);
		
		//System.out.println(9 >> 2); - SHIFT
		//System.out.println(7 ^ 1); - xor
	}
}