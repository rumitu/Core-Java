import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestStackImpl extends TestStack{

	private static int CAPACITY = 40;

    @Before
    public void makeBoundedStack() {
        s = new StackImpl(CAPACITY);
    }

    @Test(expected=IllegalStateException.class)
    public void testPushToFullStack() {
        for (int i = 0; i < CAPACITY; i++) {
            s.push("abc");
        }
        s.push("abc");
    }

}
