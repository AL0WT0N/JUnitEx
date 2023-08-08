package com.qa.junit;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int i, int j) { 
		return i - j;
	}
	
	public int conditionalCalc(int i, int j, boolean flag) {
		if (flag == true) {
			return i + j;
		} else {
			return i - j;
		}
	}
}
