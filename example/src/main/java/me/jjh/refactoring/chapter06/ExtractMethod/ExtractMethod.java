package me.jjh.refactoring.chapter06.ExtractMethod;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 메서드 추출
 * 
 * - 어떤 코드를 그룹으로 묶어도 되겠다 판단될 땐
 * 그 코드를 빼내어 목적을 잘 나타내는 직관적 이름의 메서드로 만들자.
 * 
 * @author jjh
 *
 */
public class ExtractMethod {
	String _name = "홍길동";
	List<Order> _orderList = Arrays.asList(new Order(1000), new Order(2000), new Order(3000));

	/**
	 * 리팩토링 전
	 */
	public void prictOwing() {
		
		Iterator<Order> iterator = _orderList.iterator();
		double outstanding = 0.0;
		
		// 배너 출력
		System.out.println("***************************");
		System.out.println("******** 고객 외상 ********");
		System.out.println("***************************");
		
		// 외상액 계산
		while (iterator.hasNext()) {
			Order each = iterator.next();
			outstanding += each.getAmount();
		}
		
		// 세부 내역 출력
		System.out.println("고객명: "+_name);
		System.out.println("외상액: "+outstanding);
	}
	
	/**
	 * 리팩토링 후
	 */
	public void prictOwing_refactoring() {
		pringBanner();
		pringDetails(getOutstanding(0.0));
	}
	
	private void pringBanner() {
		// 배너 출력
		System.out.println("***************************");
		System.out.println("******** 고객 외상 ********");
		System.out.println("***************************");
	}
	
	private void pringDetails(double outstanding) {
		// 세부 내역 출력
		System.out.println("고객명: "+_name);
		System.out.println("외상액: "+outstanding);
	}
	
	private double getOutstanding(double initialValue) {
		Iterator<Order> iterator = _orderList.iterator();
		double result = initialValue;
		// 외상액 계산
		while (iterator.hasNext()) {
			Order each = iterator.next();
			result += each.getAmount();
		}
		return result;
	}	
	
	
	@Test
	public void 매서드_추출() {
		ExtractMethod extractMethod = new ExtractMethod();
		
		extractMethod.prictOwing();
		extractMethod.prictOwing_refactoring();
	}	
}
