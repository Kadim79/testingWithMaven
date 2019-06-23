import com.company.ArraysUtil;
import org.junit.*;
import org.junit.rules.ExpectedException;

// import static junit.framework.TestCase.fail;
import java.util.Random;

import static org.junit.Assert.*;

public class JunitLearningTest {

    @BeforeClass

    public static void beforeClass() {

        System.out.println("One time Before All Tests");
    }
    @Before
    public void setUp(){

        System.out.println("Before each test");
    }

    @Test

    public void test1() {

        assertEquals("ca","capitala".substring(0,2));
        assertEquals(2,2);
        assertEquals("Doubles are not equals",0.2,0.25,0.1);
        assertTrue("saaa".contains("s"));
        assertFalse(false);
        assertArrayEquals(new int[]{1,2,3}, new int[] {1,2,3});
        assertNotNull("saa");

        //fail("Not implemented");
    }

    @Test(expected = ArithmeticException.class)

    public void test2(){

        int a=new Random().nextInt(1000);
        int c=a/0;
    }

    @After

    public void afterTest(){

        System.out.println("After each test");
    }


    @AfterClass

    public static void afterClass(){
        System.out.println("One time after all Tests");

    }
}

