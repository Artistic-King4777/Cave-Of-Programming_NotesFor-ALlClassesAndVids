package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "For Loops"
 */

public class VidE_Five_ForLoops {
    public static void main(String[] args) {


        // Original Codr:::


        // infinite loop
//        for(;;) {
//            System.out.println("Hello");
//        }


        // int i = 0; -- executes b4 loop starts -- loop counter
        // i<5 = a condition ( as long as its true the loop will continue)
        // i++ = will be executed once after the code goes throo the whole loop (
            // same as i + 1 like the num += 1 from the while loop class
        for(int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);

            System.out.println("====================");


            // needs two arguments
            // souf needs a string/format specifier and a value to fill in the format specifier
            // format specifier is a string of special characters / special symbols
            // which will replace the values
            // begin with % and end with a letter
            // for an integer its "d" %d to replace tht with the value after the comma
            // u need \n to make new lines
            System.out.printf("The value of i is: %d \n", i);
            System.out.println("============================");
        }


        // --------------------------------------------
        // My Code:

        for(int f = 1; f < 42; f++) {
            System.out.printf("I'm a lil tea pot short and stout, \n here is my handle here is my spout." + "\n" +
                    "When I get all steamed up, hear me SHOUT! \n TIP me over and Pour. Me. Out. %d \n", f);
            System.out.println("----------------------------------------");

        }


    }
}
