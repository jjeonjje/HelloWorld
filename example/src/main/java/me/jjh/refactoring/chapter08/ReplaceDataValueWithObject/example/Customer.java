package me.jjh.refactoring.chapter08.ReplaceDataValueWithObject.example;

public class Customer {

	private final String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
