package me.jjh.refactoring.chapter08.ReplaceArrayWithObject;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

/**
 * 배열을 객체로 전환
 * 
 * - 배열을 구성하는 특정 원소가 별의별 의미를 지닐 땐 그 배열을 각 원소마다 필드가 하나씩 든 객체로 전환하자.
 * 
 * @author jjh
 *
 */
public class ReplaceArrayWithObjectTest {

	class Performance {
		
		private String name;
		private String wins;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getWins() {
			return wins;
		}
		public void setWins(String wins) {
			this.wins = wins;
		}
		
	}
	
	@Test
	public void 배열을_객체로_전환() {
		
		String[] row = new String[3];
		row[0] = "Liverpool";
		row[1] = "15";
		
		Performance performance = new Performance();
		performance.setName("Liverpool");
		performance.setWins("15");
		
		assertThat(row[0], is(performance.getName()));
		assertThat(row[1], is(performance.getWins()));
	}
	
}
