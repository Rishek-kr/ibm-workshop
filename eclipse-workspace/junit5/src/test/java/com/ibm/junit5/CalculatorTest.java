package com.ibm.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSum() {
		System.out.println("Sum");
		int expected = 6;
		Calculator calculator = new Calculator();
		int actual = calculator.sum(4, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivide(){ 
		System.out.println("Divide");
		int expected = 2;
		Calculator calculator = new Calculator();
		int actual = calculator.divide(4, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivideByZeroException() {
		System.out.println("divide");
		Calculator calculator = new Calculator();
		ArithmeticException exception = assertThrows(ArithmeticException.class,() -> calculator.divide(10, 0),
				"Expected divide() to throw, but it didn't");
		assertEquals("/ by zero", exception.getMessage());
	}
	
	@Test
	void testSlowMethodPerformance() {
		Calculator calculator = new Calculator();
		assertTimeout(Duration.ofMillis(100), () -> calculator.getConnection());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,10})
	void testIsEvenWithEvenNumbers(int number) {
		assertTrue(Calculator.isEven(number));
	}

	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9})
	void testIsEvenWithOddNumbers(int number) {
		assertFalse(Calculator.isEven(number));
	}

}
