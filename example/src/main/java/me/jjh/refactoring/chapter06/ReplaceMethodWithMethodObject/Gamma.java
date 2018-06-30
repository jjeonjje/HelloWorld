package me.jjh.refactoring.chapter06.ReplaceMethodWithMethodObject;

public class Gamma {

	private final Account _account;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantValue1;
	private int importantValue2;
	private int importantValue3;

	public Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
		_account = source;
		inputVal = inputValArg;
		quantity = quantityArg;
		yearToDate = yearToDateArg;
	}
	
	public int compute() {
		importantValue1 = (inputVal * quantity) + _account.delta();
		importantValue2 = (inputVal * yearToDate) + 100;
		if((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		importantValue3 = importantValue2 * 7;
		
		// 기타작업
				
		return importantValue3 - 2 * importantValue1;
	}
}
