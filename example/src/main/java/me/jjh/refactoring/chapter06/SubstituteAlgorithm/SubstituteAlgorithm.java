package me.jjh.refactoring.chapter06.SubstituteAlgorithm;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * 알고리즘 전환
 * 
 * - 알고리즘을 더 분명한 것으로 교체해야 할 땐
 * 해당 메서드의 내용을 새 알고리즘으로 바꾸자.
 * 
 * @author jjh
 *
 */
public class SubstituteAlgorithm {

	/**
	 * 리펙토링 전
	 * @param people
	 * @return
	 */
	public String foundPerson(String[] people){
		for(int i=0; i < people.length; i++){
			if(people[i].equals("Don")){
				return "Don";
			}
			if(people[i].equals("John")){
				return "John";
			}
			if(people[i].equals("Kent")){
				return "Kent";
			}
		}
		return "";
	}
	
	/**
	 * 리펙토링 후
	 * @param people
	 * @return
	 */
	public String foundPerson_refactoring(String[] people){
		List<String> candidates = Arrays.asList(new String[]{"Don","John","Kent"});
		for(int i=0; i < people.length; i++){
			if(candidates.contains(people[i]))
				return people[i];
		}
		
		return "";
	}	
	
	@Test
	public void 알고리즘_전환() {
		SubstituteAlgorithm algorithm = new SubstituteAlgorithm();
		
		String person1 = algorithm.foundPerson(new String[] {"Don"});
		String person2 = algorithm.foundPerson_refactoring(new String[] {"Don"});
		
		assertThat(person1, is(person2));
	}	
}
