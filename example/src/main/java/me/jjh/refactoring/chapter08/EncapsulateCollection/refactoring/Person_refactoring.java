package me.jjh.refactoring.chapter08.EncapsulateCollection.refactoring;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;

import me.jjh.refactoring.chapter08.EncapsulateCollection.example.Course;
import me.jjh.refactoring.chapter08.EncapsulateCollection.example.Person;

public class Person_refactoring {

	private Set courses = new HashSet();

	public Set getCourses() {
		return Collections.unmodifiableSet(this.courses);
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

	public void addCourses(Course arg) {
		this.courses.add(arg);
	}
	
	public void removeCourses(Course arg) {
		this.courses.remove(arg);
	}

	public void initializeCourses(Set arg) {
		if(this.courses.isEmpty()) {
			courses.addAll(arg);
		}
	}
	
	public int numberOfCourses() {
		return this.getCourses().size();
	}
	
	public int numberOfAdvancedCourses() {
		Iterator iter = getCourses().iterator();
		int count = 0;
		while(iter.hasNext()) {
			Course each = (Course) iter.next();
			if(each.isAdvanced()) count ++;
		}
		return count;
	}
			
}