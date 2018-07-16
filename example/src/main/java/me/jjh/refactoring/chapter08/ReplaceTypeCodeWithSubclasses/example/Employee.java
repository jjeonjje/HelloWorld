package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses.example;

public class Employee {

	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	public Employee() {}
	
	private Employee (int type){
		this.type = type;
	}
	
	public int getType() {
		return this.type;
	}
	
	public Employee create(int type) {
		return new Employee(type); 
	}
	
}
