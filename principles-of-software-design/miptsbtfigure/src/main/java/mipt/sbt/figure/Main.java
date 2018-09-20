package mipt.sbt.figure;

import static org.junit.Assert.assertEquals;

/**
 * Created by Violetta on 20.09.2018.
 */
public class Main {
    public static void main(String[] args) {
     Square square = new Square(5);
        assertEquals(25.0,square.getSquare(),0);
        System.out.println(square.getSquare());
    }
}
