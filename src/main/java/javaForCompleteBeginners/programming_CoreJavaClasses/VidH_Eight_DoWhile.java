package javaForCompleteBeginners.programming_CoreJavaClasses;

import java.util.Scanner;

/**
 * Title:
 *
 * "Do ... While"
 */

public class VidH_Eight_DoWhile {
    public static void main(String[] args) {
        // do while loops // variable scopes and multi line comments

        Scanner scanner = new Scanner(System.in);

        /*
        System.outprintln("Enter a number: ");
        int value = scanner.nextInt();

        while (value != 5) {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
         */
//
//        int value = 0;
//        do{
//            System.out.println("Enter a number: ");
//            value = scanner.nextInt();
//        } while (value != 5);
//
//        System.out.println("Got 5!");

        System.out.println("+++++++++++++++ MY CODE ++++++++++++++++++");


        int num = 1;
        do{
            System.out.println("Please make a guess between 1-7");
            num = scanner.nextInt();
        } while (num != 4);
        System.out.println("Got 4!");

    }
}
