package me.jjh.refactoring.chapter08.EncapsulateField;

/**
 * 필드 캡슐화
 * 
 * public 필드가 있을 떈
 * 그 필드를 private로 만들고 필드용 getter/setter 를 만들자
 * 
 * @author jjh
 *
 */
public class EncapsulateField {

	/*
	 * 리펙토링 전
	 */
	class EncapsulateField_before {
		public String name;
	}
	
	/*
	 * 리펙토링 후
	 */
	class EncapsulateField_after {
		public String name;
		
		public String getName(){
			return this.name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
	}
	
}
