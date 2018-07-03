package me.jjh.refactoring.chapter07.ExtractClass.exapmle;

public class Person {
	
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public String get_officeAreaCode() {
		return _officeAreaCode;
	}
	public void set_officeAreaCode(String _officeAreaCode) {
		this._officeAreaCode = _officeAreaCode;
	}
	public String get_officeNumber() {
		return _officeNumber;
	}
	public void set_officeNumber(String _officeNumber) {
		this._officeNumber = _officeNumber;
	}
	
	public String getTelephoneNumber() {
		return ("(" + _officeAreaCode+")" + _officeNumber);
	}
	
}
