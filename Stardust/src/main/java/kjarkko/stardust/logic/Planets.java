package kjarkko.stardust.logic;

import java.util.ArrayList;
import java.util.Collection;

public class Planets {

    private static Planets instance;

    public static Planets get() {
        if (instance == null) {
            instance = new Planets();
        }
        return instance;
    }

    public static void clear() {
        instance = null;
    }

    /*--------------------------------------------*/
    private final ArrayList<Planet> planets;
    private int planetIdCounter;

    protected Planets() {
        planets = new ArrayList();
        planetIdCounter = 0;
    }

    public void add(Planet p) {
        if (p != null) {
            planets.add(p);
            planetIdCounter++;
        }
    }

    public void addAll(Collection<Planet> c) {
        c.forEach((p) -> add(p));
    }

    public boolean remove(int id) {
        return planets.removeIf((p) -> p.id == id);
    }

    public int getPlanetIdCounter() {
        return planetIdCounter;
    }

    private void calculateForce(Planet p1, Planet p2) {
        // add force to vectors of both planets
        throw new UnsupportedOperationException("not implemented yet.");
    }

    public void updateLocations(int elapsedTime) {
        for (int i = 0; i < planets.size(); i++) {
            for (int j = i + 1; j < planets.size(); j++) {
                calculateForce(planets.get(i), planets.get(j));
            }
        }

        planets.forEach((p) -> p.updateLocation(elapsedTime));
    }

    public int getSize() {
        return planets.size();
    }
}
