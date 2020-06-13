package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    /**
     * Prints the data which is returned by toString method
     */
    public static void print(Building[] buildings, String header, OutputInterface out){
        // prints the header provided by user
        out.println(header);
        // prints a group of 10 dashes('-')
        out.println("----------");
        // prints all the buildings in the array
        for (int i = 0; i < buildings.length; i++) {
            out.println(buildings[i].toString());
        }
    }
    /**
     *  Calculate & returns the area of all buildings
     */
    public static int calcArea(Building[] buildings){
        int totalArea = 0;
        for (int i = 0; i<buildings.length; i++) {
            totalArea += buildings[i].calcLotArea();
        }
        return totalArea;
    }
}
