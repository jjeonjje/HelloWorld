package me.jjh.refactoring.chapter07.InlineClass;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter07.InlineClass.example.Person;
import me.jjh.refactoring.chapter07.InlineClass.example.TelephoneNumber;
import me.jjh.refactoring.chapter07.InlineClass.refactoring.Person_refactoring;

/**
 * 클래스 내용 직접 삽입
 * 
 * - ㅋ클래스에 기능이 너무 적을 땐
 * 그 클래스의 모든 기능을 다른 클래스로 합쳐 넣고 원래의 클래스는 삭제하자.
 * 
 * @author jjh
 *
 */
public class InlineClassTest {

	@Test
	public void 클래스_내용_직접_삽입() {
		
		// 리펙토링 전
		Person person1 = new Person();
		TelephoneNumber tel = person1.get_officeTelephone();
		tel.set_areaCode("02");
		tel.set_number("12345678");
		
		// 리펙토링 후
		Person_refactoring person2 = new Person_refactoring();
		person2.set_officeAreaCode("02");
		person2.set_officeNumber("12345678");
		
		assertThat(person1.getTelephoneNumber(),is(person2.getTelephoneNumber()));		
	}
	
}
