package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "While Loops"
 */

public class VidD_Four_WhileLoops {
    public static void main(String[] args) {

        // Orig Code
        boolean loop = 4 < 5;
        boolean loopTwo = 6 < 1;

        int value = 0;
        boolean loopThree = value <20;
        System.out.println(loop);


        // infinite loop without value = value + 1;
        while (value < 10){
            System.out.println("Hello" + value);

            // add 1 to value and store it back in the
            // original variable
            value = value + 1;
        }


        // --------------------------------
        System.out.println("===============================================");
        // My Code


        boolean looper = 4 < 5;

        int num = 1;
        boolean loops = num < 30;

        System.out.println(loops + "/" + looper);



        while (num <= 42){
            System.out.println("Ohayo-gozaimasu " + num);

            num += 1;

            if(num == 42) {
                System.out.println("COWABUNGA DUDES " + num);
            }
        }



    }
}
