import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestConvertHashMapIntoKey {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	    map.put("1","one");
	    map.put("2","two");
	    map.put("3","three");
	    map.put("4","four");
	    
	    
	    assertEquals("1 : one, 2 : two, 3 : three, 4 : four", ConvertHashMapIntoKey.mapToString(map));
	    
	}
}
