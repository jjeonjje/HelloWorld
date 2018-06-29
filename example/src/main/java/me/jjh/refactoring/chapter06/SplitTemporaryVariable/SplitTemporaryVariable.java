package me.jjh.refactoring.chapter06.SplitTemporaryVariable;

/**
 * 임시변수 분리
 * 
 * - 루프 변수나 값 누적용 임시변수가 아닌 임시변수에 여러번 값이 대입될 땐 각 대입마다 다른 임시변수를 사용하자.
 * 
 * @author jjh
 *
 */
public class SplitTemporaryVariable {
	
	private double _primaryForce;
	private double _mass;
	private double _secondaryForce;
	private int _delay;
	
	/**
	 * 리펙토링 전
	 * @param time
	 * @return
	 */
	public double getDistanceTravelled(int time) {
		double result;
		double acc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0) {
			double primaryVel = acc * _delay;
			acc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 *
					acc * secondaryTime * secondaryTime;
		}
		
		return result;
	}
	
	
	/**
	 * 리펙토링 후 
	 * - acc 값이 두 번 대입되는것을 각 용도에 맞게 분리
	 * - acc -> primaryAcc , secondaryAcc
	 * @param time
	 * @return
	 */
	public double getDistanceTravelled_refactoring(int time) {
		double result;
		final double primaryAcc = _primaryForce / _mass;
		int primaryTime = Math.min(time, _delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - _delay;
		if(secondaryTime > 0) {
			double primaryVel = primaryAcc * _delay;
			double secondaryAcc = (_primaryForce + _secondaryForce) / _mass;
			result += primaryVel * secondaryTime + 0.5 *
					secondaryAcc * secondaryTime * secondaryTime;
		}
		
		return result;
	}	

}
