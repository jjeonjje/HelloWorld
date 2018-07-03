package me.jjh.refactoring.chapter07.IntroduceLocalExtension;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 국소적 상속확장 클래스 사용
 * 
 * - 사용중인 서버 클래스에 여러 개의 메서드를 추가해야 한느데 클래스를 수정할 수 없으 땐
 * 새 클래스를 작성하고 그 안에 필요한 여러 개의 메서드를 작성하자.
 * 이 상속확장 클래스를 원본 클래스의 하위 클래스나 래퍼 클래스로 만들자.
 * 
 * @author jjh
 *
 */
public class IntroduceLocalExtension {

	/**
	 * 하위클래스 사용
	 * @author jjh
	 *
	 */
	public class MfdateSub extends Date {
		
		public MfdateSub(String dateString) {
			super(dateString);
		}
		
		public MfdateSub(Date arg) {
			super(arg.getTime());
		}
		
		/**
		 * 추가 메서드
		 * @param arg
		 * @return
		 */
		public Date nextDay(Date arg) {
			return new Date(arg.getYear(),arg.getMonth(),arg.getDate() + 1);
		}
	}
	
	/**
	 * 래퍼 클래스 사용
	 * @author jjh
	 *
	 */
	public class MfDateWrap {
		
		private Date _original;
		
		public MfDateWrap(String dateString) {
			_original = new Date(dateString);
		}
		
		public MfDateWrap(Date arg) {
			_original = arg;
		}
		
		// 원본 Date 클래스의 모든 메서드를 위임해야됨..
		// ...
		public int getYear() {
			return _original.getYear();
		}
		
		/**
		 * 추가 메서드
		 * @param arg
		 * @return
		 */
		public Date nextDay(Date arg) {
			return new Date(arg.getYear(),arg.getMonth(),arg.getDate() + 1);
		}		
	}
	
	@Test
	public void 국소적_상속확장_클래스_사용() {
		
		// 상속
		Date nextDay1 = new IntroduceLocalExtension().new MfdateSub(new Date()).nextDay(new Date());
		// 래퍼 클래스
		Date nextDay2 = new IntroduceLocalExtension().new MfDateWrap(new Date()).nextDay(new Date());
		
		assertThat(nextDay1, is(nextDay2));
	}
}
