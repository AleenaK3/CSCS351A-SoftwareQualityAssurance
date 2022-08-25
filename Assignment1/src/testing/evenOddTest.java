package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class evenOddTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		String output = test.evenOdd(0);
		assertEquals("even", output);
	}

}
