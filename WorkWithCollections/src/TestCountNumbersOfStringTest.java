import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCountNumbersOfStringTest {
    private CountNumbersOfString str; 
	@Before
	public void setUp() throws Exception {
		str = new CountNumbersOfString();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(str.countWords("Ninjas are all over the place! We are all going to die!"));
		assertEquals("{Ninjas=1, are=2, all=2, over=1, the=1, place!=1, We=1, going=1, to=1, die!=1}",str.countWords("Ninjas are all over the place! We are all going to die!"));
		
		
	}




}
