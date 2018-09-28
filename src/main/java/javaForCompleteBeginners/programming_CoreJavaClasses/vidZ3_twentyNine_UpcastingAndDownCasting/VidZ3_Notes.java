package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ3_twentyNine_UpcastingAndDownCasting;


class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started.");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}


class Computer extends Machine {

    public void powerOff() {
        System.out.println("Shutting down");
    }
}


public class VidZ3_Notes {
    public static void main(String[] args) {

        /**
         * Upcasting and Downcasting and casting in general
         *   Its a thing you do with variables
         *     once you created an object (like Camera and
         *     Machine) those objects are always gonna be
         *     whatever they are to start with Cam = Always Cam
         *     Machine = Always Machine .. but you can change
         *     the variables that refer to them from one type
         *     to another. Like with
         *     Polymorphism: that you can always use an object
         *     of a Child Class type, where you would expect an
         *     object of a parent class type
         */

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // UPCASTING
        // Safe and guaranteed by Polymorphism
        //  wont need to cast in brackets like in the
        //  runtime error below
        Machine machine2 = camera1;
        machine2.start();
        // error: machine2.snap();

        // Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work --- runtime error.
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();

        //////////////// MY CODE //////////////////////////
        // I made th computer class
        System.out.println("///////////////////////////////");

        Computer com = new Computer();
        com.powerOff();

        Camera cam = new Camera();

       // Wont work: Computer com2 = cam;


        // same thing?
        Machine mach = com;
        com.powerOff();
        com.start();

        System.out.println("-------------");

        Machine mach2 = (Machine)com;
        com.start();
        com.powerOff();






    }
}
