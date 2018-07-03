package me.jjh.refactoring.chapter07.RemoveMiddleMan.refactoring;

public class Person_refactoring {

	Department_refactoring _department;
	
	public Department_refactoring getDepartment() {
		return _department;
	}

	public void set_department(Department_refactoring _department) {
		this._department = _department;
	}
	
}
