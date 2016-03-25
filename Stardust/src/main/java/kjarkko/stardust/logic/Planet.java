package kjarkko.stardust.logic;

import java.awt.Color;

public class Planet {

    public final int id;
    public final double radius;
    public final double mass;
    private final Coordinate location;
    private final Vector movement;
    private final Color color;
    private final String name;

    public Planet(Coordinate location, Vector movement, double mass,
            Color color, String name, double radius) {
        this.id = Planets.get().getPlanetIdCounter();
        this.location = location;
        this.movement = movement;
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.radius = radius;
    }

    public void updateLocation(int elapsedTime) {
        location.setX(location.getX() + movement.getVx() * elapsedTime);
        location.setY(location.getY() + movement.getVy() * elapsedTime);
    }

    public Color getColor() {
        return color;
    }

    public Coordinate getLocation() {
        return location;
    }

    public double getMass() {
        return mass;
    }

    public Vector getMovement() {
        return movement;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
