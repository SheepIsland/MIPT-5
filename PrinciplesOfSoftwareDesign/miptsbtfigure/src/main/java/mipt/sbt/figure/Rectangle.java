package mipt.sbt.figure;

/**
 * Created by Violetta on 20.09.2018.
 */
public class Rectangle implements Figure{

    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getSquare() {
        return x*y;
    }
}
