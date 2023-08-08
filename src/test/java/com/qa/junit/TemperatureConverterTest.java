package com.qa.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureConverterTest {

	TemperatureConverter tempConverter = new TemperatureConverter();
	
	@Test
	public void convertFahrenheitToCelsiusTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(15.556, tempConverter.convertFahrenheitToCelsius(60), 0.001);
	}
	
	@Test
	public void convertCelsiusToFahrenheitTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(104, tempConverter.convertCelsiusToFahrenheit(40), 0);
	}
	
	@Test
	public void convertKelvinToCelsiusTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(127, tempConverter.convertKelvinToCelsius(400), 0);
	}
	
	@Test
	public void convertCelsiusToKelvinTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(423, tempConverter.convertCelsiusToKelvin(150), 0);
	}
	
	@Test
	public void convertKelvinToFahrenheitTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(80.599, tempConverter.convertKelvinToFahrenheit(300), 0.001);
	}
	
	@Test
	public void convertFahrenheitToKelvinTest() {
		// assertEquals(Expected, Actual, Delta)
		assertEquals(333, tempConverter.convertFahrenheitToKelvin(140), 0);
	}
	
}
