package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	@Test
	void return20_whenAIs10AndBIs10() {
		// GIVEN
		int a = 10;
		int b = 10;
		int expected = 20;
		// WHEN
		int actual = Main.sum(a, b);
		// THEN
		assertEquals(expected, actual);
		//assertNotEquals(unexpected, actual);
	}

	@Test
	void return10_whenAIs20AndBIs10(){
		// GIVEN
		int a = 20;
		int b = 10;
		int expected = 10;
		// WHEN
		int actual = Main.differenz(a, b);
		// THEN
		assertEquals(expected, actual);
	}

	@Test
	void return20_whenAIs40AndBIs20(){
		// GIVEN
		int a = 40;
		int b = 20;
		int expected = 20;
		// WHEN
		int actual = Main.differenz(a, b);
		// THEN
		assertEquals(expected, actual);
	}

	@Test
	void isEvenNumber_whenNumberIsEven_thenExpectTrue(){
		// GIVEN
		int n = 10;
		// WHEN
		boolean actual = Main.isEvenNumber(n);
		// THEN
		assertTrue(actual);
	}
}