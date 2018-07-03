package me.jjh.refactoring.chapter07.InlineClass.example;

public class TelephoneNumber {
	
	private String _number;
	private String _areaCode;
	
	public String get_number() {
		return _number;
	}
	public void set_number(String _number) {
		this._number = _number;
	}
	public String get_areaCode() {
		return _areaCode;
	}
	public void set_areaCode(String _areaCode) {
		this._areaCode = _areaCode;
	}
	
	public String getTelephoneNumber() {
		return ("(" + _areaCode+")" + _number);
	}
	
}
