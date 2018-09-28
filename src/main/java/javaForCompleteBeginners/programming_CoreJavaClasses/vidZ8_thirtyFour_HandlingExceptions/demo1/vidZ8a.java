package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ8_thirtyFour_HandlingExceptions.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class vidZ8a {
    // made the psvm add a throws so that it wont bark and will run now
    // read a stack trace (the red text) from top to bottom

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("test.txt");

        FileReader fr = new FileReader(file);
    }
}
