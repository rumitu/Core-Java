import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestJointString {
	private JointString ms;
	@Before
	public void setUp() throws Exception {
		ms = new JointString();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Днес видях 5 ходещи медузи ", ms.stichMeUp(" ", "Днес", "видях", 5, "ходещи", "медузи"));
	}

}
