package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.refactoring;

public class Employee_refactoring {
	
	private EmployeeType type;

	private int monthlySalary = 100;
	private int commission = 200;
	private int bonus = 300;
	
	public Employee_refactoring(int type){
		setType(type);
	}
	
	int getType() {
		return type.getTypeCode();
	}

	void setType(int type) {
		this.type = EmployeeType.newType(type);
	}

	public int payAmount() {
		switch(getType()) {
			case EmployeeType.ENGINEER:
				return this.monthlySalary;
			case EmployeeType.SALESMAN:
				return this.monthlySalary +  this.commission;
			case EmployeeType.MANAGER:
				return this.monthlySalary + this.bonus;
			default:
				throw new RuntimeException("잘못된 사원");
		}
	}
	
}
