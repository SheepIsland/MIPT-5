package mipt.sbt.figure;

/**
 * Created by Violetta on 20.09.2018.
 */
public class Circle implements Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getSquare() {
        return 3.14*r*r;
    }
}