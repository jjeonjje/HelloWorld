package me.jjh.refactoring.chapter09.DecomposeConditional.ConsolidateConditionalEcpression;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

/**
 * 중복 조건식 통합
 * 
 * - 여러 조건 검사식의 결과가 같을 떈
 * 하나의 조건문으로 합친 후 메서드로 빼내자.
 * 
 * @author jjh
 *
 */
public class ConsolidateConditionalEcpressionTest {
	
	private int seniority = 3;
	private int monthsDisabled = 13;
	private boolean isPartTume = true;

	/*
	 * 리팩토링 전
	 */
	double disbilityAmount(){
		if(seniority < 2) return 0;
		if(monthsDisabled > 12) return 0;
		if(isPartTume) return 0;
		else return 1;
	}
	
	/*
	 * 리팩토링 후
	 */
	double disbilityAmount_refactoring(){
		if(isNOtEligableForDisablility()) return 0;
		else return 1;
	}	
	
	boolean isNOtEligableForDisablility() {
		return (seniority < 2) || (monthsDisabled > 12) || (isPartTume);
	}
	
	@Test
	public void 중복_조건식_통합() {
		assertThat(disbilityAmount(), is(disbilityAmount_refactoring()));
	}
	
}
