package me.jjh.refactoring.chapter08.EncapsulateCollection.example;

public class Course {

	private String name; 
	private Boolean isAdvanced; 
	
	public Course(String name, Boolean isAdvanced) {
		this.name = name;
		this.isAdvanced = isAdvanced;
	}
	
	public boolean isAdvanced() {return this.isAdvanced;}
	
}
