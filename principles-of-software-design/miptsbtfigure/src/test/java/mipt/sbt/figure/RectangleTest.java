package mipt.sbt.figure;

import com.sun.org.apache.regexp.internal.RE;
import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by Violetta on 20.09.2018.
 */
public class RectangleTest extends TestCase {
    private Rectangle figure = new Rectangle(2,3);;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before RectangleTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After RectangleTest.class");
    }

    @Test
    public void testGetSquare() throws Exception {
        assertEquals(6.0,figure.getSquare(),0);
    }

}