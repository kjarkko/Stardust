package kjarkko.stardust.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kjarkko.stardust.util.Vector;

/**
 * An object designed to hold instances of planets and some functionality
 * related to them.
 *
 * @author jarkko
 */
public class Planets {

    /**
     * The only instance of this object to exist.
     */
    private static Planets instance;

    /**
     * The only instance of this object to exist, creates one if does not exist.
     *
     * @return Instance.
     */
    public static Planets get() {
        if (instance == null) {
            instance = new Planets();
        }
        return instance;
    }

    /**
     * Sets the instance of this object to null.
     *
     * @see kjarkko.stardust.logic.Planets#instance
     */
    public static void clear() {
        instance = null;
    }

    /*--------------------------------------------*/
    private final ArrayList<Planet> planets;

    private Planets() {
        planets = new ArrayList();
    }

    /**
     * Adds the planet to the collection of planets held inside of this object,
     * given that it is not null.
     *
     * @param p The planet to be added
     */
    public void add(Planet p) {
        if (p != null) {
            planets.add(p);
        }
    }

    /**
     * Adds every planet that is not null to the collection of planets held
     * inside of this object.
     *
     * @param c the collection of planets to be added
     */
    public void addAll(Collection<Planet> c) {
        c.removeIf(p -> p == null);
        planets.addAll(c);
    }

    /**
     * Removes the planet with the given id from this collection if it exists.
     *
     * @param id the id of the planet to be removed
     */
    public void remove(int id) {
        planets.removeIf((p) -> p.id == id);
    }

    /**
     * Calculates the force between all of the planets and updates their
     * location.
     *
     * @see kjarkko.stardust.logic.Planets#calculateForces()
     * @see kjarkko.stardust.logic.Planets#updateLocations(int)
     */
    public void update() {
        calculateForces();
        updateLocations(Settings.getElapsedTime());
    }

    /**
     * Calculates the force between each planet and adds it to their tempForce
     * variable.
     *
     * @see kjarkko.stardust.logic.Planet#tempForce
     */
    public void calculateForces() {
        for (int i = 0; i < planets.size(); i++) {
            for (int j = i + 1; j < planets.size(); j++) {
                Vector f = planets.get(i).gravitationalForce(planets.get(j));
                planets.get(i).getTempForce().addVector(f);
                planets.get(j).getTempForce().addVector(f.createNegative());
            }
        }
    }

    /**
     * Updates the location of every planet based on the time elapsed.
     *
     * @param elapsedTime the time elapsed in the simulation since the last tick
     */
    public void updateLocations(double elapsedTime) {
        planets.forEach(p -> p.updateLocation(elapsedTime));
    }

    /**
     * Number of planets.
     *
     * @return the amount of planets held in this object
     */
    public int size() {
        return planets.size();
    }

    /**
     * Iterator of the planets held within this object.
     *
     * @return The iterator containing all of the planets held within this
     * object
     */
    public Iterator<Planet> getPlanetIterator() {
        return planets.iterator();
    }
}
