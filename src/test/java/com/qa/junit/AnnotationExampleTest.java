package com.qa.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationExampleTest {

	// Only once
	// Before the tests within the class run
	// Always static
	@BeforeClass
	public static void setUp() {
		System.out.println("Before Class");
	}
	
	// @Before - This is to be executed before EVERY @Test 
	@Before
	public void init() {
		System.out.println("Before Test");
	}
	
	// @Test - Labels the method as a Junit Test
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	// @Ignore - to skip this test method
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	// @After - Executed after EVERY @Test 
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	// @AfterClass - Executed once after all tests - This is ran LAST
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}
}
