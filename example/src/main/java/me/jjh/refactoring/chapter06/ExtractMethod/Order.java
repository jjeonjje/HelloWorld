package me.jjh.refactoring.chapter06.ExtractMethod;

public class Order {
		
	private double amount;

	public Order(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}
	
}
