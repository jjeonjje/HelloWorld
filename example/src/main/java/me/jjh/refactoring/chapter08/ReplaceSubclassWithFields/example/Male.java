package me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.example;

public class Male extends Person{

	@Override
	public boolean isMale() {
		return true;
	}

	@Override
	public String getCode() {
		return "M";
	}

}