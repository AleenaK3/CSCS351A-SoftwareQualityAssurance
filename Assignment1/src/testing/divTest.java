package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		double output = test.div(49, 7);
		assertEquals(7, output);
	}

}
