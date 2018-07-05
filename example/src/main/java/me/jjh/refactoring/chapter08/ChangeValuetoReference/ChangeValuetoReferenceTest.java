package me.jjh.refactoring.chapter08.ChangeValuetoReference;

import static org.junit.Assert.assertThat;


import static org.hamcrest.CoreMatchers.*;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ChangeValuetoReference.refactoring.Customer;
import me.jjh.refactoring.chapter08.ChangeValuetoReference.refactoring.Order;

/**
 * 값을 참조로 변환
 * 
 * - 클래스에 같은 인스턴스가 많이 들어 있어서 이것들을 하나의 객체로 바꿔야 할 땐
 *  그 객체를 참조 객체로 전환하라
 * 
 * @author jjh
 *
 */
public class ChangeValuetoReferenceTest {

	@Test
	public void 값을_참조로_변환() {

		Customer.loadCustomers();
		
		// name당 하나의 Customer 객체를 가진다.
		Order order1 = new Order("우리 렌터카");
		Order order2 = new Order("삼천리 가스 공장");
		Order order3 = new Order("삼천리 가스 공장");
		
		assertThat("order1 과 order2는 다른 객체여야 함",order1.getCustomer(),not(order2.getCustomer()));
		assertThat("order2 와 order3은 같은 객체여야 함",order2.getCustomer(),is(order3.getCustomer()));
	}
	
}
