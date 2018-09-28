package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ7_thirtyThree_ReadingFilesUsingScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class vidZ7_NotesAndMain {
    public static void main(String[] args) throws FileNotFoundException {


        // My file shall be:
        // coding_file_for_vidz7_readingfiles_usinscanner

        // need to change backslash to forward slash to read it correctly
        //String fileName = "C:/Users/John/Desktop/example.txt";

        // TODO -  MY FILE FOR EXAMPLE IS RIGHT HERE
        String fileName = "C:/Users/Student/Desktop/readusescannerexample.txt";
        //   tried a few diff files but i cant get it to find
        //     my file (changed name a few times and even
        //     reade my file)
        //     Did not actually put file directly in intelliJ cause
        //     worried it will bungle up all the classes and packages

        File textFile = new File(fileName);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();

        int count = 2;
        while(in.hasNextLine()) {
            String line = in.nextLine();

            System.out.println(count + ": " + line);
            count++;
        }

        in.close();
    }
}
