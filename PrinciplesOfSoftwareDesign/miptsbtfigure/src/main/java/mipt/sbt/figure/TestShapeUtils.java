package mipt.sbt.figure;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Violetta on 28.09.2018.
 */
public class TestShapeUtils {

    @Test
    public void testMaxReturnsMaxFigureWhenItLeftArgument() {
        Circle small = new Circle(5);
        Circle large = new Circle(10);
        assertEquals(large, ShapeUtils.max(small, large));
    }

    @Test
    public void testMaxReturnsMaxFigure() {
        Circle small = new Circle(5);
        Circle large = new Circle(10);
        assertEquals(large, ShapeUtils.max(large, small));
    }
}
