package me.jjh.refactoring.chapter09.DecomposeConditional.ConsolidateDuplicateConditionalFragments;

import org.junit.jupiter.api.Test;

/**
 * 조건문의 공통 실행 코드 뺴내기
 * 
 * - 조건문의 모든 절에 같은 실행 코드가 있을땐 
 * 같은 부분을 조건문 밖으로 빼자.
 * 
 * @author jjh
 *
 */
public class ConsolidateDuplicateConditionalFragmentsTest {

	private double total = 0;
	private int price = 1000;
	
	boolean isSpecialDeal() {
		return true;
	}
	
	void send() {
		System.out.println("SEND!");
	}
	
	@Test
	public void 조건문의_공통_실행_코드_빼내기() {
		
		/*
		 * 리팩토링 전
		 */
	    if(isSpecialDeal()){
	        total = price * 0.95;
	        send();
	    }else{
	        total = price * 0.98;
	        send();
	    }
	    
	    /*
	     * 리팩토링 후
	     */
	    if(isSpecialDeal()){
	        total = price * 0.95;
	    }else{
	        total = price * 0.98;
	    }
	    send();
		
	}
	
}
