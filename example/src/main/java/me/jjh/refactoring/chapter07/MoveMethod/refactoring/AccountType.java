package me.jjh.refactoring.chapter07.MoveMethod.refactoring;

public class AccountType {
	
	public boolean isPremium() {
		return true;
	}
	
	public double overdraftCharge(int daysOrverdrawn) {
		if(isPremium()) {
			double result = 10;
			if(daysOrverdrawn > 7) result += (daysOrverdrawn - 7) * 0.85;
				return result;
		}else {
			return daysOrverdrawn * 1.75;
		}
	}
	
}
