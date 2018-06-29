package me.jjh.refactoring.chapter06.RemoveAssingnmentsToParameters;

/**
 * 매개변수로의 값 대입 제거
 * 
 *  - 매개변수로 값을 대입하는 코드가 있을 떈
 * 매개변수 대신 임시변수를 사용하게 수정하다.
 * 
 * @author jjh
 *
 */
public class RemoveAssingnmentsToParameters {

	/**
	 * 리펙토링 전
	 * @param inputVal
	 * @param quantity
	 * @param yearTodate
	 * @return
	 */
	public int discount (int inputVal, int quantity, int yearTodate) {
		if (inputVal > 50) inputVal -= 2;
		if (quantity > 100) inputVal -= 1;
		if (yearTodate > 10000) inputVal -= 4;
		return inputVal;
	}

	/**
	 * 리펙토링 후 
	 * 
	 * - 매개변수를 임시변수 result로 변경
	 * - 강제 적용하고자 하면 final 키워드를 사용
	 * 
	 * @param inputVal
	 * @param quantity
	 * @param yearTodate
	 * @return
	 */
	public int discount_refactoring (final int inputVal,final int quantity,final int yearTodate) {
		int result = inputVal;
		if (inputVal > 50) result -= 2;
		if (quantity > 100) result -= 1;
		if (yearTodate > 10000) result -= 4;
		return result;
	}
}
