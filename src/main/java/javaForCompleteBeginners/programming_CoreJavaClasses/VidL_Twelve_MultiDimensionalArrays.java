package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Multi-Dimensional Arrays"
 */

public class VidL_Twelve_MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] values = {3, 5, 2343};
        // this is a 1 dimensional array bcuz u only need to use one
        //  reference point
        System.out.println(values[2]);

        // multi dimensional arrays use multiple reference points
        // we will look at 2 dimensional arrays
        // quote from cave of programming: "You can easily extrapolate it to
        //    3 or 4 dimensional arrays, ..if your completely crazy


        /*
        // they dont have to have equal amount of numbers in each row
        int[][] grid ={
                {3, 5, 2343},
                {2, 4},
                {1, 2, 3, 4}
        };

        // u always reference the row number then the column number
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        //2 dimensional array of references to strings
        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";
        System.out.println(texts[0][1]);

        System.out.println("====ITERATING THROO 2 dimensional ARRAYS=====");

        //first you iterate throo the rows then iterate throo the columns
        //  so a nested for loop
        // "\t" adds a tab!!

        // TODO - makes the 2 dimensional array print out pretty
        // iterating throo rows:
        for(int row = 0; row < grid.length; row++) {
            // iterating throo columns (col)
            for ( int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            // add a new line after each row
            System.out.println();
        } // end of multi array 1

        */


//        // so you set the number of rows but not the number of columns
//        String[][] words = new String[2][];
//
//        // google more about this bit
//        System.out.println(words[0]);
//
//        words[0] = new String[3];
//        words[0][1] = "hi there";
//        System.out.println(words[0][1]);


        System.out.println("============= MY CODE ======================");

        String[][] death ={
                {"Hades", "Cerberus", "Underworld"},
                {"Shinigami", "Spiritual Plane"},
                {"Death", "Life", "Webcomic", "on Tapas"},
        };

        String[][] spirits = {
                {"Guardians of Childhood:", "The Guardians led by MiM"},
                {"Guardians:", "Fun/Joy", "Dreams", "Wonder", "Memories", "Hope"},
                {"Guardians:", "Jack Frost", "Sandy", "North", "Tooth", "Bunny"},
                {"Spirit of Fear:", "Pitch Black:", "Fearlings", "Shadow King", "Nightmares"},
                {"Best Ship:", "Pitch x Jack:", "BlackIce", "HoarFrost", "AdrenalineRush"}
        };

        System.out.println("========== Guardians of Childhood characters ==================");

        System.out.println();

        for(int row = 0; row < spirits.length; row++) {

            for ( int col = 0; col < spirits[row].length; col++){
                System.out.print(spirits[row][col] + "\t");
            }

            System.out.println();
        }

        System.out.println("============ deadly spirits =============");

        for(int row = 0; row < death.length; row++) {

            for ( int col = 0; col < death[row].length; col++){
                System.out.print(death[row][col] + "\t");
            }

            System.out.println();
        }


    }
}
