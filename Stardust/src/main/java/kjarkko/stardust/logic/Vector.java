package kjarkko.stardust.logic;

public class Vector {

    private double vx;
    private double vy;

    public Vector(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public double getVx() {
        return vx;
    }

    public double getVy() {
        return vy;
    }

    public void addVector(Vector v) {
        vx += v.vx;
        vy += v.vy;
    }

    public Vector createNegative() {
        return new Vector(-vx, -vy);
    }
}
