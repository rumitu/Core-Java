import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestRemoveElementsFromCollection {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("three");
        list.add("three");
        list.add(null);

        
        RemoveElementsFromCollection.removeDuplicates(list);
        assertEquals(Arrays.asList("one", "two", "three"), list);
	}

}
