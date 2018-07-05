package me.jjh.refactoring.chapter08.ChangeValuetoReference.refactoring;

public class Order {

	private Customer customer;
	
	public Order(String customerName) {
		this.customer = Customer.getNamed(customerName);
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
}
