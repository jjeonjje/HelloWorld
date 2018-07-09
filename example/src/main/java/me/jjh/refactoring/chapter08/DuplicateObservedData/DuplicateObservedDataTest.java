package me.jjh.refactoring.chapter08.DuplicateObservedData;

import me.jjh.refactoring.chapter08.DuplicateObservedData.example.IntervalWIndow;
import me.jjh.refactoring.chapter08.DuplicateObservedData.refactoring.IntervalWIndow_re;

/**
 * 관측 데이터 복제
 * 
 * 도메인 데이터는 GUI 컨트롤 안에서만 사용 가능한다. 
 * 도메인 메서드가 그 데이터에 접근해야 할 땐 그 데이터를 도메인 객체로 복사하고, 양측의 데이터를 동기화하는 관측 인터페이스 observer를 작성하자.
 * 
 * @author jjh
 *
 */
public class DuplicateObservedDataTest {

	public static void main(String[] args) {

		// 리팩토링 전
		new IntervalWIndow();
		
		// 리팩토링 후
		new IntervalWIndow_re();
		
	}
}
