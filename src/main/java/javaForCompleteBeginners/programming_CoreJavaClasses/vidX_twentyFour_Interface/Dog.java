package javaForCompleteBeginners.programming_CoreJavaClasses.vidX_twentyFour_Interface;

public class Dog implements IAnimal{

    @Override
    public void eat() {
        System.out.println("Eating Butterflies");
    }

    @Override
    public void bathe() {
        System.out.println("Shakes body splashing everything");
    }

    @Override
    public void sleep() {
        System.out.println("In positions that shouldnt be possible\nNot as crazy as cat positions though");
    }
}
