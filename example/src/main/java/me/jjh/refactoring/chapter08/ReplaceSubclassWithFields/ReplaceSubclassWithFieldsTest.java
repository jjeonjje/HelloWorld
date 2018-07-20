package me.jjh.refactoring.chapter08.ReplaceSubclassWithFields;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.example.Female;
import me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.example.Male;
import me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.example.Person;
import me.jjh.refactoring.chapter08.ReplaceSubclassWithFields.refactoring.Person_refactoring;

/**
 * 하위클래스를 필드로 전환
 * 
 * - 여러 하위클래스가 상수 데이터를 반환하는 메서드만 다를 꺤
 * 각 하위클래스의 메서드를 상위클래스 필드로 전환하고 하위클래스는 전부 삭제하자.
 * 
 * @author jjh
 *
 */
public class ReplaceSubclassWithFieldsTest {

	@Test
	public void 하위클래스를_필드로_전환() {
		
		Person m = new Male();
		Person f = new Female();
		
		assertThat(m.isMale(),is(Person_refactoring.createMale().isMale()));
		assertThat(m.getCode(),is(Person_refactoring.createMale().getCode()));

		assertThat(f.isMale(),is(Person_refactoring.createFamale().isMale()));
		assertThat(f.getCode(),is(Person_refactoring.createFamale().getCode()));
		
	}
	
}
