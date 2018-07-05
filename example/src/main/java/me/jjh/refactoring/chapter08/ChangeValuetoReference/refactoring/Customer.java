package me.jjh.refactoring.chapter08.ChangeValuetoReference.refactoring;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {

	private final String name;
	private static Dictionary _instances = new Hashtable();
	
	public static Customer getNamed(String name) {
		return (Customer) _instances.get(name);
	}
	
	private Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void loadCustomers() {
		new Customer("우리 렌터카").store();
		new Customer("커피 자판기 운영업 협동조합").store();
		new Customer("삼천리 가스 공장").store();
	}
	
	private void store() {
		_instances.put(this.getName(), this);
	}
}
