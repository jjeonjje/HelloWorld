package me.jjh.refactoring.chapter07.MoveField.example;

public class Account {

	private double _interestRate = 5;
	
	public double interestForAmount_days (double amount, int days) {
		return _interestRate * amount * days / 365;
	}
	
}
