package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses.refactoring;

public abstract class Employee_refactoring {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	public abstract int getType();
	
	public static Employee_refactoring create(int type) {
		switch(type) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default :
				throw new IllegalArgumentException("분류 부호 값이 잘못된");
		}
	}
	
}
