package me.jjh.refactoring.chapter07.MoveField.refactoring;

public class Account_refactoring {
	
	private AccountType _type = new AccountType();
	
	public double interestForAmount_days (double amount, int days) {
		return _type.getInterestRate() * amount * days / 365;
	}
	
}
