package com.qa.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class BlackjackSimpleTest {

	@Test
	public void dealerBustTest() {
		// Act
		int result = BlackjackSimple.play(22, 21);
		
		// Assert
		// assertEquals(expected, actual)
		assertEquals(20, result);
	}
	
	@Test
	@Ignore
	public void playerBustTest() {
		// assertEquals(expected, actual)
		assertEquals(21, BlackjackSimple.play(21, 22));
	}
	
	@Test
	public void bothBustTest() {
		// assertEquals(expected, actual)
		assertEquals(0, BlackjackSimple.play(22, 22));
	}
	
	@Test
	public void highestValueWinsTest() {
		// assertEquals(expected, actual)
		assertEquals(18, BlackjackSimple.play(18, 17));
	}
	
}
