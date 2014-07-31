import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTime {
	private Time mytime;
	@Before
	public void setUp() throws Exception {
		mytime = new Time(10, 56, 38, 17, 7, 14);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("10:56:38 17.07.14", mytime.toString());
	}

}
