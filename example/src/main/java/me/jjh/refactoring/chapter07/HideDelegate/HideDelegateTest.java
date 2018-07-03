package me.jjh.refactoring.chapter07.HideDelegate;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter07.HideDelegate.example.Department;
import me.jjh.refactoring.chapter07.HideDelegate.example.Person;
import me.jjh.refactoring.chapter07.HideDelegate.refactoring.Department_refactoring;
import me.jjh.refactoring.chapter07.HideDelegate.refactoring.Person_refactoring;

/**
 * 대리 객체 은폐
 * 
 * - 클라이언트가 객체의 대리 클래스를 호출할 땐
 * 대리 클래스를 감추는 메서드를 서버에 작성하자.
 * 
 * @author jjh
 *
 */
public class HideDelegateTest {

	@Test
	public void 대리_객체_은폐() {

		// 리펙토링 전
		Person person1 = new Person();
		person1.set_department(new Department(person1));
		person1.getDepartment().getManager();
		
		// 리펙토링 후
		Person_refactoring person2 = new Person_refactoring();
		person2.set_department(new Department_refactoring(person2));
		person2.getManager();
		
	}
	
}
