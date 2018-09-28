package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ13_thirtyEight_TryWithResources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class vidZ13b {
    public static void main(String[] args) {
        File file = new File("test.txt");

        // passing file into new FileReader which is being made IN
        //   Buffered Reader
        //   This is much better and less insane then the last tutorials
        //   Try with Resources -- available Java 7 and up
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }
}
