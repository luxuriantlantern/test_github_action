package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	void testAddWithNegativeA() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> {
			main.add(-1, 1);
		});
	}

	@Test
	void testAddWithNegativeB() {
		Main main = new Main();
		assertThrows(IllegalArgumentException.class, () -> {
			main.add(1, -1);
		});
	}

	@Test
	void testAddOverflow() {
		Main main = new Main();
		assertThrows(ArithmeticException.class, () -> {
			main.add(Integer.MAX_VALUE, 1);
		});
	}

}
