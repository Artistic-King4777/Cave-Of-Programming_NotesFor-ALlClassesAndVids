package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Methods"
 */


class Persons{
    // Classes can contain

    /**
     * // Classes can contain
     *----------------------------------
     * // 1. Data (represents state of the object)
     *       examples: [Name, address, age, location, mood, heartrate]
     * // 2. Subroutines ((methods))
     *
     *
     */

    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
    void sayHello() {
        System.out.println("Hello there");
    }

    // ==============================================================
    // ==============================================================
    // =========================== MY CODE: =========================
    // ==============================================================
    // ==============================================================

    String address;
    String birthday;
    String mood;
    double heartrate;


}// end of person class

public class VidN_Fourteen_Methods {

    public static void main(String[] args) {

        // Create a Personz object using the Personz class
        Persons person1 = new Persons();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();

        // Create a second Personz object
        Persons person2 = new Persons();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

        // ==============================================================
        // ==============================================================
        // =========================== MY CODE: =========================
        // ==============================================================
        // ==============================================================

        Persons p3 = new Persons();
        p3.name = "Wade Wilson";
        p3.age = 30;
        p3.address = "Stark Tower - Pete's Floor";
        p3.birthday = "2/14/19__";
        p3.mood = "I'm always happy with you pete";
        p3.heartrate = 120;

        Persons p4 = new Persons();
        p4.name = "Peter Parker";
        p4.age = 16;
        p4.address = "Stark Tower - MY OWN FLOOR!! OMG";
        p4.birthday = "12/25/199_ -- wade: I ALWAYS KNEW YOU WERE A GIFT!";
        p4.mood = "so embarrassed and blushing";
        p4.heartrate = 160;

        System.out.println(p3 + "\n" + p4);


    }// end of psvm
} // end of main class
