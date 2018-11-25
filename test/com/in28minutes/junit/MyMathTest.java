package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath math = new MyMath();
	
	@BeforeAll
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}

	@BeforeEach
	public void before() {
		System.out.println("BeforeEach");
	}
	
	@AfterEach
	public void after() {
		System.out.println("AfterEach");
	}
	
	@Test
	void sum_with3numbers() {
		System.out.println("Test 1");
		assertEquals(5, math.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	void sum_with1numbers() {
		System.out.println("Test 2");
		assertEquals(3, math.sum(new int[] { 3 }));
	}

}
