package me.jjh.refactoring.chapter08.DuplicateObservedData.refactoring;

import java.util.Observable;

public class Interval extends Observable{

	private String start = "0";
	private String end = "0";
	private String length = "0";
	
	void calculateLength() {
		try {
			
			int start = Integer.parseInt(getStart());
			int end = Integer.parseInt(getEnd());
			int length = end - start;
			
			setLength(String.valueOf(length));
			
		} catch (Exception e) {
			throw new RuntimeException("잘못된 숫자 형식 오류");
		}
	}
	
	void calculateEnd() {
		try {
			
			int start = Integer.parseInt(getStart());
			int length = Integer.parseInt(getLength());
			int end = start + length;
			
			setEnd(String.valueOf(end));
			
		} catch (Exception e) {
			throw new RuntimeException("잘못된 숫자 형식 오류");
		}
	}
	
	String getStart() {
		return start;
	}
	
	void setStart(String arg) {
		start = arg;
		setChanged();
		notifyObservers();
	}

	String getEnd() {
		return end;
	}
	
	void setEnd(String arg) {
		end = arg;
		setChanged();
		notifyObservers();
	}

	String getLength() {
		return length;
	}
	
	void setLength(String arg) {
		length = arg;
		setChanged();
		notifyObservers();
	}
	
}
