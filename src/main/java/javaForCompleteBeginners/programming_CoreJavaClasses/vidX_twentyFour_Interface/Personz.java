package javaForCompleteBeginners.programming_CoreJavaClasses.vidX_twentyFour_Interface;

public class Personz implements Info{

    private String name;

    // Constructor
    public Personz(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there.");
    }

    @Override
    public void showInfo() {
        System.out.println("Personz name is: " + name);
    }
}
