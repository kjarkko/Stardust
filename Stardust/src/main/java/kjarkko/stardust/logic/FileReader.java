package kjarkko.stardust.logic;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    private static ArrayList<Planet> createdPlanets;

    public static void reset() {
        createdPlanets = new ArrayList();
    }

    public static void parseFile() {
        // call parseFile(String) with the default location
        throw new UnsupportedOperationException("not implemented yet.");
    }

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

    public static void parseLine(String line) {
        // Example of a planet: p;radius;mass;locX-locY;vecX-vecY;color;name;
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

    public static Planet createPlanet(String line) {
        double radius;
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
            radius = Double.parseDouble(values[1]);
            mass = Double.parseDouble(values[2]);

            String[] loc = values[3].split("-");
            double x = Double.parseDouble(loc[0]);
            double y = Double.parseDouble(loc[1]);
            location = new Coordinate(x, y);

            String[] mv = values[4].split("-");
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

    public static void modifySettings(String line) {
        throw new UnsupportedOperationException();
    }

    public static ArrayList<Planet> getCreatedPlanets() {
        return createdPlanets;
    }
}
