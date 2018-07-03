package me.jjh.refactoring.chapter07.InlineClass.example;

public class Person {
	
	private String _name;
	private TelephoneNumber _officeTelephone = new TelephoneNumber();
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	
	public TelephoneNumber get_officeTelephone() {
		return _officeTelephone;
	}

	public String getTelephoneNumber() {
		return _officeTelephone.getTelephoneNumber();
	}
	
}
