package me.jjh.refactoring.chapter07.RemoveMiddleMan.example;

public class Person {

	Department _department;
	
	public void set_department(Department _department) {
		this._department = _department;
	}
	
	public Person getManager() {
		return _department.getManager();
	}
}
