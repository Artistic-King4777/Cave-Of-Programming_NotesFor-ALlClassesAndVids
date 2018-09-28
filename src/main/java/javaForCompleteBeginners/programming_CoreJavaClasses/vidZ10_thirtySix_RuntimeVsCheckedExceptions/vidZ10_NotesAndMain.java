package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ10_thirtySix_RuntimeVsCheckedExceptions;

public class vidZ10_NotesAndMain {

    public static void main(String[] args) {

        /**
         * Exam and Interview: What kind of exceptions are there
         *  in Java?
         *   Answer: 2 basic/general exceptions "Runtime Exceptions"
         *   and "Checked Exceptions or R.E and C.E
         *
         *  C.E are ones you are forced to handle
         *   the ones you arent are called unchecked or R.E
         *
         *  R.E's dont force you to handle them so dont need a tryCatch
         *    RE's are really serious basic fundamental prob
         *    with your code. If Your getting a lot then there's
         *    something wrong with your code
         */

        // Null pointer exception ....
        //  Cuz theres no actual code
        String text = null;

        System.out.println(text.length());

        // Arithmetic exception ... (divide by zero)
        int value = 7/0;

        // You can actually handle RuntimeExceptions if you want to;
        // for example, here we handle an ArrayIndexOutOfBoundsException
        //   there is no index 3 just 0, 1 & 2
        String[] texts = { "one", "two", "three" };

        // dont have to do this though
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

}
