package mipt.sbt.figure;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by Violetta on 20.09.2018.
 */
public class CircleTest extends TestCase {

    private Circle figure = new Circle(10);;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before CircleTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After CircleTest.class");
    }

    @Test
    public void testGetSquare() throws Exception {
        assertEquals(314.0,figure.getSquare(),0);
    }


}