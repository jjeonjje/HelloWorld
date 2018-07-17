package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses.example.Employee;
import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithSubclasses.refactoring.Employee_refactoring;

/**
 * 분류 부호를 하위클래스로 전환
 * 
 * - 클래스 기능에 영향을 주는 변경불가 분류 부호가 있을 땐
 * 분류 부호를 하위클래스로 만들자.
 * 
 * @author jjh
 *
 */
public class ReplaceTypeCodeWithSubclassesTest {

	@Test
	public void 분류_부호를_하위클래스로_전환() {
		
		/* 리팩토링 전 */
		Employee emp = new Employee().create(0);
		
		/* 리팩토링 후 */
		Employee_refactoring emp_re = Employee_refactoring.create(0);
		
		assertThat(emp.getType(), is(emp_re.getType()));
	}
	
}
