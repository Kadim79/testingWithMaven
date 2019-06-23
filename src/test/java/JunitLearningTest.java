import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.*;

public class JunitLearningTest {

    @Test

    public void test1() {

        assertEquals("ca","capitala".substring(0,2));
        assertEquals(2,2);
        assertEquals("Doubles are not equals",0.2,0.25,0.1);
        assertTrue("saaa".contains("s"));
        assertFalse(false);
        assertArrayEquals(new int[]{1,2,3}, new int[] {1,2,4});
        assertNotNull("saa");

        //fail("Not implemented");
    }

    @Test

    public void test2(){ }

}
