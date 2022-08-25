package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addTest.class, divTest.class, evenOddTest.class, mulTest.class, 
	reverseTest.class, subTest.class })

public class AllTests {
	
}
