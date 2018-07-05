package me.jjh.refactoring.chapter06.ReplaceTempWithQuery;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

/**
 * 임시변수를 메서드 호출로 전환
 * 
 * - 수식의 결과를 저장하는 임시변수가 있을 땐 
 * 그 수식을 빼내어 메서드로 만든 후 , 임시변수 참조 부분을 전부 수식으로 교체하자.
 * 새로 만든 메서드는 다른 메서드에서도 호출 가능하다.
 * 
 * @author jjh
 *
 */
public class ReplaceTempWithQuery {

	int _quanity = 10;
	int _itemPrice = 1000;
	
	/**
	 * 리팩토링 전
	 * @return
	 */
	public double getPrice() {
		int basePrice = _quanity * _itemPrice;
		double discountFactor;
		if(basePrice > 1000) discountFactor = 0.95;
		else discountFactor = 0.98;
		return basePrice * discountFactor;
	}

	/**
	 * 리팩토링 후
	 * - 임시변수 basePrice, discountFactor를 메서드 호출로 전환
	 * @return
	 */
	public double getPrice_refactoring() {
		return basePrice() * discountFactor();
	}
	
	private int basePrice() {
		return _quanity * _itemPrice;
	}
	
	private double discountFactor() {
		if(basePrice() > 1000) return 0.95;
		else return 0.98;
	}
	
	@Test
	public void 임시변수를_메서드_호출로_전환() {
		ReplaceTempWithQuery replaceTempWithQuery = new ReplaceTempWithQuery();
		
		double price = replaceTempWithQuery.getPrice();
		double price_re = replaceTempWithQuery.getPrice_refactoring();
		
		assertThat(price, is(price_re));
	}
}
