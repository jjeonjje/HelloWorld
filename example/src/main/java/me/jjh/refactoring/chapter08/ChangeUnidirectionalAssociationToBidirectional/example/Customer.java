package me.jjh.refactoring.chapter08.ChangeUnidirectionalAssociationToBidirectional.example;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private Set orders = new HashSet();
	
	public Set friendsOrders() {
		// 연결을 변경할 때 Order에 의해서만 사용되어야 함
		return this.orders;
	}
	
	public void addOrder(Order arg) {
		arg.setCustomer(this);
	}
	
	public void removeOrder(Order arg) {
		arg.removeCustomer(this);
	}
}
