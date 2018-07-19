package me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.example.Employee;
import me.jjh.refactoring.chapter08.ReplaceTypeCodeWithState_Strategy.refactoring.Employee_refactoring;

/**
 * 분류 부호를 상태/전략 패턴으로 전환
 * 
 * - 분류 부호가 클래스의 기능에 영향을 주지만 하위클래스로 전환할 수 없을 땐
 * 그 분류 부호를 상태 객체로 만들자.
 * 
 * @author jjh
 *
 */
public class ReplaceTypeCodeWithState_StrategyTest {

	@Test
	public void 분류_부호를_상태_전략_패턴으로_전환() {

		Employee emp = new Employee(0);
		Employee_refactoring emp_re = new Employee_refactoring(0);
		
		assertThat(emp.payAmount(), is(emp_re.payAmount()));
	}
	
}
