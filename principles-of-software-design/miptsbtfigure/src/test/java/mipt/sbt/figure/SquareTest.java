package mipt.sbt.figure;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by Violetta on 20.09.2018.
 */
public class SquareTest extends TestCase {

    private Square figure = new Square(5);

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before SquareTest.class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After SquareTest.class");
    }

    @Test
    public void testGetSquare(){
        assertEquals(25.0, figure.getSquare(),0);
    }

}