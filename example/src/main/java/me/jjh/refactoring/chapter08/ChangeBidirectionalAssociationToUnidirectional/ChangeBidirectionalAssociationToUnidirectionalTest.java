package me.jjh.refactoring.chapter08.ChangeBidirectionalAssociationToUnidirectional;

import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * 클래스의 양방향 연결을 단방향으로 전환
 * 
 * - 두 클래스가 양방향으로 연결되어 있는데 한 클래스가 다른 클래스의 기능을 더 이상 사용하지 않게 됐을 땐
 * 불필요한 방향의 연결을 끊자
 * 
 * @author jjh
 *
 */
public class ChangeBidirectionalAssociationToUnidirectionalTest {

	// Order 와 Customer의 연결을 제외하고 Customer 객체를 매개변수로 전달받아 처리
	class Order {
		
		private int grossPrice = 10000;
		
		public double getDiscountedPrice(Customer customer) {
			return grossPrice * (1 - customer.getDiscount());
		}
		
	}
	
	class Customer {
		
		public double getDiscount() {
			return 0.1;
		}
		
	}
	
	@Test
	public void 클래스의_양방향_연결을_단방향으로_전환() {
		
		ChangeBidirectionalAssociationToUnidirectionalTest test = new ChangeBidirectionalAssociationToUnidirectionalTest();
		
		Customer customer = test.new Customer();
		double price = test.new Order().getDiscountedPrice(customer);
		
		assertThat(price, is(9000d));
		
	}
	
}
