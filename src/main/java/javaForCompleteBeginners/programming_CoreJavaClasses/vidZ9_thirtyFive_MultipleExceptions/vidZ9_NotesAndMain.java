package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ9_thirtyFive_MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class vidZ9_NotesAndMain {
    public static void main(String[] args)  {

        /**
         * Make sure check Java docs API for more exceptions and sub
         * exceptions to know what kind you need in future
         */
        Test test = new Test();

        // Multiple catch blocks
        //   to catch multiple exceptions (I think looks a lil
        //   messy though
        try {
            test.run();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }

        /////////////////////////////////////////////////////////////

        // Try multi-catch (Java 7+ only)
        // can catch multiple exceptions in one catch block
        //   less messy but (TEHORY)not sure how effective beyond 2 or 3 in
        //   one catch block (more then tht maybe can cause problems
        try {
            test.run();
        } catch (IOException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////

        // Using polymorphism to catch the parent of all exceptions
        // Can catch any exception by using parent exception
        //  complication: Its way to general though ?
        //  if it was this easy I feel like there wouldn't be a need for
        //  child classes of exception and on and on
        try {
            test.run();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ////////////////////////////////////////////////////////////

        // Important to catch exceptions in the right order!
        // IOException cannot come first, because it's the parent
        // of FileNotFoundException, so would catch both exceptions
        // in this case.

        // They ask this in exams and interviews: if you have a child
        // exception AND parent exception you have to put the child first
        //   otherwise itll never reach the other block -- Because polymorphism
        //   like IO and FNFound if u put io first it'll notice fnf is a child of
        //   IO and will catch it. thus it'll never reach the bottom
        //  same in try multi catch
        //   SO BE WARY OF THE ORDER OF YOUR EXCEPTIONS
        try {
            test.input();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //////////////////////////////////////////////////////////////

    }
}
