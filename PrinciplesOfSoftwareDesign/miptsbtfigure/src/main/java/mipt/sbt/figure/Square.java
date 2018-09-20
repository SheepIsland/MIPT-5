package mipt.sbt.figure;

/**
 * Created by Violetta on 20.09.2018.
 */
public class Square implements Figure{

    private double x;

    public Square(double x) {
        this.x = x;
    }

    public double getSquare() {
        return x*x;
    }
}