package kjarkko.stardust.util;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import kjarkko.stardust.logic.Planet;

public class FileReader {

    private static ArrayList<Planet> createdPlanets;

    /**
     * Removes all the planets from the list upheld by this class.
     */
    public static void reset() {
        createdPlanets = new ArrayList();
    }

    /**
     * Parses the file in the given location.
     *
     * @param location The location of the file to be parsed
     */
    public static void parseFile(String location) {
        Scanner scanner;
        createdPlanets = new ArrayList();
        try {
            scanner = new Scanner(new File(location));
        } catch (FileNotFoundException e) {
            System.out.println("No file found in: " + location);
            return;
        }

        scanner.forEachRemaining((s) -> parseLine(s));
        scanner.close();
    }

    /**
     * Parses the line given as the parameter. Example of a planet: p ; radius ;
     * mass ; locX , locY ; vecX , vecY ; color ; name;
     *
     * @see kjarkko.stardust.util.FileReader#createPlanet(java.lang.String)
     * @see kjarkko.stardust.util.FileReader#modifySettings(java.lang.String)
     *
     * @param line The line to be parsed
     */
    public static void parseLine(String line) {
        if (line.length() < 1) {
            return;
        }

        switch (line.charAt(0)) {
            case '#':
                return;
            case 'p':
                Planet p = createPlanet(line);
                if (p != null) {
                    createdPlanets.add(p);
                }
                break;
            case 's':
                modifySettings(line);
                break;
            default:
                System.out.println("Unknown operation in file: " + line);
        }
    }

    /**
     * Creates a new planet object from the line given as the parameter.
     *
     * @param line The line to be parsed
     * @return The planet created, null if invalid input
     */
    public static Planet createPlanet(String line) {
        int radius;
        double mass;
        Coordinate location;
        Vector movement;
        Color color;
        String name;

        String[] values = line.split(";", 7);
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].trim();
        }
        try {
            radius = Integer.parseInt(values[1]);
            mass = Double.parseDouble(values[2]);

            String[] loc = values[3].split(",");
            double x = Double.parseDouble(loc[0]);
            double y = Double.parseDouble(loc[1]);
            location = new Coordinate(x, y);

            String[] mv = values[4].split(",");
            x = Double.parseDouble(mv[0]);
            y = Double.parseDouble(mv[1]);
            movement = new Vector(x, y);

            color = Color.decode(values[5]);
            name = values[6];
        } catch (Exception e) {
            System.out.println("Error parsing line: " + line + "\nMessage: " + e.getLocalizedMessage());
            return null;
        }

        return new Planet(location, movement, mass, color, name, radius);
    }

    /**
     * Modify settings according to the string given as the parameter.
     *
     * @param line modifications
     */
    public static void modifySettings(String line) {
        throw new UnsupportedOperationException();
    }

    /**
     * The planets created by this class.
     *
     * @return The planets created by this class
     */
    public static ArrayList<Planet> getCreatedPlanets() {
        return createdPlanets;
    }

}
