package com.qa.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

	@Test
	public void assertEqualsTest() {
		boolean boo = true;
		// Assert that expected value is equal to actual value - (expected, actual)
		assertEquals(true, boo);
	}
	
	@Test
	public void assertTrueTest() {
		boolean boo = false;
		assertTrue("Expected: Flag set to true", boo);
	}
	
	@Test
	public void assertFalseTest() {
		boolean boo = false;
		assertFalse("Expected: Flag set to false", boo);
	}
	
	@Test
	public void assertNullTest() {
		Object obj = null;
		assertNull("Expected null object", obj);
	}
	
	@Test
	public void assertNotNullTest() {
		Object obj = "Hello";
		assertNotNull("Expected not null object", obj);
	}

	@Test
	public void assertSameTest() {
		String obj1 = "Anoush Lowton";
		String obj2 = obj1;
		
		assertSame("Expected both objects to be the same", obj1, obj2);
	}
	
	@Test
	public void assertNotSameTest() {
		String obj1 = "Alpha";
		String obj2 = "Beta";
		
		assertNotSame("Expected the objects to NOT be the same", obj1, obj2);
	}
	
}
