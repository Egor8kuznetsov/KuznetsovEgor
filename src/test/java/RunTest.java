import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RunTest {

    @Before
    public void before() {
        System.out.println("Before Test");
    }

    @Test
    public void test1() {
        assertEquals( 1, 1);
        System.out.println("Test successful");
    }

    @After
    public void after() {
        System.out.println("After Test");
    }

    @Test
    public void test2() {
        assertEquals("Fail Test", 1, 2);

    }
}
