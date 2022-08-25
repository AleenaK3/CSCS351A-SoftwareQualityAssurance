package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class subTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.sub(5, 15);
		assertEquals(-10, output);
	}

}
