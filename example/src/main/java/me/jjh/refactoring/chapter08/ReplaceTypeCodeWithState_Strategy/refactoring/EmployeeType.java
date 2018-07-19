package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.refactoring;

public abstract class EmployeeType {
	
	public abstract int getTypeCode();
	
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	static EmployeeType newType(int code) {
		switch(code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new Salesman();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("잘못된 사원"); 
		}
	}
	
}
