import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestMaximumScalar {

	private MaximumScalar ms;
	@Before
	public void setUp() throws Exception {
		ms = new MaximumScalar();
		System.out.print("This is setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.print("This is tearDown");
	}

	@Test
	public void test() {
		int [] a = {1, 0};
		int [] b = {0, 1};
		assertEquals(1, ms.maximumScalar(a, b));
	}

}
