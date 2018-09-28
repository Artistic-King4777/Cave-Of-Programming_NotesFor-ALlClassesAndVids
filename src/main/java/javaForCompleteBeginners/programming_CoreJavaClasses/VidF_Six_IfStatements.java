package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "If"
 */

public class VidF_Six_IfStatements {
    public static void main(String[] args) {

        boolean cond = 5 == 7;
        boolean condTwo = 5 != 9;

        int myInt = 5;

        if (4 == 4) {
            System.out.println("Yes, it's true!");
        }

        if(myInt < 10){
            System.out.println("Yes it's true");
        }else {
            System.out.println("No, it's false");
        }

        System.out.println("========================================");

        if(myInt < 10){
            System.out.println("Yes it's true");
        }else if(myInt < 20) {
            System.out.println("No, it's false");
        } else {
            System.out.println("None of the above");
        }

        System.out.println("==================================");

        int loop = 0;
        // is infinite without the break or the increment
        while (loop < 5) {
            System.out.println("Looping: " + loop);

            if(loop == 5) {
                break;
            }

            loop++;

            System.out.println("Running");
        }

        System.out.println("==========================================");

        int looper = 0;
        // is an infinite loop without the break
        while (true) {
            System.out.println("Looping: " + looper);

            if(looper == 5) {
                break;
            }

            looper++;

            System.out.println("Running");
        }

        // -------------------------------------------------

        System.out.println("=========== MY CODE BELOW: =============== \n \n");
        // MY CODE:
        // Made a story about a kid ending up in a bar and getting adopted XD

        byte biter = 0;

        while (true) {
            if (biter >= 1 & biter < 4) {
                System.out.println("WHO THE HELL LEAVES A BABY AT A BARHOUSE \n" + biter + "yrs old");
            } else if (biter < 7) {
                System.out.println("HOW DID YOU EVEN GET HERE \n" + biter + "yrs old");
            } else if (biter < 12) {
                System.out.println("what are you even still doing here, go home \n" + biter + "yrs old");
            } else if (biter < 18) {
                System.out.println(biter + " age is still To Young to drink \n");
            } else if(biter < 21) {
                System.out.println("You may be over 18 now but tht don't mean that you're there yet \n" + biter + "yrs old");
            } else if (biter > 21) {
                System.out.println(biter + " yrs old is old enough to get in, still dont think you should though \n");
            } else if (biter > 32) {
                System.out.println("You're " + biter +"yrs old. \n" + "You don't need to be carded anymore kiddo \n");
            } else if (biter > 36) {
                System.out.println("Your an odd kid, GOOD but odd xD \n" + biter + "yrs old");
            }

            if (biter == 42) {
                break;
            }

            biter++;
            System.out.println("---------------");
            System.out.println("Growing Up: \n");
        }




    }
}
