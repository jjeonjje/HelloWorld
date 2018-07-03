package me.jjh.refactoring.chapter07.MoveMethod.example;

public class Account {
	
	private AccountType _type = new AccountType();
	private int _daysOrverdrawn = 10;
	
	public double overdraftCharge() {
		if(_type.isPremium()) {
			double result = 10;
			if(_daysOrverdrawn > 7) result += (_daysOrverdrawn - 7) * 0.85;
				return result;
		}else {
			return _daysOrverdrawn * 1.75;
		}
	}
	
	public double bankCharge() {
		double result = 4.5;
		if(_daysOrverdrawn > 0) result += overdraftCharge();
		return result;
	}
	
}
