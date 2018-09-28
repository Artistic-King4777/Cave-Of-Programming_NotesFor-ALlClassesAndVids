package javaForCompleteBeginners;

import java.util.Scanner;

public class MikailaSaysTo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;


        System.out.println("================= WHILE LOOP AND IF STATEMENTS ==================" + " \n  \n ");

        System.out.println("\n" + "Enter a number please: ");
        int number = input.nextInt();


        // -------------------------------------------
        while (i < number) {

            // -------------------------------------------
            if ( number % 3 == 0) {
                System.out.println("ZIP " + number);

            } else if (number % 5 == 0) {
                System.out.println("CODE " + number);

            } else if ((number % 3 == 0) && (number % 3 == 0)) {
                System.out.println("ZIPCODE " + number);

            } else {
                System.out.println(number);
            }
            // -------------------------------------------


            number--;
            if(number == 0) {
                System.out.println("0" + "ALL DONE");
                break;
            }
        }

        // TRY IT WITH A TENARY OPERATOR







//        System.out.println("================= WHILE LOOP AND IF STATEMENTS ==================");
//
//        while (true) {
//            System.out.println("\n" + "Enter a number please: ");
//            int number = input.nextInt();
//
//            if ( number % 3 == 0) {
//                System.out.println("ZIP " + number);
//                number -= 1;
//            }
//            // -------------------------------------------
//            if (number % 5 == 0) {
//                System.out.println("CODE " + number);
//                number -= 1;
//            }
//            // -------------------------------------------
//            if ((number % 3 == 0) && (number % 3 == 0) ) {
//                System.out.println("ZIPCODE " + number);
//                number -= 1;
//
//            }
//
//            break;
//        }




    }
}
