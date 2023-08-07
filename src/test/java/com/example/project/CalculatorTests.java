/*
 * Copyright 2015-2022 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTests {

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3, 4, 5, 6, 7})
	void itShouldGreaterThan(int i) {
		// Given

		// When

		// Then
		assertTrue( i > 0);
	}

	@Test
	public void testFindSquareRoot(){
		Calculator calculator = new Calculator();
		double expResult = 2.5;
		double result = calculator.findSquareRoot(6.25);
		assertEquals(expResult, result, "The square is wrong");
	}


	// @Disabled
	@Test
	@Disabled
	void divisionByZero() {
		// Given
		Calculator calculator = new Calculator();
		// When

		// Then
		assertThrows(ArithmeticException.class, () -> calculator.divide(10,2),
				"wrong exception thrown");
	}


	@Test
	void itShouldSleep() {
		// Given
		Calculator calculator = new Calculator();
		// When
		assertTimeout(java.time.Duration.ofMillis(1000),
				() -> {
					// Add any code here that may take longer than 500 milliseconds to complete
					Thread.sleep(500); // Sleep for 1 second (1000 milliseconds)
					System.out.println("Test completed successfully!");
				});
		// Then

	}

	@Test
	void itShouldAddNumbersQuick() {
		// Given
		Calculator calculator = new Calculator();
		// When
		assertTimeout(java.time.Duration.ofMillis(1),
				() -> calculator.add(10,10));
		// Then
	}

	@Test
	void myDumTest(){
		assertTrue(true);
	}

//	@Test
//	void failing(){
//		Assertions.assertEquals("a", "not-a");
//	}
//	@Test
//	void assertionWithMessage(){
//		var expected = "expected";
//		var actual = "actual";
//
//		assertEquals(expected, actual, "Doh! the expected did not match the actual!");
//	}

}
