package interfaces;

public class A {
	
	class A1 implements I1 {
		@Override
		public void xpto() {
			System.out.println("Hello");
		}
	}
	
	class A2 implements I2 {
		@Override
		public void xpto() {
			System.out.println("Good bye");
		}
	}
	
	A1 a1 = new A1();
	A2 a2 = new A2();
	
	public void xpto_do_i1() {
		a1.xpto();
	}
	
	public void xpto_do_i2() {
		a2.xpto();
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.xpto_do_i1();
		a.xpto_do_i2();
	}
}
