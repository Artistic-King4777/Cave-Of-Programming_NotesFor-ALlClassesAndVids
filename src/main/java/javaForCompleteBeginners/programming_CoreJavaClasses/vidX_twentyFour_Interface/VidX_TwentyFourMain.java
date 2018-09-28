package javaForCompleteBeginners.programming_CoreJavaClasses.vidX_twentyFour_Interface;

public class VidX_TwentyFourMain {

    /**
     * INTERFACES :
     // DOnt have actual code or curly brackets
     * Can implement multiple interfaces but only can
     *   extend one class
     *
     * RECHECK ABT SAYING Info info = new Info();
     * NOT SURE WHY
     *
     * Automatically have only public methods
     */

    public static void main(String[] args) {

        Machines mach1 = new Machines();
        mach1.start();

        Personz person1 = new Personz("Bob");
        person1.greet();

        Info info1 = new Machines();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outputInfo(mach1);
        outputInfo(person1);


        // TODO ---------- MY CODE -----------------
        System.out.println("// TODO ---------- MY CODE -----------------");
        System.out.println("// TODO ---------- MY CODE -----------------");

        // I made the IAnimal Interface and dog class for reference and show

        Dog cerberus = new Dog();
        System.out.print("Cerberus: ");
        cerberus.eat();

        System.out.print("Cerberus: ");
        cerberus.bathe();

        System.out.print("Cerberus: Sleeps ");
        cerberus.sleep();


    } // end of psvm




    private static void outputInfo(Info info) {
        info.showInfo();
    }


} // end of class





