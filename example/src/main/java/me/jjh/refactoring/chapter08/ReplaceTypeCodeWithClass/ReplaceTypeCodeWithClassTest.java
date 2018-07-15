package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass.example.Person;
import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass.refactoring.BloodGroup;
import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithClass.refactoring.Person_refactoring;

/**
 * 분류 부호를 클래스로 전환
 * 
 * - 기능에 영향을 미치는 숫자형 분류 부호가 든 클래스가 있을 땐 그 숫자를 새 클래스로 바꾸자.
 * 
 * @author jjh
 *
 */
public class ReplaceTypeCodeWithClassTest {

	
	public void 분류_부호를_클래스로_전환() {

		/**
		 * 리팩토링 전
		 */
		Person person = new Person(Person.A);
		
		/**
		 * 리팩토링 후
		 */
		Person_refactoring person_re = new Person_refactoring(BloodGroup.A);

		assertThat(person.getBloodGroup(), is(person_re.getBloodGroupCode()));
	}
	
}
