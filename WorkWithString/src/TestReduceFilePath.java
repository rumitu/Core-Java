import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestReduceFilePath {
	private ReduceFilePath ms;
	@Before
	public void setUp() throws Exception {
		ms= new ReduceFilePath();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("/a/d/a", ms.reduce_file_path("/a/b/c/.././../d/a/c/.///..//////"));
	}

}
