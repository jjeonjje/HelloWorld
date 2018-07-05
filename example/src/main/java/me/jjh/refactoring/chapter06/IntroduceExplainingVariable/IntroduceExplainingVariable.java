package me.jjh.refactoring.chapter06.IntroduceExplainingVariable;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

/**
 * 직관적 임시변수 사용
 * 
 * - 사용된 수식이 복잡할 땐 수식의 결과나 수식의 일부분을 용도에 부합하는 직관적 이름의 임시변수에 대입하자
 * 
 * @author jjh
 *
 */
public class IntroduceExplainingVariable {
	
	private double _quantity = 10;
	private double _itemPrice = 9560;
	
	/**
	 * 리팩토링 전
	 * @return
	 */
	public double price() {
		// 결제액(price) = 총 구매액(base price) 
		// - 대량 구매 할인(quantity discount) 
		// + 배송비(shopping)
		return _quantity * _itemPrice -
				Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
				Math.min(_quantity * _itemPrice * 0.1, 100.0);
	}
	
	
	/**
	 * 리팩토링 후
	 * - 복잡한 수식을 임시변수로 대입하여 수식 간소화
	 * - 하지만 될 수 있으면 메서드 추출 기법을 이용하자.
	 * @return
	 */
	public double price_refactoring() {
		
		// 직관적 임시변수, 될 수 있으면 메서드 추출 기법으로 사용한다.
		//double basePrice = _quantity * _itemPrice;
		//double quantityDiscount = Math.max(0, _quantity - 500) * _itemPrice * 0.05;
		//double shopping = Math.min(basePrice() * 0.1, 100.0);
		
		// 결제액(price) = 총 구매액(base price) 
		// - 대량 구매 할인(quantity discount) 
		// + 배송비(shopping)
		return basePrice() - quantityDiscount() + shopping();
	}
	
	private double basePrice() {
		return _quantity * _itemPrice;
	}
	
	private double quantityDiscount() {
		return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
	}
	
	private double shopping() {
		return Math.min(basePrice() * 0.1, 100.0);
	}

	@Test
	public void 직관적_임시변수_사용() {
		IntroduceExplainingVariable explainingVariable = new IntroduceExplainingVariable();
		
		double price = explainingVariable.price();
		double price_re = explainingVariable.price_refactoring();
		
		assertThat(price, is(price_re));
	}
}