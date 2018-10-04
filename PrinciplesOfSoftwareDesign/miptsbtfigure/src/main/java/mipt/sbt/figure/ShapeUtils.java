package mipt.sbt.figure;

/**
 * Created by Violetta on 28.09.2018.
 */
public class ShapeUtils {

    public static Figure max (Figure figure1, Figure figure2) {
        if (figure1.getSquare() >= figure2.getSquare()) {
            return figure1;
        }
        return figure2;
    }
}
