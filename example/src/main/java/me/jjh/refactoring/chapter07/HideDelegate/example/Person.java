package me.jjh.refactoring.chapter07.HideDelegate.example;

public class Person {

	Department _department;
	
	public Department getDepartment() {
		return _department;
	}

	public void set_department(Department _department) {
		this._department = _department;
	}
	
}
