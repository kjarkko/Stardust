package kjarkko.stardust.logic;

import static java.lang.Math.*;

public class Vector {

    private double x;
    private double y;

    public Vector(double vx, double vy) {
        this.x = vx;
        this.y = vy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void addVector(Vector v) {
        x += v.x;
        y += v.y;
    }

    public Vector createNegative() {
        return new Vector(-x, -y);
    }

    public void reset() {
        x = 0;
        y = 0;
    }

    public double value() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }
}
