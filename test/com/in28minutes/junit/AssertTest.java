package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		assertTrue(25>10);
		assertFalse(25<10);
		assertNotNull((Integer)1);
		assertNull(null);
		//assertArrayEquals(expected, actual);
	}

}
