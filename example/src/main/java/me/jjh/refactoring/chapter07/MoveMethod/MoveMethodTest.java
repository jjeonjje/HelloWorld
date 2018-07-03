package me.jjh.refactoring.chapter07.MoveMethod;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter07.MoveMethod.example.Account;
import me.jjh.refactoring.chapter07.MoveMethod.refactoring.Account_refactoring;

/**
 * 메서드 이동
 * 
 * - 메서드가 자신이 속한 클래스보다 다른 클래스으 ㅣ기능을 더 많이 이용할 땐
 * 그 메서드가 제일 많이 이용하는 클래스 안에서 비슷한 내용의 새 메서드를 작성하자.
 * 기존 메서드는 간단한 대리 메서드로 전환하든지 삭제하자.
 * 
 * @author jjh
 *
 */
public class MoveMethodTest {
	
	@Test
	public void 메서드_이동() {
		
		Account account1 = new Account();
		Account_refactoring account2 = new Account_refactoring();
	
		assertThat(account1.bankCharge(), is(account2.bankCharge()));
	}	
	
}
