package me.jjh.refactoring.chapter07.HideDelegate.refactoring;

public class Person_refactoring {

	Department_refactoring _department;
	
	public void set_department(Department_refactoring _department) {
		this._department = _department;
	}
	
	public Person_refactoring getManager() {
		return _department.getManager();
	}
}
