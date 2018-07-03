package me.jjh.refactoring.chapter06.ReplaceMethodWithMethodObject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

/**
 * 메서드를 메서드 객체로 전환
 * 
 * - 지역변수 때문에 메서드 추출을 적용할 수 없는 긴 메서드가 있을 떈
 * 그 메서드 자체를 객체로 전환해서 모든 지역변수를 객체의 필드로 만들자
 * 그런 다음 그 메서드를 객체 안의 여러 메서드로 쪼개면 된다.
 * 
 * @author jjh
 *
 */
public class Account {
	
	/**
	 * 리펙토링 전
	 * @param inputVal
	 * @param quantity
	 * @param yearToDate
	 * @return
	 */
	public int gamma(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		
		// 기타작업
				
		return importantValue3 - 2 * importantValue1;
	}

	public int delta() {
		return 0;
	}
	
	/**
	 * 리펙토링 후
	 * @param inputVal
	 * @param quantity
	 * @param yearToDate
	 * @return
	 */
	public int gamma_refactoring(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}	
	
	@Test
	public void 메서드를_메서드_객체로_전환() {
		Account account = new Account();
		
		int account1 = account.gamma(10, 100, 1000);
		int account2 = account.gamma_refactoring(10, 100, 1000);
		
		assertThat(account1, is(account2));
	}	
}
