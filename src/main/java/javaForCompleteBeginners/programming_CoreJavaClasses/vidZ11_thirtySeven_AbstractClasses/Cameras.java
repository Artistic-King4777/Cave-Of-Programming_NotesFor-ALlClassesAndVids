package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ11_thirtySeven_AbstractClasses;

public class Cameras extends Machines{
    @Override
    public void start() {
        System.out.println("Starting camera.");
    }

    @Override
    public void doStuff() {
        System.out.println("Taking a photo");

    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down the camera.");

    }
}
