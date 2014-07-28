import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestReverseCollection {

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		ReverseCollection.reverse(arr);
		
	
				
		assertEquals(Arrays.asList(3, 2, 1), arr);
		
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Rumi");
		arrList.add("Iva");
		arrList.add("Petya");
		ReverseCollection.reverse(arrList);
		
		
		
		assertEquals(Arrays.asList("Petya", "Iva", "Rumi"), arrList);
	}






}
