package javaForCompleteBeginners.programming_CoreJavaClasses;


import java.util.Scanner;

/**
 * Title:
 *
 * "Switch"
 */

public class VidI_Nine_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter a command: ");
//        String text = input.nextLine();


        // have to switch to level 7 diamond arms java cuz its not
        // reading that i have java 1.8 which since java 1.7 and .8 switch statements
        // can take a string statement
//        switch(text) {
//            case "start":
//                System.out.println("Machines started!");
//                break;
//
//            case "stop":
//                System.out.println("Machines stopped.");
//                break;
//
//            default:
//                System.out.println("Command not recognized");
//        }


       // --------------------------------------
        // testing to change clunky if statement in android app
        System.out.println("============== MY CODE ==================");
        System.out.println("Please enter what you wish to translate into morse");
        String english = input.nextLine();


        // doesnt put multiple characters together (if i say abc it says the default)
        // interesting
        switch(english){
            case "a":
                System.out.println(".-");
                break;
            case "b":
                System.out.println("-...");
                break;
            case "c":
                System.out.println("-.-.");
                break;
            default:
                System.out.println("Input not available");
        }


    }// end of psvm

}
