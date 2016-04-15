package kjarkko.stardust.logic;

import static java.lang.Math.*;

public class Coordinate {

    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Coordinate that) {
        return sqrt(
                pow(xDistance(that), 2)
                + pow(yDistance(that), 2));
    }

    public double xDistance(Coordinate that) {
        return abs(this.x - that.x);
    }

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

    public void addX(double x) {
        this.x += x;
    }

    public void addY(double y) {
        this.y += y;
    }
}
