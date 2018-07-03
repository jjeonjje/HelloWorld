package me.jjh.refactoring.chapter07.HideDelegate.refactoring;

public class Department_refactoring {

	private Person_refactoring _manager = new Person_refactoring();
	
	public Department_refactoring(Person_refactoring manager) {
		_manager = manager;
	}
	
	public Person_refactoring getManager() {
		return _manager;
	}
	
}
