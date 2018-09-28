package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ14_thirtyNine_CreatingAndWritingTextFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class vidZ14_NotesAndMain {
    public static void main(String[] args) {
        // Should be appearing in main java folder but i dont see it
        // It did appear in the IDE down below the orange target folder
        //  it made the file test.txt (that is THIS file)
        File file = new File("test.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            br.write("This is line one");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }


    }
}
