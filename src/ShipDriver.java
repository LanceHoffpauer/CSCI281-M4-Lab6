/*
 * Driver class that test Ships using an array list of ships
 * Jayden LaCombe and Lance Hoffpauer
 * 4/13/2022
 */

import java.util.*;
import java.io.*;
import javax.swing.*;

public class ShipDriver {

    public static void main(String[] args) {

        ArrayList<Ship> myShip = new ArrayList<Ship>();

        // Step 1: Form a connection to the file

        String fileName = "justShips.csv";
        File inFile = new File(fileName);

        // Step 2: Test the connection to the file

        if (!inFile.exists()) {

            String errorMessage = "!!!!!!!!!!!!!!!!!!!!\n" +
                    "The file " + fileName + "\n" +
                    "does not exist!!\n" +
                    "Check your spelling or locate the file\n" +
                    "and try again." +
                    "!!!!!!!!!!!!!!!!!!!!";

            JOptionPane.showMessageDialog(null, errorMessage, "File Missing!", 2);
            System.exit(0);

        } {

            String message = "The file: \"" + fileName + "\" has been located\n";

            JOptionPane.showMessageDialog(null, message, "File Missing", 1);

        }

        // Step 3: Instantiate Reading Object

        try {

            Scanner inScan = new Scanner(inFile).useDelimiter("[\n,]");

            // Step 4: Read the data

            while (inScan.hasNext()) {

                String tempName = inScan.next();
                int tempYear = inScan.nextInt();
                String tempFlag = inScan.next();

                myShip.add(new Ship(tempName, tempYear, tempFlag));

            }

            // Step 5: Close the connection and stop reading object

            inScan.close();

        }
        catch(IOException ioe) {

            String errorMessage = "!!!!!!!!!!!!!!!!!!!!\n" +
                    "Trouble opening file " + fileName +
                    "!!!!!!!!!!!!!!!!!!!!";

            JOptionPane.showMessageDialog(null, errorMessage, "File Missing!", 2);
            System.exit(0);

        }

        String message = "there are " + myShip.size() + " ships in my list";
        JOptionPane.showMessageDialog(null, message, "File Missing!", 1);

        // Create a for loop to iterate through the list of ships
        //  to create a string accumulator of the books using the
        //  toString method from each ship

    }

}
