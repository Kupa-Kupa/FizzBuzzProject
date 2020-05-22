import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// https://www.youtube.com/watch?v=3_40oiUdLG8 - video on reading a CSV File in java

public class FizzBuzzDataSet {
    public static void main(String[] args) {

        String fileName = "C:/Projects/FizzBuzz/data.csv";   // was previously String fileName = "data.csv"; which looked for the file in C:/Projects and returned a java.io.FileNotFoundException: data.csv (The system cannot find the file specified)
        
        File file = new File(fileName);
        //System.out.println(file.getAbsolutePath());   // shows absolute path of file - for some reason the data.csv file path didn't change when moved to a lower directory
        HashMap<Integer, String> fizzbuzz = new HashMap<Integer, String>();

        try {
            Scanner inputStream = new Scanner(file);
            inputStream.next(); // ignores the first line which is the titles (not doing this created a problem of trying to parse a String to an int and throws java.lang.NumberFormatException)
            while (inputStream.hasNext()) {
                String data = inputStream.next(); // gets a whole line
                String[] dataValues = data.split(",");
                fizzbuzz.put(Integer.parseInt(dataValues[0]), dataValues[1]); // data file provides us with String values. I want my keys to be int values so have to convert
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= 300; i++) {
            String output = "";
            for (int numkey : fizzbuzz.keySet()) {
                    if (i % numkey == 0) {
                        output += fizzbuzz.get(numkey); // .get retrieves a value from the map by its key. So for each key in the fizzbuzz keyset it looks for the corresponding value
                    }
                }
            if (output == "") {
                output += i;
            }
            System.out.println(output);
        }
    }
}