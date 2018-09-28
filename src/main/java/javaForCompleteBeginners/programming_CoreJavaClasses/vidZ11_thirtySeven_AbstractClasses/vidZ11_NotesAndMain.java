package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ11_thirtySeven_AbstractClasses;

public class vidZ11_NotesAndMain {
    public static void main(String[] args) {
        Cameras cam1 = new Cameras();
        cam1.setId(5);

        Cars car1 = new Cars();
        car1.setId(4);

        car1.run();

        //  abstract classes cant be instantiated
        //Machines machine1 = new Machines();

        /**
         * With an abstract parent class your making a rlly strong statement
         * about what the child fundamentally is
         *
         * If you have an interface thats called Info with one method called
         *   showInfo() //
         *   a machine could implement showInfo() or a person or a building
         *   or anythng really your simply saying that a class that implements
         *   this Info Interface has the ability to showInfo about itself
         *
         * But with extnds.. its a really strong statement such as Cameras and
         *   Cars extends Machines and what your saying this way is Camera IS a
         *   Machine nd Car IS a Machine so the parent class determines its
         *   fundamental identity --
         *
         * When you have an abstract class as the Parent class in the heiracrchy
         *   you have to be sure the child class is gonna BE whatever that parent
         *   class is (A Car IS A Machine) so extending an abstract class is a
         *   much stronger statement then simply implementing an interface
         *
         * A class can implement many Interfaces but can only have one Parent class
         *   which shows extend is more fundamental
         *
         * Implements are things it can do while extend/parent is what it IS
         *
         * Abstract classes and parent classes can have code but Interfaces cant
         */
    }
}
