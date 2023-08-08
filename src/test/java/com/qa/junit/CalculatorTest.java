package com.qa.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(15, calc.add(10, 5));
	}
	
	@Test
	public void subtractTest() {
		assertEquals(10, calc.subtract(20, 10));
	}
	
	@Test
	public void conditionalCalcTrueTest() {
		assertEquals(12, calc.conditionalCalc(10, 2, true));
	}
	
	@Test
	public void conditionalCalcFalseTest() {
		assertEquals(8, calc.conditionalCalc(10, 2, false));
	}
}
