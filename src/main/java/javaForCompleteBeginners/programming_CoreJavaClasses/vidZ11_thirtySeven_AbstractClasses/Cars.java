package javaForCompleteBeginners.programming_CoreJavaClasses.vidZ11_thirtySeven_AbstractClasses;

public class Cars extends Machines{

    @Override
    public void start() {
        System.out.println("Starting ignition...");

    }

    @Override
    public void doStuff() {
        System.out.println("Driving...");
    }

    @Override
    public void shutdown() {
        System.out.println("Switch off ignition.");

    }
}
