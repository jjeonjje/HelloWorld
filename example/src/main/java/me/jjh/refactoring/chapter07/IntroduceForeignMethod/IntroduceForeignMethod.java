package me.jjh.refactoring.chapter07.IntroduceForeignMethod;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 외래 클래스에 메서드 추가
 * 
 * - 사용중인 서버 클래스에 메서드를 추가해야 하는데 그 클래스를 수정할 수 없을 땐
 * 클라이언트 클래스 안에 서버 클래스의 인스턴스를 첫 번째 인자로 받는 메서드를 작성하자.
 * 
 * @param arg
 * @return
 */
public class IntroduceForeignMethod {
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(),arg.getMonth(),arg.getDate() + 1);
	}
	
	@Test
	public void 외래_클래스에_메서드_추가() {
		
		Date previousEnd = new Date();
		
		// 리팩토링 전
		Date newStart1 = new Date(previousEnd.getYear(),previousEnd.getMonth(),previousEnd.getDate() + 1);
		
		// 리팩토링 후
		Date newStart2 = nextDay(previousEnd);
		
		assertThat(newStart1,is(newStart2));
	}
}
