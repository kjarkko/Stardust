package kjarkko.stardust.util;

import static java.lang.Math.*;

/**
 * A simple (double, double) vector.
 *
 * @author jarkko
 */
public class Vector {

    private double x;
    private double y;

    /**
     * New vector.
     *
     * @param vx Value.
     * @param vy Value.
     */
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

    /**
     * Sums the components of the parameter to this vector.
     *
     * @param v the vector to be added
     */
    public void addVector(Vector v) {
        x += v.x;
        y += v.y;
    }

    /**
     * Returns the copy of this vector with the values negated.
     *
     * @return copy of this vector with the values negated
     */
    public Vector createNegative() {
        return new Vector(-x, -y);
    }

    /**
     * sets the x and y components to zero.
     */
    public void reset() {
        x = 0;
        y = 0;
    }

    /**
     * Returns the length of this vector.
     *
     * @return the length of this vector
     */
    public double value() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }
}
