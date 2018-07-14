package me.jjh.refactoring.chapter08.EncapsulateCollection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.EncapsulateCollection.example.Course;
import me.jjh.refactoring.chapter08.EncapsulateCollection.example.Person;
import me.jjh.refactoring.chapter08.EncapsulateCollection.refactoring.Person_refactoring;

/**
 * 컬렉션 캡슐화
 * 
 * -메서드가 컬렉션을 반환할 땐
 * 그 메서드가 읽기전용 뷰를 반환하게 수정하고 추가 메서드와 삭제 메서드를 작성하자.
 * 
 * @author jjh
 *
 */
public class EncapsulateCollectionTest {

	@Test
	public void test() {
		
		/*
		 * 리팩토링 전
		 */
		Person kent = new Person();
		Set s = new HashSet();
		s.add(new Course("프로그래밍1", false));
		s.add(new Course("프로그래밍2", true));
		kent.setCourses(s);
		assertThat(2, is(kent.getCourses().size()));
		Course refact = new Course("리팩토링", true);
		kent.getCourses().add(refact);
		kent.getCourses().add(new Course("귀찮아", false));
		assertThat(4, is(kent.getCourses().size()));
		kent.getCourses().remove(refact);
		assertThat(3, is(kent.getCourses().size()));
		
		/*
		 * 리팩토링 후
		 */
		Person_refactoring kent2 = new Person_refactoring();
		kent2.addCourses(new Course("프로그래밍1", false));
		kent2.addCourses(new Course("프로그래밍2", true));
		kent2.addCourses(new Course("귀찮아", false));
		
		assertThat(3, is(kent2.numberOfCourses()));
	}	
	
}
