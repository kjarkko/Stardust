
package kjarkko.stardust.logic;

import java.awt.Color;
import java.math.BigInteger;

public class Planet {
    private final int id;
    private final Coordinate location;
    private final Vector movement;
    private final BigInteger mass;
    
    private final Color color;
    private final String name;
    public final int radius;

    public Planet(int id, Coordinate location, Vector movement, BigInteger mass, 
            Color color, String name, int radius) {
        this.id = id;
        this.location = location;
        this.movement = movement;
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.radius = radius;
    }
    
    
}
