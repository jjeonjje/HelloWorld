package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses.refactoring;

public class Salesman extends Employee_refactoring {

	@Override
	int getType() {
		return Employee_refactoring.SALESMAN;
	}

}
