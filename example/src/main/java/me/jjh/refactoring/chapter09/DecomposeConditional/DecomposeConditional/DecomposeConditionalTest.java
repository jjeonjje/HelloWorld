package me.jjh.refactoring.chapter09.DecomposeConditional.DecomposeConditional;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.Date;

import org.junit.jupiter.api.Test;

/**
 * 조건문 쪼개기
 * 
 * - 복잡한 조건문이 있을땐 if, then, else 부분을 각 메서드로 빼내자
 * 
 * @author jjh
 *
 */
public class DecomposeConditionalTest {

	private Date date = new Date();  
	private static final Date SUMMER = new Date(2018, 7, 1);  
	private static final Date WINTER = new Date(2018, 9, 1);  
	
	private double charge;  
	private double charge_re;  
	private double winterRate = 1;  
	private double winterServiceCharge;  
	private double summerRate = 1.1;  
	private int quantity = 1000;
	 
	@Test
	public void 조건문_쪼개기() {
		
		/*
		 * 리팩토링 전 
		 */
		if(date.before(SUMMER) || date.after(WINTER)) {
			charge = quantity * winterRate + winterServiceCharge;
		}else {
			charge = quantity * summerRate;
		}
		
		/*
		 * 리팩토링 후
		 */
		if(notSummer(date)) {
			charge_re = winterCharge(quantity);
		}else {
			charge_re = summerCharge(quantity);			
		}
		
		assertThat(charge, is(charge_re));
		
	}
	
	private boolean notSummer(Date date) {
		return date.before(SUMMER) || date.after(WINTER);
	}
	
	private double summerCharge(int quantity) {
		return quantity * summerRate;
	}
	
	private double winterCharge(int quantity) {
		return quantity * winterRate + winterServiceCharge;
	}
}


