package javaForCompleteBeginners.programming_CoreJavaClasses.vid_v_twentytwo_inheritance;

public class Car extends Machine {
    // extending machine means it has all the methods "Machines" Class has

    public void wipeWindShield() {
        System.out.println("Wiping Wind Shield");
    }


    // making methods the same will override the parent method
    // along with the override annotatiom
    // it checks to make sure your overriding and helps spot errors
    // isnt necessary tho
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    public void showInfo() {
        System.out.println("Car name: " + name);
    }

} // Car Class
