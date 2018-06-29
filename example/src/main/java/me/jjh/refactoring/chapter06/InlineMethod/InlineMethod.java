package me.jjh.refactoring.chapter06.InlineMethod;

/**
 * 메서드 내용 직접 삽입
 * 
 * - 메서드 기능이 너무 단순해서 메서드명만 봐도 너무 뻔할 땐
 * 그 메서드의 기능을 호출하는 메서드에 넣어버리고 그 메서드는 삭제하자.
 * 
 * @author jjh
 *
 */
public class InlineMethod {

	int _numberOfLateDeliveries = 1;
	
	/**
	 * 리펙토링 전
	 * @return
	 */
	public int getRating() {
		return (moreThanFineLateDeliveries()) ? 2 : 1;
	}
	
	private boolean moreThanFineLateDeliveries() {
		return _numberOfLateDeliveries > 5;
	}	
	
	/**
	 * 리펙토링 후
	 * - 단순 기능은 moreThanFineLateDeliveries() 메서드 삭제
	 * @return
	 */
	public int getRating_refactoring() {
		return (_numberOfLateDeliveries > 5) ? 2: 1;
	}
}
