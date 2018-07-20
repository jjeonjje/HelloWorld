package me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.example;

public class Female extends Person {

	@Override
	public boolean isMale() {
		return false;
	}

	@Override
	public String getCode() {
		return "F";
	}

}
