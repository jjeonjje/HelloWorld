package me.jjh.refactoring.chapter08.ReplaceDataValueWithObject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.ReplaceDataValueWithObject.example.Order;

/**
 * 데이터 값을 객체로 전환
 * 
 * - 데이터 항목에 데이터나 기능을 더 추가해야 할 때는
 * 데이터 항목을 객체로 만들자
 * 
 * @author jjh
 *
 */
public class ReplaceDataValueWithObjectTest {

	@Test
	public void 데이터_값을_객체로_전환() {
		
		String customerName = "testName";
		Order order = new Order(customerName);
		
		assertThat(customerName, is(order.getCustomerName()));
		
	}
	
}
