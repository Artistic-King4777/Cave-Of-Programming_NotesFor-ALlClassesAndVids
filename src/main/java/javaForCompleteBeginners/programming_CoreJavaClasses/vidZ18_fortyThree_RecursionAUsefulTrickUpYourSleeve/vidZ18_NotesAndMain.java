package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ18_fortyThree_RecursionAUsefulTrickUpYourSleeve;

public class vidZ18_NotesAndMain {
    public static void main(String[] args) {

        /**
         * Recursion is more of an algorithm
         *  -- something basic all programmers should learn
         *
         *  recursion is when a sub routine calls a subroutine
         *
         *
         */
        // E.g. 4! = 4*3*2*1 (factorial 4)

        System.out.println(factorial(5));
    }

    private static int factorial(int value) {
        //System.out.println(value);
        // is much like a loop but simpler
        // like the tower of hanoi
        //    future idea: Tower of Hanoi java game??
        //  if you csn solve the last step then u can do
        //  the second or the first

        // limit how many times u make it loop or else youll get a
        //  stack overflow exception after 9-10,000

        if(value == 1) {
            return 1;
        }

        return factorial(value - 1) * value;
    }
}
