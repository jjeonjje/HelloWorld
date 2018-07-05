package me.jjh.refactoring.chapter08.ChangeReferncetoValue;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ChangeReferncetoValue.example.Currency;

import static org.hamcrest.CoreMatchers.*;

/**
 * 참조를 값으로 전환
 *
 * - 참조 객체가 작고 수정할 수 없거 관리하기 힘들 땐 그 참조 객체를 값 객체로 만들자.
 * 
 * @author jjh
 *
 */
public class ChangeReferncetoValueTest {

	@Test
	public void 참조를_값으로_전환() {
		
		Currency cu1 = new Currency("USD");
		Currency cu2 = new Currency("USD");
		
		assertThat(cu1.equals(cu2), is(true));
	}
	
}
