package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Method Parameters"
 */


import java.util.Scanner;

class Robot {

//    public void speak(String text) {
//
//        System.out.println(text);
//    }
//
//    public void jump(int height) {
//        System.out.println("Jumping: " + height);
//    }
//
//    public void move(String direction, double distance) {
//        System.out.println("Moving " + distance + "meters in direction " + direction);
//    }

    ///////////////////////////////////////////////////////

}

class AI{
    // MY CODE:

    String name;
    int age;
    String operatingSystem;

    public void coffeeON(boolean question) {
        System.out.println("Would you like some coffee sir?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if(input.equals("yes")) {
            System.out.println("Coffee is already on sir. It shall be ready shortly.");
        } else if ( input.equals("no")){
            System.out.println("Sorry sir I will be turning it on now.");
        } else {
            System.out.println("I do not understand your input sir");
        }

    }


    public void introduction() {
        System.out.println("Hello my name is J.A.R.V.I.S. and I am Just A Rather Very Intelligent System. It is a pleasure to meet you");
    }

}





public class VidP_Sixteen_MethodParameters {
    public static void main(String[] args) {

//        Robot sam = new Robot();
//        sam.speak("Hi I'm Sam.");
//        sam.jump(7);
//        sam.move("West", 12.2);
//
//        String greeting ="Hello there.";
//        sam.speak(greeting);

        // //////////////////////////////////////////////////////////

        System.out.println("============== MY CODE =====================");

        AI jarvis= new AI();

        jarvis.name = "Jarvis";
        jarvis.age = 11;
        jarvis.operatingSystem = "Stark Ions";
        jarvis.introduction();
        jarvis.coffeeON(true);



    }
}
