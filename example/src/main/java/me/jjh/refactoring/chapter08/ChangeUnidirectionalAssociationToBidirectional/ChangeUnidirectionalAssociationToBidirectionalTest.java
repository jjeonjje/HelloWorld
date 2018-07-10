package me.jjh.refactoring.chapter08.ChangeUnidirectionalAssociationToBidirectional;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ChangeUnidirectionalAssociationToBidirectional.example.Customer;
import me.jjh.refactoring.chapter08.ChangeUnidirectionalAssociationToBidirectional.example.Order;

/**
 * 클래스의 단방향 연결을 양방향으로 전환
 * 
 * - 두 클래스가 서로의 기능을 사용해야 하는데 한 방향으로만 연결되어 있을 땐
 * 역 포인터를 추가하고 두 클래스를 모두 업데이트 할 수 있게 접근 한정자를 수정하자.
 * 
 * @author jjh
 *
 */
public class ChangeUnidirectionalAssociationToBidirectionalTest {

	@Test
	public void 클래스의_단방향_연결을_양방향으로_전환() {
		
		Order order = new Order();
		Customer customer = new Customer();
		order.setCustomer(customer);
		
		assertThat(order.getCustomer(), is(customer));
		assertThat(customer.friendsOrders().contains(order), is(true));
	}
	
}
