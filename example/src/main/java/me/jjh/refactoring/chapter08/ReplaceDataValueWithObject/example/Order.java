package me.jjh.refactoring.chapter08.ReplaceDataValueWithObject.example;

public class Order {

	private Customer customer;
	
	public Order(String customerName) {
		this.customer = new Customer(customerName);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(String customerName) {
		this.customer = new Customer(customerName);
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
}
