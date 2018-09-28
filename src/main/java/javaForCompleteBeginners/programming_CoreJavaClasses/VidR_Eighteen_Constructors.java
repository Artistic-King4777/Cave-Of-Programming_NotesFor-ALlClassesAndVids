package javaForCompleteBeginners.programming_CoreJavaClasses;

/**
 * Title:
 *
 * "Constructors"
 */

class Machine {

    // variables
    private String name;
    private int code;


    // Constructors
    public Machine() {
        this("Arnie", 0);

        // this prints when you make a new Machines object
        // good to check if its running in psvm
        System.out.println("Constructor running!");
    }


    // constructor that excepts a string parameter
    public Machine(String name) {
        this(name, 0);

        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }

    public Machine(String name, int code) {

        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
    }
} // end of class


class Computer {

    // INSTANCE VARIABLES
    private String name;
    private String brand;
    private String operatingSystem;
    private int ghZ;
    private String description;


    // CONSTRUCTORS

    public Computer() {
        // Calling Constructor two
        this("Bunny", "SpringAster OS", 250);
        System.out.println("Computer On!");

    }


    public Computer(String name, String operatingSystem, int ghZ) {
        //this();
        this.name = name;
        System.out.println("Second Computer is running");


    }



    public Computer(String name, String brand, String operatingSystem, int ghZ, String description) {
        System.out.println("Third Computer is on");
        this.name = name;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.ghZ = ghZ;
        this.description = description;
    }








    // GETTERS AND SETTERS

}

public class VidR_Eighteen_Constructors {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Chalky", 7);

        Computer computer1 = new Computer();
        Computer computer2 = new Computer("JackFrost", "Dark Winter OS", 300);
        Computer computer3 = new Computer("PitchBlack", "Fearlings Inc", "Dark Winter OS",
                200, "This computer will last you forever and never stop running! Powered by how dark it is its energy could never run out");

    }
}
