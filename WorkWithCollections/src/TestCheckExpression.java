import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class TestCheckExpression {
	private CheckExpression exp;
	@Before
	public void setUp() throws Exception {
		exp = new CheckExpression();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(exp.isCorrectExpression("6*(4+8)"));
		assertTrue(exp.isCorrectExpression("1 + (3 + 2 - (2+3) * 4 - ((3+1)*(4-2)))"));
		assertFalse(exp.isCorrectExpression("((6+87)+8*75-12))"));
	}

}
