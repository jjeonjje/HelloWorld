package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.refactoring;

public class Manager extends EmployeeType {

	@Override
	public int getTypeCode() {
		return MANAGER;
	}
}
