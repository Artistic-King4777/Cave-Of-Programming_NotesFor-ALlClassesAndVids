package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ5_thirtyOne_GenericsAndWildcards;

import java.util.ArrayList;

class Machine {

    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine starting.");
    }

    /////////////// adding a method of my own to test with

    public void shutDown() {
        System.out.println("shutting down");
    }

}

class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap() {
        System.out.println("snap!");
    }

    //////// adding a method of my own for testing

    public void flash() {
        System.out.println("Flash is on!");
    }

}

public class vidZ5_NotesAndMain {
    public static void main(String[] args) {

        // parent class
        ArrayList<Machine> list1 = new ArrayList<Machine>();

        list1.add(new Machine());
        list1.add(new Machine());

        // sub class of machine
        //   this array list is not a sub class of the
        //   machie arraylist they arent related at all
        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());


        showList(list2);
        showList2(list1);
        showList3(list1);


    }


    // now if the ? extends machine was just machine youd thik you could use
    //   list 2 since its a subclass but again not related like tht all
    //    so you cant

    /**
     * The ? is a wildcard and so it can take anything in the arraylist
     *
     * " ? extends Machine" will allow you to use machine or sny subtype of
     *    of machine as well
     *   which allows you to be more specific
     *   still cant call cam methods??
     */
    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
            value.shutDown();

        }

    }

    // has to be a camera or super class of cam
    // however you stilll cant use cam methods since the parent wont have
    //  cams methods
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
            // cant call methods from parent or cam clas
        }
    }



    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

}
