package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Classes and Objects"
 */


class Person{
    // Classes can contain

    /**
     * // Classes can contain
     *----------------------------------
     * // 1. Data (represents state of the object)
     *       examples: [Name, address, age, location, mood, heartrate]
     * // 2. Subroutines ((methods))
      */

    String name;
    int age;
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

public class VidM_Thirteen_ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        // ==============================================================
        // ==============================================================
        // =========================== MY CODE: =========================
        // ==============================================================
        // ==============================================================

        Person p3 = new Person();
        p3.name = "Wade Wilson";
        p3.age = 30;
        p3.address = "Stark Tower - Pete's Floor";
        p3.birthday = "2/14/19__";
        p3.mood = "I'm always happy with you pete";
        p3.heartrate = 120;

        Person p4 = new Person();
        p4.name = "Peter Parker";
        p4.age = 16;
        p4.address = "Stark Tower - MY OWN FLOOR!! OMG";
        p4.birthday = "12/25/199_ -- wade: I ALWAYS KNEW YOU WERE A GIFT!";
        p4.mood = "so embarrassed and blushing";
        p4.heartrate = 160;

        System.out.println(p3 + "\n" + p4);



    } // end of psvm
} // end of main class
