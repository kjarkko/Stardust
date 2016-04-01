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

    private Planets() {
        planets = new ArrayList();
    }

    public void add(Planet p) {
        if (p != null) {
            planets.add(p);
        }
    }

    public void addAll(Collection<Planet> c) {
        c.removeIf(p -> p == null);
        planets.addAll(c);
    }

    public void remove(int id) {
        planets.removeIf((p) -> p.id == id);
    }

    public void calculateForces() {
        for (int i = 0; i < planets.size(); i++) {
            for (int j = i + 1; j < planets.size(); j++) {
                planets.get(i).gravitationalForce(planets.get(j));
            }
        }
    }

    public void updateLocations(int elapsedTime) {
        planets.forEach(p -> p.updateLocation(elapsedTime));
    }

    public int getSize() {
        return planets.size();
    }
}
