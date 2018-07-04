package me.jjh.refactoring.chapter08.SelfEncapsulateField;

/**
 * 필드 자체 캡슐화
 * 
 * - 필드에 직접 접근하던 중 그 필드의 결합에 문제가 생길 땐
 * 그 필드용 getter/setter 메서드를 작성해서 두 메서드를 통해서만 필드에 접근하게 만들자.
 * 
 * @author jjh
 *
 */
public class SelfEncapsulateField {

	/**
	 * 필드 자체 캡슐화
	 * @author jjh
	 *
	 */
	public class IntRage {
		
		boolean includes(int arg) {
			return arg >= getLow() && arg <= getHigh();
		}
		
		void grow(int factor) {
			setHigh(getHigh() * factor);
		}
		
		private int low, high;
		
		IntRage(int low, int high){
			this.low = low;
			this.high = high;
		}

		public int getLow() {
			return low;
		}

		public void setLow(int low) {
			this.low = low;
		}

		public int getHigh() {
			return high;
		}

		public void setHigh(int high) {
			this.high = high;
		}
		
	}
	
	/**
	 * IntRage의 기능 재정의
	 * @author jjh
	 *
	 */
	class CappedRange extends IntRage {

		CappedRange(int low, int high, int cap){
			super(low,high);
			this.cap = cap;
		}
		
		private int cap;

		public int getCap() {
			return cap;
		}

		public void setCap(int cap) {
			this.cap = cap;
		}
		
		public int getHigh() {
			return Math.min(super.getHigh(), getCap());
		}
	}
	
}
