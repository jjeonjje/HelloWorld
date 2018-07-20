package me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.refactoring;

public class Person_refactoring {

	private final boolean isMale;
	private final String code;
	
	protected Person_refactoring(boolean isMale, String code) {
		this.isMale = isMale;
		this.code = code;
	}
	
	public static Person_refactoring createMale() {
		return new Person_refactoring(true, "M");
	}

	public static Person_refactoring createFamale() {
		return new Person_refactoring(false, "F");
	}

	public boolean isMale() {
		return isMale;
	}

	public String getCode() {
		return code;
	}
	
}
