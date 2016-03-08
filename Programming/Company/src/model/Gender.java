package model;

public enum Gender {
	M("Male"),
	F("Fem");
	
	private String description;
	
	private Gender(String desc) {
		description = desc;
	}
	
	public String getDescription() {
		return description;
	}
}

enum SimpleGender { M, F; } 