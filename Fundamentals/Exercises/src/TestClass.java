class TestClass{
	
	void probe(Integer x) { System.out.println("In Integer"); } //2
 	void probe(Object x) { System.out.println("In Object"); } //3 
	void probe(Long x) { System.out.println("In Long"); } //4
	void probe(Double x) { System.out.println("In Double"); } //4
	void probe(double x) { System.out.println("In double"); } //4
	
	
	public int setVar(int a, int b, float c) {
		return 0;
	}
	
	public int setVar(int a, float b, int c) {
		this.setVar(a, c, b);
		return 0;
	}
	
 	public static void main(String args){
 		//String a = "hello"; 
 		float f = 1.0F;
 		new TestClass().probe(f); 
 	}
}
