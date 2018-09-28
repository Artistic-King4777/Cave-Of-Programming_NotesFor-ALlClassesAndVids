package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ8_thirtyFour_HandlingExceptions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class vidZ8b {
    public static void main(String[] args) {

        /**
         * this time we doing the try/catch block
         *
         * try { this } if error then CATCH { e.printStackTrace();}
         *
         * no code after try catch will work if an error is throwm
         */

        File file = new File("test.txt");

        try {
            FileReader fr = new FileReader(file);

            // This will not be executed if an exception is thrown.
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }
}
