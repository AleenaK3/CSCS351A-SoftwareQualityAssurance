package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int output = test.add(5, 15);
		assertEquals(20, output);
	}

}
