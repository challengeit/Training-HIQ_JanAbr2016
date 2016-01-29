package domain;

public class Person {
	
//	private static final String XPTO;
//	static {
//		XPTO = "";		
//	}
	
	private static final int DEFAULT_NIF = 200;

	private final int _nif;
	private String _name;
	private int _age;
	
	public int agePublic;
	
	{
		_nif = 10;
	}
	
	public Person(String name, int age, int nif) {
		this(nif);
		_age  = age;		
		_name = name;
	}
	
	public Person(int nif) {
		super();
		System.out.println("here");
//		_nif = (nif >= 0)? nif : DEFAULT_NIF;
	}
	
//	public Person() {
//		this(DEFAULT_NIF);
//	}
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public int getAge() {
		return _age;
	}
	
	public boolean setAge(int age) {
		if(age < 0)
			return false;
		
		_age = age;
		return true;
	}
	
	public int getNif() {
		return _nif;
	}

	@Override
	public String toString() {
		return new StringBuilder()
		.append("Person [name=")
		.append(getName())
		.append(", age=")
		.append(getAge())
		.append(", nif=")
		.append(getNif())
		.append("]")
		.toString();
	}
	
	
}
