package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ8_thirtyFour_HandlingExceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class vidZc {
    public static void main(String[] args) {

        // horrifying as it throws in 2 or 3 diff places up
        // the chain till main has to deal with it
        //  dont put stacktraces where others of public can use
        //   find it scary>??

        try {
            openFile();
        } catch (FileNotFoundException e) {
            // PS. This message is too vague : )
            System.out.println("Could not open file");
        }
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);

    }
}
