package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass.refactoring;

public class Person_refactoring {

	public static final int O = BloodGroup.O.getCode();
	public static final int A = BloodGroup.A.getCode();
	public static final int B = BloodGroup.B.getCode();
	public static final int AB = BloodGroup.AB.getCode();
	
	private BloodGroup bloodGroup;
	
	public Person_refactoring (BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public void setBloodGroup(BloodGroup arg) {
		this.bloodGroup = arg;
	}
	
	public BloodGroup getBloodGroup() {
		return this.bloodGroup;
	}
	
	public int getBloodGroupCode() {
		return this.bloodGroup.getCode();
	}	

}
