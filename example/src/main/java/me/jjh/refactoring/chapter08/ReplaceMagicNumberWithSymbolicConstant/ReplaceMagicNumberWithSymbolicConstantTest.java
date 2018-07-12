package me.jjh.refactoring.chapter08.ReplaceMagicNumberWithSymbolicConstant;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

/**
 * 마법 숫자를 기호 상수로 전달
 * 
 * - 특수 의미를 지닌 리터럴 숫자가 있을 땐 의미를 살린 이름의 상수를 작성한 후 리터럴 숫자를 그 상수로 교체하자.
 * 
 * @author jjh
 *
 */
public class ReplaceMagicNumberWithSymbolicConstantTest {

	private double mass = 10000;
	private double height = 100;
	
	// 리팩토링 전
	double potentialEnergy(double mass, double height) {
		return mass * 9.81 * height;
	}
		
	// 리팩토링 후
	double potentialEnergy_redactoring(double mass, double height) {
		return mass * GRAVITATIONAL_CONSTANT * height;
	}
	
	static final double GRAVITATIONAL_CONSTANT = 9.81;

	
	@Test
	public void 마법_숫자를_기호_상수로_전달() {
		
		double mass = 10000;
		double height = 100;
		
		assertThat(potentialEnergy(mass,height), is(potentialEnergy_redactoring(mass,height)));
	}
}
