package me.jjh.refactoring.chapter07.MoveField;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter07.MoveField.example.Account;
import me.jjh.refactoring.chapter07.MoveField.refactoring.Account_refactoring;

/**
 * 필드 이동
 * 
 * - 어떤 필드가 자신이 속한 클래스보다 다른 클래스에서 더 많이 사용될 떄는
 * 대상 클래스 안에 새 필드를 선언하고 그 필드 참조 부분을 전부 새 필드 참조로 수정하자.
 * 
 * @author jjh
 *
 */
public class MoveFieldTest {

	@Test
	public void 필드_이동() {
		
		Account account1 = new Account();
		Account_refactoring account2 = new Account_refactoring();
	
		assertThat(account1.interestForAmount_days(1000, 50), is(account2.interestForAmount_days(1000, 50)));
	}	
	
}
