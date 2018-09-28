package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ12_thirtySeven_ReadingFilesWithFileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class vidZ11_NotesAndMain {
    public static void main(String[] args) {
        // Year is 2013 during this video class by caveOfProgramming
        // Its a very clunky and odd and nested and crazy

        //I JOJO - made a file named text.txt
        // didnt realize I could do this (Will try this in the
        //  other file reader later)
        //   Nevermind still cant get it o find the file
        //   Perhaps theres to many classes or I made in the wrong place
        File file = new File("text.txt");

        // Needs to be up here so its a global variable so that it
        //  can be used by multiple places
        BufferedReader br = null;

        try {
            // technically bad to use to letters but just for
            //  example so okay
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            // ref points to each line in the file
            String line;
            while( (line = br.readLine()) != null ) {
                // You should use StringBuilder as a better practice
                //  especially if you are reading large files so as
                //  to not waste and take up a ton of memory
                System.out.println(line);
            } // TODO end of while loop

        } catch (FileNotFoundException e) {
            // when it throws an exception it will say what file wasnt found
            //  that is good practice cuz you want to know what file wasnt
            //   found
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            // found but could not read it
            System.out.println("Unable to read file: " + file.toString());
        } // TODO IOException
        finally {
            try {
                // we need to close the bufferedReader and fileReader
                //  or else could have problems later with unclosed Files
                //  trying to close something tht is null throws a nullPointer
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            }
            catch(NullPointerException ex) {
                // File was probably never opened!
            }
        }



    }
}
