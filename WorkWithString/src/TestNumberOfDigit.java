import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestNumberOfDigit {
	private NumberOfDigit ms;
	@Before
	public void setUp() throws Exception {
		ms = new NumberOfDigit();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(2, ms.getNumberOfDigit(12));
		assertEquals(4, ms.getNumberOfDigit(1245));
		assertEquals(8, ms.getNumberOfDigit(12121212));
		assertEquals(5, ms.getNumberOfDigit(19012));
	}

}
