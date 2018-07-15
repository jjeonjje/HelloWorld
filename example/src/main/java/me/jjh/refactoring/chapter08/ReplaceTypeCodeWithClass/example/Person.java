package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass.example;

public class Person {

	public static final int O = 0;
	public static final int A = 1;
	public static final int B = 2;
	public static final int AB = 3;
	
	private int bloodGroup;
	
	public Person (int bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public void setBloodGroup(int arg) {
		this.bloodGroup = arg;
	}
	
	public int getBloodGroup() {
		return this.bloodGroup;
	}		
}
