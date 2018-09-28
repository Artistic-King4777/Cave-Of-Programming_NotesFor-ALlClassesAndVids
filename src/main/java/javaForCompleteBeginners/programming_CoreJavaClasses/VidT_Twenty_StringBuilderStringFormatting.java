package javaForCompleteBeginners.programming_CoreJavaClasses;


/**
 * Title:
 *
 * "String Builder and String Formatting"
 */

public class VidT_Twenty_StringBuilderStringFormatting {
    public static void main(String[] args) {

        // Inefficient
        // takes up more memory and data by making new strings each time
        //   rather then just editing the string you already have
        /*
        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);
        */
/////////////////////////////////////////////////////////////
        // More efficient.
        // This jus edits the string you already input
        //   does more efficient building by saving memory and data
        /*
        StringBuilder sb = new StringBuilder("");

        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        // calling the toString() on th reference variable
        //   prints out the entire string you just made
        System.out.println(sb.toString());
        */
///////////////////////////////////////////////////////////

        /*
        // The same as above, but nicer ....
         StringBuilder s = new StringBuilder();

         // does the same so its chaining this way
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");

        System.out.println(s.toString());
        */
        /**
         * String Buffer is older then String Builder
         *    but Builder is more lightweight because its not thread safe
         */
        // TODO //////////////////////  MY STRING BUILDER CODE ////////////////////////////////////

        System.out.println("STRING BUILDER TEST ONE");
        StringBuilder j = new StringBuilder();

        j.append("HEY!! \n")
                .append("I'm an Otaku! \n")
                .append("Wahoo!!");
        System.out.println(j.toString());
        System.out.println("====================== =========================");
        // TODO //////////////////////  MY STRING BUILDER CODE ////////////////////////////////////
        ///// Formatting //////////////////////////////////

//        // Outputting newlines and tabs
//        //    \t = thats a tab     ---   \n = new line
//        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
//        System.out.println(" More text.");
//
//
//
//        // Formatting integers
//        // %-10d means: output an integer in a space ten characters wide,
//        //    padding with space and left-aligning (%10d would right-align)
//        //    There doesnt need to or shouldnt have a space between them or
//        //    else it will add a space to your formatting
//        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);
//
//        // Demo-ing integer and string formatting control sequences
//        for(int i=0; i<20; i++) {
//            System.out.printf("%-2d: %s\n", i, "here is some text");
//        }



//
//        // Formatting floating point value
//
//        // Two decimal place:
//        //   also rounds it
//        System.out.printf("Total value: %.2f\n", 5.6874);
//
//
//        // One decimal place, left-aligned in 6-character field:
//        /**
//         *     %f is the main formatter
//         *     adding a .1 in front so now %.1f tells it to give up to 1 decimal point
//         *     adding a "6" in front of the .1 adding padding with spaces
//         *     adding a - so -6 adds padding to the other side
//         */
//        System.out.printf("Total value: %-6.1f\n", 343.23423);
//
//        // You can also use the String.format() method if you want to retrieve
//        // a formatted string.
//        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
//        System.out.println(formatted);
//
//        // Use double %% for outputting a % sign.
//        System.out.printf("Giving it %d%% is physically impossible.", 100);




        // TODO //////////////////////  MY STRING BUILDER AND FORMATTING CODE ////////////////////////////////////
        System.out.println("++++++++++++++++ STRING BUILDER TEST TWO ++++++++++++++++++++++++++++");

        StringBuilder k = new StringBuilder();

        k.append("HEY!! \n")
                .append("I'm an Otaku! \n")
                .append("Wahoo!! Level: ");
        //System.out.println(k.toString());


        System.out.printf(" \t %s %-10.2f", k.toString(), 9999.9999);
        System.out.println("\n++++++++++++++++ ++++++++++++++++++++++++++++");
        // TODO //////////////////////  MY STRING BUILDER AND FORMATTING CODE ////////////////////////////////////










    } // end of psvm
}
