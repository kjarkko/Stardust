package kjarkko.stardust.logic;

import java.awt.Color;
import static java.lang.Math.*;

public class Planet {

    public final double g = 6.67259E-11;
    private static int idCounter = 0;

    private static int createId() {
        return idCounter++;
    }

    public static void resetId() {
        idCounter = 0;
    }

    /*--------------------------------------------*/
    public final int id;
    public final double radius;
    public final double mass;
    private final Coordinate location;
    private final Vector velocity;
    private final Vector tempForce;
    private final Color color;
    private final String name;

    public Planet(Coordinate location, Vector movement, double mass,
            Color color, String name, double radius) {
        this.id = createId();
        this.location = location;
        this.velocity = movement;
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.radius = radius;
        this.tempForce = new Vector(0, 0);
    }

    public void updateLocation(int elapsedTime) {
        location.setX(location.getX() + velocity.getX() * elapsedTime);
        location.setY(location.getY() + velocity.getY() * elapsedTime);
    }

    /**
     * Updates the velocity of the planet based on the tempForce variable and
     * time elapsed. Resets tempForce.
     *
     * @param elapsedTime time elapsed in the simulation between the last call
     * in seconds
     * @return delta velocity, current velocity is completely ignored
     */
    public Vector deltaVelocity(int elapsedTime) {
        Vector delta = new Vector(
                (tempForce.getX() * elapsedTime) / mass,
                (tempForce.getY() * elapsedTime) / mass
        );
        tempForce.reset();
        return delta;
    }

    /**
     * Calculates the tempForce between itself and the planet given as the
     * parameter, adds the result to the tempForce variable
     *
     * @param p See above
     */
    public void gravitationalForce(Planet p) {
        double force = g * ((mass * p.mass) / pow(location.distance(p.location), 2));
        // values [0, 1]
        double x = 0.64;

        double forceX = force * x;
        double forceY = force * (1 - x);
        Vector f = new Vector(forceX, forceY);
        this.tempForce.addVector(f);
        p.tempForce.addVector(f.createNegative());

        throw new UnsupportedOperationException();
    }

    public Color getColor() {
        return color;
    }

    public Coordinate getLocation() {
        return location;
    }

    public Vector getMovement() {
        return velocity;
    }

    public String getName() {
        return name;
    }
}
