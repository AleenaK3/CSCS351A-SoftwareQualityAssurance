package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class reverseTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		String output = test.reverse("SQA");
		assertEquals("AQS", output);
	}

}
