package com.te.junitdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("MyClass")
public class MathUtilTest1 {
	@Disabled
	public void myMethod() {
		System.out.println("hello");
	}
	
	@Test
	public void addTest() {
		MathUtils mathUtils = new MathUtils();
//		int expected = 10;
//		int actual = mathUtils.add(6, 4);
//		if(actual!=expected) {
//			System.out.println("Failure");
//		}else {
//			System.out.println("Success");
//		}
		
		assertEquals(10, mathUtils.add(5, 5),"this method adds two integers");
		System.out.println("1st");
	}
	
	@Test
	@DisplayName("MethName")
	public void areaTest() {
		MathUtils mathUtils = new MathUtils();
		double expected = 3.141592653589793;
		double actual = mathUtils.areaOfCircle(1);
		assertEquals(expected, actual);
		System.out.println("2nd");
	}
	Assumptions
}
