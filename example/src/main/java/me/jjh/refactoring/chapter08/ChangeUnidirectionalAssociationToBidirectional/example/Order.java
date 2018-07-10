package me.jjh.refactoring.chapter08.ChangeUnidirectionalAssociationToBidirectional.example;

import java.util.HashSet;
import java.util.Set;

public class Order {

	Customer customer;
	Set customers = new HashSet();

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		if(this.customer != null) this.customer.friendsOrders().remove(this);
		this.customer = customer;
		if(this.customer != null) this.customer.friendsOrders().add(this);
	}
	
	public void addCustomer(Customer customer) {
		customer.friendsOrders().add(this);
		customers.add(customer);
	}
	
	public void removeCustomer(Customer customer) {
		customer.friendsOrders().remove(this);
		customers.remove(customer);
	}
}
