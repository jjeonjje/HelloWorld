package me.jjh.refactoring.chapter07.MoveMethod.refactoring;

public class Account_refactoring {
	
	private AccountType _type = new AccountType();
	private int _daysOrverdrawn = 10;
	
	public double bankCharge() {
		double result = 4.5;
		if(_daysOrverdrawn > 0) result += _type.overdraftCharge(_daysOrverdrawn);
		return result;
	}
	
}
