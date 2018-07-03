package me.jjh.refactoring.chapter07.HideDelegate.example;

public class Department {

	private Person _manager = new Person();
	
	public Department(Person manager) {
		_manager = manager;
	}
	
	public Person getManager() {
		return _manager;
	}
	
}
