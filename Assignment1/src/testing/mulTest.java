package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mulTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.mul(5, 15);
		assertEquals(75, output);
	}

}
