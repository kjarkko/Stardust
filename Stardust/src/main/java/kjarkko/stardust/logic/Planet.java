package kjarkko.stardust.logic;

import kjarkko.stardust.util.Vector;
import kjarkko.stardust.util.Coordinate;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Math.*;

/**
 * A single planet with a location, velocity and such
 *
 * @author jarkko
 */
public class Planet {

    private static int idCounter = 0;

    /**
     * Generates a unique id for each planet
     *
     * @return A unique id
     */
    private static int createId() {
        return idCounter++;
    }

    /**
     * Resets the id counter to 0
     */
    public static void resetId() {
        idCounter = 0;
    }

    /*--------------------------------------------*/
    public final int id;
    public final int radius;
    public final double mass;
    private final Coordinate location;
    private final Vector velocity;

    /**
     * Used to calculate the delta velocity of the planet between each tick, set
     * to zero between each tick
     */
    private final Vector tempForce;

    private final Color color;
    private final String name;

    public Planet(Coordinate location, Vector movement, double mass,
            Color color, String name, int radius) {
        this.id = createId();
        this.location = location;
        this.velocity = movement;
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.radius = radius;
        this.tempForce = new Vector(0, 0);
    }

    /**
     * Uses the tempForce variable to update the velocity and then updates the
     * location based on the current velocity of the planet and the elapsed time
     * since the last tick
     *
     * @param elapsedTime The time elapsed in seconds since the last tick in the
     * simulation
     */
    public void updateLocation(int elapsedTime) {
        velocity.addVector(deltaVelocity(elapsedTime));
        location.addX(velocity.getX() * elapsedTime);
        location.addY(velocity.getY() * elapsedTime);
    }

    /**
     * Updates the velocity of the planet based on the tempForce variable and
     * time elapsed. Resets tempForce.
     *
     * @param elapsedTime time elapsed in the simulation between the last call
     * in seconds in the simulation
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
     * Calculates the force between itself and the planet given as the
     * parameter, adds the result to the tempForce variable
     *
     * @param p See above
     * @return
     */
    public Vector gravitationalForce(Planet p) {
        double force = 6.67259E-11
                * ((mass * p.mass) / pow(location.distance(p.location), 2));
        
        double alpha = Math.atan(location.yDistance(p.location) / location.xDistance(p.location));

        double forceX = force * cos(alpha);
        double forceY = force * sin(alpha);

        return new Vector(forceX, forceY);
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        
        int x = 350 - (radius >> 1) + (int)(location.getX()/Settings.getDistancePerPixel());
        int y = 350 - (radius >> 1) + (int)(location.getY()/Settings.getDistancePerPixel());
        
        g.fillOval(x, y, radius, radius);
    }

    public Color getColor() {
        return color;
    }

    public Coordinate getLocation() {
        return location;
    }

    /**
     *
     * @return The current velocity of the planet in m/s as a vector
     */
    public Vector getVelocity() {
        return velocity;
    }

    public String getName() {
        return name;
    }

    /**
     * @see kjarkko.stardust.logic.Planet#tempForce
     * @return The tempForce vector
     */
    public Vector getTempForce() {
        return tempForce;
    }
}
