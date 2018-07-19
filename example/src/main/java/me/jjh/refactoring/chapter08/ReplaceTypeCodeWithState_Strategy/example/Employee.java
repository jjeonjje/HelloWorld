package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.example;

public class Employee {
	
	private int type;
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;

	private int monthlySalary = 100;
	private int commission = 200;
	private int bonus = 300;
	
	public Employee(int type){
		this.type = type;
	}
	
	public int payAmount() {
		switch(this.type) {
			case ENGINEER:
				return this.monthlySalary;
			case SALESMAN:
				return this.monthlySalary +  this.commission;
			case MANAGER:
				return this.monthlySalary + this.bonus;
			default:
				throw new RuntimeException("잘못된 사원");
		}
	}
	
}
