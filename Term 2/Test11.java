package test11keeranmoodley;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Keeran Moodley
 */
public class Test11KeeranMoodley {

    public static void main(String[] args) {
        // Open file and handle exceptions 
        Scanner reader = null;
        try {
            reader = new Scanner(new File("Movies.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found.");
            /**
             * programme halts and returns an exception code to prevent a
             * possible null pointer exception referencing reader
             */
            System.exit(-1);
        }

        //loop thorough file to gain access to lines
        while (reader.hasNextLine()) {
            String data[] = reader.nextLine().split(",");

            //ineffective use of variables 
            String movieName = data[0];
            int metaScore = Integer.parseInt(data[1]);
            String rating = data[2];
            String userScores = data[3];

            //breaking user scores into values
            String[] user = userScores.split("/");
            //calcualting average
            double average = 0;
            for (String value : user) {
                average += Integer.parseInt(value);
            }
            average /= user.length;

            //format
            String out = movieName + "\t" + rating + "\t" + metaScore + "%" + "\t" + average + "\t";

            //check which score is higher
            if (average > metaScore / 10.0) {
                out += "*Users";
            } else {
                out += "*Critics";
            }

            // display 
            System.out.println(out);
        }
    }
}
