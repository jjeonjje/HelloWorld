package me.jjh.refactoring.chapter07.ExtractClass;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter07.ExtractClass.exapmle.Person;
import me.jjh.refactoring.chapter07.ExtractClass.refactoring.Person_refactoring;
import me.jjh.refactoring.chapter07.ExtractClass.refactoring.TelephoneNumber;


/**
 * 클래스 추출
 * 
 * - 두 클래스가 처리해야 할 기능이 하나의 클래스에 들어 있을 땐
 * 새 클래스를 만들고 기존 클래스의 관련 필드와 메서드를 새 클래스로 옮기자.
 * 
 * @author jjh
 *
 */
public class ExtractClassTest {

	@Test
	public void 클래스_추출() {
		
		// 리팩토링 전
		Person person1 = new Person();
		person1.set_officeAreaCode("02");
		person1.set_officeNumber("12345678");
		
		// 리팩토링 후
		Person_refactoring person2 = new Person_refactoring();
		TelephoneNumber tel = person2.get_officeTelephone();
		tel.set_areaCode("02");
		tel.set_number("12345678");
		
		assertThat(person1.getTelephoneNumber(), is(person2.getTelephoneNumber()));
	}
	
}
