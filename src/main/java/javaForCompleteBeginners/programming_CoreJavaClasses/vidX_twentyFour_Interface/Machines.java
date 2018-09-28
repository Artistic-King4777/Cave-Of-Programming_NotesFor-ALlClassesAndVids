package javaForCompleteBeginners.programming_CoreJavaClasses.vidX_twentyFour_Interface;

public class Machines implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machines started.");
    }

    public void showInfo() {
        System.out.println("Machines ID is: " + id);
    }



}
