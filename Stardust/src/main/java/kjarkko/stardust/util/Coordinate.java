package kjarkko.stardust.util;

import static java.lang.Math.*;

/**
 * A simple (double, double) coordinate.
 *
 * @author jarkko
 */
public class Coordinate {

    private double x;
    private double y;

    /**
     * New coordinate.
     *
     * @param x location
     * @param y location
     */
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Calculates the distance between the two coordinates in meters.
     *
     * @param that the other coordinate
     * @return the distance between the two in meters
     */
    public double distance(Coordinate that) {
        return sqrt(
                pow(xDistance(that), 2)
                + pow(yDistance(that), 2));
    }

    /**
     * The distance between the two coordinates (x).
     *
     * @param that the other coordinate
     * @return distance between the x coordinates
     */
    public double xDistance(Coordinate that) {
        return abs(this.x - that.x);
    }

    /**
     * The distance between the two coordinates (y).
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
     * Adds the value to the x coordinate.
     *
     * @param x the value to be added to the x coordinate
     */
    public void addX(double x) {
        this.x += x;
    }

    /**
     * Adds the value to the y coordinate.
     *
     * @param y the value to be added to the y coordinate
     */
    public void addY(double y) {
        this.y += y;
    }
}
