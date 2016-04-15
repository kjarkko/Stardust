package kjarkko.stardust.util;

import static java.lang.Math.*;

/**
 * a simple (double, double) coordinate
 *
 * @author jarkko
 */
public class Coordinate {

    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * calculates the distance between the two coordinates in metres
     *
     * @param that the other coordinate
     * @return the distance between the two in metres
     */
    public double distance(Coordinate that) {
        return sqrt(
                pow(xDistance(that), 2)
                + pow(yDistance(that), 2));
    }

    /**
     *
     * @param that the other coordinate
     * @return distance between the x coordinates
     */
    public double xDistance(Coordinate that) {
        return abs(this.x - that.x);
    }

    /**
     *
     * @param that the other coordinate
     * @return distance between the y coordinates
     */
    public double yDistance(Coordinate that) {
        return abs(this.y - that.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @param x the value to be added to the x coordinate
     */
    public void addX(double x) {
        this.x += x;
    }

    /**
     *
     * @param y the value to be added to the y coordinate
     */
    public void addY(double y) {
        this.y += y;
    }
}
